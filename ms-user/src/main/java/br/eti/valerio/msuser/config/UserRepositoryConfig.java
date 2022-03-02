package br.eti.valerio.msuser.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class UserRepositoryConfig {
	 
	@Value("${spring.data.mongodb.uri}")
	public String connectionString;
	
	public @Bean MongoClient mongoClient() {
        return MongoClients.create(this.connectionString);
    }
}
