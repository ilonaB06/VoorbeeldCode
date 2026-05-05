package be.odisee.ti1.teller;

public class PositieveTeller extends AbstractTeller {

	public PositieveTeller() {
		super();
	}

	public void decrement() {
		if (tellerStaatAan && (this.waarde > 0)){
			this.waarde--;
		}
	}
}
