import java.util.ArrayList;
import java.util.List;

public class Trakker {
    private List<Usuario> usuarios;

    public Trakker() {
        usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void mostrarRelatorio() {
        for (Usuario u : usuarios) {
            u.exibirPerfil(); // chamada polimórfica
        }
    }

    // ✅ Método público para acessar a lista de usuários com segurança
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
