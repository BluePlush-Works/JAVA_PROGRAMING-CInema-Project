package com.iefp.Cinema.controller;

import com.iefp.Cinema.service.RegistoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class RegistoController {

    private final RegistoService registoService;


    public RegistoController(RegistoService registoService) {
        this.registoService = registoService;
    }

    //Registar utilizador

    @GetMapping("/registo")

    public String mostrarFormularioRegisto() {
        return "utilizadores";
    }

    @PostMapping("/registo")
    public String registarUtilizador(@RequestParam String nome,
                                     @RequestParam String contato,
                                     @RequestParam String email,
                                     @RequestParam String senha,
                                     @RequestParam String perfil,
                                     @RequestParam (required = false) String nif,
                                     @RequestParam (required = false) String nfuncionario,
                                     @RequestParam (required = false) String cargo,
                                     @RequestParam (required = false) String turno, Model model)
    {

        try {
            if (perfil.equals("CLIENTE")) {
                registoService.registarCliente(
                        nome,
                        contato,
                        email,
                        senha,
                        perfil,
                        nif
                );
                return "redirect:/clientes";
            }


            //Registar Funcionário

            if (perfil.equals("FUNCIONARIO")) {
                registoService.registarFuncionario(
                        nome,
                        contato,
                        email,
                        senha,
                        perfil,
                        nfuncionario,
                        cargo,
                        turno
                );
                return "redirect:/funcionarios";
            }

            return "redirect:/utilizadores";
        } catch (RuntimeException erro) {
            model.addAttribute("erro", erro.getMessage());
            return "registo-utilizador";
        }

    }

}





