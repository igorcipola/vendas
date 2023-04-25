package br.com.igor;

import br.com.igor.model.Cliente;
import br.com.igor.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

    @Autowired
    @Qualifier("applicationName")
    private String apllicationName;

    @Value("${application.name}")
    private String applicationNameProperties;

    @Autowired
    private ClienteService clienteService;

//    public VendasApplication(ClienteService clienteService) {
//        this.clienteService = clienteService;
//    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);

    }

    @GetMapping("/hello")
    public String helloWorld() {
        clienteService.salvarCliente(new Cliente("igor"));
        System.out.println(applicationNameProperties + " teste com properties");
        return apllicationName;
    }
}
