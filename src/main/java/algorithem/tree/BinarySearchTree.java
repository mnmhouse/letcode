package algorithem.tree;

public class BinarySearchTree {

    private Node tree;
   public Node find(int data){
        Node node =  tree;
        while (node!=null){
            if (data<node.data){
                node = node.left;
            }else if(data > node.data){
                node =node.right;
            }else {
                return node;
            }
        }

       return null;
   }

   public void insert(int data){

       if (tree==null){
           tree= new Node(data);
           return;
       }

       Node p = tree;
       while (p!=null){

           if (data>p.data){
               if (p.right!=null){
                   p=p.right;
               }else {
                   p.right=new Node(data);
                   return;
               }
           }else {
               if(p.left!=null){
                   p=p.left;
               }else {
                   p.left= new Node(data);
                   return;
               }
           }

       }
   }

public  void delete(int data){
    Node p =  tree;

    Node pp =null;//pp纪录的是p的父节点

    while (p!=null&&p.data!=data){
        pp =p;
        if (data>p.data){
            p=p.right;
         } else {
            p=p.left;
        }
    }

    if (p==null){
        return;
    }

    if (p.right!=null&& p.left!=null){


    }
}

    public static class Node{

        Node left;
        Node right;
        int data;
        public Node(int data){
            this.data = data;
        }
    }

}
