import java.util.ArrayList;
import java.util.List;

/**
 * Реализовать, с учетом ооп подхода, приложение. Для проведения исследований с генеалогическим древом.
 * 
 * Идея: описать некоторое количество компонент, например - модель человека и дерева.
 * Под “проведением исследования” можно понимать например получение всех детей выбранного человека.
 */

public class program {

    public static void main(String[] args) {
        List <Person> persons = new ArrayList<>();
        Person pers1 = new Person();
        for (int i = 0; i < 10; i++) {
            pers1 = GenerateFamily.Person();
            persons.add(pers1);
        }
        for (Person person : persons) {
            System.out.println(person);
        }
        
    }
        

}