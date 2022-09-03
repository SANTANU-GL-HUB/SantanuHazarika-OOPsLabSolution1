package com.greatlearning.GradedAssessment1;

public class HrDepartment extends SuperDepartment {
	 //declare method departmentName of return type string
    public String departmentName() {
        return "Welcome to Hr Department";
    }
 
    //declare method getTodaysWork of return type string
    public String getTodaysWork() {
         return "Fill todays timesheet and mark your attendance";
    }
    
    //declare method doActivity of return type string
    public String doActivity() {
         return "Team Lunch";
    }

    //declare method getWorkDeadline of return type string
    public String getWorkDeadline() {
         return "Complete by EOD";
    }

}
