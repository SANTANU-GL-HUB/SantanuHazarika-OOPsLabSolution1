package com.greatlearning.GradedAssessment1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("------------------------------------");
         AdminDepartment ad = new AdminDepartment();
         System.out.println(ad.departmentName());
         System.out.println(ad.getTodaysWork());
         System.out.println(ad.getWorkDeadline());
         System.out.println(ad.isTodayAHoliday());

         System.out.println("------------------------------------");


         // create the object of Hr Department and use all the methods
         HrDepartment hd = new HrDepartment();
         System.out.println(hd.departmentName());
         System.out.println(hd.doActivity());
         System.out.println(hd.getTodaysWork());
         System.out.println(hd.getWorkDeadline());
         System.out.println(hd.isTodayAHoliday());
         System.out.println("------------------------------------");

         // create the object of TechDepartment and use all the methods
         TechDepartment td = new TechDepartment();
         System.out.println(td.departmentName());
         System.out.println(td.getTodaysWork());
         System.out.println(td.getWorkDeadline());
         System.out.println(td.getTechStackInformation());
         System.out.println(td.isTodayAHoliday());

         System.out.println("------------------------------------");

	}

}
