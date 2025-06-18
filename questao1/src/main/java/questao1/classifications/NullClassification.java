package questao1.classifications;

// Null class
public class NullClassification extends Classification {    
    private final String NAME = "SEM CLASSIFICAÇÃO";
    
    @Override
    public boolean matchClassification(int number){
        return false;
    }

    @Override
    public String getName(){
        return NAME;
    }
}
