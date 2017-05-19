package br.com.isystem.dashboard.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the MNY_BASE database table.
 * 
 */
@Entity
@Table(name = "MNY_BASE")
@NamedQuery(name = "Base.findAll", query = "SELECT b FROM Base b")
public class Base implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4368997711736964738L;

	@Id
	@SequenceGenerator(name = "MNY_BASE_IDBASE_GENERATOR", sequenceName = "SEQ_MNY_BASE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MNY_BASE_IDBASE_GENERATOR")
	@Column(name = "ID_BASE", unique = true, nullable = false, precision = 10)
	private Long idBase;

	@Column(name = "CN_BASE", length = 20)
	private String cnBase;

	@Column(name = "NM_BASE", length = 40)
	private String nmBase;

	@Column(name = "SG_BASE", length = 10)
	private String sgBase;

	@Column(name = "TP_BASE", length = 2)
	private String tpBase;

	public Base() {
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