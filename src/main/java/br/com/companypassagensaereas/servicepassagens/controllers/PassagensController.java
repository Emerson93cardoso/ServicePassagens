package br.com.companypassagensaereas.servicepassagens.controllers;

import br.com.companypassagensaereas.servicepassagens.domain.ListaWrapper;
import br.com.companypassagensaereas.servicepassagens.domain.PassagensAereas;
import br.com.companypassagensaereas.servicepassagens.services.ServicePassagens;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/passagens")
public class PassagensController {


    @Autowired
    private ServicePassagens servicePassagens;

    @PostMapping
    public ResponseEntity<Void> passagens(@RequestBody @Valid PassagensAereas passagensAereas){
        servicePassagens.salvaPassagens(passagensAereas);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @GetMapping("/listar")
    public ListaWrapper listarPassagens() {
        return new ListaWrapper(servicePassagens.listarPassagens());
    }
}
