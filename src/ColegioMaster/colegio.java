
package ColegioMaster;

import java.util.ArrayList;
import java.util.Scanner;


public class colegio {
    
    private static ArrayList<curso> cursos = new ArrayList<>();
    static Scanner consola= new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int opcion=0;
        do {
            System.out.println("***** Menu de Opciones *****");
            System.out.println("Opcion 01. Agregar Alumno.");
            System.out.println("Opcion 02. Calcular Definitivas.");
            System.out.println("Opcion 03. Mostrar el estudiante con Distinción especial, por curso.");
            System.out.println("Opcion 04. Salir del Sistema.");
            System.out.println("Elegir de Opcion: ");
            opcion=consola.nextInt();
            
            switch (opcion) {
                case 1:
                    int codCurso = 0;
                    double def = 0.0;
                    String nomCurso = "sin definir";
                    String estMat = "por definir";
                    
                    System.out.println("Ingrese el ID del estudiante: ");
                    consola.nextLine();
                    String id = consola.nextLine();                    
                    System.out.println("Ingrese el Nombre del Estudiante: ");
                    //consola.nextLine();
                    String nomApell = consola.nextLine();                                        
                    System.out.println("Ingrese Nota 1: ");
                    //consola.nextLine();
                    double nota1 = consola.nextDouble();                    
                    System.out.println("Ingrese Nota 2: ");
                    consola.nextLine();
                    double nota2 = consola.nextDouble();
                                        
                    alumno objEstudi = new alumno(id, nomApell, nota1, nota2, def, estMat );
                    
                    if (cursos.isEmpty() ) {
                        System.out.println("Ingrese el curso: ");
                        consola.nextLine();
                        nomCurso = consola.nextLine();
                        codCurso = 0;                        
                        
                    }
                    else{
                        for (int i = 0; i < cursos.size(); i++) {
                            System.out.println(i+" = "+cursos.get(i).getNomCurso());
                                                        
                        }
                        System.out.println(cursos.size()+" Ingrese nuevo curso: ");
                        System.out.println("Selecciona un codigo del curso: ");
                        codCurso=consola.nextInt();
                        
                        if (codCurso>= cursos.size()) {
                            System.out.println("Ingrese nuevo curso: ");
                            consola.nextLine();
                            nomCurso=consola.nextLine();
                            
                                
                            }
                    }
                    guardarCursos(codCurso, nomCurso, objEstudi);                   
                    
                    break;
                    
                case 2:
                    for (int i = 0; i < cursos.size(); i++){
                        cursos.get(i).calculoDefinitiva();
                    }
                    for (int i = 0; i < cursos.size(); i++) {
                    System.out.println(cursos.get(i).getNomCurso());
                    cursos.get(i).mostrarAlumnos();
                    }
                    
                    break;
                case 3:
                    for (int i = 0; i < cursos.size(); i++) {
                            System.out.println(i+" = "+cursos.get(i).getNomCurso());
                            
                    }
                    System.out.println("Ingrese el nombre del Curso: ");
                    consola.nextLine();
                    nomCurso = consola.nextLine();
                    
                    boolean bandera = false;
                    int bandera2 = 0;
                    for (int i = 0; i < cursos.size(); i++) {
                        bandera = nomCurso.equals(cursos.get(i).getNomCurso());
                        if (bandera==true) {
                            bandera2 = 1;
                        }
                    }
                    if (bandera2 == 1) {
                        mejorAlumno(nomCurso);
                    }
                    else{
                        System.out.println("No existe curso solicitado");
                    }
                    
                    break;
                case 4:
                    System.out.println("Gracias por utilizar el sistema");
                    break;
                    
                default:
                    System.out.println("Digita una Opcion valida.");
            }
            
        } while (opcion!=4);
        
        
        
    }
    //metodo
    
    public static void guardarCursos(int codCurso, String nomCurso,alumno alumno1){
        if (codCurso < cursos.size()) {
            System.out.println("Agregar un alumno a un curso ya existenten: ");
            
            cursos.get(codCurso).agregarAlumno(alumno1);            
        }
        else{
            curso curso1 = new curso(nomCurso);
            curso1.agregarAlumno(alumno1);
            cursos.add(curso1);            
        }
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println(cursos.get(i).getNomCurso());
            cursos.get(i).mostrarAlumnos();
            
        }
    }
    
    public static void mejorAlumno(String nomCurso){
        
        int bandera3 = -1;
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getNomCurso().equals(nomCurso)) {
                bandera3= i;
                break;
            }
            
        }
        cursos.get(bandera3).alumnoMax(nomCurso);
    }
    
}
