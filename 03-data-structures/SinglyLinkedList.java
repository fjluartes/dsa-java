// Singly Linked List in Java
public class SinglyLinkedList<E> { // Java generics
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

    public class SinglyLinkedList<E> {
        private Node<E> head = null;
        private Node<E> tail = null;
        private int size = 0;
        public SinglyLinkedList() { } // initialize empty list
        // access methods
        public int size() { return size; }
        public boolean isEmpty() { return size == 0; }
        public E first() { // returns (but does not remove) first element
            if (isEmpty) return null;
            return head.getElement();
        }
        public E last() { // returns (but does not remove) last element
            if (isEmpty()) return null;
            return tail.getElement();
        }
        // update methods
        public void addFirst(E e) { // adds element e to front of list
            head = new Node<>(e, head);
            if (size == 0) 
                tail = head;
            size++;
        }
        public void addLast(E e) { // adds element e to back of list
            Node<E> newest = new Node<>(e, null);
            if (isEmpty())
                head = newest;
            else
                tail.setNext(newest);
            tail = newest;
            size++;
        }
        public E removeFirst() {
            if (isEmpty()) return null;
            E answer = head.getElement();
            head = head.getNext(); // null if list has only one node
            size--;
            if (size == 0)
                tail = null; // special case; list now empty
            return answer;
        }
    }
}
