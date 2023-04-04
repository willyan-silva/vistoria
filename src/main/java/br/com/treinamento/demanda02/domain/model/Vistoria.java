package br.com.treinamento.demanda02.domain.model;

import br.com.treinamento.demanda02.enums.NivelCombustivel;
import br.com.treinamento.demanda02.enums.Resultado;
import br.com.treinamento.demanda02.enums.Situacao;
import br.com.treinamento.demanda02.enums.TipoCombustivel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vistoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String placa;
    private String marca;
    private String modelo;
    private short ano;
    private float km;
    private TipoCombustivel tipoCombustivel;
    private NivelCombustivel nivelCombustivel;
    private String cor;
    private String avariaAparente;
    private String chassi;

    private Date data;
    private Situacao situacaoExtintor;
    private Situacao situacaoParabrisa;
    private Situacao situacaoFarois;
    private Resultado resultado;
}
