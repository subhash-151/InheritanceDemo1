package encapsulation;

public class Programmer {
	
	private String name;
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name=name;
		
	}

}
class Demo1{
	
	public static void main(String[] args) {
		
		Programmer p= new Programmer();
		p.setName("subhash");
		System.out.println("name is:"+p.getName());
	}
}
