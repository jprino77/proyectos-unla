package sistemaDistribuidos.webConODBC.entity;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

public class Turno {

	private Integer id;
	
	private LocalDateTime fechaHoraSolicitud;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime fechaHoraDesde;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime fechaHoraHasta;
	
	private Cancha cancha;
	private Usuario usuario;
	private boolean cancelado;
	private boolean puedeAnular;
	private boolean esModificacion;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFechaHoraSolicitud() {
		return fechaHoraSolicitud;
	}

	public void setFechaHoraSolicitud(LocalDateTime fechaHoraSolicitud) {
		this.fechaHoraSolicitud = fechaHoraSolicitud;
	}

	public LocalDateTime getFechaHoraDesde() {
		return fechaHoraDesde;
	}

	public void setFechaHoraDesde(LocalDateTime fechaHoraDesde) {
		this.fechaHoraDesde = fechaHoraDesde;
	}

	public LocalDateTime getFechaHoraHasta() {
		return fechaHoraHasta;
	}

	public void setFechaHoraHasta(LocalDateTime fechaHoraHasta) {
		this.fechaHoraHasta = fechaHoraHasta;
	}

	public Cancha getCancha() {
		return cancha;
	}

	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public boolean isCancelado() {
		return cancelado;
	}

	public void setCancelado(boolean cancelado) {
		this.cancelado = cancelado;
	}

	public boolean isPuedeAnular() {
		return puedeAnular;
	}

	public void setPuedeAnular(boolean puedeAnular) {
		this.puedeAnular = puedeAnular;
	}

	public boolean getEsModificacion() {
		return esModificacion;
	}

	public void setEsModificacion(boolean esModificacion) {
		this.esModificacion = esModificacion;
	}

}
