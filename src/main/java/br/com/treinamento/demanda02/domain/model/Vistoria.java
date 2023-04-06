package br.com.treinamento.demanda02.domain.model;

import br.com.treinamento.demanda02.enums.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vistoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
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
