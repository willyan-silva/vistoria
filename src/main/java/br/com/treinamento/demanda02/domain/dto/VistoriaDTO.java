package br.com.treinamento.demanda02.domain.dto;

import br.com.treinamento.demanda02.enums.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class VistoriaDTO implements Serializable {
    private static final long serialVersionUID = -1L;

    private String id;
    private String placa;
    private Marca marca;
    private String modelo;
    private short ano;
    private float km;
    private TipoCombustivel tipoCombustivel;
    private NivelCombustivel nivelCombustivel;
    private String cor;
    private String avariaAparente;
    private String chassi;

    private LocalDateTime data;
    private Situacao situacaoExtintor;
    private Situacao situacaoParabrisa;
    private Situacao situacaoFarois;
    private Resultado resultado;
}
