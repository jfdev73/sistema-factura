package com.example.sistemafactura.service;

import com.example.sistemafactura.model.Cliente;
import com.example.sistemafactura.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements  ClienteService {

    private final ClienteRepository clienteRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Cliente findById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Transactional
    @Override
    public Cliente update(Long id, Cliente cliente) {
        Cliente clienteBD = findById(id);
        if (clienteBD != null){
            cliente.setId(clienteBD.getId());
            return clienteRepository.save(clienteBD);
        }


        return null;
    }

    @Transactional
    @Override
    public void delete(Long id) {
        clienteRepository.deleteById(id);

    }
}
