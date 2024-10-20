package deob;

@ObfuscatedName("fm")
public final class class162 {

    @ObfuscatedName("fm.i")
    public static final char[] field2636 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gf.i(J)Ljava/lang/String;")
    public static String method3458(long arg0) {
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var2 = 0;
            for (long var3 = arg0; var3 != 0L; var3 /= 37L) {
                var2++;
            }
            StringBuilder var5 = new StringBuilder(var2);
            while (arg0 != 0L) {
                long var6 = arg0;
                arg0 /= 37L;
                var5.append(field2636[(int) (var6 - arg0 * 37L)]);
            }
            return var5.reverse().toString();
        }
    }
}
