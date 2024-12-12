public class Magazine extends Publication{
       int orderqty;
       String curIssue;

       public Magazine(String title,double price,int copies,int orderqty,String curIssue){
          super(title,price,copies);
          this.orderqty=orderqty;
          this.curIssue=curIssue;
       }
     
       public void sellcopy(int qty){
       System.out.println("Total Magazine sell copy:"+(qty*price));
}
}

