package ds;

public class Node {
	
	private char data;
	private Node next;
	
	public Node (char data)
	{
		this.setData(data);
		this.setNext(null);
	}
	
	public char getData() {
		return data;
	}
	public void setData(char data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
