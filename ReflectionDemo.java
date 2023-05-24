import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//Loading the Laptop class with the help of class "Class"
		Class c = Class.forName("Laptop");
		
		//Creating a Laptop object
		Laptop laptop01 = new Laptop();
		
		
		//Some Interesting methods We can use with Class object c
		System.out.println(c.getName());
		System.out.println(c.getConstructors());
		System.out.println(c.getMethods());
		
		//Calling a private method of other class
		Method m = c.getDeclaredMethod("playingVideo",null);
		m.setAccessible(true);
		m.invoke(laptop01);

	}

}
