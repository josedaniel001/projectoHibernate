package tse.org.gt.pruebajpa.models;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.Where;

@SuppressWarnings("serial")
@Entity
@Table(name="V_DEPARTAMENTOS")
@SequenceGenerator(name = "default_gen", sequenceName = "IDSERIEINVALIDO", allocationSize = 1)
public class Departamento implements Serializable{

	//private static final long serialVersionUID = 1L;
	@Id
	@Column(name="coddep")
	private	Long coddep;
	 
	@Column(name="departamento")
	private	String nombre;
	 
	public Long getCoddep() {		return coddep;	}
	public void setCoddep(Long coddep) {		this.coddep = coddep;	}
	
	public String getNombre() {		return nombre;	}
	public void setNombre(String nombre) {		this.nombre = nombre;	}
}
