package be.odisee.ti1.teller;

public class Teller extends AbstractTeller {

	public Teller() {
		super();
	}

	public void decrement() {
		if (tellerStaatAan){
			this.waarde--;
		}
	}
}
