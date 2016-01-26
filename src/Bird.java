import java.awt.Graphics;


public class Bird extends Shape{

	@Override
	protected void hook_paint(Graphics gr) {
		System.out.println("Bird");
	}

}
