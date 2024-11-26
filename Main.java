

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("pepe");
        p.setEdad(25);
        Estudiante e = new Estudiante();
        e.setNombre("juan jose");
        e.setLegajo(22345);
        e.setCarrera("sistemas");
        Profesor pro = new Profesor();
        pro.setNombre("Fernando");
        pro.setMateria("paradigmas de programacion");
        pro.setCargo("Adjunto");
        System.out.println("Objeto p de tipo persona");
        System.out.printf("Nombre: %s, Edad: %d\n", p.getNombre(), p.getEdad());
        System.out.println("Objeto e de tipo estudiante");
        System.out.printf("Nombre: %s, Carrera: %s, Legajo: %d\n", e.getNombre(),e.getCarrera(),e.getLegajo());
        System.out.println("Objeto de tipo Profesor");
        System.out.printf("Nombre: %s, Cargo: %s, Materia: %s\n", pro.getNombre(), pro.getCargo(), pro.getMateria());
    }
    }


