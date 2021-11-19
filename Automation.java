package learnInterface;

public class Automation extends MultipleLanguage implements Language, TestTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation aut = new Automation();
		aut.selenium();
		aut.java();
		aut.ruby();
		aut.python();

	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("selenium");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
	}

}
