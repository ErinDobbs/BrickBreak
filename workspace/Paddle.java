import java.awt.*;

//
//  Class author: Erin Dobbs 
//  Date created:  December 3 2024
//  General description: Makes the paddle for brick break 


public class Paddle {

	//your code here!
	
	//don't forget you need instance variables:
	private int Velocity;
	private int Width;
	private int Height;
	private int Y;
	private int X;
	private int addVelocity;

	//constructor(s):
public  Paddle(int X, int Y , int Width , int Height){
this.Velocity = 1;
this.X = X;
this.Y = Y;
this.Width = Width;
this.Height = Height;
this. addVelocity = 1;
}
	//methods:
	public int getX() {
		return X;
	}
	
	public void setX(int X) {
		this.X = X;
	}
	
	public int getY() {
		return Y;
	}
	
	public void setY(int Y) {
		this.Y = Y;
	}
	
	public int getWidth() {
		return Width;
	}
	
	public void setWidth(int Width) {
		this.Width = Width;
	}
	
	public int getHeight() {
		return Height;
	}
	
	public void setHeight(int Height) {
		this.Height= Height;
	}
	
	public int getVelocity() {
		return Velocity;
	}
	
	public void setVelocity(int Velocity) {
		this.Velocity = Velocity;
	}


	public void addVelocity(int toAdd) {
	Velocity = Velocity + toAdd	;
	}
	

//
//  Pre-condition: a postive number 
//  Post-condition: draws the paddle 

//


	public void draw(Graphics g) {
		   g.setColor(Color.red); // call first to set the desired color
               g.fillRect(X, Y, Width, Height); // draws a rectangle (paddle)

	}
//
//  Pre-condition: there needs to be a velocity 
//  Post-condition: moves the ball
//


	public void move(){
		X+= Velocity;
	}
	


	
}


