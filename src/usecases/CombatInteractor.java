// usecases.CombatInteractor.java
package usecases;

import domain.Character;
import domain.Spell;
import domain.Spellbook;

public class CombatInteractor {
        public void attack(Character attacker, Character target) {
            attacker.attack(target);
        }

        public void castSpell(Character caster, Character target, Spellbook spellbook, String spellName) {
            for (Spell spell : spellbook) {
                if (spell.getName().equalsIgnoreCase(spellName)) {
                    caster.castSpell(target, spell);
                    break;
                }
            }
        }
    }