package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller.CadastroUsuarioController;

class CadastrarUsuarioTU {

    @Test
    void test() {
        CadastroUsuarioController controle = new CadastroUsuarioController();
        controle.cadastrarUsuario("julia@gmail.com", "Julia");

        String resultadoFinal = controle.usuario.getNome();
        String valor = "Julia";

        assertEquals(valor, resultadoFinal);
    }

}