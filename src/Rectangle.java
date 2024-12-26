public class Rectangle {
    double a;
    double b;

    public Rectangle(double a, double b){
        if (a <= 0 | b <= 0){
            throw new RuntimeException("There is no figure with such parameters.");
        } else{
            this.a = a;
            this.b = b;
        }
    }

    public double Square() { return this.a * this.b; }

    public double Perimeter() { return (this.a + this.b) * 2; }
}