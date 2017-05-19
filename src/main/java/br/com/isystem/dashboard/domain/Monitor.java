package br.com.isystem.dashboard.domain;

import java.io.Serializable;
import java.math.BigDecimal;

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

/**
 * The persistent class for the MNY_MONITOR database table.
 * 
 */
@Entity
@Table(name = "MNY_MONITOR")
@NamedQuery(name = "Monitor.findAll", query = "SELECT m FROM Monitor m")
public class Monitor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1044170489513129238L;

	@Id
	@SequenceGenerator(name = "MNY_MONITOR_IDMONITOR_GENERATOR", sequenceName = "SEQ_MNY_MONITOR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MNY_MONITOR_IDMONITOR_GENERATOR")
	@Column(name = "ID_MONITOR", unique = true, nullable = false, precision = 10)
	private Long idMonitor;

	@Column(name = "DS_QUERY", length = 4000)
	private String dsQuery;

	@Column(name = "NM_MONITOR", length = 50)
	private String nmMonitor;

	@Column(name = "QT_NVR_COL1", precision = 10)
	private BigDecimal qtNvrCol1;

	@Column(name = "QT_NVR_COL2", precision = 10)
	private BigDecimal qtNvrCol2;

	@Column(name = "QT_NVR_COL3", precision = 10)
	private BigDecimal qtNvrCol3;

	@Column(name = "QT_NVR_COL4", precision = 10)
	private BigDecimal qtNvrCol4;

	@Column(name = "QT_NVR_COL5", precision = 10)
	private BigDecimal qtNvrCol5;

	@Column(name = "QT_NVY_COL1", precision = 10)
	private BigDecimal qtNvyCol1;

	@Column(name = "QT_NVY_COL2", precision = 10)
	private BigDecimal qtNvyCol2;

	@Column(name = "QT_NVY_COL3", precision = 10)
	private BigDecimal qtNvyCol3;

	@Column(name = "QT_NVY_COL4", precision = 10)
	private BigDecimal qtNvyCol4;

	@Column(name = "QT_NVY_COL5", precision = 10)
	private BigDecimal qtNvyCol5;

	@Column(name = "SG_MONITOR", precision = 10)
	private BigDecimal sgMonitor;

	@Column(name = "TP_BASE", length = 2)
	private String tpBase;

	@ManyToOne
	@JoinColumn(name = "ID_GRUPO", nullable = false)
	private Grupo grupo;

	public Monitor() {
	}

	public Long getIdMonitor() {
		return idMonitor;
	}

	public void setIdMonitor(Long idMonitor) {
		this.idMonitor = idMonitor;
	}

	public String getDsQuery() {
		return dsQuery;
	}

	public void setDsQuery(String dsQuery) {
		this.dsQuery = dsQuery;
	}

	public String getNmMonitor() {
		return nmMonitor;
	}

	public void setNmMonitor(String nmMonitor) {
		this.nmMonitor = nmMonitor;
	}

	public BigDecimal getQtNvrCol1() {
		return qtNvrCol1;
	}

	public void setQtNvrCol1(BigDecimal qtNvrCol1) {
		this.qtNvrCol1 = qtNvrCol1;
	}

	public BigDecimal getQtNvrCol2() {
		return qtNvrCol2;
	}

	public void setQtNvrCol2(BigDecimal qtNvrCol2) {
		this.qtNvrCol2 = qtNvrCol2;
	}

	public BigDecimal getQtNvrCol3() {
		return qtNvrCol3;
	}

	public void setQtNvrCol3(BigDecimal qtNvrCol3) {
		this.qtNvrCol3 = qtNvrCol3;
	}

	public BigDecimal getQtNvrCol4() {
		return qtNvrCol4;
	}

	public void setQtNvrCol4(BigDecimal qtNvrCol4) {
		this.qtNvrCol4 = qtNvrCol4;
	}

	public BigDecimal getQtNvrCol5() {
		return qtNvrCol5;
	}

	public void setQtNvrCol5(BigDecimal qtNvrCol5) {
		this.qtNvrCol5 = qtNvrCol5;
	}

	public BigDecimal getQtNvyCol1() {
		return qtNvyCol1;
	}

	public void setQtNvyCol1(BigDecimal qtNvyCol1) {
		this.qtNvyCol1 = qtNvyCol1;
	}

	public BigDecimal getQtNvyCol2() {
		return qtNvyCol2;
	}

	public void setQtNvyCol2(BigDecimal qtNvyCol2) {
		this.qtNvyCol2 = qtNvyCol2;
	}

	public BigDecimal getQtNvyCol3() {
		return qtNvyCol3;
	}

	public void setQtNvyCol3(BigDecimal qtNvyCol3) {
		this.qtNvyCol3 = qtNvyCol3;
	}

	public BigDecimal getQtNvyCol4() {
		return qtNvyCol4;
	}

	public void setQtNvyCol4(BigDecimal qtNvyCol4) {
		this.qtNvyCol4 = qtNvyCol4;
	}

	public BigDecimal getQtNvyCol5() {
		return qtNvyCol5;
	}

	public void setQtNvyCol5(BigDecimal qtNvyCol5) {
		this.qtNvyCol5 = qtNvyCol5;
	}

	public BigDecimal getSgMonitor() {
		return sgMonitor;
	}

	public void setSgMonitor(BigDecimal sgMonitor) {
		this.sgMonitor = sgMonitor;
	}

	public String getTpBase() {
		return tpBase;
	}

	public void setTpBase(String tpBase) {
		this.tpBase = tpBase;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

}