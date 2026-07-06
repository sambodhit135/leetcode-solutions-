class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class MyLinkedList {

    Node head;

    public MyLinkedList() {

    }

    public int get(int index) {
        Node trav = head;
        int count = 0;
        if (head == null) {
            return -1;
        }
        while (trav != null) {
            if (count == index) {
                return trav.data;
            }
            count++;
            trav = trav.next;
        }
        return -1;
    }

    public void addAtHead(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
    }

    public void addAtTail(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            return;
        }
        Node trav = head;
        while (trav.next != null) {
            trav = trav.next;
        }
        trav.next = temp;
    }

    public void addAtIndex(int index, int val) {

        int count = 0;
        Node temp = new Node(val);
        Node trav = head;
        if (index == 0) {
            temp.next = head;
            head = temp;
            return;
        }
        while (trav != null) {
            if (count == index - 1) {
                temp.next = trav.next;
                trav.next = temp;
                return;
            }
            count++;
            trav = trav.next;

        }

    }

    public void deleteAtIndex(int index) {
        if (head == null) {
            return;
        }
        Node trav = head;
        int count = 0;
        if (index == 0) {
            head = head.next;
            return;
        }
        while (trav.next != null) {
            if (count == index - 1) {
                trav.next = trav.next.next;
                return;
            }
            count++;
            trav = trav.next;

        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */