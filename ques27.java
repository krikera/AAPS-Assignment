/* Find the node where two singly linked lists intersect.  Write its algorithm, program. 
Find its time and space complexities. Explain with suitable example. */

public class ques27 {
    
    static class Node {
        int data;
        Node next;
        Node(int x) {
            data = x;
            next = null;
        }
    }

    // Function to get the intersection point of two linked lists
    public static Node intersectPoint(Node head1, Node head2) {
        
        // Maintaining two pointers ptr1 and ptr2 
        // at the heads of the lists
        Node ptr1 = head1;
        Node ptr2 = head2;

        // If any one of the heads is NULL, there is no intersection
        if (ptr1 == null || ptr2 == null)
            return null;

        // Traverse through the lists until both pointers meet
        while (ptr1 != ptr2) {
          
            // Move to the next node in each list and if the one 
            // pointer reaches NULL, start from the other linked list
            ptr1 = ptr1 != null ? ptr1.next : head2;
            ptr2 = ptr2 != null ? ptr2.next : head1;
        }

        // Return the intersection node, or null if no intersection
        return ptr1;
    }

    public static void main(String[] args) {
        
        // creation of first list: 10 -> 15 -> 30
        Node head1 = new Node(10);
        head1.next = new Node(15);
        head1.next.next = new Node(30);

        // creation of second list: 3 -> 6 -> 9 -> 15 -> 30
        Node head2 = new Node(3);  
        head2.next = new Node(6);
        head2.next.next = new Node(9);
      
        // 15 is the intersection point
        head2.next.next.next = head1.next;

        Node intersectionPoint = intersectPoint(head1, head2);

        if (intersectionPoint == null)
            System.out.println("-1");
        else
            System.out.println(intersectionPoint.data);
    }
}