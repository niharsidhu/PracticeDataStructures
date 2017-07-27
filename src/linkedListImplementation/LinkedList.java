package linkedListImplementation;

public class LinkedList {
	protected Node start;
	protected Node end;
	protected int size;
	
    public LinkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
	
	public void addToBeginning(int myData){
		Node addOn = new Node(myData, null);
		size ++;
		
		if (start == null){
			start = addOn;
			end = addOn;
		}
		else{
			addOn.next = start;
			start = addOn;
		}
	}
	
	public void addToEnd (int myData){
		Node addOn = new Node(myData, null);
		size ++;
		
		if (start == null){
			start = addOn;
			end = addOn;
		}
		
		else{
			end.next = addOn;
			end = addOn;
		}
	}
	
	public void addToPosition (int myData, int myPosition){
		Node addOn = new Node (myData, null);
		Node currentPtr = start;
		
		if (size == 0){
			start = addOn;
			end = addOn;
		}
		
		for (int i = 0; i < size; i++){
			if (i == myPosition -1){
				Node temp = currentPtr.next;
				currentPtr.next = addOn;
				addOn.next = temp;
				break;
			}
			currentPtr = currentPtr.next;
		}
		size++;
	}
	
	public void delete (int myPosition){
		Node currentPtr = start;
		
		if (myPosition == 0){
			start = start.next;
			size--;
			return;
		}
		
		if (myPosition == size){
			Node prevPtr = start;
			while (currentPtr != end){
				prevPtr = currentPtr;
				currentPtr = currentPtr.next;	
			}
			end = prevPtr;
			prevPtr.next = null;
			size --;
			return; 
		}
		
		for (int i = 0; i < size; i++){
			if (i == myPosition - 1){
				Node temp = currentPtr.next;
				temp = temp.next;
				currentPtr.next = temp;
				size--;
				return;
			}
			currentPtr = currentPtr.next;
		}
	}
}
