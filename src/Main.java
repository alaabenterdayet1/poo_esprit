import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        List<Etudiant> students = new ArrayList<>();
        students.add(new Etudiant(1, "Alice", 20));
        students.add(new Etudiant(2, "Bob", 22));
        students.add(new Etudiant(3, "Charlie", 21));

        StudentManagement management = new StudentManagement();

        // Afficher tous les étudiants
        System.out.println("Tous les étudiants :");
        management.displayStudents(students, System.out::println);

        // Afficher les étudiants par filtre (âge > 20)
        System.out.println("\nÉtudiants avec âge > 20 :");
        management.displayStudentsByFilter(students, e -> e.getAge() > 20, System.out::println);

        // Retourner les noms des étudiants
        System.out.println("\nNoms des étudiants :");
        String names = management.returnStudentsNames(students, Etudiant::getNom);
        System.out.println(names);

        // Créer un nouvel étudiant
        System.out.println("\nCréation d'un nouvel étudiant :");
        Etudiant newStudent = management.createStudent(() -> new Etudiant(4, "David", 23));
        System.out.println(newStudent);

        // Trier les étudiants par ID
        System.out.println("\nÉtudiants triés par ID :");
        List<Etudiant> sortedStudents = management.sortStudentsById(students, Comparator.comparingInt(Etudiant::getId));
        sortedStudents.forEach(System.out::println);

        // Convertir la liste en flux
        System.out.println("\nConversion de la liste en flux :");
        management.convertToStream(students).forEach(System.out::println);
    }


}