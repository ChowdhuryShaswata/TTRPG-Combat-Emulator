import domain.Character;
import domain.Spell;
import usecases.CombatInteractor;

import java.util.Scanner;

public class DungeonCombatEmulator {
    public static void main(String[] args) {
//        Character player = new Character("Player", 100, 50, 15);
//        Character enemy = new Character("Enemy", 80, 40, 12);
//        CombatInteractor combatInteractor = new CombatInteractor();
//
//        // Add some spells to the player's spellbook
//        Spell fireball = new Spell("Fireball", "Deals fire damage", 20);
//        Spell heal = new Spell("Heal", "Restores health", 15);
//        player.getSpellbook().addSpell(fireball);
//        player.getSpellbook().addSpell(heal);
//
//        System.out.println("Welcome to the Dungeon Combat Emulator!");
//        System.out.println("Your character: " + player.getName() + " | Health: " + player.getHealth() + " | Mana: " + player.getMana());
//        System.out.println("Enemy character: " + enemy.getName() + " | Health: " + enemy.getHealth());
//        System.out.println("Let the battle begin!");
//
//        Scanner scanner = new Scanner(System.in);
//        while (player.isAlive() && enemy.isAlive()) {
//            System.out.println("\nPlayer's Turn! Type 'attack' to attack the enemy or 'cast' to cast a spell.");
//            String input = scanner.nextLine().toLowerCase();
//
//            if (input.equals("attack")) {
//                combatInteractor.attack(player, enemy);
//            } else if (input.equals("cast")) {
//                System.out.println("\nYour spellbook:");
//                for (Spell spell : player.getSpellbook()) {
//                    System.out.println(spell.getName() + " - " + spell.getDescription() + " (Cost: " + spell.getCost() + " Mana)");
//                }
//
//                System.out.println("\nType the name of the spell to cast:");
//                String spellName = scanner.nextLine();
//                combatInteractor.castSpell(player, enemy, player.getSpellbook(), spellName);
//            } else {
//                System.out.println("\nInvalid command. Type 'attack' to attack the enemy or 'cast' to cast a spell.");
//            }
//
//            if (!enemy.isAlive()) {
//                System.out.println("\nCongratulations! You have defeated the enemy.");
//                break;
//            }
//
//            System.out.println("\nEnemy's Turn!");
//            combatInteractor.attack(enemy, player);
//            if (!player.isAlive()) {
//                System.out.println("\nGame Over! The enemy has defeated you.");
//            }
//        }
//
//        scanner.close();
    }
}