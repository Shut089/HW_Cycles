package ru.netology.service.HW_Cycles;
// income - зарплата в месяц
// expenses - траты в месяц
// threshold - Денег на счету
public class WorkService {
        public int calculate(int income, int expenses, int threshold){
            int money = 0; // Зарплата
            int count = 0; // счетчик месяцев отдыха

            for (int month = 0; month < 12; month++){
                if (money >= threshold) { // Можно ли отдыхать
                    count++; // Увеличение месяцев отдыха
                    money -= expenses; // обязательные траты
                    money = money / 3; // Траты на отдых
                } else {
                    money += income; // Заработок
                    money -= expenses; // обязательные траты
                }
            }
            return count;


        }

    }



