public class arrays {
    public static void main(String[]args){
       // int [] marks = new int[5];
        //marks[0] = 62;
        //marks[1] = 100;
        //marks[2] = 76;
        //marks[3] = 86;
        //marks[4] = 92;
        //System.out.println(marks.length);
       // int [] marks = {85,66,48,58,52};
        String [] students = {"Prem","Aditya","Rajshi"};
        //reverse order
        //System.out.println(students.length);
        //for(int i=students.length-1;i>=0;i--){
            //System.out.println(students[i]);
        //for (int i = 0; i<students.length;i++){
            //System.out.println(students[i]);
        //}
        for (String element: students){
            System.out.println(element);
        }
    }
}
