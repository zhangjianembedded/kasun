
public class Main {

	public static void main(String[] args) {
		IShape shape = new Bird();
		shape.template_paint(null);
		shape=new Dog();
		shape.template_paint(null);
	} 

}
