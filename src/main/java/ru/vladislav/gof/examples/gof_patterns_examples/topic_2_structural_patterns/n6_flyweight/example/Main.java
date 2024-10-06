package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n6_flyweight.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        TreeFactory treeFactory = new TreeFactory();

        List<Tree> treeList = new ArrayList<>();

        treeList.add(treeFactory.createTree(10, 15, "Дуб", "Зелёный", "Дубовая, шершавая"));
        treeList.add(treeFactory.createTree(15, 20, "Дуб", "Зелёный", "Дубовая, шершавая"));
        treeList.add(treeFactory.createTree(-10, 0, "Клён", "Зелёный, лист резной", "Кленовая, шершавая"));

        for (Tree tree : treeList) {
            System.out.println("Добавлено дерево: " + tree);
        }

        System.out.println("Уникальные типы деревьев: " + treeFactory.getTreeSize());
        System.out.println("Всего деревьев: " + treeList.size());
    }
}
