package uxui;

import uxui.user; // importa sua classe

public class teste {
    public static void main(String[] args) {
        user usuario = new user();

        // Chama o método de verificação
        boolean valido = usuario.verificarUsuario("login_de_teste", "senha_de_teste");

        // Usa o resultado
        if (valido) {
            System.out.println("Usuário encontrado: " + usuario.nome);
        } else {
            System.out.println("Usuário não encontrado ou dados inválidos.");
        }
    }
}
