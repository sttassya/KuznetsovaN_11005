package Project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private static final List<Client> list = new ArrayList<>();
    private static final HashSet<String> bills = new HashSet<>();
    private static final Scanner in = new Scanner(System.in);
    private static Client client;
    // Сделать переключения между пользователями и привязку нескольких кредитных карт к одному счету
    public static void main(String[] args) {
        start(); // Создаем клиента, счет и карту
        while (true) {
            System.out.println("Введите цифру для выполнения следующего действия: "); // Меню
            System.out.println("[1] -- Добавить нового клиента [2] -- Заблокировать текущую карту");
            System.out.println("[3] -- Переслать деньги на другой счет [4] -- Добавить баланс на карту");
            System.out.println("[5] -- Выйти [6] -- Вывести всех клиентов");
            System.out.println("[7] -- Снять деньги с карты [8] -- Аннулировать счет");
            // System.out.println(list);
            String s = in.next();
            if (s.charAt(0) == '1') {
                start(); // Создаем нового клиента и счет
            }
            if (s.charAt(0) == '2') {
                client.getBill().getCreditCard().blockCard(); // Блокируем карту
            }
            if (s.charAt(0) == '3') {
                if (client.getBill().getCreditCard().isBlocked) {
                    System.out.println("Карта заблокирована :(");
                    continue;
                }
                boolean flag = true;
                if (list.size() < 2) {
                    System.out.println("Вы единственный клиент банка");
                }
                System.out.println("Введите номер счета другого клиента");
                String address = in.next();
                for (Client clientq : list) {
                    if (clientq.getBill().getBill().equals(address)) { // Если имеется счет, то перечисляем на баланс (если он у нас больше введенной суммы) деньги
                        flag = false;
                        System.out.println("Введите сумму");
                        int z = in.nextInt();
                        if (client.getBill().getCreditCard().getBalance() < z) {
                            System.out.println("У вас недостаточно средств :(");
                            continue;
                        }
                        client.getBill().getCreditCard().setBalance(client.getBill().getCreditCard().getBalance() - z);
                        clientq.getBill().getCreditCard().setBalance(clientq.getBill().getCreditCard().getBalance() + z);
                    }
                }
                if (flag) {
                    System.out.println("Такого клиента нет");
                }
            }
            if (s.charAt(0) == '4') {
                if (client.getBill().getCreditCard().isBlocked) {
                    System.out.println("Карта заблокирована :(");
                    continue;
                }
                System.out.println("Введите сумму");
                int k = in.nextInt();
                client.getBill().getCreditCard().setBalance(client.getBill().getCreditCard().getBalance() + k); // Добавляем баланс
                System.out.println("Успешно");
            }
            if (s.charAt(0) == '7') {
                if (client.getBill().getCreditCard().isBlocked) {
                    System.out.println("Карта заблокирована :(");
                    continue;
                }
                System.out.println("Введите сумму");
                int k = in.nextInt();
                if (client.getBill().getCreditCard().getBalance() < k) {
                    System.out.println("Недостаточно средств");
                    continue;
                }
                client.getBill().getCreditCard().setBalance(client.getBill().getCreditCard().getBalance() - k); // Уменьшаем баланс
                System.out.println("Успешно");
            }
            if (s.charAt(0) == '5') {
                System.exit(0);
            }
            if (s.charAt(0) == '8') { // Аннулируем счет
                list.remove(client);
                System.out.println("Клиент успешно удален");
                start();
            }
            if (s.charAt(0) == '6') { // Выводим всех клиентов и всю информацию о них
                for (Client client2: list) {
                    System.out.println("Номер счета: ");
                    System.out.println(client2.getBill().getBill());
                    System.out.println("Имя клиента: ");
                    System.out.println(client2.getName());
                    System.out.println("Номер карты: ");
                    System.out.println(client2.getBill().getCreditCard().getCardnumber());
                    System.out.println("Баланс карты: ");
                    System.out.println(client2.getBill().getCreditCard().getBalance());
                }
            }
        }
    }

    public static void start() {
        while (true) {
            System.out.println("Введите имя клиента: ");
            client = new Client();
            list.add(client);
            client.setName(in.next());
            System.out.println("Введите номер счета: ");
            Bill bill = new Bill();
            String v = in.next();
            bill.setBill(v);
            bills.add(v);
            if (bills.size() != list.size()) {
                System.out.println("Такой счет уже существует :(");
                continue;
            }
            bill.generateCreditCard();
            client.setBill(bill);
            System.out.println("Сгенерированная карта: ");
            System.out.println(client.getBill().getCreditCard().getCardnumber());
            break;
        }
    }
}
