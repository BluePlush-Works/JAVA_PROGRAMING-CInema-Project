package com.iefp.Cinema.service;

import com.iefp.Cinema.model.Cliente;
import com.iefp.Cinema.model.Funcionario;
import com.iefp.Cinema.model.Utilizador;
import com.iefp.Cinema.repository.ClienteRepository;
import com.iefp.Cinema.repository.FuncionarioRepository;
import com.iefp.Cinema.repository.UtilizadorRepository;
import org.springframework.stereotype.Service;

@Service
public class RegistoService {

    private final UtilizadorRepository utilizadorRepository;
    private final FuncionarioRepository funcionarioRepository;
    private final ClienteRepository clienteRepository;

    public RegistoService(UtilizadorRepository utilizadorRepository, FuncionarioRepository funcionarioRepository, ClienteRepository clienteRepository) {
        this.utilizadorRepository = utilizadorRepository;
        this.funcionarioRepository = funcionarioRepository;
        this.clienteRepository = clienteRepository;
    }

    //Registar Cliente

    public void registarCliente(String nome,
                                String contato,
                                String email,
                                String senha,
                                String perfil,
                                String nif) {

        if (utilizadorRepository.existsByEmail(email)) {
            throw new RuntimeException("Já existe um utilizador com esse email");
        }

        Utilizador utilizador = new Utilizador(
                null,
                nome,
                contato,
                email,
                senha,
                "CLIENTE"
        );

        utilizadorRepository.save(utilizador);

        Cliente cliente = new Cliente(null, nif, utilizador);

        clienteRepository.save(cliente);

    }

    //Registar Funcionário

    public void registarFuncionario(String nome,
                                    String contato,
                                    String email,
                                    String senha,
                                    String perfil,
                                    String nfuncionario,
                                    String cargo,
                                    String turno) {

        if(utilizadorRepository.existsByEmail(email)) {
            throw new RuntimeException("Já existe um utilizador com esse email");
        }

        Utilizador utilizador = new Utilizador(
                null,
                nome,
                contato,
                email,
                senha,
            "FUNCIONARIO");

        utilizadorRepository.save(utilizador);

        Funcionario funcionario = new Funcionario(null, nfuncionario, cargo, turno,  utilizador);

        funcionarioRepository.save(funcionario);

    }



}
