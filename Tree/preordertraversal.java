class binarytree{
    node root; 
    class node{
        int data;
        node left,right;
        
        public node(int val){
            data = val;
            left = null;
            right = null;
        }
    }
    public binarytree(int v){
        root = new node(v);
    }
    public void insertLeft(node r,int val){
        node newnode = new node(val);
        r.left=newnode;
    }
    public void insertRight(node r,int val){
        node newnode = new node(val);
        r.right=newnode;
    }
    void preorder(node r){
        if(r==null)
            return;
        System.out.println(r.data);
        inorder(r.left);
        inorder(r.right);
    }
}

class HelloWorld {
    public static void main(String[] args) {
        binarytree tree = new binarytree(10);
        tree.insertLeft(tree.root,5);
        tree.insertRight(tree.root,15);
        tree.insertLeft(tree.root.left,3);
        tree.insertRight(tree.root.left,4);
        tree.insertRight(tree.root.right,20);
        System.out.println("preorder:");
        tree.preorder(tree.root);
        System.out.println("Inorder:");
        tree.inorder(tree.root);
        System.out.println("postorder:");
        tree.postorder(tree.root);
    }
}
