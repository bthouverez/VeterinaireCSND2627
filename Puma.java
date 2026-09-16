class Puma extends Felin {
	private String couleur;

	public Puma() {
		super();
		this.couleur = "noir";
	}

	public Puma(double p, int t, double tp, String c) {
		super(p, t, tp);
		this.couleur = c;
	}

	@Override
	public String toString() {
		return super.toString() +
		" de couleur " + couleur;
	}

	@Override
	public void faireDuBruit() {
		System.out.println("MAAAAAAAAAAOUUUUU");
	}
}