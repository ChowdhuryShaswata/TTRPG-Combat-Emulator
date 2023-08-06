// domain.SupportSpell.java
package domain;

import java.util.Random;

public class SupportSpell extends Spell {
    /**
     * Concrete subclass representing a support spell that heals the target character.
     *
     * @param name        The name of the support spell.
     * @param description The description of the support spell.
     * @param cost        The mana cost of the support spell.
     */
    public SupportSpell(String name, String description, int cost) {
        super(name, description, cost);
    }

    @Override
    public void cast(Character caster, Character target) {
        int spellHeal = getCost() + new Random().nextInt(10);
        target.heal(spellHeal);
        System.out.println(caster.getName() + " casts " + getName() + " on " + target.getName() + " and heals for " + spellHeal + " health!");
    }
}
