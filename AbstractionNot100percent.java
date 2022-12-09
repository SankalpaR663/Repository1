// demo of  y abstraction class does not achieve 100% abstraction 

package abstraction;

public abstract class Shape 
{
	public abstract void draw();
	public void display()//non abstract methods
	{
		System.out.println("welcome");
	}

}

package abstraction;

public class Circle extends Shape
{

	@Override
	public void draw() 
	{
		System.out.println("i can draw circle");
		// TODO Auto-generated method stub
		
	}
	

}
package abstraction;

public class Rectangle extends Shape
{

	@Override
	public void draw() {
		System.out.println("i can draw rectangle");
		
	}

}



package abstraction;

public class ShapeMain {

	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.draw();
		circle.display();
		Rectangle rectangle=new Rectangle();
		rectangle.draw();
		rectangle.display();


	}

}
