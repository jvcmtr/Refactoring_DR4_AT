package questao1.classifications;



public class HighClassification extends Classification {    
    private final String NAME = "ALTO";
    
    @Override
    public boolean matchClassification(int number){
        return number > 10;
    }

    @Override
    public String getName(){
        return NAME;
    }
}