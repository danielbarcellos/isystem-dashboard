package br.com.isystem.dashboard.service.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ExecucaoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1744936264718056116L;

	private Long idExecucao;

	private Date dhExecucao;

	private String dsErro;

	private BigDecimal qtCol1;

	private BigDecimal qtCol2;

	private BigDecimal qtCol3;

	private BigDecimal qtCol4;

	private BigDecimal qtCol5;

	private String sgBase;

	private String sgCor;

	private String sgGrupo;

	private String sgMonitor;

	private BigDecimal stExecucao;

	public ExecucaoDTO() {
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

}