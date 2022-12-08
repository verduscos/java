class Test {
  // public static void main(String[] args) {
  //   /*
  //   The prints method simply print text on the console and does not add any new line. While println adds new line after print text on console.
  //   */
  //   System.out.println("Hello, World!");
  //   System.out.print("1...");
  //   System.out.println("2...");
  //   System.out.println("3...");
  //   /*
  //   Hello, World!
  //   1...2..
  //   3...
  //   */
  // }

  public static void main(String[] args) {
    String compressed = "2c3b";
    String nums = "0123456789";
    String uncompressed = "";
    String currN = "";

    for (int i = 0; i < compressed.length(); i++) {
      char curr = compressed.charAt(i);
      String currentString = String.valueOf(curr);

      if (!nums.contains(currentString)) {
        int n = Integer.parseInt(currN);
        currN = "";

        while (n > 0) {
          uncompressed += curr;
          n -= 1;
        }

      } else {
        currN += currentString;
      }

    }
    System.out.println(uncompressed);
  }
}
