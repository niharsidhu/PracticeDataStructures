package hashTableImplementation;
import java.util.ArrayList;
 
public class HashTable<K, V>{
	
    private ArrayList<Node<K, V>> arrayList;
    private int size;
 
    public HashTable(){
    	arrayList = new ArrayList<Node<K,V>>();
    	size = 10;
    }
    
    public int getSize(){
    	return size;
    }
    
    public int getIndex (K key){
    	int hashCode = key.hashCode();
    	return hashCode % this.getSize();
    }
    
    public V get (K key){
    	int index = key.hashCode();
    	Node<K,V> currentNode = arrayList.get(index);
    	
    	while (currentNode != null){
    		if (currentNode.key == key)
    			return currentNode.value;
    	currentNode = currentNode.next;
    	}
    	
    	return null;
    }
    
    public void remove (K key){
    	int indexRemoved = key.hashCode();
    	Node <K, V> currentNode = arrayList.get(indexRemoved);
    	Node <K, V> previousNode = null;
    	
    	while (currentNode != null){
    		if (currentNode.key == key){
    			if (previousNode == null)
    				arrayList.set(indexRemoved, currentNode.next);
    			previousNode.next = currentNode.next;
    		}
    	previousNode = currentNode;
    	currentNode = currentNode.next;
    	}
    }
    
    public void add (K key, V value){
    	int hashCode = key.hashCode();
    	int index = hashCode % this.getSize();
        
    	Node<K,V> currentNode = arrayList.get(index);
    	
    	while (currentNode != null){
    		if (currentNode.key == key){
    			currentNode.value = value;
    			return;
    		}
    		currentNode = currentNode.next;
    	}
    	
    	Node<K,V> head = arrayList.get(index);
    	Node <K, V> addOn = new Node <K, V>(key, value);
    	addOn.next = head;
    }
}