package br.com.isystem.dashboard.service.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MonitorBase implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6676472788368127766L;

	private Long idMonitorBase;

	private String flAtivo;

	private Date dhAgendado;

	private BigDecimal idLastExecucao;

	private BigDecimal qtIntervalo;

	public MonitorBase() {
	}

	public Long getIdMonitorBase() {
		return idMonitorBase;
	}

	public void setIdMonitorBase(Long idMonitorBase) {
		this.idMonitorBase = idMonitorBase;
	}

	public String getFlAtivo() {
		return flAtivo;
	}

	public void setFlAtivo(String flAtivo) {
		this.flAtivo = flAtivo;
	}

	public Date getDhAgendado() {
		return dhAgendado;
	}

	public void setDhAgendado(Date dhAgendado) {
		this.dhAgendado = dhAgendado;
	}

	public BigDecimal getIdLastExecucao() {
		return idLastExecucao;
	}

	public void setIdLastExecucao(BigDecimal idLastExecucao) {
		this.idLastExecucao = idLastExecucao;
	}

	public BigDecimal getQtIntervalo() {
		return qtIntervalo;
	}

	public void setQtIntervalo(BigDecimal qtIntervalo) {
		this.qtIntervalo = qtIntervalo;
	}

}