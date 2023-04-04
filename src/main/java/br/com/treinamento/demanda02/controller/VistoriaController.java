package br.com.treinamento.demanda02.controller;

import br.com.treinamento.demanda02.domain.dto.VistoriaDTO;
import br.com.treinamento.demanda02.service.VistoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
//@Tag(name = "Cartão")
@RestController
@RequestMapping(value = "/v1/vistoria")
public class VistoriaController {

    @Autowired
    private final VistoriaService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    //@Operation(summary = "Cria um Cartão")
    public VistoriaDTO create(@RequestBody VistoriaDTO vistoriaDTO) {
        return service.salvarVeiculo(vistoriaDTO);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
        //@Operation(summary = "Cria um Cartão")
    List<VistoriaDTO> read() {
        return service.listarVeiculos();
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
        //@Operation(summary = "Cria um Cartão")
    void delete(@PathVariable String id) {
        service.removerVeiculo(id);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public VistoriaDTO update(@PathVariable String id, @RequestBody VistoriaDTO dto) {
        return service.update(id, dto);
    }


}
