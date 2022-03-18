package com.support.mycompany;

import com.support.mycompany.admin.AdminDepartment;
import com.support.mycompany.hr.HrDepartment;
import com.support.mycompany.tech.TechDepartment;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<SuperDepartment> departments = new ArrayList<SuperDepartment>();
        departments.add(new AdminDepartment());
        departments.add(new HrDepartment());
        departments.add(new TechDepartment());

        for(SuperDepartment department : departments){
            System.out.println("Welcome to " + department.departmentName());

            if (department instanceof HrDepartment){
                HrDepartment hrDepartment = (HrDepartment) department;
                System.out.println(hrDepartment.doActivity());
            }
            System.out.println(department.getTodaysWork());
            System.out.println(department.getWorkDeadline());
            System.out.println(department.isTodayAHoliday());
            System.out.println("\n");
        }

    }


    }
