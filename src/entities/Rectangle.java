package entities;

public class Rectangle {
	
	public double comprimento;
	public double altura;
	
	
	public double area() {
		return comprimento * altura;
	}
	
	public double perimetro() {
		return (comprimento + altura) * 2;
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(comprimento, 2) + Math.pow(altura, 2));
				
	}
}

