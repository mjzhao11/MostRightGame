import java.util.Scanner;

public class Game{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("rules displayed"+"\n");
		
		Stick[] game = new Stick[3];
		
		game[0] = new Stick(1);
		game[1] = new Stick();
		game[2] = new Stick();
		
		
		
		display(game);
		int a,b,c;
		
		Scanner kb = new Scanner(System.in);
		int nn = 0;
		
		do{
			do{
				System.out.println("Move from row number: ");
				a = kb.nextInt()-1;
				System.out.println("Move to row number: ");
				b = kb.nextInt()-1;
				System.out.println("");
				if(!valIn(a, b, game)){
					System.out.println("\n"+"Input is not valid. please read the rule and input again."+"\n");
					display(game);
				}
			}while(!valIn(a, b, game));
			
			c = game[a].maxVal();
			
			System.out.println("You have move the number >>> "+c+" >>> from row number "+(a+1)+" to row number "+(b+1)+" .");
			
			game[a].arr[game[a].maxIndex()].val = 0;
			
			if(game[b].maxVal() == 0)
				game[b].arr[0].val = c;
			else
				game[b].arr[game[b].maxIndex()+1].val = c;
			
			
			display(game);
			nn++;
		}while(!win(game[2]));
		
		System.out.println("Congres, you finish the game in "+nn+" steps~(enter any value to exit)");
		nn = kb.nextInt();
		
	}
	
	public static boolean valIn(int a , int b, Stick[] st){
		
		if(a>2 || b>2||a<0||b<0||a==b){
			System.out.println("!!!!!!!!!!!!!!!");
			return false;
		}
		
		
		if (st[a].maxVal()==0){
			System.out.println("@@@@@@@@@@@");
			return false;
		}
		if(st[b].maxVal()==0){
			System.out.println("############");
			return true;
		}
		
		if(st[a].maxVal()>=st[b].maxVal()){
			System.out.println("$$$$$$$$$$");
			return false;
		}
		System.out.println("%%%%%%%%%%%%");
		
		return true;
		
		
	}
	
	public static boolean win(Stick last){
		
		for(int i = 0; i < 3 ; i++){
			
			if(last.arr[i].val != 3-i){
		
				return false;
			}
		}
		return true;
	}
	
	public static void display(Stick[] st){
		
		for(int i = 0; i< 3; i++){
			System.out.print("["+(i+1)+"] : ");
			
			for(int j = 0; j<3;j++){
				
				//if(st[i].arr[j].val !=0){
					
					System.out.print("(  "+st[i].arr[j]+"  )  ");
					
				//}
					
			}	
			System.out.println("");
			System.out.println("");				
		}
	}
	
}






















