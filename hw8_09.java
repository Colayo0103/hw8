class CCalculator{
    int x, y, z;
    void set_value(int a, int b, int c){
        x = a;
        y = b;
        z = c;
    }

    void show(){
        System.out.println(x + " " + y + " " + z);
    }

    int add(){
        return x + y + z;
    }

    int sub(){
        return x - y - z;
    }

    int mul(){
        return x * y * z;
    }

    double avg(){
        return (double)(x + y + z) / 3;
    }
}
public class hw8_09 {
    public static void main(String[] args) {
        CCalculator cc = new CCalculator();
        cc.set_value(25, 3, 7);
        cc.show();
        System.out.println(cc.add());
        System.out.println(cc.sub());
        System.out.println(cc.mul());
        System.out.printf("%.2f \n", cc.avg());
    }    
}