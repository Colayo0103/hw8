class CWin{
    int width;
    int height;
    String name;

    void setW(int w){
        width = w;
    }
    void setH(int h){
        height = h;
    }
    void setName(String s){
        name = s;
    }
    void setwindows(int w, int h, String n){
        width = w;
        height = h;
        name = n;
    }
    public void show(){
        System.out.println("Name="+name);
        System.out.println("W=" + width + ", H=" + height);
    }
}
public class hw8_12 {
    public static void main(String[] args) {
        CWin cw = new CWin();
        cw.setName("My Windows");
        cw.setW(5);
        cw.setH(3);
        cw.show();
        CWin cw1 = new CWin();
        cw1.setwindows(5, 3, "My Windows");
        cw1.show();
    }
}
