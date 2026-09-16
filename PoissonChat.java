class PoissonChat extends Animal {
	private int longueur_moustache;

	public PoissonChat() {
		super();
		this.longueur_moustache = 3;
	}


	public int getLongueurMoustache() { return this.longueur_moustache; }
	public void setLongueurMoustache(int lm) { this.longueur_moustache = lm;}

	public void faireDuBruit() {
		System.out.println("Gloups bwoup");
	}
}