package br.com.isystem.dashboard.service.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class GrupoDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9217903181482631917L;

	private Long idGrupo;

	private String hdCol1;

	private String hdCol2;

	private String hdCol3;

	private String hdCol4;

	private String hdCol5;

	private String nmGrupo;

	private BigDecimal qtCol;

	private String sgGrupo;

	public GrupoDTO() {
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