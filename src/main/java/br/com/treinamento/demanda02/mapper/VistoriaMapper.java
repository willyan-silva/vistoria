package br.com.treinamento.demanda02.mapper;

import br.com.treinamento.demanda02.domain.dto.VistoriaDTO;
import br.com.treinamento.demanda02.domain.model.Vistoria;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper (componentModel = "spring")
public interface VistoriaMapper {
    VistoriaDTO toDTO(Vistoria obj);

    List<VistoriaDTO> listToDTO(List<Vistoria> obj);

    Vistoria toEntity(VistoriaDTO obj);

}
