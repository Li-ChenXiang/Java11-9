package work;

public class Doctor implements Student,Teacher{	
	String name;
	String sex;
	int age;
	double pay;
	double salary;
	
	//构造博士研究生带参构造函数
	public Doctor(String name,String sex,int age,double pay,double salary){
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.pay=pay;
		this.salary=salary;
	}
	//构造无参构造函数
	public Doctor(){}
	
	//工资
	@Override
	public void salaryTeacher(double salary) {
		this.salaryTeacher(salary);		
	}
	@Override
	public double searchTeacher() {
		return salary;		
	}
	
	//学费
	@Override
	public void payStudent(double pay) {
		this.payStudent(pay);		
	}
	@Override
	public double searchStudent() {
		return pay;		
	}
	
	//姓名
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//性别
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//年龄
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}
	
	