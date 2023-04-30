package com.dytech.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dytech.rest.carro.Carro;
import com.dytech.rest.repository.CarroRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CarroController {

	CarroRepository repository;

	@GetMapping("/carro")
	public List<Carro> getAllCarros() {
		return repository.findAll();
	}

	@GetMapping("/carro/{id}")
	public Carro getCarroById(@PathVariable Long id) {
		return repository.findById(id).get();
	}

	@PostMapping("/carro")
	public Carro saveCarro(@RequestBody Carro carro) {
		return repository.save(carro);
	}

	@DeleteMapping("/carro/{id}")
	public void deleteCarro(@PathVariable Long id) {
		repository.deleteById(id);
	}

	@PutMapping("/carro	")
	public Carro atualiCarro(@RequestBody Carro carro) {
		return repository.save(carro);
		}

}
