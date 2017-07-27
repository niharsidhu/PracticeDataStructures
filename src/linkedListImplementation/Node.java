package linkedListImplementation;

public class Node {
	protected int data;
	protected Node next;
	
	public Node(){
		data = 1;
		next = null;
	}
	
	//constructor 2
	public Node(int myData, Node myNext){
		data = myData;
		next = myNext;
	}
	
	public int getData(){
		return data;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void changeData (int myData){
		data = myData;
	}
	
	public void changeNext (Node myNext){
		next = myNext;
	}
}
