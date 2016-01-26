import java.awt.Graphics;


public abstract class Shape implements IShape{
	public	void template_paint(Graphics gr){
		invariant_paint(gr);
		hook_paint(gr);
	}
	private void invariant_paint(Graphics gr){
		//do Something
		System.out.println("invariant_paint");
	}
	abstract protected void hook_paint(Graphics gr);
}
