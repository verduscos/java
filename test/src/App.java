class Customer {
  String name= "defaultName";
  String size = "S";

  public static void main(String[] args) {
  }
  void setSize(String newSize) {
    // The void keyword specifies that a method should not have a return value.
    size = newSize;
  }
  String getSize() {
    System.out.println(size);
    return size;
  }
  public void getName() {
    System.out.println(name);
  }
  public void updateName(String n) {
    this.name = n;
  }
}

public class App {
    public static void main(String[] args) throws Exception {
      Customer newCustomer = new Customer();
      newCustomer.getName();
      newCustomer.getSize();
      newCustomer.updateName("Eddie");
      newCustomer.getName();
      System.out.println("END");
    }
}
