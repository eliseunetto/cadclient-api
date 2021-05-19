package com.eliseunetto.cadclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eliseunetto.cadclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
