package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n6_flyweight.example;

import java.util.Objects;

public class TreeType {
    private final String treeType;
    private final String leafColor;
    private final String barkTexture;

    public TreeType(String treeType, String leafColor, String barkTexture) {
        this.treeType = treeType;
        this.leafColor = leafColor;
        this.barkTexture = barkTexture;
    }

    public String getTreeType() {
        return treeType;
    }

    public String getLeafColor() {
        return leafColor;
    }

    public String getBarkTexture() {
        return barkTexture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeType treeType1 = (TreeType) o;
        return Objects.equals(treeType, treeType1.treeType) && Objects.equals(leafColor, treeType1.leafColor) && Objects.equals(barkTexture, treeType1.barkTexture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treeType, leafColor, barkTexture);
    }

    @Override
    public String toString() {
        return "TreeType{" +
                "treeType='" + treeType + '\'' +
                ", leafColor='" + leafColor + '\'' +
                ", barkTexture='" + barkTexture + '\'' +
                '}';
    }
}
