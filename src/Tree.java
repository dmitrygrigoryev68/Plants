


public class Tree extends Plant {

    int startHight;

    public Tree(int height, int age) {
        super(height,age);
       // this.startHight = startHight;

    }


     public  void doSpring(int height, int age){
        height = height + 1;
        System.out.println("height " + height);

    }

    public  void doSummer(int height, int age){
        height = height + 1;
    }

    public  void doAutumn(int height, int age){
        height = height;
    }

    public  void doWinter(int height, int age){
        height = height;
        age = age + 1;
    }
}
