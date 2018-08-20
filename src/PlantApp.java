


public class PlantApp {


    public static void main(String [] arg){
        Plant t1 = new Tree(77);
        Plant f1 = new Flower();



        t1.doSpring();
        System.out.println("Tree " + t1.getHeight()+ " cm " + t1.getAge() +" year");
        t1.doSummer();
        System.out.println("Tree " + t1.getHeight() + " cm " + t1.getAge() + " year");
        t1.doAutumn();
        System.out.println("Tree " + t1.getHeight()+ " cm " + t1.getAge() + " year");
        t1.doWinter();
        System.out.println("Tree " + t1.getHeight()+ " cm " + t1.getAge() + " year");

        t1.doSpring();
        System.out.println("Tree " + t1.getHeight()+ " cm " + t1.getAge() +" year");
        t1.doSummer();
        System.out.println("Tree " + t1.getHeight() + " cm " + t1.getAge() + " year");
        t1.doAutumn();
        System.out.println("Tree " + t1.getHeight()+ " cm " + t1.getAge() + " year");
        t1.doWinter();
        System.out.println("Tree " + t1.getHeight()+ " cm  " + t1.getAge() + " year");



        f1.doSpring();
        System.out.println("Flower " + f1.getHeight());
        f1.doSummer();
        System.out.println("Flower " + f1.getHeight());
        f1.doAutumn();
        System.out.println("Flower " + f1.getHeight());
        f1.doWinter();
        System.out.println("Flower " + f1.getHeight());

    }

}

