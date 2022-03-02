package br.eti.valerio.msuser.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.eti.valerio.msuser.entities.User;

public interface UserRepository extends MongoRepository<User, Long>{

	User findByEmail(String email);
	
	
	
	
}
