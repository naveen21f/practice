import java.util.Scanner;

public class LinkedList {

  private static Node head;

  class Node {

    private int data;
    private Node next;
    public Node(int value) {
      this.data = value;
      this.next = null;
    }
  }

  public static void main(String[] args) {

    System.out.println("Enter Linked List Values");
    LinkedList linkedList = new LinkedList();
    Scanner scanner = new Scanner(System.in);
    int data;
    do{
      data = scanner.nextInt();
      linkedList.insertTail(data);
    }while (data!=9);
    linkedList.insertAfter(10,2);

    linkedList.diaplay();
  }


  public void insertHead(int value) {

    if(head == null){
      head = new Node(value);
    } else {
      Node temp = new Node(value);
      temp.next = head;
      head = temp;
    }
  }

  public void insertTail(int value) {

    if(head == null) {
      head = new Node(value);
    } else {
      Node temp = head;
      while(temp.next!=null) {
        temp = temp.next;
      }
      temp.next = new Node(value);
    }
  }

  public void insertAfter(int value, int pos) {

    if(head != null) {
      Node temp = head;
      while(--pos > 0 && temp!=null){
        temp = temp.next;
      }
      if(temp!=null) {
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
      }
    }
  }

  public void diaplay(){
    Node temp = head;
    System.out.println("Linked List: ");
    while(temp != null){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println();
  }
}
