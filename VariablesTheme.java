public class VariablesTheme {

    public static void main(String[] args) {
        byte processorCoresNumber = 2;
        short amountOfRam = 4;
        int processorFrequency = 1100;
        long osBuildNumber = 19045;
        float smbiosVersion = 3.2f;
        double totalVirtualMemorySize = 8.08;
        char firstLetterOfComputerBrand = 'd';
        boolean isPowerfulComputer = false;
        System.out.println("1. Вывод характеристик компьютера\n");
        System.out.println("Количество ядер процессора: " + processorCoresNumber);
        System.out.println("Объём оперативной памяти: " + amountOfRam + " Gb");
        System.out.println("Частота процессора: " + processorFrequency + " Hz");
        System.out.println("Номер сборки ОС: " + osBuildNumber);
        System.out.println("Версия SMBIOS: " + smbiosVersion);
        System.out.println("Общий объём виртуальной памяти: " + totalVirtualMemorySize + " Gb");
        System.out.println("Первая буква названия производителя компьютера: " + firstLetterOfComputerBrand);
        System.out.println("Это мощный компьютер? Ответ: " + isPowerfulComputer + "\n");
        System.out.println("2. Расчет стоимости товара со скидкой\n");
        int penPrice = 100;
        int bookPrice = 200;
        int totalPrice = penPrice + bookPrice;
        double discount = 0.11;
        double discountAmount = totalPrice * discount;
        double discountPrice = totalPrice - discountAmount;
        System.out.println("Общая стоимость товаров без скидки: " + totalPrice + " руб.");
        System.out.println("Сумма скидки: " + discountAmount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой: " + discountPrice + " руб.\n");
        System.out.println("3. Вывод слова JAVA\n");
        System.out.println("   J    a  v     v  a     ");
        System.out.println("   J   a a  v   v  a a    ");
        System.out.println("J  J  aaaaa  V V  aaaaa   ");
        System.out.println(" JJ  a     a  V  a     a\n");
        System.out.println("4. Вывод min и max значений целых числовых типов\n");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = (Long.MAX_VALUE);
        System.out.println(maxByte);
        System.out.println(maxByte + 1);
        System.out.println(maxByte - 1);
        System.out.println(maxShort);
        System.out.println(maxShort + 1);
        System.out.println(maxShort - 1);
        System.out.println(maxInt);
        System.out.println(maxInt + 1);
        System.out.println(maxInt - 1);
        System.out.println(maxLong);
        System.out.println(maxLong + 1);
        System.out.println(maxLong - 1 + "\n");
        System.out.println("5. Перестановка значений переменных\n");
        System.out.println("Перестановка значений переменных с помощью третьей переменной:\n");
        int a = 2;
        int b = 5;
        int c = b;
        b = a;
        a = c;
        System.out.println(a);
        System.out.println(b + "\n");
        System.out.println("Перестановка значений переменных с помощью арифметических операций:\n");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b + "\n");
        System.out.println("Перестановка значений переменных с помощью побитовой операции:\n");
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b + "\n");
        System.out.println("6. Вывод символов и их кодов\n");
        char char1 = 36;
        char char2 = 42;
        char char3 = 64;
        char char4 = 124;
        char char5 = 126;
        System.out.println("Код символа: " + (int) char1 + " Отображение символа: " + char1);
        System.out.println("Код символа: " + (int) char2 + " Отображение символа: " + char2);
        System.out.println("Код символа: " + (int) char3 + " Отображение символа: " + char3);
        System.out.println("Код символа: " + (int) char4 + " Отображение символа: " + char4);
        System.out.println("Код символа: " + (int) char5 + " Отображение символа: " + char5 + "\n");
        System.out.println("7. Вывод в консоль ASCII-арт Дюка\n");
        String sp = " "; // space
        String us = "_"; // underscore
        char lp = 40; // leftParenthesis
        char rp = 41; // rightParenthesis
        char sl = 47; // slash
        char bs = 92; // backSlash
        System.out.println(sp + sp + sp + sp + sl + bs + sp + sp + sp + sp);
        System.out.println(sp + sp + sp + sl + sp + sp + bs + sp + sp + sp);
        System.out.println(sp + sp + sl + us + lp + sp + rp + bs + sp + sp);
        System.out.println(sp + sl + sp + sp + sp + sp + sp + sp + bs + sp);
        System.out.println(sl + us + us + us + us + sl + bs + us + us + bs + "\n");
        System.out.println("8. Вывод количества сотен, десятков и единиц числа\n");
        int n = 123;
        int x = (n / 100) % 10;
        int y = (n / 10) % 10;
        int z = n % 10;
        System.out.println("Число N равно: " + n);
        System.out.println("Число N содержит цифру: " + x + " в разряде сотен");
        System.out.println("Число N содержит цифру: " + y + " в разряде десятков");
        System.out.println("Число N содержит цифру: " + z + " в разряде  единиц");
        System.out.println("Сумма цифр числа N составляет: " + (x + y + z));
        System.out.println("Произведение цифр числа N составляет: " + (x * y * z) + "\n");
        System.out.println("9. Вывод времени\n");
        int secondsAmount = 86399;
        int hoursAmount = secondsAmount / 3600;
        int minutesAmount = (secondsAmount % 3600) / 60;
        int secondsLeft = ((secondsAmount % 3600) % 60);
        System.out.println(secondsAmount + " секунд в формате ЧЧ:ММ:СС = " + hoursAmount + ":"+ minutesAmount + ":" + secondsLeft);
    }
}