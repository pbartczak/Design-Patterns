package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Sentence implements Glif {

    private List<Glif> childrenGlif;

    public Sentence() {
        this.childrenGlif = new ArrayList<>();
    }

    public void add(Glif glif) {
        childrenGlif.add(glif);
    }

    public void remove(Glif glif) {
        childrenGlif.remove(glif);
    }

    @Override
    public void print() {
        childrenGlif.forEach(Glif::print);
    }

}
