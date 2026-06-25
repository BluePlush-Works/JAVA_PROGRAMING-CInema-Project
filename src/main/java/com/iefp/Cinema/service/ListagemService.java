package com.iefp.Cinema.service;

import com.iefp.Cinema.model.Cliente;
import com.iefp.Cinema.model.Funcionario;
import com.iefp.Cinema.model.Utilizador;
import com.iefp.Cinema.repository.ClienteRepository;
import com.iefp.Cinema.repository.FuncionarioRepository;
import com.iefp.Cinema.repository.UtilizadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListagemService {

    private final UtilizadorRepository utilizadorRepository;
    private final FuncionarioRepository funcionarioRepository;
    private final ClienteRepository clienteRepository;


    public ListagemService(UtilizadorRepository utilizadorRepository, FuncionarioRepository funcionarioRepository, ClienteRepository clienteRepository) {
        this.utilizadorRepository = utilizadorRepository;
        this.funcionarioRepository = funcionarioRepository;
        this.clienteRepository = clienteRepository;
    }

    public List<Utilizador> listarUtilizadores() {
        return utilizadorRepository.findAll();
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

}
