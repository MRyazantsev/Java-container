package org.example;

/**
 * A container class that allows you to store an arbitrary number of objects.
 * The container allows you to add, get, remove, and print elements.
 */
public class container<dataType>{
    /**
     * A container node class containing an information field and a link to the next cell.
     */
    public class Node {
        dataType data;
        Node next;

        /**
         * Constructor for list cell with one parameter
         * @param element The element that is added to the information field
         */
        public Node(dataType element) {
            data = element;
            next = null;
        }
    }

    Node head;

    /**
     * No parameter constructor that sets the head of the list to null.
     */
    public container() {
        head = null;
    }

    /**
     * A method that allows you to print a list to the console.
     */
    public void print() {
        Node currentNode = head;
        if(currentNode == null){
            System.out.println("List is empty");
        }
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    /**
     * The method adds a new element to the end of the current list.
     * @param element The element to add to the end.
     */
    public void add(dataType element) {
        Node newNode = new Node(element);
        Node currentNode = head;

        if (head == null) {
            head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    /**
     * A method that allows you to extract an element by its ordinal number in the list.
     * @param order The ordinal number of the element in the list.
     * @return Returns the value corresponding to the node number.
     */
    public dataType get(int order) {
        Node currentNode = head;
        if(head == null){
            return null;
        }
        for(int i=1;i<order;i++){
            if(currentNode.next != null){
                currentNode = currentNode.next;
            }
            else{
                System.out.println("Такого номера в списке нет");
                return null;
            }
        }
        return currentNode.data;
    }

    /**
     * The method removes an element from the list.
     * If there is no element in the list, the method returns null.
     * @param element The element to be removed.
     */
    public void remove(dataType element) {
        Node prev = head;
        Node currentNode = head;
        while(currentNode != null){
            if(currentNode.data == element){
                if(currentNode == head){
                    head = head.next;
                }
                else{
                    prev.next = currentNode.next;
                }
            }
            prev = currentNode;
            currentNode = currentNode.next;
        }
    }

}
