package MyFirstPack;

import java.util.LinkedList;

public class LinkedListReverse {

  static Node head;

  static class Node {

    int data;
    Node next;

    Node(int d)
    {
      data = d;
      next = null;          // d->NULL
    }
  }

  Node reverse(Node root)
  {
    Node prev = null;
    Node current = root;
    Node next = root;
    while (next != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    //node = prev;
    return prev;
  }

  void printList(Node node)
  {
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
  }
  public static void main(String[] args)
  {
    LinkedListReverse list = new LinkedListReverse();
    list.head = new Node(85);
    list.head.next = new Node(15);
    list.head.next.next = new Node(4);                    //// 85->15->4->20
    list.head.next.next.next = new Node(20);

    System.out.println("Given Linked list");
    list.printList(head);
    head = list.reverse(head);
    System.out.println("");
    System.out.println("Reversed linked list ");
    list.printList(head);
  }
}
