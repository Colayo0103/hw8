class CCircle {
    double pi = 3.14;
    double radius;

    void show_periphery() {
        System.out.println("periphery = " + this.pi * 2 * radius);
    }
}
public class hw8_06 {
    public static void main(String[] args) { 
        CCircle cir1 = new CCircle();
        CCircle cir2 = new CCircle();
        cir1.radius = 3.0;
        cir1.pi = 3;
        cir2.radius = 3.0;
        cir1.show_periphery();
        cir2.show_periphery();  
    }
}
