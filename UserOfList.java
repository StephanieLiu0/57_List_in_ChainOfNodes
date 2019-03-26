/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );
        
        // the spec requests that toString include the size
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println( "populated list: " + list
                          + System.lineSeparator());

	// /* Test get and set accessors
	//  */
	// System.out.println(list.get(0));	
	// System.out.println(list.get(1));	
	// System.out.println(list.get(2));
	// System.out.println(list.get(3));

	// System.out.println("Replace "
	// 		   + list.set(2, "o")
	// 		   + " with o: "
	// 		   + list);
	// System.out.println("Replace "
	// 		   + list.set(3, "p")
	// 		   + " with p: "
	// 		   + list
	// 		   + System.lineSeparator());

	/* Test add method
	 */
	System.out.println(list.add(3, "d")
			   + " "
			   + list);
	System.out.println(list.add(0, "!")
			   + " "
			   + list);
	
      	/* Test remove method
	 */
	System.out.println(list.remove(4)
			   + " "
			   + list);
	System.out.println(list.remove(0)
			   + " "
			   + list);
			   			   
    }
}
