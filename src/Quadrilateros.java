public class Quadrilateros {

    double lado1;

    double lado2;

    double area;

    double perimetro;

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double calculaArea(){

        this.area = this.lado1 * this.lado2;
    return this.area;
    }
    public double calculaPerimetro(){

        this.perimetro = 2 * (this.lado1 + this.lado2);
        return this.perimetro;
    }
}
