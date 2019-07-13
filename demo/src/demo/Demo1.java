package demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class A{
	public A(){
		System.out.println("A Cons call");
	}
	void show() {
		System.out.println("Show");
	}
}
class B{
	public B(){
		System.out.println("B Cons Call");
	}
	void print() {
		System.out.println("Print");
	}
}
public class Demo1 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Enter the Class Name to Load");
		Scanner scanner = new Scanner(System.in);
		String className = scanner.next();
		Object object = Class.forName(className).getConstructor().newInstance();
		System.out.println("Method Name to be Call");
		String methodName = scanner.next();
		Method method = object.getClass().getDeclaredMethod(methodName);
		method.invoke(object);
	}

}
