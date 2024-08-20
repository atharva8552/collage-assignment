class Employee {
    String name, email;
    int id, Base_Salary;
    String mob_number;



    void salary() {
        float da, hra, pf, cf, gross_salary;
        da = Base_Salary * 97f / 100;
        hra = Base_Salary * 10f / 100;
        pf = Base_Salary * 12f/100;
        cf = Base_Salary * 0.1f/100;
        gross_salary = Base_Salary+da+hra-pf-cf;

        System.out.println("Employee ID:"+id);
        System.out.println("Employee Name:"+name);
        System.out.println("Mob number:"+mob_number);
        System.out.println("Basic Salary:"+Base_Salary);
        System.out.println("Gross Salary:"+gross_salary);
    }
}
class Programmer extends Employee
{
    Programmer(int id,String name,String mob_number,int Salary){
        this.id=id;
        this.name=name;
        this.mob_number=mob_number;
        Base_Salary=Salary;

    }
}
class Teamlead extends Employee
{
    Teamlead(int id,String name,String mob_number,int Salary)
    {
        this.id=id;
        this.name=name;
        this.mob_number=mob_number;
        Base_Salary=Salary;

    }
}
class APM extends Employee
{
    APM(int id, String name, String mob_number, int Salary) {
        this.id = id;
        this.name = name;
        this.mob_number = mob_number;
        Base_Salary = Salary;

    }
}
class ProjectManager extends Employee
{
    ProjectManager(int id, String name, String mob_number, int Salary)
    {
        this.id = id;
        this.name = name;
        this.mob_number = mob_number;
        Base_Salary = Salary;

    }
}
public class Main
{
    public static void main(String[]args){
        Programmer a=new Programmer(100,"Atharva","8390768833",400000);
        a.salary();
        System.out.println("===================================");
        Teamlead b=new Teamlead(102,"prajwal","9795654376",500000);
        b.salary();
        System.out.println("===================================");

        APM c=new APM(103,"Ram","7564746465",20000);
        c.salary();
        System.out.println("===================================");

        ProjectManager d = new ProjectManager(104,"Sham","8467908765",200000);
        d.salary();
        System.out.println("===================================");


    }

}
