package br.com.companypassagensaereas.servicepassagens.domain;

import br.com.companypassagensaereas.servicepassagens.domain.PassagensAereas;

import java.util.List;

public class ListaWrapper {

    private final List<PassagensAereas> listaPassagens;

    public ListaWrapper(List<PassagensAereas> lista) {
        this.listaPassagens = lista;
    }
    public List<PassagensAereas> getPassagensAereas() {
        return listaPassagens;
    }
}

