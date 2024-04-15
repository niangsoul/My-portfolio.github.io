package C03;

public class SimpleDto {
	
	private String name;
	private int age;
	private String addr;
	@Override
	public String toString() {
		return "SimpleDto [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public SimpleDto(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	//toString
	
	//getter And Setter
	
	//모든 인자 생성자
	
	
}
