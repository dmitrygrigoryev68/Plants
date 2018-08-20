public abstract class Plant {

    public int age;
    public int height;

    public abstract void doSpring();
    public abstract void doSummer();
    public abstract void doAutumn();
    public abstract void doWinter();

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }
}
