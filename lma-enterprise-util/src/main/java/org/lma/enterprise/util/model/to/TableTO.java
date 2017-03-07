package org.lma.enterprise.util.model.to;


public class TableTO extends TO{
	private static final long serialVersionUID = 1L;

	private Long tablePk;

	private Double tableAvbChairs;

	private String tableName;

	private Double tableReservable;

	private String tableType;
	
	private Long branchPk;

	public Long getTablePk() {
		return tablePk;
	}

	public void setTablePk(Long tablePk) {
		this.tablePk = tablePk;
	}

	public Double getTableAvbChairs() {
		return tableAvbChairs;
	}

	public void setTableAvbChairs(Double tableAvbChairs) {
		this.tableAvbChairs = tableAvbChairs;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Double getTableReservable() {
		return tableReservable;
	}

	public void setTableReservable(Double tableReservable) {
		this.tableReservable = tableReservable;
	}

	public String getTableType() {
		return tableType;
	}

	public void setTableType(String tableType) {
		this.tableType = tableType;
	}

	public Long getBranchPk() {
		return branchPk;
	}

	public void setBranchPk(Long branchPk) {
		this.branchPk = branchPk;
	}
}