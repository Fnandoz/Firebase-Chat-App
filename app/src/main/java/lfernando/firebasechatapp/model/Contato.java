package lfernando.firebasechatapp.model;

/**
 * Created by fernando on 01/03/2018.
 */

public class Contato {
    String nome, email, numero, image;

    public Contato(String nome, String email, String numero, String image) {
        this.nome = nome;
        this.email = email;
        this.numero = numero;
        this.image = image;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getNumero() {
        return numero;
    }
}
