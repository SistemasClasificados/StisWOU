/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificadosregistrarse;

/**
 *Producto a sido Modificando por Josue Martinez *-*-**-*
 * @author Marvinn
 */
public class Producto {
    private String titulo;
    private String descripcion;
    private String precio;
    private String estado;
    private String nombre;
    private String telefono;
    private String correo;
    
    //Modificando
    private int fechaNav;
    private String departamento;
    private int numDui;

    public Producto() {
    }

    public Producto(String titulo, String descripcion, String precio, String estado, String nombre, String telefono, String correo, int fechaNav, String departamento, int numDui) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        
        //Modificando;
        
        this.fechaNac= fechaNac;
        this.departamento= departamento;
        this.numDui=numDui
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public String getEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
