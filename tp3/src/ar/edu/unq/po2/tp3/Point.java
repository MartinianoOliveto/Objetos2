package ar.edu.unq.po2.tp3;

public class Point {
	int x; 
	int y; 
	
	public Point(int _x, int _y) {
		x = _x; 
		y = _y; 
	}
	
	public Point() {
		x = 0; 
		y = 0; 
	}
	
	private void setX(int _x) {
		x = _x; 
	}
	private void setY(int _y) {
		y = _y; 
	}
	private int getX() {
		return x; 
	}
	private int getY() {
		return y; 
	}
	
	public void  movePoint(int _x, int _y, Point p) {
		p.setX(_x);
		p.setY(_y);
	}
	
	public Point sumPoint(Point a, Point b) {
		int coordX = a.getX() + b.getY();		
		int coordY = a.getY() + b.getY();
		Point p = new Point(coordX, coordY); 
		return p; 
	}
}