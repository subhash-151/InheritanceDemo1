package encapsulation;

public class Demo {

	public static void main(String[] args) {
		
		Programmer p= new Programmer();
		p.setName("subhash");
		System.out.println("name is:"+p.getName());
		
		
		Employee e= new Employee();
		e.setName("subhash");
		e.setsalery(20000);
		e.setid(2087);
		
		System.out.println("name is:"+e.getName());
		System.out.println("salery is:"+e.getsalery());
		System.out.println("id id:"+e.getid());
		
	}

}
