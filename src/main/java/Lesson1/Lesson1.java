package Lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");



        /*Второе задание*/

        int val1 = 3;
        int val2 = 2;
        int result = val1 + val2;
        {
            System.out.println("Ответ: " + result);

        }
        double Val3 = 13.2;
        double Val4 = 23.5;
        double Sum1;
        Sum1 = Val4 - Val3;
        {
            System.out.println("Сумма: " + Sum1);
        }

        char ch1 = 'a';
        char ch2 = 'l';
        char ch3 = 'e';
        char ch4 = 'x';
        {
            System.out.println("" + ch1 + ch2 + ch3 + ch4);
        }

//        Третье задание

        float a, b, c, d;
        a = 7;
        b = 3;
        c = 4;
        d = 2;
        float sumFormula;
        sumFormula = a * (b + (c / d));
        {
            System.out.println("Формула равна: " + sumFormula + " LVL");
        }

//        Четвертое задание:


        int Val7 = 3;
        int Val8 = 9;
        Task4Method(Val7, Val8);



     /*   int Val41 = 3;
        int Val42 = 7;
        boolean ValTask4;
        newTask4Method( Val41, Val42 );
        System.out.println(ValTask4);*/

//        Пятое задание
       /* boolean TF;
        Task5Method(int Val);*/

//        Шестое
        int Val61 = 0;
        Task6Method( Val61 );

//         Седьмое
        String name;
        name = "";
        Showname( name );



    }
    /*Четвертое задание:*/
    public static void Task4Method(int Val7, int Val8) {

        int ValTask4 = Val7 + Val8;
        if (ValTask4 >= 10 && ValTask4 <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    public static boolean newTask4Method (int Val41, int Val42) {
        int ValTask44 = Val41 + Val42;
        boolean TF;
        if (ValTask44 >= 10 && ValTask44 <=20){
            return true;
        }
        else {
            return false;
        }
    }

    /*Шестое задание*/

    public  static boolean Task5Method(int Number) {
        int Number1 = -10;
        if (Number1 >=0) {
            return true;
        } else {
            return false;
        }


    }

    /*Пятое задание*/

    public static void Task6Method( int Val61 ) {
        if ( Val61 >= 0 ) {
            System.out.println("Число положительное!");
        }
        else {
            System.out.println("Число отрицательное!");
        }
    }


    /*Седьмое задание*/
//    Я знаю что здесь не должно быть  String name;
//        name = "Vasja"; но как уйти от этого я не пойму.

    public static void Showname(String Name) {
        String name;
        name = "Vasja";
        {
            System.out.println("Привет, " + name + "!");
        }
    }
}

