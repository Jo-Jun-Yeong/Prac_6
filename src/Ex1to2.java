
public class Ex1to2 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false); 
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info()); 
		System.out.println(card2.info());

	}

}

class SutdaCard{
	int num; 	//카드 숫자가 1~10사이
	boolean isKwang;	//광이면 true 아니면 false
	
	
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int a, boolean b){
		this.num=a;
		this.isKwang=b;
	}
	
	String info() {
		
		return num + (isKwang? "K" : "");
		
		  
	}
}
