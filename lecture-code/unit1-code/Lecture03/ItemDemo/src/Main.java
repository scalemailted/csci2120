/**
 *
 */
public class Main {
    public static void main(String[] args){
        Potion p = new Potion(5);
        System.out.println(p);
        p.consume();
        System.out.println(p);
        p.stack(new Potion(10));
        System.out.println(p);
        p.destroy();
        System.out.println(p);
        printBreakable(p);
        printConsumable(p);
    }

    public static void printBreakable(Breakable b){
        System.out.println("printBreakable:  "+b.getClass());
    }

    public static void printConsumable(Consumable c){
        System.out.println("printConsumable:  "+c.getClass());
    }
}
