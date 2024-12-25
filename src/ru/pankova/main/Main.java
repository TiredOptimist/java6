package ru.pankova.main;

import ru.pankova.Cache.CacheClass;
import ru.pankova.Default.DefaultClass;
import ru.pankova.Invoke.InvokeClass;
import ru.pankova.ToString.ToStringClass;
import ru.pankova.Two.TwoClass;
import ru.pankova.Validate.ValidateClass;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        out.println("Задание 2.1. ");
        InvokeClass invokeClass = new InvokeClass();
        invokeClass.exampleMethod();

        out.println("Задание 2.2. ");
        DefaultClass defaultclass = new DefaultClass();
        out.println("Аннотация с default: " + defaultclass.getDefaultField());

        out.println("Задание 2.3. ");
        ToStringClass toStringClass = new ToStringClass();
        out.println(toStringClass.toString());

        out.println("Задание 2.4. ");
        ValidateClass validateClass = new ValidateClass("Панда", "Зоя");
        out.println("Аннотация с Validate ");
        out.println("animal: " + validateClass.getAnimal());
        out.println("name: " + validateClass.getName());

        out.println("Задание 2.5. ");
        TwoClass twoClass = new TwoClass("first", 2);
        out.println("Аннотация с Two");
        out.println("first: " + twoClass.getFirst());
        out.println("second: " + twoClass.getSecond());

        out.println("Задание 2.6. ");
        out.println("Аннотация с Cache");
        CacheClass cacheClass = new CacheClass("First", 2, 2.4);
        out.println("first: " + cacheClass.getFirst());
        out.println("second: " + cacheClass.getSecond());
        out.println("third: " + cacheClass.getThird());
    }
}