public class Circle {
    double r;

    public Circle(double r){
        if (r <= 0){
            throw new RuntimeException("There is no figure with such parameters.");
        } else{
            this.r = r;
        }
    }

    public double Square() { return 3.1415926535 * this.r * this.r; }

    public double Perimeter() { return 2 * 3.1415926535 * this.r; }
}