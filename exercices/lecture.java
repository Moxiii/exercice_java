package exercices;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.util.Scanner;
public class lecture {
    public static void main(String[] args){
        System.out.println("Taper la path du fichier text a ouvrir");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        int nombresDeMots = 0;
        try{
            FileReader fileReader = new FileReader(path, null);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while(line != null ){
                line = reader.readLine();
                String[] mots = line.split("\\s+");
                nombresDeMots =  mots.length;

            }
            reader.close();
        }
        catch (IOException e) {
			e.printStackTrace();
		}
        
        System.out.println(nombresDeMots);
    }
}
