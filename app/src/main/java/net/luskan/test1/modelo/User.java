package net.luskan.test1.modelo;

import com.google.auto.value.AutoValue;

/**
 * Created by Clayton on 16/02/2017.
 */

public class User {
    final public String Nome;
    final public String Sobrenome;

    public User(String nome, String sobrenome) {
        Nome = nome;
        Sobrenome = sobrenome;
    }
}
