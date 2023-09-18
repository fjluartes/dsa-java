// Circular Linked List in Java
public class CircularlyLinkedList<E> {
    // nested Node class
    private static class Node<E> {
        private E element;    // reference to element stored at this node
        private Node<E> next; // reference to subsequent node in list
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }
        public E getElement() { return element; }
        public Node<E> getNext() { return next; }
        public void setNext(Node<E> n) { next = n; }
    } // end of nested Node class

    public class CircularlyLinkedList<E> {
        private Node<E> tail = null;
        private int size = 0;
        public CircularlyLinkedList() { }
    }
}
}
