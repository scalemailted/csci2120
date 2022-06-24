public class Potion extends StackableItem implements Consumable, Breakable{
    public Potion(int quantity) {
        super(20, "Potion", quantity, 10);
    }

    public Potion(){
        this(1);
    }

    @Override
    public void consume() {
        this.setQuantity(this.quantity-1);
    }

    @Override
    public void destroy(){
        this.setItemName("Broken Bottles");
    }

    @Override
    public String toString(){
        String text = String.format("%s/%dgp [%d/%d]",itemName, itemValue, quantity, maxStacks);
        return text;
    }
}
