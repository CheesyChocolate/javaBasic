public class Lab29 {
	public static void main(String Args[]) {
		// create a new instance of subclass
		SubClass sub = new SubClass();
		// create a new instance of subclass through superclass
		SuperClass sup = new SubClass();
		// call the method in subclass
		sub.hello();
		sub.world();
		// call the method in superclass
		sup.hello();
		/* sup.world(); */
	}
}

class SuperClass {
	public void hello() {
		System.out.println("hello");
	}
}

class SubClass extends SuperClass {
	public void world() {
		System.out.println("world");
	}
}
