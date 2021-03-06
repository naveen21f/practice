import java.util.Scanner;

public class LinkedList {

  private static Node head;

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

    System.out.println("Recursive Length: "+linkedList.length_recursive(head));
    System.out.println("Iterative Length: "+linkedList.length_iterative());

    System.out.println("Enter Number to search: ");
    int find = scanner.nextInt();
    System.out.println("Recursive Search: "+linkedList.search_recursive(head, find));
    System.out.println("Iterate Search: "+linkedList.search_iterate(find));
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

  public int length_iterative(){

    Node temp = head;
    int count = 0;
    while(temp != null) {
      count++;
      temp = temp.next;
    }
    return count;
  }

  public int length_recursive(Node head) {

    if(head == null)
      return 0;
    return 1 + length_recursive(head.next);
  }

  public boolean search_iterate(int val) {
    Node temp = head;
    while(temp!=null){
      if(temp.data == val)
        return true;
      temp = temp.next;
    }
    return false;
  }

  public boolean search_recursive(Node temp, int val) {

    if(temp == null)
      return false;
    if(temp.data == val)
      return true;
    return search_recursive(temp.next, val);
  }

}
