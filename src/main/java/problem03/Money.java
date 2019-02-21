package problem03;

public class Money {

	//
	// 클래스 구현을 완성 하십시오.
	//
	

	private int amount;
	
	@Override
	public boolean equals(Object o){
	      boolean isT = false;
	      Money money = (Money) o;
	      int m = money.amount;
	      if(this.amount == m) {
	    	  isT = true;
	      }
	      return isT;
	      
//	      if(amount.equals(m)){
//	         isT = true;
//	      }
//	      return isT;
	  }

	@Override
	public int hashCode(){
		return super.hashCode()+137;
	}
	
	public Money(int amount) {
		this.amount = amount;
	}
	
	public Money add(Money money) {
		this.amount += money.amount;
		Money newM = new Money(amount);
		return newM;
	}

	public Money minus(Money money) {
		this.amount -= money.amount;
		Money m = new Money(amount);
		
		return m;
	}

	public Money multiply(Money money) {
		this.amount *= money.amount;
		Money m = new Money(amount);
		return m;
	}

	public Money devide(Money money) {
		this.amount = this.amount / money.amount;
		Money m = new Money(amount);
		return m;
	}
}