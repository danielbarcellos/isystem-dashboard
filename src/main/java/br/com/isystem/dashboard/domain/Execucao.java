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
 * The persistent class for the MNY_EXECUCAO database table.
 * 
 */
@Entity
@Table(name = "MNY_EXECUCAO")
@NamedQuery(name = "Execucao.findAll", query = "SELECT e FROM Execucao e")
public class Execucao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6402126027367372302L;

	@Id
	@SequenceGenerator(name = "MNY_EXECUCAO_IDEXECUCAO_GENERATOR", sequenceName = "SEQ_MNY_EXECUCAO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MNY_EXECUCAO_IDEXECUCAO_GENERATOR")
	@Column(name = "ID_EXECUCAO", unique = true, nullable = false, precision = 10)
	private Long idExecucao;

	@Temporal(TemporalType.DATE)
	@Column(name = "DH_EXECUCAO")
	private Date dhExecucao;

	@Column(name = "DS_ERRO", length = 200)
	private String dsErro;

	@Column(name = "QT_COL1", precision = 10)
	private BigDecimal qtCol1;

	@Column(name = "QT_COL2", precision = 10)
	private BigDecimal qtCol2;

	@Column(name = "QT_COL3", precision = 10)
	private BigDecimal qtCol3;

	@Column(name = "QT_COL4", precision = 10)
	private BigDecimal qtCol4;

	@Column(name = "QT_COL5", precision = 10)
	private BigDecimal qtCol5;

	@Column(name = "SG_BASE", length = 10)
	private String sgBase;

	@Column(name = "SG_COR", length = 1)
	private String sgCor;

	@Column(name = "SG_GRUPO", length = 10)
	private String sgGrupo;

	@Column(name = "SG_MONITOR", length = 10)
	private String sgMonitor;

	@Column(name = "ST_EXECUCAO", precision = 2)
	private BigDecimal stExecucao;

	@ManyToOne
	@JoinColumn(name = "ID_MONITOR_BASE")
	private MonitorBase monitorBase;

	public Execucao() {
	}

	public Long getIdExecucao() {
		return idExecucao;
	}

	public void setIdExecucao(Long idExecucao) {
		this.idExecucao = idExecucao;
	}

	public Date getDhExecucao() {
		return dhExecucao;
	}

	public void setDhExecucao(Date dhExecucao) {
		this.dhExecucao = dhExecucao;
	}

	public String getDsErro() {
		return dsErro;
	}

	public void setDsErro(String dsErro) {
		this.dsErro = dsErro;
	}

	public BigDecimal getQtCol1() {
		return qtCol1;
	}

	public void setQtCol1(BigDecimal qtCol1) {
		this.qtCol1 = qtCol1;
	}

	public BigDecimal getQtCol2() {
		return qtCol2;
	}

	public void setQtCol2(BigDecimal qtCol2) {
		this.qtCol2 = qtCol2;
	}

	public BigDecimal getQtCol3() {
		return qtCol3;
	}

	public void setQtCol3(BigDecimal qtCol3) {
		this.qtCol3 = qtCol3;
	}

	public BigDecimal getQtCol4() {
		return qtCol4;
	}

	public void setQtCol4(BigDecimal qtCol4) {
		this.qtCol4 = qtCol4;
	}

	public BigDecimal getQtCol5() {
		return qtCol5;
	}

	public void setQtCol5(BigDecimal qtCol5) {
		this.qtCol5 = qtCol5;
	}

	public String getSgBase() {
		return sgBase;
	}

	public void setSgBase(String sgBase) {
		this.sgBase = sgBase;
	}

	public String getSgCor() {
		return sgCor;
	}

	public void setSgCor(String sgCor) {
		this.sgCor = sgCor;
	}

	public String getSgGrupo() {
		return sgGrupo;
	}

	public void setSgGrupo(String sgGrupo) {
		this.sgGrupo = sgGrupo;
	}

	public String getSgMonitor() {
		return sgMonitor;
	}

	public void setSgMonitor(String sgMonitor) {
		this.sgMonitor = sgMonitor;
	}

	public BigDecimal getStExecucao() {
		return stExecucao;
	}

	public void setStExecucao(BigDecimal stExecucao) {
		this.stExecucao = stExecucao;
	}

	public MonitorBase getMonitorBase() {
		return monitorBase;
	}

	public void setMonitorBase(MonitorBase monitorBase) {
		this.monitorBase = monitorBase;
	}

}