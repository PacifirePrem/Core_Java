class Mymainemployee{
    private int id;
    private String name;
    public Mymainemployee(){
        id =99;
        name = "Your name here";
    }
    public Mymainemployee(String myname,int myid){
        id = myid;
        name = myname;
    }
    public void setid(int i){
        id = i;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
}

public class Constructors {
    public static void main(String[] args) {
        //Mymainemployee employee = new Mymainemployee("Code with PREM",5);
        Mymainemployee employee = new Mymainemployee();
        System.out.println(employee.getid());
        System.out.println(employee.getname());
    }
}
