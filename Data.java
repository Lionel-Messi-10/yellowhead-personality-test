public class Data {
    private double arkar = 0;
    private double aindra = 0;
    private double ryln = 0;
    private double ellie = 0;
    private double ella = 0;
    private double dave = 0;
    private double lily = 0;
    
    public Data(){
        
    }
    public void a(double a, double b, double c, double d, double e, double f, double g){
        arkar += a;
        aindra += b;
        ryln += c;
        ellie += d;
        ella += e;
        dave += f;
        lily += g;
    }
    public String toString(){
        double max = Math.max(Math.max(Math.max(arkar,aindra),Math.max(ellie,ryln)),Math.max(Math.max(dave,ella),lily));
        if (max == arkar){
            return "Arkar!";
        }else if(max == aindra){
            return "Aindra!";
        }else if(max == ellie){
            return "Ellie!";
        }else if(max == ryln){
            return "Ryln!";
        }else if(max == dave){
            return "Dave!";
        }else if(max == ella){
            return "Ella!";
        }else{
            return "Lily!";
        }
    }
}

//make sure to set personalityquiz to main file!!!! (idk how to fix this)
