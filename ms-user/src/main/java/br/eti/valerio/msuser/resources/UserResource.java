package br.eti.valerio.msuser.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource implements CommandLineRunner{
	
	@Value("${spring.data.mongodb.uri}")
	public String connectionStringTest;


	@GetMapping(value = "/configs")
	public ResponseEntity<String> getConfigs(){
		return ResponseEntity.ok(connectionStringTest);
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("STRING DE CONEXÃO: "+connectionStringTest);
	}
	

}
