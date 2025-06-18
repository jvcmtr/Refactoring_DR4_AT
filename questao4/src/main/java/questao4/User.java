package questao4;

import java.util.List;

/*
    Refatore esse código para:

    - Aplicar encapsulamento de campos
    - Substituir listas por objetos que representem endereços
    - Introduzir um método que oculte o acesso direto à lista, como addAddress()

*/

public class User {
    public String name;
    public String email;
    public List addresses;
}

