public class Main {
    public static void main(String[] args) {
        //DZ 1
        //1
        int salary = 65536;
        int i = 0;
        int sumSalary = 0;
        int neededMoney = 2459000;
        while(sumSalary <= neededMoney){
            i++;
            sumSalary+=salary;
            if (sumSalary >= neededMoney){
                System.out.println("Месяц " + i + ", сумма накоплений равна " + sumSalary + " рублей");
            }
        }
        //2
        String sout ="";
        int x = 0;
        while (x < 10){
            x++;
            sout += x + " ";
        }
        System.out.println(sout);

        sout = "";
        for (x = 10; x > 0; x--){
            sout += x + " ";
        }
        System.out.println(sout);
        //3

        //DZ2
        //1

        int sumVklad = 15000;
        double percent = 1.07;
        int neededSum = 12_000_000;
        int tekSum = sumVklad;
        int monthAmount = 0;
        while (tekSum < neededSum){
            tekSum *= percent;
            monthAmount++;
            System.out.println("Месяц " + monthAmount + ". Сумма накоплений = " + tekSum);
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        tekSum = 15000;
        monthAmount = 0;
        //2
        while (tekSum < neededSum){
            tekSum *= percent;
            monthAmount++;
            if (monthAmount % 6 == 0){
                System.out.println("Месяц " + monthAmount + ". Сумма накоплений = " + tekSum);
            }
        }
        //3
        tekSum = 15000;
        percent = 1.07;

        int yearsAmount = 9;
        int newMonthAmount = yearsAmount * 12;
        int tekMonth = 0;
        while (tekMonth < newMonthAmount){
            tekSum *= percent;
            tekMonth += 1;
            if (tekMonth % 6 == 0){
                System.out.println(tekSum);
            }
        }

        //4
        System.out.println("=-=-=-=-=-=-=-");
        int pyatnica = 5;
        int monthLength = 31;
        for (i = pyatnica;i < monthLength;i++){
            if((i - pyatnica) % 7 == 0){
                System.out.println("Сегодня пятница, " + i + " число");
            }
        }

        //DZ 3
        //1
        System.out.println("=-=-=-=-=-=-=-=-=");
        int everyYear = 79;
        int startYear = 0;
        int year = 2022;
        int lastYearsRange = 200;
        int nextYearsRange = 100;
        for (i = startYear; i < year + nextYearsRange;i++){
            if (i % everyYear == 0 && i > year - lastYearsRange && i < year + nextYearsRange){
                System.out.println(i);
            }
        }
        //2
        System.out.println("=-=-=-=-=-=-=-=-=");
        int TYN = 2;
        String holder = TYN + "";
        for (i = 1; i <= 10;i++){
            System.out.println(holder + "*" + i + "=" + TYN * i);
        }


        
    }
}