
public class Circulo extends FormaGeometrica {
	double raio;
	double area;

	public Circulo() {
		this.raio = 2;
	}

	@Override
	public void calcularArea() {
		area = 3.14 * raio * raio;
		System.out.println("Área do Círculo = " + this.area);
	}
}
