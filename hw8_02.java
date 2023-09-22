class cbbb{
    double x;
    double y;
}
public class hw8_02 {
    public static void main(String[] args) {
        cbbb obj1 = new cbbb();
        cbbb obj2 = new cbbb();
        cbbb avg = new cbbb();
        obj1.x = 5.2;
        obj1.y = 3.9;
        obj2.x = 6.5;
        obj2.y = 4.6;
        avg.x = (obj1.x + obj2.x) / 2;
        avg.y = (obj1.y + obj2.y) / 2;
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(avg);
        
    }
}
