package heritage;

public class voitures {
    private String couleur;
    private int puissance;
    private String marque;
    public voitures(String couleur,int puissance,String marque){
        this.couleur=couleur ;
        this.puissance = puissance;
        this.marque=marque;}
    
        public String getCouleur(){
            return couleur;
        }
        public void setCouleur(String couleur){
            this.couleur=couleur;
        }
        public int getPuissance(){
            return puissance;
        }
        public void setPuissance(int puissance){
            this.puissance=puissance;
        }
        public String getMarque(){
            return  marque;

        }
        public void setMarque(String marque){
            this.marque=marque;
        }
}
