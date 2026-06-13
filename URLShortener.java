import java.util.Random;

public class URLShortener {
   private static final String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

   public URLShortener() {
   }

   public static String generateCode() {
      Random var0 = new Random();
      StringBuilder var1 = new StringBuilder();

      for(int var2 = 0; var2 < 6; ++var2) {
         var1.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(var0.nextInt("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".length())));
      }

      return var1.toString();
   }
}
