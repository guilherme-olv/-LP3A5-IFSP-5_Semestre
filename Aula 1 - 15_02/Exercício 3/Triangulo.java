
public class Triangulo extends FormaGeometrica {
	double base;
	double altura;
	double area;

	public Triangulo() {
		this.base = 2;
		this.altura = 3;
	}

	@Override
	public void calcularArea() {

		area = (base * altura) / 2;
		System.out.println("Área do Triângulo = " + this.area);
	}

}
