
 class employee {
     int id;
     String name;
     public void printdetails(){
         System.out.println("My id is: "+id);
         System.out.println("My name is: "+name);
     }
        }
public class customclass {
    public static void main(String[] args) {
        employee Harry = new employee();
        Harry.id = 1;
        Harry.name = "Code with Harry";
        //Printing attributes
        //System.out.println(Harry.id);
        //System.out.println(Harry.name);

        Harry.printdetails();
    }
}
