package Criptografia;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author guilherme.nunes
 */
public class Criptografar {
    public static String criptografar(String mensagem, int chave) {
        StringBuilder mensagemCriptografada = new StringBuilder();
        for (int i = 0; i < mensagem.length(); i++) {
            char caractere = mensagem.charAt(i);

            if (Character.isLetter((caractere))) {
                char novoCaractere;
                if (Character.isLowerCase(caractere)) {
                    novoCaractere = (char) (((caractere - 'a' + chave) % 26) + 'a');
                } else {
                    novoCaractere = (char) (((caractere - 'A' + chave) % 26) + 'A');
                }

                mensagemCriptografada.append(novoCaractere);
            } else {
                mensagemCriptografada.append(caractere);
            }
        }
        return mensagemCriptografada.toString();
    }

    public static String descriptografar(String mensagemCriptografada, int chave) {
        return criptografar(mensagemCriptografada, 26 - chave);
    }
}
