package br.com.isystem.dashboard.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the MNY_GRUPO database table.
 * 
 */
@Entity
@Table(name = "MNY_GRUPO")
@NamedQuery(name = "Grupo.findAll", query = "SELECT g FROM Grupo g")
public class Grupo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2093900007471009977L;

	@Id
	@SequenceGenerator(name = "MNY_GRUPO_IDGRUPO_GENERATOR", sequenceName = "SEQ_MNY_GRUPO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MNY_GRUPO_IDGRUPO_GENERATOR")
	@Column(name = "ID_GRUPO", unique = true, nullable = false, precision = 10)
	private Long idGrupo;

	@Column(name = "HD_COL1", length = 20)
	private String hdCol1;

	@Column(name = "HD_COL2", length = 20)
	private String hdCol2;

	@Column(name = "HD_COL3", length = 20)
	private String hdCol3;

	@Column(name = "HD_COL4", length = 20)
	private String hdCol4;

	@Column(name = "HD_COL5", length = 20)
	private String hdCol5;

	@Column(name = "NM_GRUPO", length = 40)
	private String nmGrupo;

	@Column(name = "QT_COL", precision = 2)
	private BigDecimal qtCol;

	@Column(name = "SG_GRUPO", length = 10)
	private String sgGrupo;

	public Grupo() {
	}

	public Long getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getHdCol1() {
		return hdCol1;
	}

	public void setHdCol1(String hdCol1) {
		this.hdCol1 = hdCol1;
	}

	public String getHdCol2() {
		return hdCol2;
	}

	public void setHdCol2(String hdCol2) {
		this.hdCol2 = hdCol2;
	}

	public String getHdCol3() {
		return hdCol3;
	}

	public void setHdCol3(String hdCol3) {
		this.hdCol3 = hdCol3;
	}

	public String getHdCol4() {
		return hdCol4;
	}

	public void setHdCol4(String hdCol4) {
		this.hdCol4 = hdCol4;
	}

	public String getHdCol5() {
		return hdCol5;
	}

	public void setHdCol5(String hdCol5) {
		this.hdCol5 = hdCol5;
	}

	public String getNmGrupo() {
		return nmGrupo;
	}

	public void setNmGrupo(String nmGrupo) {
		this.nmGrupo = nmGrupo;
	}

	public BigDecimal getQtCol() {
		return qtCol;
	}

	public void setQtCol(BigDecimal qtCol) {
		this.qtCol = qtCol;
	}

	public String getSgGrupo() {
		return sgGrupo;
	}

	public void setSgGrupo(String sgGrupo) {
		this.sgGrupo = sgGrupo;
	}

}