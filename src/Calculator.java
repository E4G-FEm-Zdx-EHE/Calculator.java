import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){

                     // Вывод на экран
            System.out.println("Выберите пункт");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Выйти");


            int person = scanner.nextInt();
            int result;
            if (person == 5){
                break;
            } else if (person ==1){
                System.out.println("Введите первое число");
                int a = scanner.nextInt();
                System.out.println("Введите второе число");
                int b = scanner.nextInt();
                System.out.println("a:" + a);
                System.out.println("b:" +b);
                result = a+b;                          // блок сложения
                System.out.println("Ответ" + result); // 1й блок сложения

            }  else if (person ==2){
                    System.out.println("Введите первое число");
                    int a = scanner.nextInt();
                    System.out.println("Введите второе число");
                    int b = scanner.nextInt();
                    System.out.println("a:" + a);
                    System.out.println("b:" +b);
                    result = a-b;                          // блок сложения
                    System.out.println("Ответ" + result); // 2й блок вычитания

            }else if (person ==3){
                    System.out.println("Введите первое число");
                    int a = scanner.nextInt();
                    System.out.println("Введите второе число");
                    int b = scanner.nextInt();
                    System.out.println("a:" + a);
                    System.out.println("b:" +b);
                    result = a*b;                         // блок умножения
                    System.out.println("Ответ" + result); // 3й блок умножения

                    }else if (person ==4){
                      System.out.println("Введите первое число");
                      int a = scanner.nextInt();
                      System.out.println("Введите второе число");
                      int b = scanner.nextInt();
                      if (b == 0){
                      System.out.println("На ноль делить нелзя");}
                      System.out.println("a:" + a);
                      System.out.println("b:" +b);
                      result = a/ b;                        // ,блок деления
                      System.out.println("Ответ" + result); // 4й блок деления

            }else {
        }
                      System.out.println("Ошибка - Eror"); // Вывод ошибки

                      System.out.println("Программа завершена"); // 5й блок выход
                                    }
    }
}