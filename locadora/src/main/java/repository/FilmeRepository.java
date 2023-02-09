package repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import model.Filme;

public interface FilmeRepository extends MongoRepository <Filme, String> {

} 



    

