class Emp{ //Encapsulated Classification
	public int empid;  //abstracted attribute
	public String name; //abstracted attribute
	private int sal; //Encapsulated attribute (data hidden)
	public int getSal(){ //getter() for sal : property
		return sal;
	}
	public void setSal(int s){ //setter() for sal : property
		if(s<=0){
			s=0;
		}
		sal=s;
	}
	public void inputEmp(int id,String n, int s){ //Abstracted behavior
		empid=id;
		name=n;
		setSal(s);
	}
	public void display(){ //Abstracted behavior
		System.out.println("Emp Details: Name:" + name + " id: " + empid + " Salary: "+ sal);
	}
}
public class Hello {

	public static void main(String[] args) {
		Emp e1=new Emp();
		e1.inputEmp(101, "Abc", 2000000);
		e1.display();
		System.out.println("Hello World!");

	}

}
