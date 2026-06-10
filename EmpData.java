package day6;
class Employee{
    int id;
    String name;
    int salary;
    String email;
    String role;
    static String company="google";
    public Employee(int id,String name,int salary,String email,String role,String company){
        this.id=id;
         this.name=name;
          this.salary=salary;
           this.email=email;
            this.role=role;
             this.company=company;
    }
    public void displayDetails(){
        System.out.println("Id is: "+ this.id);
        System.out.println("Name is: "+ this.name);
        System.out.println("Salary is: "+ this.salary);
        System.out.println("Email is: "+ this.email);
        System.out.println("Role is: "+ this.role);
        System.out.println("Company is: "+ Employee.company);
        System.out.println("___________________");
    }
    

public class EmpData {
    public static void main(String[] args) {
        Employee e1 = new Employee(101,"jaanu",7000,"jaanu@gmail.com","manager","wipro");
        Employee e2 = new Employee(102,"laxmi",5000,"laxmi@gmail.com","dev","wipro");
        e1.displayDetails();
        e2.displayDetails();
    
}
}
}