package org.example;

import static org.junit.jupiter.api.Assertions.*;

class containerTest {

    @org.junit.jupiter.api.Test
    void print() {
    }

    @org.junit.jupiter.api.Test
    void add() {
    }

    @org.junit.jupiter.api.Test
    void get() {
        container List = new container();
        List.add(1);
        assertEquals(1, List.get(1));
        assertEquals(null, List.get(2));
    }

    @org.junit.jupiter.api.Test
    void remove() {
    }
}