
public class Iniciar {

	public static void main(String[] args) {

		FormaGeometrica circulo = new Circulo();
		FormaGeometrica triangulo = new Triangulo();
		FormaGeometrica quadrado = new Quadrado();

		circulo.calcularArea();
		triangulo.calcularArea();
		quadrado.calcularArea();

	}
}