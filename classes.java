class Customer {
  String[] name;
  String size = "S";

  void setSize(String newSize) {
    // The void keyword specifies that a method should not have a return value.
    size = newSize;
  }
  String getSize() {
    return size;
  }
  // String getName() {
  //   return name;
  // }
}

// Customer newCustomer = new Customer("Eddie", "M");

// newCustomer.getName();
