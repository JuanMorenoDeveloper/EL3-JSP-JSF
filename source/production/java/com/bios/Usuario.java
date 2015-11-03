
package com.bios;

public class Usuario {
    private long documento;
    private String nombre;
    private int edad;

    public Usuario(long documento, String nombre, int edad) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = edad;
    }

    
    public long getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    @Override
    public String toString(){
        return nombre+" "+edad+" "+documento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (this.documento ^ (this.documento >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.documento != other.documento) {
            return false;
        }
        return true;
    }
}
