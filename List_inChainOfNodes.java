/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    
    /**
      Construct an empty list
    */


    /**
      @return the number of elements in this list
     */
    public int size() {
        if( headReference == null) return 0;
        else return size( headReference);
    }

    // recursively-called helper
    private int size( Node startingAt) {
        Node next = startingAt.getReferenceToNextNode();
        if( next == null) return 1;
        else return 1+ size( next);
    }
    

     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
	String output = size() + " elements [";
	Node currentNode = headReference;
	for (int i = 0; i < size(); i++) {
	    output += currentNode.getCargoReference() + ",";
	    currentNode = currentNode.getReferenceToNextNode();
	}
	return output += "]";
    }
    
    
    /**
      Append @value to the head of this list./
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
	 headReference = new Node(val, headReference);
	 return true;
     }


    /**
      Helper function
      returns the node at an index
    */
    public Node getNode( int index) {
	Node currentNode = headReference;
	while (index > 0) {
	    currentNode = currentNode.getReferenceToNextNode();
	    index--;
	}
	return currentNode;
    }

    
    /**
      accessor
      @return element @index from this list
    */
    public Object get( int index ) {
	return getNode(index).getCargoReference();	  
    }
    
    
    /**
      Set value at @index to @newValue
      @return old value at @index
    */
    public Object set( int index, Object newValue ) {
    	Object oldCargo = get(index);
	getNode(index).setCargoReference(newValue); 
	return oldCargo;	
    }


    /**
      Insert @value at position @index in this list.
    */
    public boolean add( int index, Object value) {
	if (index == 0)
	    addAsHead(value);
	else {
	    Node newNode = new Node( value, getNode(index));
	    getNode(index - 1).setReferenceToNextNode( newNode);
	}
	return true;
    }

    
    /**
      Remove the element at position @index in this list.
      @return the value that was removed from the list
    */
    public Object remove( int index) {
	Object oldCargo = get(index);
	if (index == 0)
	    headReference = getNode(index + 1);
	else
	    getNode(index - 1).setReferenceToNextNode(getNode(index + 1));
	return oldCargo;
    }
}
