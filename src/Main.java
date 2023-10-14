import java.util.*;

/*
Lista în Java oferă posibilitatea de a menține colecția ordonată .
Conține metode bazate pe index pentru a insera, actualiza, șterge și căuta elemente.
Poate avea și elemente duplicate. De asemenea, putem stoca elementele nule din listă.
Interfața Listă se găsește în pachetul java.util și moștenește interfața Collection.
Clasele de implementare ale interfeței List sunt ArrayList , LinkedList , Stack
-- Link Util --- https://www.javatpoint.com/java-list

 */
// puteți crea Lista de orice tip. Clasele ArrayList<T> și LinkedList<T>
// sunt folosite pentru a specifica tipul. Aici, T indică tipul.
public class Main {
    public static void main(String[] args) {
        // Exemplu de listă Java
        //Să vedem un exemplu simplu de Listă în care
        // folosim clasa ArrayList ca implementare.
        //Creating a List
        List<String> list=new ArrayList<String>();
        //Adding elements in the List
        list.add("Mango");
        list.add("AppleReturn");
        list.add("Banana");
        list.add("Grapes");
        //Iterating the List element using for-each loop
        for(String fruit:list)
            System.out.println(fruit);

        // Cum se creează Lista
        //Clasele ArrayList și LinkedList oferă implementarea interfeței List.
        // Să vedem exemplele pentru a crea Lista:

        /*
        //Creating a List Tip String using ArrayList
        List<String> list=new ArrayList<String>();

        //Creating a List Tip Integer using ArrayList
        List<Integer> list=new ArrayList<Integer>();

        //Creating a List Tip Book using ArrayList
        List<Book> list=new ArrayList<Book>();

         //Creating a List Tip String using LinkedList
        List<String> list=new LinkedList<String>();
         */

        //Creating a List model cu ArrayList
        List<String> lista=new ArrayList<String>();
        //Adding elements in the List
        lista.add("Man");
        lista.add("App");
        lista.add("Bana");
        lista.add("Gra");
        //Iterating the List element using for-each loop
        for(String fruit:lista)
            System.out.println(fruit);

        //How to convert Array to List
        //We can convert the Array to List by traversing the array and
        // adding the element in list one by one using list.add() method.

        //Creating Array
        String[] array={"Java","Python","PHP","C++"};
        System.out.println("Printing Array: "+Arrays.toString(array));
//Converting Array to List

        List<String> listi=new ArrayList<String>();
        for(String lang:array){
            list.add(lang);
        }
        System.out.println("Printing List: "+listi);

        //We can convert the List to Array by calling the list.toArray() method.

        List<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");

        //Converting ArrayList to Array

        //String[] array = fruitList.toArray(new String[fruitList.size()]);
        //System.out.println("Printing Array: "+Arrays.toString(array));
        //System.out.println("Printing List: "+fruitList);

        // Obțineți și setați elementul în listă
        //Metoda get() returnează elementul la indexul dat,
        // în timp ce metoda set() schimbă sau înlocuiește elementul.

        //Creating a List
        List<String> liste=new ArrayList<String>();
        //Adding elements in the List
        liste.add("Maria");
        liste.add("Aian");
        liste.add("Bacus");
        liste.add("Grand");
        //accessing the element

        System.out.println("Returning element: "+list.get(1));//it will return the 2nd element, because index starts from 0
        //changing the element

        list.set(1,"Dates");

        //Iterating the List element using for-each loop
        for(String fruit:liste)
            System.out.println(fruit);

        // CUM SE SORTEAZA LISTA
        /*
        Există diferite moduri de a sorta Lista, aici vom folosi metoda Collections.sort()
        pentru a sorta elementul listă.
        Pachetul java.util oferă o clasă de utilitate Collections care are metoda statică sort().
        Folosind metoda Collections.sort() , putem sorta cu ușurință orice Listă.
         */

        //Creating a list of fruits
        List<String> list1=new ArrayList<String>();
        list1.add("Mama");
        list1.add("Aprilie");
        list1.add("Basarabia");
        list1.add("Gerunziu");

        //Sorting the list
        Collections.sort(list1);

        //Traversing list through the for-each loop
        for(String fruit:list1)
            System.out.println(fruit);

        System.out.println("Sorting numbers...");

        //Creating a list of numbers
        List<Integer> list2=new ArrayList<Integer>();
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(1);

        //Sorting the list
        Collections.sort(list2);

        //Traversing list through the for-each loop
        for(Integer number:list2)
            System.out.println(number);

        // Interfață Java ListIterator
        //Interfața ListIterator este folosită pentru a traversa elementul într-o direcție înapoi și înainte.

        List<String> al=new ArrayList<String>();
        al.add("Amit");
        al.add("Vijay");
        al.add("Kumar");
        al.add(1,"Sachin");
        ListIterator<String> itr=al.listIterator();
        System.out.println("Traversing elements in forward direction");
        while(itr.hasNext()){

            System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());
        }
        System.out.println("Traversing elements in backward direction");
        while(itr.hasPrevious()){

            System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());
        }

        // Vezi si lista Class Book







            }
}