public class Book extends Publication{
    
       String author;
   public Book(){
    super();
    this.author=null;
}
   public Book(String title,double price,int copies,String author){
      super(title,price,copies);
      this.author=author;
}
   public void sellcopy(int qty){
       System.out.println("Total Book sell copy:"+(qty*price));
}
}

