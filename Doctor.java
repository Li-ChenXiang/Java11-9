package work;

public class Doctor implements Student,Teacher{	
	String name;
	String sex;
	int age;
	double pay;
	double salary;
	
	//���첩ʿ�о������ι��캯��
	public Doctor(String name,String sex,int age,double pay,double salary){
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.pay=pay;
		this.salary=salary;
	}
	//�����޲ι��캯��
	public Doctor(){}
	
	//����
	@Override
	public void salaryTeacher(double salary) {
		this.salaryTeacher(salary);		
	}
	@Override
	public double searchTeacher() {
		return salary;		
	}
	
	//ѧ��
	@Override
	public void payStudent(double pay) {
		this.payStudent(pay);		
	}
	@Override
	public double searchStudent() {
		return pay;		
	}
	
	//����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//�Ա�
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//����
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}
	
	