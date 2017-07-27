package stackImplementation;
import java.util.NoSuchElementException;

/*Implementing a stack using a linked list. A stack follows LIFO order*/

public class Stack {
	private Node start;
	private int size;

	public Stack(){
		start = null;
		size = 0;
	}

	public boolean empty (){
		if (start == null)
			return true;
		return false;
	}

	public Node peek (){
		return start;
	}

	public Node pop (){
		if (size == 0){
			throw new NoSuchElementException ("Sorry the element is empty");
		}
		Node temp = start;
		start = start.next;
		size--;
		return temp;
	}

	public void push (Node myNode){	
		myNode.next = start;
		start = myNode;
		size ++;
	}

	public int search (Node myNode){
		Node currentPtr = start;
		int count = 1;
		while (count <= size){
			if (currentPtr.data == myNode.data){
				return count;
			}

			currentPtr = currentPtr.next;
			count++;
		}
		return -1;
	}
}
