public abstract class Plant {

    int age = 0;
    int height = 0;

    public abstract void doSpring(int height, int age);
    public abstract void doSummer(int height, int age);
    public abstract void doAutumn(int height, int age);
    public abstract void doWinter(int height, int age);
}
