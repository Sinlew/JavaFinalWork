package classes;

import java.util.*;

public class ChocolateProcess {
    public static void chocolateInfoTopFull(ArrayList<Chocolate> a, int year){
        chocolateInfoTopAfrica(a,year);
        chocolateInfoTopAmerica(a,year);
        chocolateInfoTopAsia(a,year);
        chocolateInfoTopAvstralia(a,year);
        chocolateInfoTopEuropa(a,year);

    }
    public static void chocolateInfoTopAmerica(ArrayList<Chocolate> a, int year){
        List<Object> DATE = Arrays.asList(a.stream().filter(x -> CountriesInfo.isAmerica(x.getExporterCountry())).filter(x->x.getDateOfIndex()==year).toArray());
        ArrayList<Chocolate> date =  new ArrayList(DATE);
        System.out.println("Aфрика "+ year+" \n---------------------");
        hashFormChocolate(date);
        System.out.println("---------------------");
    }
    public static void chocolateInfoTopAvstralia(ArrayList<Chocolate> a, int year){
        List<Object> DATE = Arrays.asList(a.stream().filter(x -> CountriesInfo.isAvsralia(x.getExporterCountry())).filter(x->x.getDateOfIndex()==year).toArray());
        ArrayList<Chocolate> date =  new ArrayList(DATE);
        System.out.println("Aвстралия "+ year+" \n---------------------");
        hashFormChocolate(date);
        System.out.println("---------------------");
    }

    public static void chocolateInfoTopEuropa(ArrayList<Chocolate> a, int year){
        List<Object> DATE = Arrays.asList(a.stream().filter(x -> CountriesInfo.isEuropa(x.getExporterCountry())).filter(x->x.getDateOfIndex()==year).toArray());
        ArrayList<Chocolate> date =  new ArrayList(DATE);
        System.out.println("Европа "+ year+" \n---------------------");
        hashFormChocolate(date);
        System.out.println("---------------------");
    }

    public static void chocolateInfoTopAsia(ArrayList<Chocolate> a, int year){
        List<Object> DATE = Arrays.asList(a.stream().filter(x -> CountriesInfo.isAsia(x.getExporterCountry())).filter(x->x.getDateOfIndex()==year).toArray());
        ArrayList<Chocolate> date =  new ArrayList(DATE);
        System.out.println("Aзия "+ year+" \n---------------------");
        hashFormChocolate(date);
        System.out.println("---------------------");
    }
    public static void chocolateInfoTopAfrica(ArrayList<Chocolate> a, int year){
        List<Object> DATE = Arrays.asList(a.stream().filter(x -> CountriesInfo.isAfrika(x.getExporterCountry())).filter(x->x.getDateOfIndex()==year).toArray());
        ArrayList<Chocolate> date =  new ArrayList(DATE);
        System.out.println("Aфрика "+ year+" \n---------------------");
        hashFormChocolate(date);
        System.out.println("---------------------");
    }

    private static void hashFormChocolate(ArrayList<Chocolate> date){
        if(date.isEmpty()){
            System.out.println("Нет экспертиз");
        }
        else {
            HashMap<String, ArrayList> countries = new HashMap<>();
            for (Chocolate b : date) {
                if (countries.containsKey(b.getExporterCountry())) {
                    ArrayList hash = countries.get(b.getExporterCountry());
                    hash.add(b.getExpertScore());
                    countries.put(b.getExporterCountry(), hash);
                } else {
                    ArrayList hash = new ArrayList();
                    hash.add(b.getExpertScore());
                    countries.put(b.getExporterCountry(), hash);
                }
            }
            Set<String> coName = countries.keySet();
            ArrayList<Country> result = new ArrayList<>();

            for (String text : coName) {
                ArrayList<Double> rez = countries.get(text);
                Double SUM = 0.0;
                for (Double rer : rez) {
                    SUM += rer;
                }
                result.add(new Country(text, SUM / rez.size()));
            }

            result.stream().sorted(Comparator.comparing(Country::getScore).reversed()).forEach(x -> System.out.printf(x.getName() + " - %.2f %n", x.getScore()));
        }
    }
}
