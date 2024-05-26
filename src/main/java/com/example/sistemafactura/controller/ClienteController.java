package com.example.sistemafactura.controller;

import com.example.sistemafactura.model.Cliente;
import com.example.sistemafactura.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @GetMapping("listar")
    public String listarClientes(Model model){
        model.addAttribute("titulo","Listado de clientes");
        model.addAttribute("clientes",clienteService.findAll());
        return "clientes";
    }

    @GetMapping("form")
    public String createClient(Model model){
        Cliente cliente = new Cliente();
        model.addAttribute("titulo","Formulario Cliente");
        model.addAttribute("cliente",cliente);
        model.addAttribute("clientes",clienteService.findAll());
        return "clienteEdit";
    }

    @PostMapping("save")
    public String saveCliente(Cliente cliente, Model model){
        model.addAttribute("titulo","Listado de clientes");
        log.info("Cliente a guardar: {}", cliente);
        clienteService.save(cliente);
        return "redirect:/clientes/listar";
    }



}
