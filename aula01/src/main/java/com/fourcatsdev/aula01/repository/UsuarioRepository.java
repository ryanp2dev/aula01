package com.fourcatsdev.aula01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fourcatsdev.aula01.modelo.Usuario;
import java.util.List;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Usuario findByLogin(String login);
}
