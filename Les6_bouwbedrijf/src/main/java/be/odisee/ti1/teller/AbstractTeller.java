package be.odisee.ti1.teller;

public abstract class AbstractTeller {
	protected boolean tellerStaatAan;
	protected int waarde;
	
	public AbstractTeller(){
		this.waarde = 0;
		this.tellerStaatAan = false;
	}
	
	public void increment(){
		if(tellerStaatAan){
			this.waarde++;
		}
	}

	public int increment(int aantal) {
		if(tellerStaatAan) {
			this.waarde += aantal;
		}
		return this.waarde;
	}

	public void reset(){
		if(tellerStaatAan){
			this.waarde = 0;
		}
	}	
	
	public int getWaarde(){
		return this.waarde;
	}
	
	public void zetTellerAan(){
		this.tellerStaatAan = true;
		this.waarde = 0;
	}
	
	public void zetTellerUit(){
		this.tellerStaatAan = false;
		this.waarde = 0;
	}
	
	public boolean staatTellerAan(){
		return this.tellerStaatAan;
	}
	
	public abstract void decrement();

}
