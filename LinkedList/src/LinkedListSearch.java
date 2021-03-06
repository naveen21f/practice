import java.util.Scanner;


public class LinkedListSearch {

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
