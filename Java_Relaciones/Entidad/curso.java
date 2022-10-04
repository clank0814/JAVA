/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Mario
 */
public class curso {
    
    private String materia;
    private int año;
    private prof Prof;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public prof getProf() {
        return Prof;
    }

    public void setProf(prof Prof) {
        this.Prof = Prof;
    }

    @Override
    public String toString() {
        return "curso{" + "materia=" + materia + ", a\u00f1o=" + año + ", Prof=" + Prof + '}';
    }
    
    
    
}
