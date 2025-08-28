// MEthod overloading


class Human{
   public int height(int l){
       int temp = l*10;
       return temp;
   }

   public int height(int l,int h){
       int temp = h+l*10;
       return temp;
   }

   public static void main(String[] args) {
     Human obj = new Human();
     System.out.println(obj.height(10));
     System.out.println(obj.height(10,5));
   }
}