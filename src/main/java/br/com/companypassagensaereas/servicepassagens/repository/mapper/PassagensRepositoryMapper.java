package br.com.companypassagensaereas.servicepassagens.repository.mapper;

import br.com.companypassagensaereas.servicepassagens.domain.PassagensAereas;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class PassagensRepositoryMapper implements RowMapper<PassagensAereas> {

    @Override
    public PassagensAereas mapRow(ResultSet rs, int rowNum) throws SQLException {
            PassagensAereas passagensAereas = new PassagensAereas();
            passagensAereas.setId(rs.getLong("id"));
            passagensAereas.setPais(rs.getString("pais"));
            passagensAereas.setEstado(rs.getString("estado"));
            passagensAereas.setCidade(rs.getString("cidade"));
            return passagensAereas;

    }

}
