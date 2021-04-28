package tse.org.gt.pruebajpa.models;

import java.io.Serializable;
import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="V_MUNICIPIOS", schema="RNPSOLICITUD")
@SequenceGenerator(name = "default_gen", sequenceName = "IDSERIEINVALIDO", allocationSize = 1)

public class Municipio implements Serializable{

	//private static final long serialVersionUID = 1L;
	@Id	
	@Column(name="CODMUN")
	private	Long codmun;
	
	@Column(name="CODDEP")
	private	Long coddep;
	
	
	@Column(name="MUNICIPIO")
	private	String nombre;

	public Long getCodmun() {
		return codmun;
	}

	public void setCodmun(Long codmun) {
		this.codmun = codmun;
	}

	public Long getCoddep() {
		return coddep;
	}

	public void setCoddep(Long coddep) {
		this.coddep = coddep;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
