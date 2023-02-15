
public class Quadrado extends FormaGeometrica {
	double base;
	double area;

	public Quadrado() {
		this.base = 4;
	}

	@Override
	public void calcularArea() {
		area = base * base;
		System.out.println("Área do Quadrado = " + this.area);
	}

}
