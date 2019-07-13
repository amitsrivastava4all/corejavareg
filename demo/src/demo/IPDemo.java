package demo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPDemo {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress ip = InetAddress.getLocalHost();
		System.out.println(ip);
		System.out.println("Enter the Host Name");
		String hostName =new Scanner(System.in).next();
		InetAddress inet2[] = InetAddress.getAllByName(hostName);
		for(InetAddress i : inet2) {
			System.out.println(i);
		}
		

	}

}
