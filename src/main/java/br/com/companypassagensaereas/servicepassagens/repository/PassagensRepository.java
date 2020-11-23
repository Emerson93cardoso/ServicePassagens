package br.com.companypassagensaereas.servicepassagens.repository;

import br.com.companypassagensaereas.servicepassagens.domain.PassagensAereas;

import java.util.List;


public interface PassagensRepository {

    void salvarPassagens(PassagensAereas passagensAereas);
    List<PassagensAereas> listarPassagens();
}


