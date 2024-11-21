class Main {
  public static void main(String[] args) {

    // Step 1 - Create a BST tree object called lab5Tree
    BST<Integer> lab5Tree = new BST<Integer>();

    // Step 2 - Insert the following values: 13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10
    int[] nums = {13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10};
    for (int num : nums)
      lab5Tree.insert(num);

    // Step 3 - Delete the value 17
    lab5Tree.delete(17);

    // Step 4 - Traverse and output the values using inorder (sorted)
    System.out.print("Inorder: ");
    lab5Tree.inorder();

    // Step 5 - Traverse and output the values using postorder
    System.out.println("");
    System.out.print("Postorder: ");
    lab5Tree.postorder();

    // Step 6 - Traverse and output the values using preorder
    System.out.println("");
    System.out.print("Preorder: ");
    lab5Tree.preorder();

    // Step 7 - Display the result of a search for the value 36
    System.out.println("");
    System.out.print("Search for 36: ");
    if(lab5Tree.search(36)){
        System.out.println("True");
      }
      else{
        System.out.println("False");
      }

    // Step 8 - Display the result of a search for the value 37
    System.out.print("Search for 37: ");
    if(lab5Tree.search(37)){
        System.out.println("True");
      }
      else{
        System.out.println("False");
      }

    // Step 9 - Using the path() method, display the path from the root to 2
    System.out.print("Path to 2: ");
    var pathResults = lab5Tree.path(2);
    for(var result: pathResults){
      System.out.print(result.element);
      System.out.print(" ");
    }

    // Step 10 - Display the path from the root to 34
    System.out.println("");
    System.out.print("Path to 34: ");
    pathResults = lab5Tree.path(34);
    for(var result: pathResults){
      System.out.print(result.element);
      System.out.print(" ");
    }

  }
}