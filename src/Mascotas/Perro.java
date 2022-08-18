package Mascotas;

public class Perro {


    private String nombre;


    private boolean vacunado;
    private int edad;
    private String raza;
    private String color;
    private int numeroPatas;

    //Constructor con el nombre del perro
    public Perro(String nombre) {
        this.nombre = nombre;
    }

    //Metodos
    //Geters y Seters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    //Metodos del perro
    public void ladrar() {
        System.out.println(nombre + " esta ladrando");
    }

}
