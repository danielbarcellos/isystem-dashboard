package br.com.isystem.dashboard.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the MNY_MONITOR_BASE database table.
 * 
 */
@Entity
@Table(name = "MNY_MONITOR_BASE")
@NamedQuery(name = "MonitorBase.findAll", query = "SELECT m FROM MonitorBase m")
public class MonitorBase implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5613644289834627769L;

	@Id
	@SequenceGenerator(name = "MNY_MONITOR_BASE_IDMONITORBASE_GENERATOR", sequenceName = "SEQ_MNY_MONITOR_BASE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MNY_MONITOR_BASE_IDMONITORBASE_GENERATOR")
	@Column(name = "ID_MONITOR_BASE", unique = true, nullable = false, precision = 10)
	private Long idMonitorBase;

	@Column(name = "FL_ATIVO", length = 1)
	private String flAtivo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DH_AGENDADO")
	private Date dhAgendado;

	@Column(name = "ID_LAST_EXECUCAO", precision = 10)
	private BigDecimal idLastExecucao;

	@Column(name = "QT_INTERVALO", precision = 10)
	private BigDecimal qtIntervalo;

	@ManyToOne
	@JoinColumn(name = "ID_BASE")
	private Base base;

	@ManyToOne
	@JoinColumn(name = "ID_MONITOR")
	private Monitor monitor;

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

	public Base getBase() {
		return base;
	}

	public void setBase(Base base) {
		this.base = base;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

}