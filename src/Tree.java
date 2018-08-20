


public class Tree extends Plant {

    private static int startHight = 100;
    private int growPerSeason = 2;

    public Tree(int startHight) {
        super();
        this.startHight = startHight;

     }
    public int getGrowPerSeason() {
        return growPerSeason;
    }

    public void doSpring() {
        height = startHight + getGrowPerSeason();
        startHight = height;
    }

    public void doSummer() {
    }

    public void doAutumn() {
    }

    public void doWinter() {
        age = age + 1;
    }
}