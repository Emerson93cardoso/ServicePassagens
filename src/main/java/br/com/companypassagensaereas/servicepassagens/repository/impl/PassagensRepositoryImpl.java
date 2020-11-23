package br.com.companypassagensaereas.servicepassagens.repository.impl;

import br.com.companypassagensaereas.servicepassagens.domain.PassagensAereas;
import br.com.companypassagensaereas.servicepassagens.repository.PassagensRepository;
import br.com.companypassagensaereas.servicepassagens.repository.mapper.PassagensRepositoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PassagensRepositoryImpl implements PassagensRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void salvarPassagens(PassagensAereas passagensAereas) {
        jdbcTemplate.update("insert into passagens(pais, cidade, estado) values(?, ?, ?)",
                passagensAereas.getPais(), passagensAereas.getCidade(), passagensAereas.getEstado());
    }

   @Override
   public List<PassagensAereas> listarPassagens() {
        List<PassagensAereas> passagens = jdbcTemplate.query("select * from passagens", new PassagensRepositoryMapper());
        return passagens;
    }
    }

