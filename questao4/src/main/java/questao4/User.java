package questao4;

import java.util.ArrayList;
import java.util.List;

/*
    Refatore esse código para:

    - Aplicar encapsulamento de campos
    - Substituir listas por objetos que representem endereços
    - Introduzir um método que oculte o acesso direto à lista, como addAddress()

*/

public class User {
    private String name;
    private String email;
    private List<Address> addresses;

    public User(String name, String email, List<Address> addresses){
        this.name = name;
        this.email = email;
        this.addresses = new ArrayList<>(addresses);
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public List<Address>  getAddress() {
        return new ArrayList<>(addresses);
    }
}

