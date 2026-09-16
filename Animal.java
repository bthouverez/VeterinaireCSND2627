class Animal {
	protected double poids;
	protected int taille;

	public Animal() {
		System.out.println("Constructeur Animal par défaut");
		this.poids = 5;
		this.taille = 50;
	}

	public Animal(double p, int t) {
		System.out.println("Constructeur Animal paramétré");
		this.poids = p;
		this.taille = t;
	}

	public void faireDuBruit() {
		System.out.println("Du bruit...");
	}

	public int getTaille() { return this.taille;}
	public void setTaille(int i ) { this.taille = t;}
	public double getPoids() { return this.poids;}
	public void setPoids(double p ) { this.poids = p;}
	
	@Override
	public String toString() {
		return "Animal qui pèse " + poids + "kg et mesure " + taille + "cm";
	}
}