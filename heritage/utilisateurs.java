package heritage;

public class utilisateurs {
    private String name;
    private String Email;
    private String password;
        public utilisateurs(String name, String Email,String password){
        this.name=name ;  
        this.Email = Email;
        this.password=password;

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }
        public String getEmail(){
            return Email;
        }
        public void setEmail(String Email){
            this.Email = Email;
        }
        public String getPassword(){
            return password;
        }
        public void setPassword(String password){
            this.password=password;
        }
    }
}
