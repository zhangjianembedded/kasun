import java.awt.Graphics;


public class Dog extends Shape{

	@Override
	protected void hook_paint(Graphics gr) {
		System.out.println("Dog");
	}

}
