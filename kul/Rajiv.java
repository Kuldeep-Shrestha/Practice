public class Rajiv{
    int x=89;
    static int y=10;
    void study(){
        int x=7;
        System.out.println(x);
        System.out.println(this.x);   
}
    public static void main(String [] args){
        Rajiv ra=new Rajiv();
        ra.study();
        System.out.println(ra.x);
        System.out.println(Rajiv.y);
    }
}