package br.com.alura.forum.service

import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service

@Service
class UsuarioService (var usuarios: List<Usuario>) {

    init {
        val usuario = Usuario(id=1, nome="Ana Silva", email="ana@email.com")
        usuarios = listOf(usuario)
    }

    fun buscarPorId(id: Long): Usuario {
        return usuarios.stream().filter { c -> c.id == id }.findFirst().get()
    }

}
