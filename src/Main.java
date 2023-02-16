public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1(){
        System.out.println(" Задача №1");
        int sumMonth=15000;
        int total=0;
        int month=1;
        while(total<=2_459_000){
            month++;
            total=sumMonth + total;
            System.out.println( " Месяц " + month +", сумма накоплений равна " + total+ " рублей.");
        }
    }
    public static void task2(){
        System.out.println(" Задача №2");
        int i=0;
        while (i<10){
            i++;
            System.out.print (" " + i ) ;
        }
        System.out.println();
        for(int n=10; n>0; n--){
            System.out.print(" "+ n);
        }
    }
    public static void task3(){
        System.out.println(" Задача №3");
        int population =12_000_000;
        int fertility =17;
        int mortality =8;
        int year=0;
        while (year<10){
            year++;
            population= population + (population/100_000*fertility)-(population/100_000*mortality);
            System.out.println("Год "+ year + ", численность населенияя составляет " +population);
        }
    }
    public static void task4(){
        System.out.println(" Задача №4" );
        int deposit=15000;
        int total =0;
        int month=1;
        while ( total<12_000_000){
            month++;
            deposit=deposit+deposit*7/100;
            total=deposit+total;
            System.out.println(" Месяц " + month +", сумма накоплений равна " + total+ " рублей.");
        }
        
    }
    public static void task5(){
        System.out.println(" Задача №5" );
        int deposit=15000;
        int total =0;
        int month=1;
        while ( total<12_000_000){
            month++;
            deposit=deposit+deposit*7/100;
            total=deposit+total;
            if (month%6==0){
                System.out.println(" Месяц " + month +", сумма накоплений равна " + total+ " рублей.");
            }
        }
    }
    public static void task6(){
        System.out.println(" Задача №6");
        int deposit=15000;
        int total =0;
        int month=0;
        while ( month<9*12){
           month++;
           deposit=deposit+deposit*7/100;
            total=deposit+total;
            if (month%6==0){
                System.out.println(" Месяц " + month +", сумма накоплений равна " + total+ " рублей.");
            }

        }
    }
    public static void task7(){
        System.out.println(" Задача №7");
        int friday=3;
        do {
            System.out.println( friday);
            friday=friday+6;
        }
        while (friday<31);
    }
    public static void task8(){
        System.out.println(" Задача №8");
        int startYear=2023;
        int fromYear=startYear-200;
        int toYear=startYear+100;
        for (int i=fromYear; i<=toYear; i++){
            if(i%79==0){
                System.out.println(i);
            }
        }
    }
}