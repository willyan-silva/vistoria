package br.com.treinamento.demanda02.domain.dto;

import br.com.treinamento.demanda02.enums.Resultado;
import br.com.treinamento.demanda02.enums.Situacao;
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

    @Id
    private String id;

    private String placa;
    private String marca;
    private String modelo;
    private short ano;
    private float km;

    private Date data;

    private Situacao situacaoExtintor;
    private Situacao situacaoParabrisa;
    private Situacao situacaoFarois;

    private Resultado resultado;

}
