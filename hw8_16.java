class CSphere{
    private int x;
    private int y;
    private int z;
    private int radius;

    void setLocation(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    void setRadius(int radius){
        this.radius = radius;
    }

    void surfaceArea(){
        System.out.printf("%.2f \n", Math.PI * Math.pow(radius, 2));
    }

    void volume(){
        System.out.printf("%.2f \n", Math.PI * Math.pow(radius, 3));
    }

    void showCenter(){
        System.out.println(x + " " + y + " " + z);
    }
}
public class hw8_16 {
    public static void main(String[] args) {
        CSphere sphere = new CSphere();
        sphere.setLocation(3, 4, 5);
        sphere.setRadius(1);
        sphere.surfaceArea();
        sphere.volume();
        sphere.showCenter();
    }
}
