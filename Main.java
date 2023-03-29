public class Main {
    public static void main(String[] args) {
        // Создание объектов "Игрушки"
        Toy doll = new Toy(1, "Doll");
        Toy soldier = new Toy(2,"Soldier" );
        Toy tank = new Toy(3, "Tank");
        Toy bear = new Toy(4, "Bear");
        Toy cubes = new Toy(5, "Cubes");
        Toy ball = new Toy(6, "Ball");
        Toy car = new Toy(7, "Car");

        // Создание объекта "Розыгрыш игрушек" с добавлением игрушек в розыгрыш
        Toy_Lottery toy_lottery = new Toy_Lottery();
        toy_lottery.add_toy_in_listToy(doll);
        toy_lottery.add_toy_in_listToy(soldier);
        toy_lottery.add_toy_in_listToy(tank);
        toy_lottery.add_toy_in_listToy(bear);
        toy_lottery.add_toy_in_listToy(cubes);
        toy_lottery.add_toy_in_listToy(ball);
        toy_lottery.add_toy_in_listToy(car);

        // Запускаем розыгрыш с управлением выпадения выигрыша, затем читаем файл
        toy_lottery.lottteryToy();
        toy_lottery.readFile();
        toy_lottery.lottteryToy();
        toy_lottery.readFile();
        // Проверяем оставшиеся игрушки в списке
        toy_lottery.getToys();
        // просматриваем число игрушек в списке
        toy_lottery.getToy_count();
    }
}
