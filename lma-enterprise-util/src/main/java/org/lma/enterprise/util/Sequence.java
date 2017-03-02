package org.lma.enterprise.util;

public enum Sequence {
	
	EMPLOYEE("TEST_EMPLOYEE_SEQ"),
    MAKE("TEST_MAKE_SEQ"),
    VEHICLE("TEST_VEHICLE_SEQ");

    private String sequence;

    Sequence(String sequence) {
        this.sequence = sequence;
    }

    public String getSequence() {
        return sequence;
    }

}
