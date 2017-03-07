package org.lma.enterprise.util.model.vo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "TABLES" database table.
 * 
 */
@Embeddable
public class TablePKVO implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="TABLE_PK")
	private Long tablePk;

	@Column(name="BRANCH_ID", insertable=false, updatable=false)
	private Long branchId;

	public TablePKVO() {
	}
	public Long getTablePk() {
		return this.tablePk;
	}
	public void setTablePk(Long tablePk) {
		this.tablePk = tablePk;
	}
	public Long getBranchId() {
		return this.branchId;
	}
	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TablePKVO)) {
			return false;
		}
		TablePKVO castOther = (TablePKVO)other;
		return 
			(this.tablePk == castOther.tablePk)
			&& (this.branchId == castOther.branchId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.tablePk ^ (this.tablePk >>> 32)));
		hash = hash * prime + ((int) (this.branchId ^ (this.branchId >>> 32)));
		
		return hash;
	}
}