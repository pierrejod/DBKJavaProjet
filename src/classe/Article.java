package classe;

 //Initialisation de la classe et le constructeur Produit
 //Modif de classe tout clean
public class Article {

    private int id;
    private String intitule;
    private float prixHT;
    private long reference;
    private int quantiteEnStock;
    private static int comp;

    public Article(int id, String intitule, float prixHT, long reference, int quantiteEnStock) {
        this.id = id;
        this.intitule = intitule;
        this.prixHT = prixHT;
        this.reference = reference;
        this.quantiteEnStock = quantiteEnStock;
    }

    public Article(String intitule, float prixHT, long reference, int quantiteEnStock) {
        this.id = ++comp;
        this.intitule = intitule;
        this.prixHT = prixHT;
        this.reference = reference;
        this.quantiteEnStock = quantiteEnStock;
        
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public float getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(float prixHT) {
		this.prixHT = prixHT;
	}

	public long getReference() {
		return reference;
	}

	public void setReference(long reference) {
		this.reference = reference;
	}

	public int getQuantiteEnStock() {
		return quantiteEnStock;
	}

	public void setQuantiteEnStock(int quantiteEnStock) {
		this.quantiteEnStock = quantiteEnStock;
	}
    
}