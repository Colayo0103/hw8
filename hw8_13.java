class CCircle{
    double area(double dr){
        return Math.PI*dr*dr;
    }

    float area(float fr){
        return (float)(Math.PI*fr*fr);
    }

    int area(int ir){
        return (int)(Math.PI*ir*ir);
    }
}
public class hw8_13 {
    public static void main(String[] args) {
        CCircle c = new CCircle();
        System.out.printf("%.2f \n", c.area(2.2));
        System.out.printf("%.2f \n", c.area(2.2f));
        System.out.printf("%.2f \n", c.area(2));
    }
}
