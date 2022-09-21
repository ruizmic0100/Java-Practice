import java.util.*;

/* Linked List = Stores Nodes in 2 parts ( data + address )
                 Nodes are in non-consectutive memory locations
                 Elements are linked using pointers

                                    Singly Linked List
                        Node                Node                Node
                    [data | address]    [data | address]    [data | address]

                                        Doubly Linked List
                 Node                          Node                         Node
      [address | data | address]    [address | data | address]    [addres | data | address]

      Advantages?
      1. Dynamic Data Structure (allocates needed memory while running).
      2. Insertion and deletion of nodes is easy. O(1)
      3. No/low memory waste.

      Disadvantages?
      1. Greater memory usage (additional pointer).
      2. No random access of elements (no index[i]).
      3. Accessing/searching elements is more time consuming. O(n)

      Uses?
      1. Implement Stacks/Queue.
      2. GPS navigation.
      3. music playlist.
 * 
 */

public class linked_lists {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        // Can be treated as a stack
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();

        // Can be treated as a queue
        linkedList.offer("G");
        linkedList.poll();

        // Insert and deletion of nodes.
        linkedList.add(4, "E");
        linkedList.remove("E");
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("G");
        linkedList.addLast("P");

        System.out.println(linkedList);
    }
}