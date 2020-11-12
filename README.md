# 计G202 2020322088 李晨香

# Java11-9

## 一、实验目的
1.掌握JAVA抽象类和抽象方法的定义；

2.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法；

3.了解异常的使用方法，并在程序中根据输入情况做异常处理；

## 二、实验过程
1.创建Java项目Interface;

2.创建学生接口Student,教授接口Teacher,学生接口包括缴纳学费方发和查询学费方法，教授接口包括发放薪水和查询薪水的方法；

3.创建博士研究生Doctor类，实现学生和教授两个接口，添加姓名，性别，年龄，学费和薪水五种属性，构造Docotor的有参构造函数和无参构造函数；

4.在测试类Main类中，实例化Doctor类，通过采用Scanner类实现运行时交互式输入；  

6.创建自定义异常类，通过使用throws关键字声明要产生的若干个异常，并在该方法体中给出产生异常的操作；

## 三、核心方法
1.方法一
```
//构造博士研究生带参构造函数
	public Doctor(String name,String sex,int age,double pay,double salary){
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.pay=pay;
		this.salary=salary;
	}	
}
```

2.方法二
```
//自定义异常类
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
```

3.方法三
```
//添加Course有参构造方法
public Course(int cid,String cName,String add,String time,String teacher){
	super();
	this.cid=cid;
	this.cName=cName;
	this.add=add;
	this.time=time;
	this.teacher=teacher;
}
```

4.方法四
```
//通过使用throws关键字声明要产生的若干个异常，并在该方法体中给出产生异常的操作
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
```

5.方法五
```
在try-catc块中调用可能发生的异常方法
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
```

6.方法六
```
//判断纳税的范围
if (Sj < 3000 * 12) {
			System.out.println("年收入为" + Sj + "，低于（3000）元，不需纳税！");
		} else if (Sj >= 3000 * 12 && Sj < 12000 * 12) {
			Ns = (Sj - 3000 * 12) * 0.1;
			System.out.println("年收入为" + Sj + "，应缴纳" + Ns + "元。");
		} else {
			Ns = (Sj - 12000 * 12) * 0.2;
			System.out.println("年收入为" + Sj + "，应缴纳" + Ns + "元。");
		}
```

## 四、实验结果
1.每月薪水高于3000时的输出结果
```
姓名：
李晨香
性别：
女
年龄：
21
请输入正确的年龄（不低于23岁)：
24
每月薪水：
6500
月工资不能高于6000元，请重新输入：
6000
需缴纳学费：
5000
年收入为67000.0，应缴纳3100.0元。
```
2.每月薪水低于3000时的输出结果
```
姓名：
李晨香
性别：女
年龄：
23
每月薪水：
5000
需缴纳学费：
45000
年收入为15000.0，低于（36000）元，不需纳税！
```

## 五、实验感想
实验过程中遇到的问题：1.在创建自定义异常类后，在Main方发中运行时无法捕获异常； 解决方法：在对应try-catch块中调用相应的异常； 2.捕获异常后，无法重新输入信息；解决方法：在catch方法体中输入年龄和薪水的调用语句。

