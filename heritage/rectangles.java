package heritage;

public class rectangles {
    private int Longueur;
    private int Largeur;
    private double Aire;
    private double perimetre;
    public  rectangles(int Longueur, int Largeur, double Aire , double perimetre){
        Longueur = this.Longueur;
        Largeur=this.Largeur ;
        Aire  = this.Aire   ;
        perimetre = this .perimetre      ;
        }
     
        public  int getLongueur(){
            return Longueur;
        }

        public void setLongueur(int Longueur){
            this.Longueur = Longueur;
        }
        public  int getLargeur(){
            return Largeur;
        }

        public void setLargeur(int Largeur){
            this.Largeur = Largeur;
        }
        public double getAire(){
            return Aire;
        }

        public  void setAire(double Aire){
            this.Aire = Aire;
        }
        public double getPerimetre(){
            return perimetre;
        }

        public void setPerimetre(double perimetre){
            this.perimetre = perimetre;
        }
        public  int calculateArea(){
             int longeur = getLongueur();
             int largeur = getLargeur();
            int Aire = longeur*largeur;
            setAire(Aire);
            System.out.println(Aire);
            return (Aire);}
}
