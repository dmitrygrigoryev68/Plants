


public class Tree extends Plant {

    int startHight;

    public Tree(int startHight) {
        super();
        this.startHight = startHight;

     }
    public void doSpring(int height, int age, int startHight) {
        height = startHight + 1;
        age = age + 1;
        System.out.println("height " + height);
        System.out.println("age " + age);

    }

    public void doSpring(int height, int age) {
        height = height + 1;
        age = age + 1;
        System.out.println("height " + height);
        System.out.println("age " + age);

    }
    public void doSummer(int height, int age, int startHight) {
        height = startHight + 1;
        age = age + 1;
        System.out.println("height " + height);
        System.out.println("age " + age);

    }

    public void doSummer(int height, int age) {
        height = height + 1;
        age = age + 1;
        System.out.println("height " + height);
        System.out.println("age " + age);

    }
    public void doAutumn(int height, int age, int startHight) {
        height = startHight + 1;
        age = age + 1;
        System.out.println("height " + height);
        System.out.println("age " + age);

    }

    public void doAutumn(int height, int age) {
        height = height + 1;
        age = age + 1;
        System.out.println("height " + height);
        System.out.println("age " + age);

    }
    public void doWinter(int height, int age, int startHight) {
        height = startHight + 1;
        age = age + 1;
        System.out.println("height " + height);
        System.out.println("age " + age);

    }

    public void doWinter(int height, int age) {
        height = height + 1;
        age = age + 1;
        System.out.println("height " + height);
        System.out.println("age " + age);

    }

}