package br.eti.valerio.controler;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ms-crud")
public class MockController {

	@GetMapping("/getMock")
	public Map<String, String> mock(){
		return Map.of("name","Valerio.eti.br");
	}
	
}
