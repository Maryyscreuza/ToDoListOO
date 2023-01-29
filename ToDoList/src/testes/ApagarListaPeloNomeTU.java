package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller.CadastroUsuarioController;

class ApagarListaPeloNomeTU {

    @Test
    void test() {

        CadastroUsuarioController controle = new CadastroUsuarioController();
        controle.cadastrarUsuario("julia@gmail.com", "Julia");
        controle.usuario.cadastrarEducacao("Faculdade", "FGA", true, true);
        controle.usuario.apagarListaPeloNome("Faculdade", "educacao");

        boolean resultadoFinal = controle.usuario.getEducacao().isEmpty();

        assertTrue(resultadoFinal);
    }

}