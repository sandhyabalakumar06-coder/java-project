import java.util.Scanner;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      URLStorage var2 = new URLStorage();

      while(true) {
         System.out.println("\n===== URL SHORTENER =====");
         System.out.println("1. Shorten URL");
         System.out.println("2. Retrieve URL");
         System.out.println("3. Display All URLs");
         System.out.println("4. Exit");
         System.out.print("Enter choice: ");
         int var3 = var1.nextInt();
         var1.nextLine();
         if (var3 == 1) {
            System.out.print("Enter Long URL: ");
            String var6 = var1.nextLine();
            String var7 = URLShortener.generateCode();
            var2.saveURL(var7, var6);
            System.out.println("Short URL: short.ly/" + var7);
         } else if (var3 == 2) {
            System.out.print("Enter Short Code: ");
            String var4 = var1.nextLine();
            String var5 = var2.getLongURL(var4);
            if (var5 != null) {
               System.out.println("Original URL: " + var5);
            } else {
               System.out.println("URL not found");
            }
         } else if (var3 == 3) {
            var2.displayAll();
         } else {
            if (var3 == 4) {
               System.out.println("Exiting...");
               var1.close();
               return;
            }

            System.out.println("Invalid choice");
         }
      }
   }
}
