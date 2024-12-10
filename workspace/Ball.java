import java.awt.*;

//
//  Class author: Erin Dobbs 
//  Date created:  December 3 2024
//  General description: Makes the ball for brick break 


public class Ball {
	//your code here!
	
	//don't forget you need instance variables:

private int size;
private int x;
private int y;
private int yVelocity;
private int xVelocity;

	//constructor(s):
	public  Ball(int x, int y, int size){
this.x = x;
this.y = y;
this.size = size;
this.yVelocity = 1;
this.xVelocity = 1;

}

public int getXpos() {
	return x;
}

public void setX(int Xpos) {
	this.x = Xpos;
}

public int getSize() {
	return size;
}

public void setSize(int size) {
	this.size = size;
}




public int getYpos() {
	return y;
}

public void setY(int Ypos) {
	this.y = Ypos;
}

public int getyVelocity() {
	return yVelocity;
}

public void setYVelocity(int yVelocity) {
	this.yVelocity = yVelocity;
}

public int getXVelocity() {
	return xVelocity;
}

public void setXVelocity(int addVelocity) {
	this.xVelocity = addVelocity;
}

public void move(){
	x+= xVelocity;
	y+= yVelocity;
}

public void reverseX(){
	xVelocity = (-1* xVelocity);
}

public void reverseY(){

	yVelocity = (-1 *yVelocity);
}

//
//  Pre-condition: a postive number 
//  Post-condition: draws the ball 

//
	//methods:
	public void draw(Graphics g) {
		g.setColor(Color.red); // call first to set the desired color
		g.fillOval(x,y, size, size); // draws an oval (ball)

	}
	
}
