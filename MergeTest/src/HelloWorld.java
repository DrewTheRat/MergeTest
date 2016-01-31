
public class HelloWorld {

	private int i = 0;
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
	/**
	 * If you can't say something nice, say it in all CAPS.
	 */
	public void shout(String s) {
		System.out.println(s.toUpperCase());
		i++;
	}
	public int howManyTimes(){
		return i;
	}
}
