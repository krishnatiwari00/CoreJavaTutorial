package string;

public class StringBufferIntro1 {//string buffer is mutable and thread safe class in java, StringBuffer is suitable for multi thread env

	public static void main(String[] args) {
		String name = "Krishna";//string class is immutable so we can not perform any actions like insert,append, insert,replace, delete, reverse operations in it
		name.concat("Tiwari");
		System.out.println("unmutalbe string output: "+name);//it will print only Krishna
		
		StringBuffer name1 = new StringBuffer("Sachin");
		
		name1.append("Tiwari");
		System.out.println("Mutable string output is: "+name1);//it will print Sachin Tiwari becasue StringBuffer is mutable so we can perform actions like append, insert, replace, delete
		
		name1.reverse();
		System.out.println("Mutable string reverse method use :"+name1);
		
		name1.insert(4, "Tiwari");
		System.out.println("Mutalbe string insert method use :"+name1);//it will print SachTiwariinTiwari
		
		name1.replace(1, 20, "Subham");
		System.out.println("Mutable string replace method use: "+name1);//it will print SSubham
		
		name1.delete(1, 20);
		System.out.println("Mutable string delete method use: "+name1);//it will pring only S
		
	}

}
