class CTest {
    int x;
    String test(){
        if(x==0){
            return "此數為0";
        }else if(x%2 == 0){
            return "此數為偶數";
        }else{
            return "此數為奇數";
        }
    }    
}
public class hw8_07 {
    public static void main(String[] args) {
        CTest x1 = new CTest();
        CTest x2 = new CTest();
        CTest x3 = new CTest();
        x1.x = 3;
        x2.x = 8;
        x3.x = 0;
        System.out.println(x1.test());
        System.out.println(x2.test());
        System.out.println(x3.test());
    }
}
