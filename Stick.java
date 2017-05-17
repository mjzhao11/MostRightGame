public class Stick{
	
	public Node[] arr;
	
	
	public Stick(){
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		
		arr = new Node[3];
		
		arr[0] = n1;
		arr[1] = n2;
		arr[2] = n3;
		
	}
	
	public Stick(int n){
		
		Node n1 = new Node(3);
		Node n2 = new Node(2);
		Node n3 = new Node(1);
		
		arr = new Node[3];
		
		arr[0] = n1;
		arr[1] = n2;
		arr[2] = n3;
	}
	
	public int maxVal(){
		if(arr[2].val !=0){
			return arr[2].val;
		}
		if(arr[1].val!=0){
			return arr[1].val;
			
		}
		return arr[0].val;
	}
	
	public int maxIndex(){
		if(arr[2].val!=0)
			return 2;
		if(arr[1].val!=0)
			return 1;
		
		return 0;
		
	}
	

}