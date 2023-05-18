package classes;

public class Country {
    private String name;
    private Double score;

    public Country(String name,Double score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public  Double getScore() {
        return score;
    }
}
