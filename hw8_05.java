class CBox{
    int length;
    int width;
    int height;

    int volume(){
        return length*height*width;
    }

    int surfaceArea(){
        return length*height*6;
    }

    void showData(){
        System.out.println("length= "+length);
        System.out.println("width= "+width);
        System.out.println("height= "+height);
    }
    
    void showAll(){
        showData();
        System.out.println("volume= "+volume());
        System.out.println("surfaceArea= "+surfaceArea());
    }
}    
public class hw8_05 {
    public static void main(String[] args) {
        CBox box = new CBox();
        box.length = 1;
        box.width = 1;
        box.height = 1;
        box.showAll();
    }
}
