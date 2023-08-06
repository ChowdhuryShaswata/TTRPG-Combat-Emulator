package domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Spellbook implements Collection<Spell> {
    private ArrayList<Spell> spells;

    public Spellbook() {
        spells = new ArrayList<>();
    }

    // Implementing methods from Collection interface
    @Override
    public boolean add(Spell spell) {
        return spells.add(spell);
    }

    @Override
    public boolean remove(Object o) {
        return spells.remove(o);
    }

    @Override
    public boolean contains(Object o) {
        return spells.contains(o);
    }

    @Override
    public boolean isEmpty() {
        return spells.isEmpty();
    }

    @Override
    public int size() {
        return spells.size();
    }

    @Override
    public void clear() {
        spells.clear();
    }

    @Override
    public Iterator<Spell> iterator() {
        return spells.iterator();
    }

    @Override
    public Object[] toArray() {
        return spells.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return spells.toArray(a);
    }

    // Other methods that are not relevant to the Spellbook and can throw UnsupportedOperationException
    @Override
    public boolean containsAll(Collection<?> c) {
        return spells.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Spell> c) {
        return spells.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return spells.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return spells.retainAll(c);
    }
}

