package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller.CadastroUsuarioController;

class CadastrarEducacaoTU {

    @Test
    void test() {
        CadastroUsuarioController controle = new CadastroUsuarioController();
        controle.cadastrarUsuario("julia@gmail.com", "Julia");
        controle.usuario.cadastrarEducacao("Faculdade", "FGA", true, true);

        boolean resultadoFinal = controle.usuario.getEducacao().isEmpty();

        assertFalse(resultadoFinal);
    }

}