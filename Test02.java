package test;
/**
 * �쳣����try catch�׳��쳣
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
			
		//�����쳣���ܵ���λ�ã�һ��Ϊ�����쳣��ǰ�������쳣�ں�
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("3");
			e.printStackTrace();//��ӡ�쳣��Ϣ
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
