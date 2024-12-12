public class main{

    public static void main(String[] args){
    
       Publication obj = new Publication("java",800,3);
          obj.sellcopy(3);

       Book obj1 = new Book("java",800,3,"Joe");
             obj1.sellcopy(2);
    
       Magazine obj2 = new Magazine("java",800,3,5,"Oct");
            obj2.sellcopy(4);

}}

