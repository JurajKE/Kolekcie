package kolekcie;

//1. úloha: napíš program, kde si vytvoríš zoznam mien, ktorý vypíšeš na konzolu.
//
//2. úloha: napíš program, ktorá ti vloží element (napríklad String meno) na prvé miesto v zozname mien.
//
//3. úloha: napíš program, ktorí má niekoľko elementov, napríklad mien a nahradíš meno na druhej pozícii iným menom.
//
//4. úloha: napíš metódu, ktorá na vstupe bude mať zoznam mien a meno, ktoré sa pokúsiš vyhľadať v zozname. Metóda zistí, či sa daný element (napr. meno) nachádza v zozname alebo nie. Ak áno vráti jeho pozíciu ako návratovú hodnotu.
//
//5. úloha: použi metódu z úlohy 4. Vrátenú pozíciu použi na to aby si načítal daný element zo zoznamu a vypísal ho na konzolu. Potom vyskúšaj do metódy v úlohe 4 zadať také meno, ktoré sa tam nenachádza a postupuj tak ako v úlohe 5. Vyskúšaš si ako si poradiť s neznámym indexom. Ako to vyriešiš?
//
//6. úloha: napíš program, ktorý ti zotriedi prvky v kolekcii.
//
//7. úloha: napíš program, ktorý pridá elementy z jednej kolekcie na koniec druhej kolekcie.
//
//8. úloha: napíš program, ktorý ti vymení dva elementy v kolekcii medzi sebou.
//
//9. úloha: napíš program, ktorý ti zistí, či daná kolekcia je prázdna alebo nie.
//
//10. úloha: napíš program, ktorý ti vypíše elementy z kolekcie na konzolu. Elementy získaj pomocou indexu.
//
//11. úloha: napíš program, ktorý použije HasMap<Integer, Osoba>. Pridaj pár záznamov do danej kolekcii a vypíš prvky danej kolekcie. Integer ber, že je to identifikátor Osoby a Osoba je inštancia nejakej osoby.
//
//12. úloha: použi kolekciu z úlohy 11. Napíš program, ktorý zistí, či v danej kolekcii je Osoba priradená k identifikátoru.
//
//13. úloha: napíš program, ktorý vloží Osoby z kolekcie osôb z úlohy 11 do ArrayListu.
//
//14. úloha: Napíš program, ktorý načíta riadky z textového súboru. Riadky ulož do kolekcie. Jeden riadok = jeden záznam v kolekcii.
//
//15. úloha: napíš metódu, ktorá na vstupe bude akceptovať kolekciu typu Collection. Vo vnútri metódy sa všetky elementy z kolekcie vypíšu na konzolu. Pre predstavu použi napríklad dve kolekcie takto:


import java.util.*;

public class KolekciePriklady {

    ////1. úloha: napíš program, kde si vytvoríš zoznam mien, ktorý vypíšeš na konzolu.
    public static void exampleOne(){
        Set<String> mena = new HashSet<>();
        mena.add("Juraj");
        mena.add("Peter");
        mena.add("Katarina");
        mena.add("Fero");

        for (String s: mena
             ) {
            System.out.println(s);
        }
    }

    //2. úloha: napíš program, ktorá ti vloží element (napríklad String meno) na prvé miesto v zozname mien.
    public static void exampleTwo(){
        List<String> mena2 = new ArrayList<>();
        mena2.add("Jarmila");
        mena2.add("Hugo");
        mena2.add("Peter");

        mena2.add(0, "Lucia");
        System.out.println(mena2.subList(0, 4));
    }

    //3. úloha: napíš program, ktorí má niekoľko elementov, napríklad mien a nahradíš meno na druhej pozícii iným menom.
    public static void exampleThree(){
        List<String> mena3 = new ArrayList<>();
        mena3.add("Jarmila");
        mena3.add("Hugo");
        mena3.add("Peter");

        Collections.replaceAll(mena3, "Peter" , "Jarmila");
        System.out.println(mena3);
    }

    //4. úloha: napíš metódu, ktorá na vstupe bude mať zoznam mien a meno, ktoré sa pokúsiš vyhľadať v zozname. Metóda zistí, či sa daný element (napr. meno) nachádza v zozname alebo nie. Ak áno vráti jeho pozíciu ako návratovú hodnotu.
    public static void exampleFour(String string) {
        List<String> mena3 = new ArrayList<>();
        mena3.add("Jarmila");
        mena3.add("Hugo");
        mena3.add("Peter");

        if (mena3.contains(string)){
            System.out.println(mena3.indexOf(string));
        }else {
            System.out.println("nic");
        }
    }

    //5. úloha: použi metódu z úlohy 4. Vrátenú pozíciu použi na to aby si načítal daný element zo zoznamu a vypísal ho na konzolu. Potom vyskúšaj do metódy v úlohe 4 zadať také meno, ktoré sa tam nenachádza a postupuj tak ako v úlohe 5. Vyskúšaš si ako si poradiť s neznámym indexom. Ako to vyriešiš?
    public static void exampleFive (String string){
        List<String> mena3 = new ArrayList<>();
        mena3.add("Jarmila");
        mena3.add("Hugo");
        mena3.add("Peter");

        //riesenie ak zada meno ktore sa v zozname nenachadza + vypisanie
        if (mena3.contains(string)){
            System.out.println(mena3.indexOf(string));
            System.out.println(mena3.get(mena3.indexOf(string)));
        }else {
            System.out.println("Meno sa tam nenachadza");
        }
    }

    //6. úloha: napíš program, ktorý ti zotriedi prvky v kolekcii.
    public static void exampleSix(){
        List<String> mena3 = new ArrayList<>();
        mena3.add("Jarmila");
        mena3.add("Hugo");
        mena3.add("Peter");

        Collections.sort(mena3);
        System.out.println(mena3);
    }


    //7. úloha: napíš program, ktorý pridá elementy z jednej kolekcie na koniec druhej kolekcie.
    public static void exampleSeven(){
        List<String> mena3 = new ArrayList<>();
        mena3.add("Jarmila");
        mena3.add("Hugo");
        mena3.add("Peter");

        List<String> mena4 = new ArrayList<>();
        mena4.add("Marek");

        mena4.addAll(mena3);
        System.out.println(mena4);
    }

    //8. úloha: napíš program, ktorý ti vymení dva elementy v kolekcii medzi sebou.
    public static void exampleEight(){
        List<String> mena5 = new ArrayList<>();
        mena5.add("Jarmila");
        mena5.add("Hugo");
        mena5.add("Peter");

        Collections.swap(mena5, 0, 1);
        System.out.println(mena5);
    }

    //9. úloha: napíš program, ktorý ti zistí, či daná kolekcia je prázdna alebo nie.
    public static void exampleNine(){
        List<String> mena5 = new ArrayList<>();
        mena5.add("Jarmila");
        mena5.add("Hugo");
        mena5.add("Peter");

        System.out.println(mena5.isEmpty());
    }

    //10. úloha: napíš program, ktorý ti vypíše elementy z kolekcie na konzolu. Elementy získaj pomocou indexu.
    public static void exampleTen(){
        List<String> mena5 = new ArrayList<>();
        mena5.add("Jarmila");
        mena5.add("Hugo");
        mena5.add("Peter");

        for (int i = 0; i < mena5.size(); i++){
            System.out.println(mena5.get(i));
        }
    }

    //11. úloha: napíš program, ktorý použije HasMap<Integer, Osoba>. Pridaj pár záznamov do danej kolekcii a vypíš prvky danej kolekcie. Integer ber, že je to identifikátor Osoby a Osoba je inštancia nejakej osoby.
    public static void exampleEleven(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Juraj");
        hashMap.put(2, "Jan");

        System.out.println(hashMap.get(2));
    }

    //12. úloha: použi kolekciu z úlohy 11. Napíš program, ktorý zistí, či v danej kolekcii je Osoba priradená k identifikátoru.
    public static void exampleTwelve(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Juraj");
        hashMap.put(2, "Jan");

        for (HashMap.Entry m: hashMap.entrySet()
             ) {
            System.out.printf("Kluc je %d a meno %s %n" , m.getKey(), m.getValue());
        }
    }


    //13. úloha: napíš program, ktorý vloží Osoby z kolekcie osôb z úlohy 11 do ArrayListu.

    public static void exampleThirteen(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Juraj");
        hashMap.put(2, "Jan");

        List<String> mena = new ArrayList<>();

        for (String s: hashMap.values()
             ) {
            hashMap.get(s);
            mena.add(s);
        }

        System.out.println(mena);

    }


    //14. úloha: Napíš program, ktorý načíta riadky z textového súboru. Riadky ulož do kolekcie. Jeden riadok = jeden záznam v kolekcii.



    public static void main(String[] args) {
       exampleOne();
       exampleTwo();
       exampleThree();
       exampleFour("Peter");
       exampleFive("Peter");
       exampleSix();
       exampleSeven();
       exampleEight();
       exampleNine();
       exampleTen();
       exampleEleven();
       exampleTwelve();
       exampleThirteen();


    }


}
