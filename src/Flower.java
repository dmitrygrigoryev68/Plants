

public class  Flower extends Plant{

    private int growPerSeason = 10;

    public int getGrowPerSeason() {
        return growPerSeason;
    }

    public void doSpring() {
        height = getGrowPerSeason();
    }

    public void doSummer() {
    }

    public void doAutumn() {
        height = 0;
    }

    public void doWinter() {
        age = age + 1;
    }



}
