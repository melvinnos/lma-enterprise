package org.lma.enterprise.util.model.vo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "TABLES" database table.
 * 
 */
@Entity
@Table(name="TABLES")
public class TableVO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TABLE_PK")
	private Long tablePk;

	@Column(name="TABLE_AVB_CHAIRS")
	private Double tableAvbChairs;

	@Column(name="TABLE_NAME")
	private String tableName;

	@Column(name="TABLE_RESERVABLE")
	private Double tableReservable;

	@Column(name="TABLE_TYPE")
	private String tableType;

	//bi-directional many-to-one association to Reservation
	@OneToMany(mappedBy="table")
	private List<ReservationVO> reservations;

	//bi-directional many-to-one association to Branch
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="BRANCH_ID")
	private BranchVO branch;

	public TableVO() {
	}

	
	public Long getTablePk() {
		return tablePk;
	}


	public void setTablePk(Long tablePk) {
		this.tablePk = tablePk;
	}


	public Double getTableAvbChairs() {
		return this.tableAvbChairs;
	}

	public void setTableAvbChairs(Double tableAvbChairs) {
		this.tableAvbChairs = tableAvbChairs;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Double getTableReservable() {
		return this.tableReservable;
	}

	public void setTableReservable(Double tableReservable) {
		this.tableReservable = tableReservable;
	}

	public String getTableType() {
		return this.tableType;
	}

	public void setTableType(String tableType) {
		this.tableType = tableType;
	}

	public List<ReservationVO> getReservations() {
		return this.reservations;
	}

	public void setReservations(List<ReservationVO> reservations) {
		this.reservations = reservations;
	}

	public BranchVO getBranch() {
		return branch;
	}

	public void setBranch(BranchVO branch) {
		this.branch = branch;
	}
}