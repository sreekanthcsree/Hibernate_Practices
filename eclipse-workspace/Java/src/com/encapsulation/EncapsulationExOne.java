package com.encapsulation;

//using with Constructor
public class EncapsulationExOne {
	private int eid;
    private String ename;
	private float salary;
	
   public EncapsulationExOne(int id,String name,float sal){
		this.eid=id;
		this.ename=name;
		this.salary=sal;
	}
   EncapsulationExOne(){
	   System.out.println("I'm a Default Constructor");
   }
   
   public void display() {
	   System.out.println("Employee id : "+eid+" Employee Name : "+ename+" Salary : "+salary);
   }
   
  public static void main(String[] args) {
	EncapsulationExOne ex=new EncapsulationExOne(100,"Shyam",45000.56f);
	ex.display();
	EncapsulationExOne ex1=new EncapsulationExOne();
}

}
