package com.mycompany.libreria;
import java.time.LocalDate;
import java.util.*;
public class Prestamo {
    private int numero;
    private LocalDate fechaPrestamo;
    private Libro libro;
    private Estudiante estudiante;

    public Prestamo(int numero, Libro libro, Estudiante estudiante) {
        this.numero = numero;
        this.libro = libro;
        this.estudiante = estudiante;
    }
