public class Person {
	public static String uji = new String("氏");
	public static String na = new String("名");
	public String firstname = new String("");
	public String lastname = new String("");

	public String getfirstname(){
		return this.firstname;
	}

	public void setfirstname(String name){
		this.firstname = name;
	}

	public String getlastname(){
		return this.lastname;
	}

	public void setlastname(String name){
		this.lastname = name;
	}

	public void showname(){
		System.out.println("氏:"+this.firstname+" "+"名:"+this.lastname);
	}

	public static void main(String[] args){
		String firstname1 = new String("渡辺");
		String lastname1 = new String("高志");
		String firstname2 = new String("和田");
		String lastname2 = new String("充史");

		this.setfirstname("firstname1");
		this.setlastname("lastname1");
		this.showname();

		this.setfirstname("firstname2");
		this.setlastname("lastname2");
		this.showname();

		this.setfirstname("firstname1");
		this.setlastname("lastname1");
		this.showname();
	}
}