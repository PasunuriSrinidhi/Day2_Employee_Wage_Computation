import java.util.*;
public class EmpMonth{
public static final int IS_PART_TIME=1;
public static final int IS_FULL_TIME=2;
public static final int EMP_RATE=20;
public static final int NUM_OF_WORKING_DAYS=30;
public static void main (String[] args){
int empHrs=0,empWage=0,totalWage=0;
for(int day=0;day<NUM_OF_WORKING_DAYS;day++){
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
empWage=empHrs=EMP_RATE;
totalWage+=empWage;
System.out.println("Emp Wage: "+empWage);
}
System.out.println("Total Emp Wage: "+totalWage);

}
}