package com.hillel.reziapov.homeworks.homework4;

//2. Створити класи Собака та Кіт з успадкуванням від класу Тварини.
//3. Всі тварини можуть бігти та плисти. Як параметр кожному методу передається довжина перешкоди.
// Результатом виконання дії буде друк у консоль. (Наприклад, dogBobik.run(150); -> 'Бобік пробіг 150 м');
//4. Кожна тварина має обмеження на дії (біг: кіт 200 м., собака 500 м.; плавання: кіт не вміє плавати, собака 10 м.).
//  5. * Додати підрахунок створених котів, собак та тварин.
public class Animal {

    public String name;
    private int distanceRun;
    private int distanceSwim;

    public String getName() {
        return name;
    }

    public int getDistanceRun() {
        return distanceRun;
    }

    public int getDistanceSwim() {
        return distanceSwim;
    }

    public Animal(String name, int distanceRun, int distanceSwim) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
    }

    public static void demo(Animal animal) {
        if (animal instanceof Runnable) {
            ((Runnable) animal).run();
        }
        if (animal instanceof Swimmable) {
            ((Swimmable) animal).swim();
        }
    }
}
