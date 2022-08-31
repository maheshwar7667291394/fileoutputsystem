package serilizableclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
		ClassA a=new ClassA();
		a.i=20;
		
		
		File file=new File("mkumar.txt");
		try {
			FileOutputStream fo=new FileOutputStream(file);
			
			
			try {
				ObjectOutputStream oss=new ObjectOutputStream(fo);
				oss.writeObject(a);
				oss.close();
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		
		try {
			FileInputStream fi = new FileInputStream(file);
		    try {
				ObjectInputStream oi=new ObjectInputStream(fi);
				try {
					Object obj=oi.readObject();
					ClassA boj=(ClassA)obj;
					System.out.println(boj.i);
//					boj.fun();
					
				} catch (ClassNotFoundException e) {
					
					e.printStackTrace();
				}
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		
	}

}
