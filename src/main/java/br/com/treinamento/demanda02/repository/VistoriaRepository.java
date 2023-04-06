package br.com.treinamento.demanda02.repository;

import br.com.treinamento.demanda02.domain.model.Vistoria;
import br.com.treinamento.demanda02.enums.Marca;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VistoriaRepository extends MongoRepository<Vistoria, String> {

    public List <Vistoria> findAllByMarca(Marca marca);
    public List <Vistoria> findAllByMarcaAndModelo(Marca marca, String modelo);
}
