package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;
import java.util.ArrayList;

public class Node {
    private String name;
    private Node leftChild;
    private Node rightChild;
    private List<String> currentNames = new ArrayList<>();

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        int comparison = nameOfNewNode.compareTo(this.name);
        Node current = this;

        if (comparison < 0) {
            if (current.leftChild != null) {
                current = current.leftChild;
                current.add(nameOfNewNode);
            } else {
                Node newNode = new Node(nameOfNewNode);
                current.leftChild = newNode;
            }
        } if (comparison > 0) {
            if (current.rightChild != null) {
                current = current.rightChild;
                current.add(nameOfNewNode);
            } else {
                Node newNode = new Node(nameOfNewNode);
                current.rightChild = newNode;
            }
        }
    }

    public List<String> names() {
        if (this.leftChild == null) {
            currentNames.add(this.name);

            if (this.rightChild != null) {
                currentNames.addAll(this.rightChild.names());
            }
        } else if (this.rightChild == null){
            currentNames.addAll(this.leftChild.names());
            currentNames.add(this.name);
        } else {
            currentNames.addAll(this.leftChild.names());
            currentNames.add(this.name);
            currentNames.addAll(this.rightChild.names());
        }


        return currentNames;
    }
}
