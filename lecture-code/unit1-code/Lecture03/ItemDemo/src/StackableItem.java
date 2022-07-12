public abstract class StackableItem extends ItemBase implements Stackable{

    protected int quantity;
    protected int maxStacks;

    public StackableItem(int itemValue, String itemName, int quantity, int maxStacks) {
        super(itemValue, itemName);
        this.quantity = quantity;
        this.maxStacks = maxStacks;
    }

    @Override
    public void stack (Stackable s)
    {
        if (s instanceof  StackableItem)
        {
            StackableItem si = (StackableItem) s;
            if(this.getQuantity() + si.getQuantity() < maxStacks){
                this.setQuantity(this.getQuantity()+si.getQuantity());
                si.setQuantity(0);
            }
            else if(this.getQuantity() + si.getQuantity() > maxStacks){
                int diff = maxStacks - this.getQuantity();
                this.setQuantity(this.getQuantity() + diff);
                si.setQuantity(si.getQuantity() - diff);
            }
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMaxStacks() {
        return maxStacks;
    }

    public void setMaxStacks(int maxStacks) {
        this.maxStacks = maxStacks;
    }
}

