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







    }
}