package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n6_flyweight.example;

public class Tree {
    private final Point point;
    private final TreeType treeType;

    public Tree(Point point, TreeType treeType) {
        this.point = point;
        this.treeType = treeType;
    }

    public Point getPoint() {
        return point;
    }

    public String getTreeTypeInfo() {
        return treeType.toString();
    }

    @Override
    public String toString() {
        return "Tree{" +
                "point=" + point +
                ", treeType=" + treeType +
                '}';
    }
}
