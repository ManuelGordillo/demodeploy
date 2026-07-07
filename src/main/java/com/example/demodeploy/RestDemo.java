package com.example.demodeploy;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class RestDemo {
	
	public Map<String, Object> consultar(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("nombre", "Deploy en railway");
		map.put("procedencia", "Repositorio Github");
		return map;
	}

}
