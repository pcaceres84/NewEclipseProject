package arrayListDemo;

import java.util.ArrayList;

public class arrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList obj= new ArrayList();
		
		//added integer to the obj object
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add("This is ArrayList");
		obj.add("This is ArrayList Demo");
		obj.add('E');
		obj.add(true);
		
		System.out.println("The size of obj object is:" +obj.size());
		
		
		System.out.println(obj);
		System.out.println("The index of 5 is:" +obj.get(6));
		
		
		
		
		
		

	}

}
