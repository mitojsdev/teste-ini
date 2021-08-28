package entities;

public class Student {

	public double nota1;
	public double nota2;
	public double nota3;
	public String name;
	
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public String resultado() {
		double total = nota1 + nota2 + nota3;
		if (total >= 60) {
			return "Aprovado";
		}
		else {
			return "Reprovado";
		}
	}
	
	public double falta() {
		double meta = 60;
		double nota = nota1 + nota2 + nota3;
		return meta - nota;
	}
	
	
}
