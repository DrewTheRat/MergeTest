
public class HelloWorld {

	public int i = 0;
	/**
	 * Say hello
	 */
	public void sayIt() {
		System.out.println("Hello World!");
		i++;
	}
	/**
	 * Say what you want.
	 */
	public void say(String s) {
		System.out.println("You said, \"" + s + ".\"");
		i++;
	}
}
