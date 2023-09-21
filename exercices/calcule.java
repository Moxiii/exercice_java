package exercices;

public class calcule {
    static double somme;
    public static void main(String[] args){
        for (int i=0 ; i<=10000;i++){
            somme+=i;
            
        }
        System.out.print(somme);
    }
}
