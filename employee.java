package com.company;
class emp{
    int id;
    String name;
    public void printdetails(){
        System.out.println("My id is: " + id);
        System.out.println(("My name is: " + name));
    }
}
public class employee {
    public static void main(String[] args) {
        emp harry = new emp();
        emp prem = new emp();

        harry.id = 10;
        harry.name = "harry";

        prem.id = 12;
        prem.name = "prem kumar";

        harry.printdetails();
        prem.printdetails();

    }
}