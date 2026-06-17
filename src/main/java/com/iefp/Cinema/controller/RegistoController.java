package com.iefp.Cinema.controller;

import com.iefp.Cinema.model.Utilizador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RegistoController {
    private List<Utilizador> utilizadores = new ArrayList<>();

    @GetMapping("/registo")
    public String ListaUtilizadores(Model model) {
        model.addAttribute("lista", utilizadores);
        return "/utilizadores";
    }

    @PostMapping("/registo")
    public String adicionarUtilizador(@RequestParam String nome, @RequestParam String contato, @RequestParam String email, @RequestParam String senha, @RequestParam String perfil) {
        Utilizador utilizador = new Utilizador(nome, contato, email, senha, perfil);
        utilizadores.add(utilizador);
        return "redirect:/utilizadores";
    }
}
