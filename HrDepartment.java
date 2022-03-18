package com.support.mycompany.hr;

import com.support.mycompany.SuperDepartment;

public class HrDepartment extends SuperDepartment {
    public String departmentName(){
        return "Hr Department";
    }
    public String getTodaysWork(){
        return "Fill today’s worksheet and mark your attendance";
    }
    public String getWorkDeadline(){
        return "Complete by EOD";
    }
    public String doActivity(){
        return "Team Lunch";
    }
}
