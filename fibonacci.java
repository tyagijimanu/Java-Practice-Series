class fibonacci {
   public static void main(String[] args) {
      int f, s, t, i;
      f = 0;
      s = 1;
     for(i=2; i<=10; i++) {
      t = f + s;
     System.out.print(f + " ");
     f=s;
     s=t;
     }
   }
}