// domain.OffenseSpell.java
package domain;

import java.util.Random;

public class OffenseSpell extends Spell {
    /**
     * Concrete subclass representing an offensive spell that deals damage to the target character.
     *
     * @param name        The name of the offensive spell.
     * @param description The description of the offensive spell.
     * @param cost        The mana cost of the offensive spell.
     */
    public OffenseSpell(String name, String description, int cost) {
        super(name, description, cost);
    }

    @Override
    public void cast(Character caster, Character target) {
        int spellDamage = getCost() + new Random().nextInt(10);
        target.takeDamage(spellDamage);
        System.out.println(caster.getName() + " casts " + getName() + " on " + target.getName() + " for " + spellDamage + " damage!");
    }
}