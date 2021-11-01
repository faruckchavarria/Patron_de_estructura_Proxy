package org.faruck;


public interface Servidor {
    public String subir(String nomFich);

    public String listado();

    public Fichero bajar(String id);
}
