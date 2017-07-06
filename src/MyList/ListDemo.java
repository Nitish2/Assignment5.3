package MyList;

public class ListDemo {

	int x;  // Initializing variable x
	ListDemo next=null;  // Class type variable 
	public ListDemo(int x, ListDemo next) //  Method 
	{
	this.x = x;  //Reference variable of x
	this.next = next; //Reference variable of next
	}

	public static void main(String[] args)
	{
		// Creating  objects  
	ListDemo a = new ListDemo(35, null); 
	ListDemo b = new ListDemo(57, null);
	ListDemo c = new ListDemo(24, null );
	ListDemo d = new ListDemo(40, null);
	ListDemo e = new ListDemo(70,null);

	 /** Takes the next reference from the current node 
         and makes it the current element.
     **/
	a.next = b;  
	b.next = c;
	c.next=d; 
	d.next = e;

	System.out.print("Linked list: ");
	for(ListDemo ptr = a; ptr!=null; ptr=ptr.next) //Using pointer to refer the address of the next element in the list
	{
	System.out.print(ptr.x + " " );
	}
	
	}

	
	}

