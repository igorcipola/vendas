package br.com.igor.service;

import br.com.igor.model.Cliente;
import br.com.igor.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

//    @Autowired
//    public ClienteService(ClienteRepository repository) {
//        this.repository = repository;
//    }

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        this.repository.salvar(cliente);
    }

    private void validarCliente(Cliente cliente) {
    }
}
