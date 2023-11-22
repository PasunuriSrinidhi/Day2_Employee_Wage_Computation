import java.util.*;
class EmployeeDailyWage{
public static void main(String[] args){
int IS_FULL_TIME=1;
int EMP_RATE=20;
int empHrs=0;
int empWage=0;
double emp=Math.floor(Math.random()*10)%2;
if(emp==IS_FULL_TIME){

empHrs=8;
}
else{
empHrs=0;
}
empWage=empHrs*EMP_RATE;
System.out.println("Emp Wage: "+empWage);

}
}
