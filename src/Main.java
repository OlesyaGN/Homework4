public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println(" Задание 1. ");
        int age = 15;
        if ( age >= 18 ) {
            System.out.println(" Поздравляем с совершеннолетием ! ");
        }
        if ( age < 18 ){
            System.out.println(" Возраст совершеннолетия ещё не наступил, и нужно немного подождать. ");
        }
        // Задание 2
        System.out.println(" Задание 2. ");
        if ( age >= 7 && age < 18 ) {
            System.out.println(" Ребенок ходит в школу. ");
        }
        if ( age >= 18 && age < 24 ) {
            System.out.println(" Человек уже закончил школу и может отправляться в университет. ");

        }
        if ( age >= 24 ) {
            System.out.println(" Человек окончил университет и ему пора искать первую работу. ");

        }
        // Задание 3.
        System.out.println( " Задание 3. ");
        int capacity = 102;
        int seating = 60;
        int standing = capacity - seating;
        int seatingUsed = 56;
        int standingUsed = 30;
        if ( seatingUsed < seating ) {
            System.out.println(" Есть еще " + (seating - seatingUsed) + " свободных сидящих мест. ");
        }
        if ( standingUsed < standing ) {
            System.out.println(" Есть еще " + ( standing- standingUsed) + " свободных стоящих мест. ");
        }

        // Задание 4
        System.out.println(" Задание 4. ");
        int age1 = 15;
        if ( age1 >= 18 ) {
            System.out.println(" Поздравляем с совершеннолетием ! ");
        } else {
            System.out.println(" Возраст совершеннолетия ещё не наступил, и нужно немного подождать. ");
        }
        // Задание 5
        System.out.println(" Задание 5. ");
        if ( age1 >= 7 && age1 < 18 ) {
            System.out.println(" Ребенок ходит в школу. ");
        } else if ( age1 >= 18 && age1 < 24 ) {
            System.out.println(" Человек уже закончил школу и может отправляться в университет. ");

        } else if ( age1 >= 24 ) {
            System.out.println(" Человек окончил университет и ему пора искать первую работу. ");

        }
        // Задание 6.
        System.out.println( " Задание 6. ");
        int capacity1 = 102;
        int seating1 = 60;
        int standing1 = capacity1 - seating1;
        int seatingUsed1 = 56;
        int standingUsed1 = 30;
        if ( seatingUsed1 < seating1 ) {
            System.out.println(" Есть еще " + (seating1 - seatingUsed1) + " свободных сидящих мест. ");
        } else {
            System.out.println(" Сидячих мест нет! ");
        }
        if ( standingUsed1 < standing1 ) {
            System.out.println(" Есть еще " + ( standing1- standingUsed1 ) + " свободных стоячих мест. ");
        } else {
            System.out.println( "Стоячих мест нет! ");
        }
        // Задание 7
        System.out.println( " Задание 7. ");
        int yearsOld = 25;
        if (yearsOld >= 2 && yearsOld<= 6) {
            System.out.println("Если возраст человека равен "+ yearsOld+ ",то ему нужно ходить в детский сад ");
        } else if (yearsOld>= 7 && yearsOld<=18) {
            System.out.println("Если возраст человека равен "+ yearsOld+ ",то ему нужно ходить в школу ");
        }else if (yearsOld>=18 && yearsOld<=24){
            System.out.println("Если возраст человека равен "+ yearsOld+ ",то ему нужно ходить в университет ");
        } else if (yearsOld>24) {
            System.out.println("Если возраст человека равен "+ yearsOld+ ",то ему нужно ходить на работу ");
        }
        // Задание 8
        System.out.println( " Задание 8. ");
        if ( yearsOld< 5) {
            System.out.println( " Ребенок не может кататься на атракционе. ");
        } else if (yearsOld>=5 && yearsOld<=14){
            System.out.println( " Ребенок может кататься на атракционе только в сопровождении взрослых. ");
        } else if(yearsOld>14) {
            System.out.println( " Ребенок может кататься на атракционе без сопровождения взрослых. ");
        }
        // Зажание 9
        System.out.println(" Задание 10. ");
        int one = 10;
        int two = -7;
        int three = 200;
        if (one>two) {
            if (one > three) {
                System.out.println("Максимальное число - " + one);
            } else if (three > one) {
                System.out.println("Максимальное число - " + three);
            } else {
                System.out.println(" Числа - " + one + " и " + three + " равны ");
            }}else if(two>one) {
            if (three > two) {
                System.out.println("Максимальное число - " + two);
            } else if (three > one) {
                System.out.println("Максимальное число - " + three);
            } else {
                System.out.println(" Числа - " + two + " и " + three + " равны ");
            }
        } else {
            if (one> three){
                System.out.println(" Максимальное число" + one);
            }
            else if (three>one){
                System.out.println( " Маскимальное число"+ three);

            }
            else {
                System.out.println( "Все числа равны ");
            }


        }








    }
}