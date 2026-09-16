class Felin extends Animal {
	protected double taux_piquant;

	public Felin() {
		super();
		this.taux_piquant = 0.85;
	}

	public Felin(double p, int t, double tp) {
		super(p, t);
		this.taux_piquant = tp;
	}

	@Override
	public void faireDuBruit() {
		System.out.println("Miaouuuuu");
	}

	@Override
	public String toString() {
		return super.toString() 
		+ " et des dents pointues à "+taux_piquant*100+"%";
	}
}