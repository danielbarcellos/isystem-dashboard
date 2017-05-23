package br.com.isystem.dashboard.service.dto;

import java.io.Serializable;
import java.math.BigDecimal;


public class MonitorDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8239811710570779849L;

	private Long idMonitor;

	private String dsQuery;

	private String nmMonitor;

	private BigDecimal qtNvrCol1;

	private BigDecimal qtNvrCol2;

	private BigDecimal qtNvrCol3;

	private BigDecimal qtNvrCol4;

	private BigDecimal qtNvrCol5;

	private BigDecimal qtNvyCol1;

	private BigDecimal qtNvyCol2;

	private BigDecimal qtNvyCol3;

	private BigDecimal qtNvyCol4;

	private BigDecimal qtNvyCol5;

	private BigDecimal sgMonitor;

	private String tpBase;

	public MonitorDTO() {
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
}