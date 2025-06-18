package questao1.classifications;



public class MediumClassification extends Classification {    
    private final String NAME = "MÉDIO";
    
    @Override
    public boolean matchClassification(int number){
        return number == 10;
    }

    @Override
    public String getName(){
        return NAME;
    }
}

