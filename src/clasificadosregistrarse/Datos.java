/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificadosregistrarse;

/**
 *
 * @author Marvinn
 */
public class Datos {
    private String nombre;
    private String apellido;
    private String direccion;
    private String edad;
    private String sexo;
    private String sexob;
    private String correo;
    private String contrseña;
    private String repitaContraseña;
    private String marcar;

    public Datos() {
    }

    public Datos(String nombre, String apellido, String direccion, String edad, String sexo, String correo, String contrseña, String repitaContraseña, String marcar) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.sexo = sexo;
        this.correo = correo;
        this.contrseña = contrseña;
        this.repitaContraseña = repitaContraseña;
        this.marcar = marcar;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getSexob() {
        return sexob;
    }
    
    

    public String getCorreo() {
        return correo;
    }

    public String getContrseña() {
        return contrseña;
    }

    public String getRepitaContraseña() {
        return repitaContraseña;
    }

    public String getMarcar() {
        return marcar;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setSexob(String sexob) {
        this.sexob = sexob;
    }
    
    

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrseña(String contrseña) {
        this.contrseña = contrseña;
    }

    public void setRepitaContraseña(String repitaContraseña) {
        this.repitaContraseña = repitaContraseña;
    }

    public void setMarcar(String marcar) {
        this.marcar = marcar;
    }
    
    
}
