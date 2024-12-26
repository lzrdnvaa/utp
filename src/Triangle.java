public class Triangle {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c){
        if (a <= 0 | b <= 0 | c <= 0 | a >= (b + c) | b >= (a + c) | c >= (b + a)){
            throw new RuntimeException("There is no figure with such parameters.");
        } else{
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public double Square() {
        double p = (this.a + this.b + this.c) / 2;
        return Math.pow((p * (p - this.a) * (p - this.b) * (p - this.c)), 0.5);
    }

    public double Perimeter() { return this.a + this.b + this.c; }
}
