package com.iefp.Cinema.controller;

import com.iefp.Cinema.service.ListagemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListagemController {
    private final ListagemService listagemService;

    public ListagemController(ListagemService listagemService) {
        this.listagemService = listagemService;
    }

    @GetMapping("/")
    public String paginaInicial() {
        return "redirect:/clientes";
    }


    //Listar Utilizadores

    @GetMapping("/utilizadores")
    public String listarUtilizadores(Model model) {
        model.addAttribute("lista", listagemService.listarUtilizadores());
        model.addAttribute("tipo", "UTILIZADOR");
        return "listagem";
    }

    //Listar Clientes

    @GetMapping("/clientes")
    public String listarClientes(Model model) {
        model.addAttribute("lista", listagemService.listarClientes());
        model.addAttribute("tipo", "CLIENTE");
        return "listagem";
    }

    @GetMapping("/funcionarios")
    public String listarFuncionarios(Model model) {
        model.addAttribute("lista", listagemService.listarFuncionarios());
        model.addAttribute("tipo", "FUNCIONARIO");
        return "listagem";
    }

}
