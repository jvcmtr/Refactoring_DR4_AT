package questao4;

public class Address {
    private String street;
    private String number;
    private String zipcode;

    public Address(String street, String number, String zipcode){
        this.street = street;
        this.number = number;
        this.zipcode = zipcode;
    }
    
    @Override
    public String toString(){
        return zipcode.toUpperCase() + " - " + street + ", " + number;
    }
}
