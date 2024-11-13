package com.unir.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.sql.Date;

@AllArgsConstructor
@Getter
public class MySqlDeptEmp {
    private int employeeId;
    private String departmentId;
    private Date fromDate;
    private Date toDate;
}
