package modelo;

public class operaciones {

    double num1;
    double num2;

    public operaciones(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double suma() {
        return this.num1 + this.num2;
    }

    public double resta() {
        return this.num1 - this.num2;
    }

    public double division() {
        return this.num1 / this.num2;
    }

    public double multiplicacion() {
        return this.num1 * this.num2;
    }
}
