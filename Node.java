package com.company;

class Node<String>{
    String element;
    Node<String> next;
    Node<String> prev;

    Node(Node<String> prev, String element, Node<String> next){
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}
