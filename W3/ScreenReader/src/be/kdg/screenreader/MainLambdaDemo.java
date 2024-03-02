package be.kdg.screenreader;

import be.kdg.screenreader.model.ScreenReader;
import be.kdg.screenreader.view.ScreenReaderView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MainLambdaDemo {

    static List<Person> personList = new ArrayList<>(Arrays.asList(
            new Person("Sebastiaan", 84, 'M'),
            new Person("Lucas", 19, 'M'),
            new Person("Qosai", 46, 'X') ));
    public static void main(String[] args) {
        System.out.println(getPersonByName("Lucas"));
        System.out.println(getPersonByX((person) -> person.getAge() > 40));
        ScreenReader sr = new ScreenReader();
        sr.setText("Brotherrrr");
        sr.readAloud();
    }
    private static Person getPersonByX(Predicate<Person> filter){
        for (Person p : personList) {
            if(filter.test(p)){ return p; } } return null; }
    public static Person getPersonByName(String name){
        for (Person p : personList) {
            if(p.getName().equals(name)){
                return p; }
        } return null; }
}
