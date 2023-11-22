import java.util.*;
class EmployeeCheck{
public static void main(String[] args){
int IS_FULL_TIME=1;
double emp=Math.floor(Math.random()*10)%2;
if(emp==IS_FULL_TIME){
System.out.println("Employee is present");
}
else{
System.out.println("Employee is absent");
}

}
}