package com.project75.core;

import java.io.Serializable;

/**
 *
 * @author Aryan
 */
public class TimeTableData implements Serializable {
    private final Object[][] data;
    private final String[] columns;

    public TimeTableData(Object[][] data, String[] columns) {
        this.data = data;
        this.columns = columns;
    }

    public Object[][] getData() {
        return data;
    }

    public String[] getColumns() {
        return columns;
    }
}
