package com.example.bluebank.ibmchallenge.repositories;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bluebank.ibmchallenge.entities.Saque;

import java.util.UUID;

@Repository
public interface SaqueRepository extends JpaRepository<Saque, UUID> {

}
