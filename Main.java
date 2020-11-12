package work;

import java.util.Scanner;

class InterfaceException extends Exception {
	String message;
	public InterfaceException(int age) {
		message= "请输入正确的年龄（不低于23岁)：";		
	}

	public InterfaceException(double salary) {
		message="月工资不能高于6000元，请重新输入：";
	}

	public String warnMess() {
		return message;		
	}
}

class Interface{
	public static void myException (int age) throws InterfaceException{
		if(age<=22){
			throw new InterfaceException(age);//方法拋出异常，导致方法结束
		}		
	}
	
	public static void my (double salary) throws InterfaceException{
		if(salary>6000){
			throw new InterfaceException(salary);//方法拋出异常，导致方法结束
		}		
	}
}


public class Main {
	public static void main(String args[]) throws InterfaceException{
		// 对象实例化
		Doctor doc = new Doctor();		
		
		// 用Scanner类实现输入
		Scanner sc = new Scanner(System.in);
		
		System.out.println("姓名：");
		doc.name = sc.next();

		System.out.println("性别：");
		doc.sex = sc.next();
		
		//对年龄异常捕获
		try {
			System.out.println("年龄：");		
			doc.age = sc.nextInt();	
			Interface.myException(doc.age);
		}catch(InterfaceException e) {
			System.out.println(e.message);
			doc.age = sc.nextInt();			
		}		
		
		//对每月薪水异常捕获
		try{
			System.out.println("每月薪水：");
			doc.salary = sc.nextDouble();
			Interface.my(doc.salary);
		}catch(InterfaceException e){
			System.out.println(e.message);
			doc.salary = sc.nextDouble();
		}
		
		System.out.println("需缴纳学费：");
		doc.pay = sc.nextDouble();		
		
		double Ysalary = doc.salary * 12;// 年收入=每月薪水*12
		double Sj = Ysalary - doc.pay;// 实际年收入=年收入-学费
		// System.out.println(Sj);
		double Ns;// 年应纳税金额

		if (Sj < 3000 * 12) {
			System.out.println("年收入为" + Sj + "，低于（36000）元，不需纳税！");
		} else if (Sj >= 3000 * 12 && Sj < 12000 * 12) {
			Ns = (Sj - 3000 * 12) * 0.1;
			System.out.println("年收入为" + Sj + "，应缴纳" + Ns + "元。");
		} else {
			Ns = (Sj - 12000 * 12) * 0.2;
			System.out.println("年收入为" + Sj + "，应缴纳" + Ns + "元。");
		}
		
	}

}

