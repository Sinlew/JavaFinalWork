package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public  class DataFillGenerator {


    public static ArrayList DataFillGenerator2(File a){
        ArrayList<Chocolate> datChoc = new ArrayList<>();
        String exporterCountry;
        String exporterFirm;
        String chocolateMark;
        Integer expertiseIndex;
        Integer dateOfIndex;
        Integer percentChocolate;
        String countryCrafting;
        Double expertScore;
        try{
            FileReader dat = new FileReader(a);
            BufferedReader reader = new BufferedReader(dat);
            while((exporterCountry = reader.readLine())!=null){
                exporterFirm = reader.readLine();
                chocolateMark = reader.readLine();
                expertiseIndex = Integer.valueOf(reader.readLine());
                dateOfIndex = Integer.valueOf(reader.readLine());
                percentChocolate = Integer.valueOf(reader.readLine().replace("%",""));
                countryCrafting = reader.readLine();
                expertScore = Double.parseDouble(reader.readLine());
                datChoc.add(new Chocolate(exporterCountry,exporterFirm,chocolateMark,expertiseIndex,dateOfIndex,percentChocolate,countryCrafting,expertScore));
            }

            System.out.println("Чтение завершено успешно");

        }
        catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
        catch (Exception e){
                System.out.println(e.getMessage());
            }
        return datChoc;
    }

    public static int stringKol(File a){
        int sum=0;
        try{
            FileReader dat = new FileReader(a);
            BufferedReader reader = new BufferedReader(dat);
            while (reader.readLine()!=null){
                sum+=1;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return sum;
    }

    public static ArrayList CountryNames(File a){
        ArrayList countries = new ArrayList<>();
        String gr;
        int par = 8;
        try{
            FileReader dat = new FileReader(a);
            BufferedReader reader = new BufferedReader(dat);
            while ((gr = reader.readLine() )!=null){
                if (par == 8){
                    countries.add(gr);
                    par = 0;//1 2 3 4 5 6 7 8
                }

                par+=1;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        //countries.stream().forEach(x->System.out.print(x+" "));
        return countries;
    }

    public static ArrayList reduceClone(ArrayList a){
        Set co = new HashSet(a);
        ArrayList b = new ArrayList<>(co);
        return b;

    }

    public static ArrayList exporterkol(ArrayList<Chocolate> a){
        ArrayList<String> name = new ArrayList<>();
        for (Chocolate dat:a){
            name.add(dat.getExporterCountry());
        }
        reduceClone(name);
        return name;
    }


}
