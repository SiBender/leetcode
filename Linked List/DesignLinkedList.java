class MyLinkedList {
    LinkedListNode head;
    int length;
    
    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.length = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index >= this.length || index < 0) {
            return -1;
        }
        LinkedListNode current = this.head;
        int count = 0;
        while(count < index) {
            current = current.getNext();
            count++;
        }
        
        return current.getValue();
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        LinkedListNode newNode = new LinkedListNode(val);
        newNode.setNext(head);
        head = newNode;
        this.length++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if(this.length == 0) {
            head = new LinkedListNode(val);
            this.length++;
            return;
        }
        
        LinkedListNode current = head;
        LinkedListNode next = current.getNext();
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new LinkedListNode(val));
        this.length++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index > this.length || index < 0) {
            return;
        }
        
        if (index == 0) {
            addAtHead(val);
            return;
        }
        
        if (index == length) {
        	addAtTail(val);
        	return;
        }
        
        LinkedListNode current = this.head;
        int count = 0;        
        while(count < index - 1) {
            current = current.getNext();
            count++;
        }
        
        LinkedListNode newNode = new LinkedListNode(val);
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        this.length++;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
    	if(index >= this.length || index < 0) {
            return;
        }
    	
    	if(index == 0) {
    		head = head.getNext();
    		this.length--;
    		return;
    	}
    	
    	int count = 0;
        LinkedListNode current = this.head;
        while(count < index - 1) {
            current = current.getNext();
            count++;
        }
        
        if(index == this.length - 1) {
        	current.setNext(null);
        } else {
            current.setNext(current.getNext().getNext());
        }
        this.length--;
    }
}

class LinkedListNode {
    int val;
    LinkedListNode next;
    
    public LinkedListNode(int val) {
        this.val = val;
    }
    
    public LinkedListNode getNext() {
        return next;
    }
    
    public void setNext(LinkedListNode next) {
        this.next = next;
    }
    
    public int getValue() {
        return this.val;
    }
    
    public void setValue(int val) {
        this.val = val;
    }
}
