package org.fatec.l1b.mobel;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected  long id;
	
	@Column(nullable = false, unique = false)
	protected String nome;
	
	@OneToMany (cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "idPessoa")
	protected Set<Telefone> telefones = new HashSet<Telefone>();
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Set<Telefone> getTelefones(){
		return telefones;
	}
	public void SetTelefones(Set<Telefone> telefones) {
		this.telefones = telefones;
	}
}
