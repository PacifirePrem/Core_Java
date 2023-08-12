

public class Gradingsys {
    public static void main(String[] args) {
        int marks = 65;
        if(marks>=90){
            System.out.println("A Grade");
        }
        else if(marks>=70 && marks<90){
            System.out.println("B Grade");
        }
        else if(marks>=60 && marks<70){
            System.out.println("C Grade");
        }
        else if(marks>=50 && marks<60){
            System.out.println(" D Grade");
        }
        else{
            System.out.println("Fail");
        }
    }
}
