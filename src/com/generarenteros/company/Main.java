package com.generarenteros.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String tituloMain, autorMain;
        int ejemplaresMain;

        Libro libro1 = new Libro("El quijote", "Cervantes", 1, 0);
        Libro libro2 = new Libro();

        System.out.print("Introduce titulo: ");
        tituloMain = entrada.nextLine();

        System.out.println("Introduce autor :");
        autorMain = entrada.nextLine();

        System.out.println("Numero de ejemplares: ");
        ejemplaresMain = entrada.nextInt();

        libro2.setTitulo(tituloMain);
        libro2.setAutor(autorMain);
        libro2.setEjemplares(ejemplaresMain);

        System.out.println("Libro 1 : -------------");
        System.out.println("Titulo : " + libro1.getTitulo());
        System.out.println("Autor : " + libro1.getAutor());
        System.out.println("Ejemplares : " + libro1.getEjemplares());
        System.out.println("Prestados : " + libro1.getPrestados());
        System.out.println();

        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }

        if (libro1.develucion()) {
            System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
        } else {
            System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
        }

        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }

        System.out.println("Libro 1: ");
        System.out.println("Titulo :" + libro1.getTitulo());
        System.out.println("Autor : " + libro1.getAutor());
        System.out.println("Ejemplares " + libro1.getEjemplares());
        System.out.println("Prestados " + libro1.getPrestados());
        System.out.println();

        System.out.println("----------------------------------------");

        System.out.println("Libro 2 : -------------");
        System.out.println("Titulo : " + libro2.getTitulo());
        System.out.println("Autor : " + libro2.getAutor());
        System.out.println("Ejemplares " + libro2.getEjemplares());
        System.out.println("Prestados : " + libro2.getPrestados());
        System.out.println();
    }
}
