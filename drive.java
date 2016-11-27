import shapes.square;
import shapes.rectangle;
import utils.math;

public class drive {
	public static void main(String[] args){
    
    square s = new square(100);
    rectangle r = new rectangle(80, 50);
    

    System.out.println(s.getArea());
    System.out.println(r.getArea());

    double z = 15.6;
    int n = (int)z;
    System.out.println(math.factorial(n));
    System.out.println(math.factorialLoop(n));
    
	}
}