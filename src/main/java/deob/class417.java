package deob;

@ObfuscatedName("qf")
public final class class417 {

    @ObfuscatedName("qf.ak")
    public static final char[] field4665 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @ObfuscatedName("qf.al")
    public static long[] field4666 = new long[12];

    static {
        for (int var0 = 0; var0 < field4666.length; var0++) {
            field4666[var0] = (long) Math.pow(37.0D, (double) var0);
        }
    }

    public class417() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ga.ak(J)Ljava/lang/String;")
    public static String method3190(long arg0) {
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
                char var8 = field4665[(int) (var6 - arg0 * 37L)];
                if (var8 == '_') {
                    int var9 = var5.length() - 1;
                    var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                    var8 = 160;
                }
                var5.append(var8);
            }
            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
        }
    }
}
