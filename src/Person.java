public class Person {
	public static String uji = new String("氏");
	public static String na = new String("名");
	public String firstname;
	public String lastname;

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

		Person person1 = new Person();
		person1.setfirstname("渡辺");
		person1.setlastname("高志");
		person1.showname();

		Person person2 = new Person();
		person2.setfirstname("和田");
		person2.setlastname("充史");
		person2.showname();

		person1.showname();
	}
}