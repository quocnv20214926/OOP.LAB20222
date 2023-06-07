package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0;
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public DigitalVideoDisc(String title) {
        this.title = title;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, float cost, String category) {
        this.title = title;
        this.cost = cost;
        this.category = category;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, float cost, String category, String director) {
        this.title = title;
        this.cost = cost;
        this.category = category;
        this.director = director;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, float cost, String category, String director, int length) {
        this.title = title;
        this.cost = cost;
        this.category = category;
        this.director = director;
        this.length = length;
        this.id = ++nbDigitalVideoDiscs;
    }

    public String getTitle() {
        return title;
    }

    public float getCost() {
        return cost;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public int getId() {
        return id;
    }
  
    public void setTitle(String title) {
		
		this.title = title;
	}

    public boolean isMatch(String title) {
        return this.title.toLowerCase().contains(title.toLowerCase());
    }
	
	public String toString(){
		return "DVD - " + title + " - " + category + " - " + director + " - " + length + ":" + cost + "$";
	}
	
}


