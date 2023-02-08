
public class TestOrders {
  public static void main(String[] args) {

    // Items
    Item item1 = new Item();
    item1.name = "mocha";
    item1.price = 3;

    Item item2 = new Item();
    item2.name = "latte";
    item2.price = 4;

    Item item3 = new Item();
    item3.name = "drip coffee";
    item3.price = 2;

    Item item4 = new Item();
    item4.name = "capuccino";
    item4.price = 5;

    // Orders
    Order order1 = new Order();
    order1.name = "Cindhuri";

    Order order2 = new Order();
    order2.name = "Jimmy";

    Order order3 = new Order();
    order3.name = "Noah";

    Order order4 = new Order();
    order4.name = "Sam";

    System.out.println(order1);
    // prints out memory location

    order2.items.add(item1);
    order2.total += item1.price;

    System.out.println(order2.total);

    order3.items.add(item4);
    order1.ready = true;
    order4.items.add(item2);
    order4.items.add(item2);
    order4.total += item2.price * 2;
    System.out.println(order4.total);
    order2.ready = true;
  }
}
