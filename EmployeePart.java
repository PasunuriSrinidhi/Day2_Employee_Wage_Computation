import java.util.*;
class EmployeePart{
public static void main(String[] args){

int IS_PART_TIME=1;
int IS_FULL_TIME=2;
int EMP_RATE=20;
int empHrs=0;
int empWage=0;
double emp=Math.floor(Math.random()*10)%3;
if(emp==IS_PART_TIME){
empHrs=4;
}
else if(emp==IS_FULL_TIME){
empHrs=8;
}
else{
empHrs=0;
}
empWage=empHrs*EMP_RATE;
System.out.println("Emp Wage: "+empWage);
}

}