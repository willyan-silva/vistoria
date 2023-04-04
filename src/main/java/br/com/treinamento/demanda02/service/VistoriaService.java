package br.com.treinamento.demanda02.service;

import br.com.treinamento.demanda02.domain.dto.VistoriaDTO;
import br.com.treinamento.demanda02.domain.model.Vistoria;
import br.com.treinamento.demanda02.mapper.VistoriaMapper;
import br.com.treinamento.demanda02.repository.VistoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VistoriaService {

    @Autowired
    private final VistoriaRepository vistoriaRepository;

    @Autowired
    private final VistoriaMapper mapper;

    public VistoriaDTO salvarVeiculo(VistoriaDTO vistoriaDTO) {
        Vistoria vistoria = mapper.toEntity(vistoriaDTO);
        return mapper.toDTO(vistoriaRepository.save(vistoria));
    }

    public List<VistoriaDTO> listarVeiculos() {
        return mapper.listToDTO(vistoriaRepository.findAll());
    }

    public void removerVeiculo(String id) {
        vistoriaRepository.deleteById(id);
    }

    public VistoriaDTO update(String id, VistoriaDTO vistoriaDTO) {
        vistoriaDTO.setId(id);
        Vistoria entity = mapper.toEntity(vistoriaDTO);
        entity = vistoriaRepository.save(entity);
        return mapper.toDTO(entity);
    }

}
