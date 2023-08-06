// domain.Spell.java
package domain;

public abstract class Spell {
    private String name;
    private String description;
    private int cost;

    /**
     * Abstract class representing a spell that can be cast by a character.
     *
     * @param name        The name of the spell.
     * @param description The description of the spell.
     * @param cost        The mana cost of the spell.
     */
    public Spell(String name, String description, int cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }

    /**
     * Abstract method to be implemented by concrete subclasses.
     * Casts the spell on the given target character.
     *
     * @param caster The character casting the spell.
     * @param target The character on which the spell is being cast.
     */
    public abstract void cast(Character caster, Character target);
}




