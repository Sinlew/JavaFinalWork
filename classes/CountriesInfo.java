package classes;
import java.util.*;

public class CountriesInfo {

    final static ArrayList africa = new ArrayList(Arrays.asList("Ivory Coast", "Ghana","Sao Tome",
            "AfricaCarribeanC. Am.","Tanzania","Uganda","Congo","Nigeria","Madagascar","Principe","PeruMadagascar","West Africa",
            "Togo","Cameroon","Gabon","Liberia","South AmericaAfrica"));
    final static ArrayList asia = new ArrayList(Arrays.asList("Vietnam", "Philippines", "Indonesia","Sri Lanka","IndonesiaGhana",
            "Burma","Malaysia","India"));
    final static ArrayList america = new ArrayList(Arrays.asList("South America", "VenBoliviaD.R.", "Ven.TrinidadMad.","Cost RicaVen",
            "Trinidad","GhanaPanamaEcuador","Grenada","EcuadorCosta Rica","Nicaragua","Colombia","Honduras","Martinique",
            "Jamaica","VenezuelaJava","TrinidadEcuador","DREcuadorPeru","Suriname","Belize","Hawaii","St. Lucia","Central and S. America",
            "Peru","PeruMad.Dom. Rep.","Bolivia","Cuba","Brazil","ColombiaEcuador","Ecuador","Haiti","Domincan Republic",
            "Mexico","VenezuelaGhana","Panama","Puerto Rico","Dominican Rep.Bali","Guatemala","Costa Rica","El Salvador","Carribean",
            "PeruBelize","GhanaDomin. Rep","VenTrinidadEcuador","TrinidadTobago","Tobago","Venezuela","South AmericaAfrica","Dominican Republic"
    ));
    final static ArrayList afsralia = new ArrayList(Arrays.asList("Solomon Islands", "Papua New Guinea","Australia","Fiji","Samoa","Vanuatu"));

    final static ArrayList europa = new ArrayList();
    public static void info(){
        System.out.println("Aмерика: "+america.size());
        System.out.println("Австралия: "+afsralia.size());
        System.out.println("Африка: "+ africa.size());
        System.out.println("Asia: "+ asia.size());
        System.out.println("Европа: "+europa.size());
    }

    public static double countrySum(){
        return america.size()+afsralia.size()+africa.size()+asia.size()+europa.size();
    }

    public static int percentCountry(String a){
        switch (a){
            case "america":
                return (int)(america.size()/countrySum()*100);
            case "afstralia":
                return (int)(afsralia.size()/countrySum()*100);
            case "africa":
                return (int)(africa.size()/countrySum()*100);
            case "asia":
                return (int)(asia.size()/countrySum()*100);
            case "europa":
                return (int)(europa.size()/countrySum()*100);
            default:
                return 0;
        }

    }

    public static void gisto(){
        System.out.println("Деления   0%       10%       20%       30%       40%       50%       60%       70%       80%       90%       100%");
//        System.out.println("Деления   0|||||||||10|||||||||20|||||||||30|||||||||40|||||||||50|||||||||60|||||||||70|||||||||80|||||||||90|||||||||100 ");
        System.out.println("Америка:  |"+"|".repeat(percentCountry("america")));
        System.out.println("Австралия:|"+"|".repeat(percentCountry("afstralia")));
        System.out.println("Африка:   |"+"|".repeat(percentCountry("africa")));
        System.out.println("Азия:     |"+"|".repeat(percentCountry("asia")));
        System.out.println("Европа:   |"+"|".repeat(percentCountry("europa")));
    }

    public static boolean isAmerica(String a){
        if (america.contains(a)){
            return true;
        }
        else return false;
    }

    public static boolean isAvsralia(String a){
        if (afsralia.contains(a)){
            return true;
        }
        else return false;
    }
    public static boolean isAsia(String a){
        if (asia.contains(a)){
            return true;
        }
        else return false;
    }
    public static boolean isEuropa(String a){
        if (europa.contains(a)){
            return true;
        }
        else return false;
    }
    public static boolean isAfrika(String a){
        if (africa.contains(a)){
            return true;
        }
        else return false;
    }
}
