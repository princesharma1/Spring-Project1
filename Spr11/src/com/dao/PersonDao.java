package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.entity.Person;

public class PersonDao {
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<Person> getAllPerson() {
		return template.query("select * from p11", new RowMapper<Person>() {
			@Override
			public Person mapRow(ResultSet rs, int rowNumber)
					throws SQLException {
				Person p = new Person();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				return p;
			}
		});
	}
}
