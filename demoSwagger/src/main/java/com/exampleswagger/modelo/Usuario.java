package com.exampleswagger.modelo;

public class Usuario {
  private String nomUsu;
  private Long sueldo;

  /** Constructor de Usuario.
   * 
   * @param nomUsu Nombre del usuario.
   * @param sueldo Sueldo del usuario.
   */
  public Usuario(String nomUsu, Long sueldo) {
    super();
    this.nomUsu = nomUsu;
    this.sueldo = sueldo;
  }

  public String getNomUsu() {
    return nomUsu;
  }

  public void setNomUsu(String nomUsu) {
    this.nomUsu = nomUsu;
  }

  public Long getSueldo() {
    return sueldo;
  }

  public void setSueldo(Long sueldo) {
    this.sueldo = sueldo;
  }
}
