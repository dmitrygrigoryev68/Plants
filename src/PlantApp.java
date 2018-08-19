


public class PlantApp {


    public static void main(String [] arg){
        Tree t1 = new Tree(0);

        Flower f1 = new Flower(1,1);



        t1.doSpring(90,0);
        t1.doSummer(1,1);
        t1.doAutumn(1,1);
        t1.doWinter(1,1);
        t1.doSpring(1,1,100);


        f1.doSpring(1,1);
        f1.doSummer(1,1);
        f1.doAutumn(1,1);
        f1.doWinter(1,1);

    }

}

