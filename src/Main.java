import classes.*;
import java.io.File;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        File dat = new File("data\\data_chocolate.txt");
        ArrayList<Chocolate> dataFin = DataFillGenerator.DataFillGenerator2(dat);

        //CountriesInfo.info();

        CountriesInfo.gisto();
//        ChocolateProcess.chocolateInfoTopFull(dataFin,2015);
        FileWriterChocolate.writeChocolate(dataFin);



        }
    }
