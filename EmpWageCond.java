import java.util.*;
public class EmpWageCond{
public static final int IS_PART_TIME=1;
public static final int IS_FULL_TIME=2;
public static final int EMP_RATE=20;
public static final int NUM_OF_WORKING_DAYS=30;
public static final int MAX_HRS=10;
public static void main (String[] args){
int empHrs=0,totalEmpHrs=0,totalDays=0;
while(totalEmpHrs<=MAX_HRS && totalDays<NUM_OF_WORKING_DAYS){
totalDays++;
int emp=(int) Math.floor(Math.random()*10)%3;
switch(emp){
case IS_PART_TIME:
empHrs=4;
break;
case IS_FULL_TIME:
empHrs=8;
break;
default:
empHrs=0;

}
totalEmpHrs+=empHrs;
System.out.println("Days "+totalDays+" Emp Hr: "+empHrs);

}
int totalEmpWage=totalEmpHrs+EMP_RATE;
System.out.println("Total Emp Wages: "+totalEmpWage);
}
}