package exercices;
import java.util.*;
import java.io.*;
public class phrase {
    public static void main(String[] args){
        String currentWorkingDir = System.getProperty("user.dir");
        System.out.println("Taper une phrase");
        Scanner sc = new Scanner(System.in);
        String charactere = sc.nextLine();
        String replace = charactere.replace(" ", "");
        System.out.println("il y a "+(replace.length())+ " lettres dans la phrase");
        
        try {
			FileWriter fileWriter = new FileWriter(currentWorkingDir+"\\phrase.txt", false);

			BufferedWriter writer = new BufferedWriter(fileWriter);

			writer.write(charactere);

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
    }

