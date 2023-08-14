

public class MethodOverloading {
    //static void change(int [] arr){
         //arr[0] =98;
    //}
    static void Employee(){
        System.out.println("Welcome Employee");
    }
    static void Employees(int a){
        System.out.println("Your Emp id is: "+a);
    }
    static void Employees(int a,int b){
        System.out.println("Your house number is: "+a);
        System.out.println("Your job id is: "+b);
    }

    public static void main(String[] args) {
        //int [] marks = {57,68,55,54,35};
        //change(marks);
        //System.out.println("The value at 0 is: "+marks[0]);
        Employee();
        Employees(101);
        Employees(1,111);
    }
}
