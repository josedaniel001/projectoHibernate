package tse.org.gt.pruebajpa.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="trefcomunidad", schema="PADRON")
public class TRefcomunidad implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="DEPARTAMENTO")
	private Long coddep;
	
	@Column(name="MUNICIPIO")
	private Long codmun;
		
	@Id
	@Column(name="COMUNIDAD")
	private	Long codigoComunidad;
	
	@Column(name="CENVOTACION")
	private	Long codigoCentroVota;
	
	@Column(name="DESCRIPCION")
	private	String nombreComunidad;
	
	@Column(name="CATEGORIA")
	private	Long codigoCategoria;
		
	@Column(name="REFERENCIA")
	private String referencia;
	
	@Column(name="ESTATUS")
	private Long estatus;
	
	/*@ManyToOne
    @JoinColumn(name="coddepartamento", referencedColumnName="coddep",insertable=false, updatable=false)
    private Municipio departamento;*/
	
	/*@ManyToOne
    @JoinColumn(name="codCategoria", referencedColumnName="codCategoria",insertable=false, updatable=false)
    private TRefcategoria codCategoria;*/
	
	/*@ManyToOne
    @JoinColumn(name="codmunicipio", referencedColumnName="codmun",insertable=false, updatable=false)
    private Municipio municipio;*/



	public Long getCoddep() {
		return coddep;
	}

	public void setCoddep(Long coddep) {
		this.coddep = coddep;
	}

	public Long getCodmun() {
		return codmun;
	}

	public void setCodmun(Long codmun) {
		this.codmun = codmun;
	}

	public Long getCodigoComunidad() {
		return codigoComunidad;
	}

	public void setCodigoComunidad(Long codigoComunidad) {
		this.codigoComunidad = codigoComunidad;
	}

	public Long getCodigoCentroVota() {
		return codigoCentroVota;
	}

	public void setCodigoCentroVota(Long codigoCentroVota) {
		this.codigoCentroVota = codigoCentroVota;
	}

	public String getNombreComunidad() {
		return nombreComunidad;
	}

	public void setNombreComunidad(String nombreComunidad) {
		this.nombreComunidad = nombreComunidad;
	}

	public Long getCodigoCategoria() {
		return codigoCategoria;
	}

	public void setCodigoCategoria(Long codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Long getEstatus() {
		return estatus;
	}

	public void setEstatus(Long estatus) {
		this.estatus = estatus;
	}

	/*public Municipio getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Municipio departamento) {
		this.departamento = departamento;
	}*/

	/*public TRefcategoria getCodCategoria() {
		return codCategoria;
	}

	public void setCodCategoria(TRefcategoria codCategoria) {
		this.codCategoria = codCategoria;
	}*/

	/*public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}*/
	
	
	
	
}
