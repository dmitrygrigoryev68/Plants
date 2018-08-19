public abstract class Plant {

    private int age;
    private int height;

    public Plant(int height, int age) {
        super();
        this.age = age;
        this.height = height;

    }
    public int getAge() {
        return age;
    }
    public int getHeight() {
        return height;
    }

    public abstract void doSpring(int height,int age);
    public abstract void doSummer(int height,int age);
    public abstract void doAutumn(int height, int age);
    public abstract void doWinter(int height,int age);
    }
