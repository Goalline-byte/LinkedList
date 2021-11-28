
public class LinkedList{
    private Node head;
    private Node tail;

    private int size;

    public LinkedList(){
        this.size = 0;

    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }
    private class Node{
       private int value;
       private Node next;

       public Node(int value){
        this.value = value;
        }

        public Node(int value, Node next){
        this.value = value;
        this.next = next;

        }
    }


public static void main(String[] args){
    
    LinkedList linkedList = new LinkedList();
    linkedList.insertFirst(3);
    linkedList.insertFirst(6);
    linkedList.insertFirst(9);
    linkedList.insertFirst(17);

    linkedList.insertLast(89);

    linkedList.display();


    
}

}
