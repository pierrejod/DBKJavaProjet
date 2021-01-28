package classe;

 //Initialisation de la classe et le constructeur Produit

public class Produit {

    private int id;
    private String nom;
    private String prix;
    private String type;
    private String stock;
    private static int comp;

    public Produit(int id, String nom, String prix, String type, String stock) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.type = type;
        this.stock = stock;
    }

    public Produit(String nom, String prix, String type, String stock) {
        this.id = ++comp;
        this.nom = nom;
        this.prix = prix;
        this.type = type;
        this.stock = stock;
        
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}
	
	
}