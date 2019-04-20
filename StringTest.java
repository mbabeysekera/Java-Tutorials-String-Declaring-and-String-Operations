/*
 * Author @ BUDDHIKA ABEYSEKERA
 * 
 * This tutorial is all about Java String manipulations.
 * Here we will discuss about the String Pool in heap memory and new object 
 * references with object re-defining method.
 * 
 * Besides that the string concatenate techniques will also be covered here.
 * 
 * Thank you.
 * 
 * Check out me on: LinkedIn: https://www.linkedin.com/in/babey/ 
 * 					GitHub: https://github.com/mbabeysekera/
 */
public class StringTest {

	public static void main(String[] args) {
		//To declare a String
		String str; //Here just the variable str is created on the heap memory
		            //in String Pool 
	    //the declared string can be defined as,
		str = "Hello World";
		System.out.println(str);
		
		/*
		 * But if you declare the String as an object of the string class
		 * then it will no longer store in the String pool. Instead it will be 
		 * put in a new object on the heap memory.
		 * Let's say you have defined a variable as above called str.
		 * So str will be created in String Pool.
		 * If you declare a new String object on the heap memory, it will not put
		 * your string on its heap memory location. It keeps a memory location in which 
		 * the address or the Hash code will be stored in the object location and that hash code 
		 * points the String Pool location or the memory address.   
		 * This is really a nice thing in Java.
		 */
		
		String strObj = new String("Hello Object World");//String Object
						//Here the default constructor can be used to set the values.
		System.out.println(strObj);
		
		/*
		 * And you can even declare the string object and later you can assign
		 * values to it.
		 */
		String strObjL = new String();
		strObjL = "Hello later assign";
		System.out.println(strObjL);
		/*
		 * Java String concatenate is quite simple and easy.
		 */
		//First Method (1)
		String concat = str.concat(strObj); //Here the String str which we created before
						// and the next strObj will be concatenated using concat Method.
		System.out.println(concat);
		
		//Second Method (2)
		String addingStr = str + strObj; // Just use + to concatenate two strings
		System.out.println(addingStr);

	}

}
