package queueImplementation;

import java.util.NoSuchElementException;

public class Queue<T> {

	private static class Node<T>{
		private T data;
		private Node<T> next;

		public Node (T myData){
			data = myData;
		}
	}
	
	private Node<T> start;
	private Node<T> end;
	private int size;
	
	//Add item to the end of list
	public void add (T item){
		Node<T> addOn = new Node<T> (item);
		if (size == 0){
			size++;
			start = addOn;
			end = addOn;
		}
		
		else{
			end.next = addOn;
			end = addOn;
			size++;
		}
	}
	
	//Remove first item in the list
	public T remove (T item){
		if (size == 0){
			throw new NoSuchElementException ("Sorry there is nothing to be removed");
		}
		
		T returnData = start.data;
		start = start.next;
		
		if (start == null)
			end = null;
		
		size --;
		return returnData;
	}
	
	//return the top of the queue
	public T peek (){
		if (size == 0)
			throw new NoSuchElementException ("Sorry the queue is empty");
		return start.data;
	}
	
	//return true if queue is empty
	public boolean isEmpty(){
		return (size == 0);
	}
}