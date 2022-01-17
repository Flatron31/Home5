import java.util.Random;
import java.util.Scanner;

public class Comp {
    private String proc;
    private int operativka;
    private int disk;
    private int cycle;
    private boolean state = true;
    private Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    // конструктор
    public Comp(String proc, int operativka, int disk, int cycle) {
        this.proc = proc;
        this.operativka = operativka;
        this.disk = disk;
        this.cycle = cycle;
    }

    // в случае замены какой-либо комплектующей
    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public int getOperativka() {
        return operativka;
    }

    public void setOperativka(int operativka) {
        this.operativka = operativka;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public int getCycle() {
        return cycle;
    }

    public void setCycle(int cycle) {
        this.cycle = cycle;
    }

    // метод описания компьютера
    public void printComp() {
        System.out.println("Процессор компьютера " + proc);
        System.out.println("Компьютер имеет " + operativka + " Gb оперетивной памяти");
        System.out.println("Жесткий диск имеет " + disk + " Gb памяти");
        System.out.println("Количество циклов работы = " + cycle);
    }

    // метод включения
    public void OnComp() {
        int randomComp = random.nextInt(1);
        System.out.println("введите число 0 или 1");
        if (cycle < 0) {
            state = false;
            System.out.println("Компуктеру конец, нужен новый компуктер");
        } else {
            int myChislo = scanner.nextInt();
            if (randomComp == myChislo && state == true) {
                cycle--;
            } else {
                System.out.println("компуктер сгорел");
                state = false;
            }
        }

    }

    //метод выключения
    public void OffComp() {
        int randomComp = random.nextInt(1);
        if (cycle < 0 || state == false) {
            state = false;
            System.out.println("Компуктеру конец, нужен новый компуктер");
        } else {
            System.out.println("введите число 0 или 1");
            int myChislo = scanner.nextInt();
            if (randomComp == myChislo && state == true) {
                cycle--;
            } else {
                System.out.println("компуктер сгорел");
                state = false;
            }
        }
    }

}

//        Создать класс Компьютер.
//        Класс должен иметь следующие поля
//        - процессор
//        - оперативка
//        - жесткий диск
//        - ресурс полных циклов работы (включение/выключение)
//        Методы:
//        - метод описание(вывод всех полей)
//        - метод включить, при включении может произойти сбой, при вывзове метода рандом загадывает
//        число (0 либо 1), вы вводите число с клавиатуры, если угадали комп включается, если нет сгорает

//        .Если комп сгорел, при попытке включить нужно выдать сообщение что ему конец
//        - выключить (аналогично включению)
//        - при превышении лимита ресурса комп сгорает