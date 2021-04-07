package org.fatec.l1b.mobel;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa{
	@Column
	private String conta;
}
