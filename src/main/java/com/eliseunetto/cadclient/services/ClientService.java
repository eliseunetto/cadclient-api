package com.eliseunetto.cadclient.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eliseunetto.cadclient.entities.Client;
import com.eliseunetto.cadclient.repositories.ClientRepository;
import com.eliseunetto.cadclient.services.exceptions.ResourceNotFoundException;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<Client> findAll() {
		List<Client> list = repository.findAll();
		return list;
	}
	
	@Transactional(readOnly = true)
	public Client findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException("Entiti not found"));
	}
}
