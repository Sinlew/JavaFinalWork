package classes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileWriterChocolate {
    public static void writeChocolate(ArrayList<Chocolate> a){
        ArrayList<String> countries = new ArrayList<>();
        ArrayList<Chocolate> dat =  new ArrayList<>();
        ArrayList<String> innerDat = new ArrayList<>();
        ArrayList<String> innerDat2 = new ArrayList<>();
        Integer num = 1;

        for (Chocolate cl:a){
            if (!countries.contains(cl.getCountryCrafting())){
                countries.add(cl.getCountryCrafting());
            }
        }

        try(FileWriter writer = new FileWriter("data\\result_"+ System.currentTimeMillis()+".txt")){
            for (String nameCountry:countries){
                Integer min=100;
                Integer max=0;
                String nameMark="-";
                Double score = 0.0;
                Integer year4 = 0;
                writer.write(num+" "+nameCountry+"\n");
                num+=1;
                dat.clear();
                for (Chocolate tap:a){
                    if(tap.getCountryCrafting().equals(nameCountry)){
                        dat.add(tap);
                    }

                }
                for (Chocolate dee:dat){
                    //количестов марок
                    if(!innerDat.contains(dee.getChocolateMark())){
                        innerDat.add(dee.getChocolateMark());
                    }
                    if(!innerDat2.contains(dee.getExporterCountry())){
                        innerDat2.add(dee.getExporterCountry());
                    }
                    if (dee.getPercentChocolate()>max){
                        max=dee.getPercentChocolate();
                    }
                    if (dee.getPercentChocolate()<min){
                        min=dee.getPercentChocolate();
                    }
                    if (dee.getExpertScore()>score){
                        nameMark= dee.getChocolateMark();
                        score= dee.getExpertScore();
                        year4=dee.getDateOfIndex();
                    }
                }
                String resultString = "Количество марок шоколада:"+innerDat.size()+"\nКоличество стран экспортеров: "+innerDat2.size()+"\nМаксимальный процент шоколада: "+max+"\nМинимальный процент шоколада: "+ min+"\nЛучшая марка: "+nameMark+" (Оценка: "+score+" дата проведения: "+year4+")\n";
                writer.write(resultString);
                innerDat.clear();
                innerDat2.clear();

            }

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        };

    }
}
