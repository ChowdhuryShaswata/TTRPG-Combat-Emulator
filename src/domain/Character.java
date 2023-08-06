package domain;

import java.util.Random;

public class Character {
    private String name;
    private int health;
    private int maxMana;
    private int mana;
    private int attackDamage;
    private Spellbook spellbook;

    /**
     * Represents a character in the combat emulator, which can attack, cast spells, and take damage.
     *
     * @param name        The name of the character.
     * @param health      The initial health of the character.
     * @param maxMana     The maximum mana capacity of the character.
     * @param attackDamage The attack damage of the character.
     */
    public Character(String name, int health, int maxMana, int attackDamage) {
        this.name = name;
        this.health = health;
        this.maxMana = maxMana;
        this.mana = maxMana;
        this.attackDamage = attackDamage;
        this.spellbook = new Spellbook();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public Spellbook getSpellbook() {
        return spellbook;
    }

    /**
     * Attacks the specified target character, dealing damage based on the character's attack damage.
     *
     * @param target The character to be attacked.
     */
    public void attack(Character target) {
        int damageDealt = new Random().nextInt(attackDamage) + 1;
        target.takeDamage(damageDealt);
        System.out.println(name + " attacks " + target.getName() + " for " + damageDealt + " damage!");
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    /**
     * Casts the given spell on the target character if the character has the spell in their spellbook
     * and enough mana to cast it. Mana cost is deducted upon casting.
     *
     * @param target The character on which the spell is being cast.
     * @param spell  The spell to be cast.
     */
    public void castSpell(Character target, Spell spell) {
        if (!spellbook.contains(spell)) {
            System.out.println(name + " does not have " + spell.getName() + " in their spellbook.");
            return;
        }

        if (spell.getCost() <= mana) {
            spell.cast(this, target);
            mana -= spell.getCost();
        } else {
            System.out.println("Not enough mana to cast " + spell.getName() + ".");
        }
    }

    /**
     * Restores the character's health by the specified amount.
     * Health cannot exceed 100.
     *
     * @param amount The amount of health to be restored.
     */
    public void heal(int amount) {
        health = Math.min(health + amount, 100); // Health cannot exceed 100
    }

}
