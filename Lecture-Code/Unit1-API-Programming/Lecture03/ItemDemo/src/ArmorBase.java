public abstract class ArmorBase implements Equippable{
    protected String name;
    protected String description;
    protected int defenseRating;
    protected  int weight;

    public ArmorBase(String name, String description, int defenseRating, int weight) {
        this.name = name;
        this.description = description;
        this.defenseRating = defenseRating;
        this.weight = weight;
    }

}
