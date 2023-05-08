public class Triangulo extends Forma{

    private double lado1;
    private double lado2;
    private double lado3;


    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        vereficacaoTriangulo(this);
    }

    private void vereficacaoTriangulo(Triangulo triangulo){

        if (this.lado1 == this.lado2 && this.lado2 == this.lado3) {
            triangulo = new Equilatero(this.lado1,this.lado2,this.lado3);
        } else if (this.lado1 == this.lado2 || this.lado1 == this.lado3 || this.lado2 == this.lado3) {
            triangulo = new Isoceles(this.lado1,this.lado2,this.lado3);
        } else {
            triangulo = new Escaleno(this.lado1,this.lado2,this.lado3);
        }

    }

}
