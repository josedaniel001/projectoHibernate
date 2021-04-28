package tse.org.gt.pruebajpa.models;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="trefcategoria", schema="PADRONDPI")
public class TRefcategoria implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="CODCATEGORIA")
	private	Long codigoCategoria;  
	
	@Column(name="DESCRIPCION")
	private	String descripcion_Categoria;
	
	private Long Departamento;
	private Long Municipio;
	
	public TRefcategoria() {
		
	}

	public Long getDepartamento() {
		return Departamento;
	}
	
	public void setDepartamento(Long departamento) {
		Departamento = departamento;
	}

	public Long getMunicipio() {
		return Municipio;
	}

	public void setMunicipio(Long municipio) {
		Municipio = municipio;
	}

	public TRefcategoria(Long codigo_Categoria, String descripcion_Categoria) {
		this.codigoCategoria = codigo_Categoria;
		this.descripcion_Categoria = descripcion_Categoria;
	}

	public Long getCodigo_Categoria() {
		return codigoCategoria;
	}
	public void setCodigo_Categoria(Long codigo_Categoria) {
		this.codigoCategoria = codigo_Categoria;
	}
	public String getDescripcion_Categoria() {
		return descripcion_Categoria;
	}
	public void setDescripcion_Categoria(String descripcion_Categoria) {
		this.descripcion_Categoria = descripcion_Categoria;
	}

	@Override
	public String toString() {
		return "TRefcategoria [codigo_Categoria=" + codigoCategoria + ", descripcion_Categoria="
				+ descripcion_Categoria + "]";
	}
	
	
}
