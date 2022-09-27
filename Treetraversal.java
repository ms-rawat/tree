// write code for other traversal

class Node{
    String name;
    Node left,right;
    public Node(String NAME)
    {
        name = NAME;
        left=right=null;

    }
}
public class Treetraversal{
   Node root;
 Treetraversal(){ root = null;}
 void printInOrder(Node node)
 {
    if(node == null)
    return;
    printInOrder(node.left);
    System.out.println(node.name+" ");
    printInOrder(node.right);
 }
 void printInOrder(){
    printInOrder(root);
    System.out.println("Hello my name is chinu");
 }
    public static void main(String[] args) {
        Treetraversal tree = new Treetraversal();
        tree.root=new Node("mohar");
        tree.root.left=new Node("chintu");
        tree.root.right=new Node("pintu");
        tree.printInOrder(tree.root);

        
    }






}