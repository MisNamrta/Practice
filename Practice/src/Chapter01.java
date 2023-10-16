/*
 
 insert anywhere, insert beginning, and insert end methods &  insertArrIntoSortedLL.
 
 */
public class Chapter01 {
	
	Node head; 
	 
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            data = data;
            next = null;
        }
    }
    public boolean  insertAtBeginning(int data)
    {
    	Node node = new Node(data);
    	node.next = head;
    	head = node;
		return false;
    }
	public static void main(String args[]) {
		System.out.println("/hello");
		
		 Chapter01 list = new Chapter01();
		 
		System.out.print(list.insertAtBeginning(1));
	}
}

/*

insert anywhere, insert beginning, and insert end methods &  insertArrIntoSortedLL.

*/

/*

// An identifier name must begin with a letter, dollar sign ($), or underscore (_). Numbers are permitted only for subsequent characters. 
//Therefore, option C is not a valid variable name. Additionally, an identifier may not be a single underscore, making option A an invalid variable name.
 
Which of the following are not valid variable names? (Choose two.)
A. _
B. _blue
C. 2blue
D. blue$
E. Blue

Ans. A,C ..
*/

/*
 What is the value of tip after executing the following code snippet?


int meal = 5;
int tip = 2;
var total = meal + (meal˃6 ? tip++ : tip--);

A. 1
B. 2
C. 3
D. 7
E. None of the above
 */


































