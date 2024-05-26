package com.example.sistemafactura.repository;

import com.example.sistemafactura.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
}
