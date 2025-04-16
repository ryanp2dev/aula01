package com.fourcatsdev.aula01.modelo;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 3, message = "O nome deve ter no minimo 3 caracteres")
	private String nome;
	
	@CPF(message = "CPF INVALIDO" )
	private String cpf;
	
	@Basic
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date DataNascimento;
	
	@Email(message = "Email invalido")
	private String email;
	
	@NotEmpty(message = "A senha deve ser informada")
	@Size(min = 4, message = "A senha deve ser informada ")
	private String password;
	
	@NotEmpty(message = "O login deve ser informado")
	@Size(min = 4,message = "O login deve ter no minimo 4 caracter")
	private String login;
	
	private String ativo;
	
	@ManyToMany(fetch = FetchType.EAGER )
	@JoinTable(name="usuario_papel",
				joinColumns = @JoinColumn(name ="usuario_id"),
				inverseJoinColumns  = @JoinColumn(name = "papel_id"))
	private List<Papel> papeis;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		DataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	public List<Papel> getPapeis() {
		return papeis;
	}
	public void setPapeis(List<Papel> papeis) {
		this.papeis = papeis;
	}
	
	
}
