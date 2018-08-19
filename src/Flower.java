

public class  Flower extends Plant{

    public Flower(int height, int age) {
        super(height, age);
    }



    public  void doSpring(int height, int age){
        height = height + 5;
    }

    public  void doSummer(int height, int age){
        height = height + 5;
    }
    public  void doAutumn(int height, int age){
        height = 0;
    }
    public  void doWinter(int height, int age){
        height = height;
    }


}
