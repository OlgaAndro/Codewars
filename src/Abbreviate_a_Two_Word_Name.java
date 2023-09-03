public class Abbreviate_a_Two_Word_Name {
    /*
    Write a function to convert a name into initials.
    This kata strictly takes two words with one space in between them.
The output should be two capital letters with a dot separating them.

It should look like this:
Sam Harris => S.H
patrick feeney => P.F
     */

    public static String abbrevName(String name) {

        name = name.toUpperCase(); //Переводим строку в верхний регистр

//        Создаем новый массив с разделением по параметру "пробел"
        String[] names = name.split(" ");

//      Задаем в значение name символы с индексом 0 и 1
        name = names[0].charAt(0)+"."+names[1].charAt(0);

        return name;
    }

    public static void main(String[] args) {
        String strName = "Alex Black" ;
        System.out.println(abbrevName(strName));

    }


    }


