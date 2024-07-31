package first;

import java.util.ArrayList;
import java.util.List;

public class FirstHomeworks {

    public void juJa(){

 //Объявление и инициализация списка
            List<String> names = new ArrayList<>();

            /*Добавление элементов в список*/
            names.add("VovaDjan");
            names.add("CocadPetuh");
            names.add("MALASH");

            /*Вывод элементов списка*/
            System.out.println("Initial list:");
            for (String name : names) {
                System.out.println(name);
            }

            /*Получение элемента по индексу*/
            String firstElement = names.get(0);
            System.out.println("First element: " + firstElement);

        /*Обновление элемента*/
               names.set(1, "CocadPetuh");
            System.out.println("Updated list: " + names);

            names.set(2, "MALAHS");
            System.out.println("Updated list: " + names);

            names.set(3, "VovaDlan");
            System.out.println("Updated list: " + names);

//            // Удаление элемента по индексу или по значению
//            names.remove(2); // Удаление элемента по индексу
//            names.remove("VovaDjan"); // Удаление элемента по значению
//            System.out.println("List after removal: " + names);


            int size = names.size();
            System.out.println("List size: " + size);
        }
    }
/*suchka obleji menia kak ledinec*/
