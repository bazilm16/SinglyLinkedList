
public class SinglyLinkedList<T> {
	
	private class Node<T>{
		Node next;
		T value;
		
		public Node(){
			next = null;
		}
		
		public Node(T val){
			next = null;
			value = val;
		}
		
	}

	private Node root;
	private int size;//this is the size of the linked list
	private Node last;//the last element in the list
	
	/**
	 * Singly linked list constructor without initial value
	 */
	public SinglyLinkedList(){
		root = null;
		last = null;
		size = 0;
	}
	
	/**
	 * Singly linked list constructor with initial value
	 * @param val
	 */
	public SinglyLinkedList(T val){
		root = new Node<T>(val);
		size = 1;
		last = root;
	}
	
	/**
	 * deletes the last element of the linked list
	 * @return, the last element deleted from the linked list
	 */
	public T pop(){
		T lastElem = null;
		Node<T> head = root;
		if(size == 1){
			lastElem = (T)root.value;
		}else if(size > 1){
			System.out.println("size: "+ size);
			Node<T> curr = root;
			for(int i = 0; i < size - 1; i++){
				curr = curr.next;
			}
			lastElem = (T) curr.next;
		}
		size--;
		return lastElem;
	}//pop
	
	/**
	 * adds the element to the end of the linked list
	 * @param val, the value to be added to the linked list
	 */
	public void push(T val){
		//start from the last of the list and add the element at constant time
		last.next = new Node(val);
		last = last.next;
		size++;
	}//push
	
	/**
	 * gets the size of the list
	 * @return, the size of the list
	 */
	public int size(){
		return this.size;
	}//size
	
	public void print(){
		Node<T> curr = root;
		int i = 0;
		for(i=0; i < size; i++){
			//System.out.println(++i + "j");
			System.out.println(curr.value);
			curr = curr.next;
		}
	}//prints the elements of the list
	
	public static void main(String args[]){
		SinglyLinkedList list = new SinglyLinkedList(27);
		list.push(24);
		list.push(78);
		list.pop();
		list.push(43);
		list.push(57);
		System.out.println("size = " + list.size());
		list.print();
	}
	
}
