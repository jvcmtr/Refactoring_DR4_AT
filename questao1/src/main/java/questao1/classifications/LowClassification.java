package questao1.classifications;


public class LowClassification extends Classification {    
    private final String NAME = "BAIXO";
    
    @Override
    public boolean matchClassification(int number){
        return number <= 10;
    }

    @Override
    public String getName(){
        return NAME;
    }
}
