package com.exampleswagger.rest;

import com.exampleswagger.modelo.Usuario;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UsuarioRestDemoSwaggerController {
  /**
   * getUsuario().
   * 
   * @return Retorna una lista de usuarios.
   */
  @GetMapping("/api/1.0/usuario")
  public List<Usuario> getUsuarios() {
    return Arrays.asList(new Usuario("Juan", 2000L), new Usuario("Pablo", 1000L));
  }

  @GetMapping("/api/1.0/usuario/{nomUsu}")
  public Usuario getUsuario(@PathVariable("nomUsu") final String nomUsu) {
    return new Usuario(nomUsu, 1000L);
  }
}
