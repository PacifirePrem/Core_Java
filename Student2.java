
public class Student2{
       
       private int Roll_No; 
       private String Student_Name;
       private int Maths; 
       private int English;
       private int Science;
       private int overall_marks;
       public int getoverall_marks() {
        return overall_marks;
    }
    public void setoverall_marks(int overall_marks) {
        this.overall_marks = overall_marks;
    }
    private int Total_Marks;
       private String Grade;
       
       public int getRoll_No() {
        return Roll_No;
    }
    public String getStudent_Name() {
        return Student_Name;
    }
    public int getTotal_Marks(){
        return Total_Marks;
    }
    public void setStudent_Name(String Student_Name) {
        this.Student_Name = Student_Name;
    }
    public int getMaths() {
        return Maths;
    }
    public void setMaths(int Maths) {
        this.Maths = Maths;
    }
    public int getEnglish() {
        return English;
    }
    public void setEnglish(int English) {
        this.English = English;
    }
    public int getScience() {
        return Science;
    }
    public void setScience(int Science) {
        this.Science = Science;
    }
    public float Percentage(float overall_marks, float Total_Marks){
        return (float)((overall_marks/ Total_Marks) * 100);
    }
    public void setPercentage(float Percentage){
        this.Percentage(Percentage, Percentage);
    }
    public String Grade(int overall_marks) {
        if(overall_marks>=250){
            System.out.println("A Grade");
        }
        else if(overall_marks>=240 && overall_marks<250){
            System.out.println("B Grade");
        }
        else if(overall_marks>=220 && overall_marks<240){
            System.out.println("C Grade");
        }
        else if(overall_marks>=200 && overall_marks<220){
            System.out.println(" D Grade");
        }
        else{
            System.out.println("Fail");
        }
        return Grade;
    }
    
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.Roll_No = 22;
        s1.Student_Name = "Munish";
        s1.English = 85;
        s1.Science = 80;
        s1.Maths = 75;
        System.out.println(s1.Student_Name);
        System.out.println(s1.Percentage(240, 300));
        System.out.println(s1.Grade(235));
}
}



