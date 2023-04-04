package br.com.treinamento.demanda02.repository;

import br.com.treinamento.demanda02.domain.model.Vistoria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VistoriaRepository extends MongoRepository<Vistoria, String> {
}
