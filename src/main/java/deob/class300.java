package deob;

@ObfuscatedName("kk")
public final class class300 {

    @ObfuscatedName("kk.h")
    public static final char[] field3690 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @ObfuscatedName("kk.v")
    public static long[] field3691 = new long[12];

    static {
        for (int var0 = 0; var0 < field3691.length; var0++) {
            field3691[var0] = (long) Math.pow(37.0D, (double) var0);
        }
    }

    public class300() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bw.v(J)Ljava/lang/String;")
    public static String method1097(long arg0) {
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
                var5.append(field3690[(int) (var6 - arg0 * 37L)]);
            }
            return var5.reverse().toString();
        }
    }

    @ObfuscatedName("jl.x(J)Ljava/lang/String;")
    public static String method4173(long arg0) {
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
                char var8 = field3690[(int) (var6 - arg0 * 37L)];
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

    @ObfuscatedName("ig.w(Ljava/lang/CharSequence;I)Ljava/lang/String;")
    public static String method3813(CharSequence arg0) {
        String var1 = method4173(Statics.method3102(arg0));
        if (var1 == null) {
            var1 = "";
        }
        return var1;
    }
}
