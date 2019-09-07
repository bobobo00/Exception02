package test;
/**
 * 异常处理：try catch抛出异常
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readMyfile();

	}
	public static void readMyfile(){
		FileReader reader=null;
		try {
			System.out.println("1");
			reader=new FileReader("e:/b.txt");
			System.out.println("2");
			char c1=(char)reader.read();
			System.out.println(c1);
			
		//两个异常不能调换位置，一般为子类异常在前，父类异常在后
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("3");
			e.printStackTrace();//打印异常信息
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("4");
			e.printStackTrace();
		}finally {
			System.out.println("5");
			try {
				if(reader!=null) {
				reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("7");
				e.printStackTrace();
			}
		}
	}

}
