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
        int size = 0;
	Node currentNode = headReference;
        while (currentNode.getReferenceToNextNode() != null) {
	    size ++;
	    currentNode = currentNode.getReferenceToNextNode();
	}
	return size;		      
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
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
	 Node element = new Node(val, headReference);
	 headReference = element;
	 return true;
     }
}
