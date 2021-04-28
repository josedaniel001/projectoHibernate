package tse.org.gt.pruebajpa.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Tdpi")
public class TDpi implements Serializable{
	
	@Id
	@Column(name="cui")
	private Long cui;
	
	@Column(name="nroboleta")
	private Long nroboleta;
	
	@Column(name="fechaemision")
	private Date fechaemision;
	
	@Column(name="serie")
	private Long serie;
	
	@Column(name="feccre")
	private Date fecha_creacion;
	
	@Column(name="depnacimientodpi")
	private int departamentonacimientodpi;
	
	@Column(name="munnacimientodpi")
	private int municipionacimientodpi;
	
	@Column(name="fecasientonacdpi")
	private Date fechasientonacimientodpi;

	public TDpi() {
	}

	public TDpi(Long cui, Long nroboleta, Date fechaemision, Long serie, Date fecha_creacion,
			int departamentonacimientodpi, int municipionacimientodpi, Date fechasientonacimientodpi) {
		this.cui = cui;
		this.nroboleta = nroboleta;
		this.fechaemision = fechaemision;
		this.serie = serie;
		this.fecha_creacion = fecha_creacion;
		this.departamentonacimientodpi = departamentonacimientodpi;
		this.municipionacimientodpi = municipionacimientodpi;
		this.fechasientonacimientodpi = fechasientonacimientodpi;
	}

	@Override
	public String toString() {
		return "TDpi [cui=" + cui + ", nroboleta=" + nroboleta + ", fechaemision=" + fechaemision + ", serie=" + serie
				+ ", fecha_creacion=" + fecha_creacion + ", departamentonacimientodpi=" + departamentonacimientodpi
				+ ", municipionacimientodpi=" + municipionacimientodpi + ", fechasientonacimientodpi="
				+ fechasientonacimientodpi + "]";
	}
	
	
	
	
}
