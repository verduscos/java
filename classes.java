class Customer {
  String name;
  String size = "S";

  void setSize(String newSize) {
    // The void keyword specifies that a method should not have a return value.
    size = newSize;
  }
  String getSize() {
    return size;
  }
  public void getName() {
    System.out.println(this.name);
  }
}

class Main {
  public static void main(String[] args) {
    Customer newCustomer = new Customer();
    newCustomer.name = "eddie";
    newCustomer.getName();
  }
}
