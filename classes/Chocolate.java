package classes;

public class Chocolate {
    private String exporterCountry;
    private String exporterFirm;
    private String chocolateMark;
    private Integer expertiseIndex;
    private Integer dateOfIndex;
    private Integer percentChocolate;
    private String countryCrafting;

    private Double expertScore;

    public Chocolate(String eC,String eF, String cM,Integer eI,Integer dOI, Integer pC, String cC, Double eS){
        this.exporterCountry = eC;
        this.exporterFirm = eF;
        this.chocolateMark = cM;
        this.expertiseIndex = eI;
        this.dateOfIndex = dOI;
        this.percentChocolate = pC;
        this.countryCrafting = cC;
        this.expertScore = eS;
    }

    public String getExporterCountry() {
        return exporterCountry;
    }

    public String getExporterFirm() {
        return exporterFirm;
    }

    public String getChocolateMark() {
        return chocolateMark;
    }

    public Integer getExpertiseIndex() {
        return expertiseIndex;
    }

    public Integer getDateOfIndex() {
        return dateOfIndex;
    }

    public Integer getPercentChocolate() {
        return percentChocolate;
    }

    public String getCountryCrafting() {
        return countryCrafting;
    }

    public Double getExpertScore() {
        return expertScore;
    }
}
