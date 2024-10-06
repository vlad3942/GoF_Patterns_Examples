package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n6_flyweight.example;

import java.util.HashSet;
import java.util.Set;

public class TreeFactory {

    private final Set<TreeType> treeTypes = new HashSet<>();

    public Tree createTree(int x, int y, String type, String leaf, String bark) {
        TreeType treeType = new TreeType(type, leaf, bark);
        if (!treeTypes.contains(treeType)) {
            treeTypes.add(treeType);
            return new Tree(new Point(x, y), treeType);
        }
        var iterator = treeTypes.iterator();
        var currentType = iterator.next();
        while (!currentType.equals(treeType)) {
            currentType = iterator.next();
        }
        return new Tree(new Point(x, y), currentType);
    }

    public int getTreeSize() {
        return treeTypes.size();
    }
}
