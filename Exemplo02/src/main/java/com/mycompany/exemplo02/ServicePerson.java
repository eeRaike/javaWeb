
package com.mycompany.exemplo02;

import java.util.Objects;

public class ServicePerson {
    
    public boolean isAdult(Pessoa pessoa){
        //Retorna true caso a pessoa seja construida com idade maior ou igual a 18 anos
        Objects.requireNonNull(pessoa, "Pessoa can't be null");
        return pessoa.getAge()>=18;
    }
}
