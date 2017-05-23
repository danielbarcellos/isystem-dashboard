package br.com.isystem.dashboard.service.dto;

import java.io.Serializable;

public class BaseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5896907918964287565L;

	private Long idBase;

	private String cnBase;

	private String nmBase;

	private String sgBase;

	private String tpBase;

	public BaseDTO() {
	}

	public Long getIdBase() {
		return idBase;
	}

	public void setIdBase(Long idBase) {
		this.idBase = idBase;
	}

	public String getCnBase() {
		return cnBase;
	}

	public void setCnBase(String cnBase) {
		this.cnBase = cnBase;
	}

	public String getNmBase() {
		return nmBase;
	}

	public void setNmBase(String nmBase) {
		this.nmBase = nmBase;
	}

	public String getSgBase() {
		return sgBase;
	}

	public void setSgBase(String sgBase) {
		this.sgBase = sgBase;
	}

	public String getTpBase() {
		return tpBase;
	}

	public void setTpBase(String tpBase) {
		this.tpBase = tpBase;
	}

}