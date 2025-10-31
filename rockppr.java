import java.util.Scanner;

class rockppr
{
    public static void main(String[] args) {
        System.out.println("rules ->>> botton contain--->   1=rock,2=paper,3=scissor");
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your choice ");
      int ch=sc.nextInt();
      if(ch==1)
      {
        System.out.println("rock");
      }
      if(ch==2)
      {
        System.out.println("paper");
      }
      if(ch==3)
      {
        System.out.println("scissor");
      }
        
        int n = (int)(Math.random() * 3) + 1;

          
         if(n==1)
         {
            System.out.println("rock");
         }
         if(n==2)
         {
            System.out.println("paper");
         }
         else{
            
            System.out.println("scissor");
         
         }
         switch(ch)
         {
            case 1 -> {
                if(ch==1 &&n==1)
                {
                    System.out.println("tie");
                }
                if(ch==1 && n==2 )
                {
                    System.out.println("youLose");
                }
                if(ch==1 && n==3)
                {
                    System.out.println("you won");
                }}
           case 2 -> {
               if(ch==2 &&n==1)
               {
                   System.out.println("youwon");
               }
               if(ch==2 && n==2 )
               {
                   System.out.println("tie");
               }
               if(ch==2 && n==3)
               {
                   System.out.println("youLose");
               }}
           case 3 -> {
               if(ch==3 &&n==1)
               {
                   System.out.println("YouLose");
               }
               if(ch==3 && n==2 )
               {
                   System.out.println("youWon");
               }
               if(ch==3 && n==3)
               {
                   System.out.println("tie");
               }}
           default -> System.out.println("wrong coice");
           


         }


         
    }
}