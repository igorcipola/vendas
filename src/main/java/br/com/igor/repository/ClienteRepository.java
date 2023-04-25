package br.com.igor.repository;

import br.com.igor.model.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepository {
    public void salvar(Cliente cliente) {
        //acessa a base e salva
        System.out.println("salvandoooooo " + cliente.getNome());
    }
}
