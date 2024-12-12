public class Publication{
   
     String title;
     double price;
     int copies;

        Publication(){
          this.title=null;
          this.price=0;
          this.copies=0;
}
        Publication(String title,double price,int copies){
          this.title=title;
          this.price=price;
          this.copies=copies;
}

    public void sellcopy(int qty){
       System.out.println("Total Publicatin sell copy:"+(qty*price));
}
}


       

