package dev.vinisantosn.geradordesenhas.gerador;

import jakarta.persistence.*;

@Table(name = "gerador")
@Entity(name = "gerador")
public class Gerador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String senha;
    private final String ALFABETO = "abcdefghijklmnopqrstuvwxyz";
    private final String NUMEROS = "0987654321";
    private final String SIMBOLOS = "!@#$%^&*()-+";
    ;
    private String letrasMaiusculas = ALFABETO.toUpperCase();
    private String letrasMinusculas = ALFABETO.toLowerCase();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

//    public String geraSenha() {
//        int tamanhoDaSenha = 12;
//        boolean maiusculas = true;
//        boolean minusculas = true;
//        boolean numeros = true;
//        boolean simbolos = true;
//        StringBuilder senha = new StringBuilder();
//        String caracteres = "";
//
//        if (maiusculas) {
//            caracteres += letrasMaiusculas;
//        }
//        if (minusculas) {
//            caracteres += letrasMinusculas;
//        }
//        if (numeros) {
//            caracteres += NUMEROS;
//        }
//        if (simbolos) {
//            caracteres += SIMBOLOS;
//        }
//
//        for (int i = 0; i < tamanhoDaSenha; i++) {
//            int posicaoAleatoria = (int) (Math.random() * caracteres.length());
//            senha.append(caracteres.charAt(posicaoAleatoria));
//        }
//
//        return senha.toString();
//
//
//    }
}
