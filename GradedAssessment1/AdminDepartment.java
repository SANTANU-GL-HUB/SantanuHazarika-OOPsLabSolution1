package com.greatlearning.GradedAssessment1;

public class AdminDepartment extends SuperDepartment {
	//declare method departmentName of return type string
    public String departmentName() {
        return "Welcome to Admin Department";
    }
 
    //declare method getTodaysWork of return type string
    public String getTodaysWork() {
         return "Complete your documents submission";
    }
    
    //declare method getWorkDeadline of return type string
    public String getWorkDeadline() {
         return "Complete by EOD";
    }


}
