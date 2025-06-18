package questao1.classifications;


public class RareCaseClassification extends Classification {    
    private final String NAME = "CASO RARO";
    
    @Override
    public boolean matchClassification(int number){
        return number == -9999;
    }

    @Override
    public String getName(){
        return NAME;
    }
}