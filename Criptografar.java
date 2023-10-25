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
        StringBuilder resultado = new StringBuilder();
        int deslocamento = chave % 95;  // Intervalo de caracteres ASCII imprimíveis

        for (int i = 0; i < mensagem.length(); i++) {
            char caractere = mensagem.charAt(i);

            if (caractere >= 32 && caractere <= 126) {  // Se o caractere estiver no intervalo imprimível
                char novoCaractere = (char) (((caractere - 32 + deslocamento) % 95) + 32);
                resultado.append(novoCaractere);
            } else {
                resultado.append(caractere);  // Se estiver fora do intervalo, apenas copie o caractere
            }
        }
        return resultado.toString(); //Converte o resultado para String
    }

    public static String descriptografar(String mensagemCriptografada, int chave) {
        return criptografar(mensagemCriptografada, 95 - chave);
    }
}
