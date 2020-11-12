package work;

import java.util.Scanner;

class InterfaceException extends Exception {
	String message;
	public InterfaceException(int age) {
		message= "��������ȷ�����䣨������23��)��";		
	}

	public InterfaceException(double salary) {
		message="�¹��ʲ��ܸ���6000Ԫ�����������룺";
	}

	public String warnMess() {
		return message;		
	}
}

class Interface{
	public static void myException (int age) throws InterfaceException{
		if(age<=22){
			throw new InterfaceException(age);//���������쳣�����·�������
		}		
	}
	
	public static void my (double salary) throws InterfaceException{
		if(salary>6000){
			throw new InterfaceException(salary);//���������쳣�����·�������
		}		
	}
}


public class Main {
	public static void main(String args[]) throws InterfaceException{
		// ����ʵ����
		Doctor doc = new Doctor();		
		
		// ��Scanner��ʵ������
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������");
		doc.name = sc.next();

		System.out.println("�Ա�");
		doc.sex = sc.next();
		
		//�������쳣����
		try {
			System.out.println("���䣺");		
			doc.age = sc.nextInt();	
			Interface.myException(doc.age);
		}catch(InterfaceException e) {
			System.out.println(e.message);
			doc.age = sc.nextInt();			
		}		
		
		//��ÿ��нˮ�쳣����
		try{
			System.out.println("ÿ��нˮ��");
			doc.salary = sc.nextDouble();
			Interface.my(doc.salary);
		}catch(InterfaceException e){
			System.out.println(e.message);
			doc.salary = sc.nextDouble();
		}
		
		System.out.println("�����ѧ�ѣ�");
		doc.pay = sc.nextDouble();		
		
		double Ysalary = doc.salary * 12;// ������=ÿ��нˮ*12
		double Sj = Ysalary - doc.pay;// ʵ��������=������-ѧ��
		// System.out.println(Sj);
		double Ns;// ��Ӧ��˰���

		if (Sj < 3000 * 12) {
			System.out.println("������Ϊ" + Sj + "�����ڣ�3000��Ԫ��������˰��");
		} else if (Sj >= 3000 * 12 && Sj < 12000 * 12) {
			Ns = (Sj - 3000 * 12) * 0.1;
			System.out.println("������Ϊ" + Sj + "��Ӧ����" + Ns + "Ԫ��");
		} else {
			Ns = (Sj - 12000 * 12) * 0.2;
			System.out.println("������Ϊ" + Sj + "��Ӧ����" + Ns + "Ԫ��");
		}
		
	}

}

