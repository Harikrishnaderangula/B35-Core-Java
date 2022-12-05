package stringbuilderdemo;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("India is motivational counry");//28
		
		
		//capcity method returns the current capacity
		/*The capacity is the number of charactersthat can be stored 
		(including already written characters), beyond whichan allocation will occur*/
		System.out.println(s.capacity());//by default capacity is 16+it will take length of input
		System.out.println(s.length());
		System.out.println(s.append("Delhi"));
		
		System.out.println(s.insert(10, "Andhrapradesh"));
		
		System.out.println(s.capacity());//by default capacity is 16+it will take length of input
		s.setCharAt(2, 'Z');
		System.out.println(s);

	}

}
