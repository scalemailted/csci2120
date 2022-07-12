public abstract class ItemBase {
    protected int itemValue;
    protected String itemName;

    public ItemBase(int itemValue, String itemName) {
        this.itemValue = itemValue;
        this.itemName = itemName;
    }

    public int getItemValue() {
        return itemValue;
    }

    public void setItemValue(int itemValue) {
        this.itemValue = itemValue;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}

