package br.com.companypassagensaereas.servicepassagens.services;

import br.com.companypassagensaereas.servicepassagens.domain.PassagensAereas;
import br.com.companypassagensaereas.servicepassagens.repository.PassagensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class ServicePassagens {

    @Autowired
    private PassagensRepository passagensRepository;


    public void salvaPassagens(PassagensAereas passagensAereas){
        passagensRepository.salvarPassagens(passagensAereas);
    }
    public List<PassagensAereas> listarPassagens() {
        List<PassagensAereas> passagensAereas = passagensRepository.listarPassagens();
        return passagensAereas;
    }

}
