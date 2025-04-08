package mytree;

class TNode {

    int data;
    TNode left, right;

    TNode(int x) {
        data = x;
        left = right = null;
    }

    TNode(int x, TNode ll, TNode rr) {
        data = x;
        left = ll;
        right = rr;
    }
}

public class MyTree {
    TNode root;
    
    void taocayT(){
        TNode A = new TNode (11, new TNode(8), new TNode(9));
        TNode B = new TNode (6, new TNode(4,new TNode(5),new TNode(99)), new TNode(22, new TNode(17),null));
        root = new TNode (3, A, B);
    }
    
    void duyet1(TNode T){
        if(T!=null){
            System.out.print(" " + T.data);
            duyet1(T.left);
            duyet1(T.right);
        }
    }
    void duyettientu(){
        System.out.println("Tien tu: ");
        duyet1(root);
    }
    
    void duyet2(TNode T){
        if(T!=null){
            duyet2(T.left);
            System.out.print(" " + T.data);
            duyet2(T.right);
        }
    }
    void duyettrungtu(){
        System.out.println("\nTrung tu: ");
        duyet2(root);
    }
    void duyet3(TNode T){
        if(T!=null){
            duyet3(T.left);
            duyet3(T.right);
            System.out.print(" " + T.data);
        }
    }
    void duyethautu(){
        System.out.println("\nHau tu: ");
        duyet3(root);
    }
    
    int sonot(TNode T){
        if(T == null) return 0;
        else return 1+ sonot(T.left)+ sonot(T.right);
    }
    int sonot(){
        return sonot(root);
    }
    
    int tong(TNode T){
        if(T==null) return 0;
        else return T.data + tong(T.left)+ tong(T.right);
    }
    int tong(){
        return tong(root);
    }
    
    int la(TNode T){
        if(T == null) return 0;
        else if(T.left == null && T.right == null) return 1;
        else return la(T.left) + la(T.right);
    }
    int la(){
        return la(root);
    }
    
    int cao(TNode T){
        if(T == null) return 0;
        else return 1 + Math.max(cao(T.left), cao(T.right));
    }
    int cao(){
        return cao(root);
    }
    
    int tongTrong(TNode T){
        if(T == null || T.left == null && T.right == null) return 0;
        else return T.data + tongTrong(T.left) + tongTrong(T.right);
    }
    int tongTrong(){
        return tongTrong(root);
    }
    
    public static void main(String[] args) {
        MyTree T = new MyTree();
        T.taocayT();
        T.duyettientu();
        T.duyettrungtu();
        T.duyethautu();
        System.out.println("\nSo not: " + T.sonot());
        System.out.println("Tong: " + T.tong());
        System.out.println("So not la: " + T.la());
        System.out.println("Chieu cao: " + T.cao());
        System.out.println("Tong trong: " + T.tongTrong());
    }

}
