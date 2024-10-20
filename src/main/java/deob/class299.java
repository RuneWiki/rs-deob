package deob;

@ObfuscatedName("kq")
public final class class299 {

    @ObfuscatedName("kq.x")
    public static final char[] field3645 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @ObfuscatedName("kq.m")
    public static long[] field3644 = new long[12];

    static {
        for (int var0 = 0; var0 < field3644.length; var0++) {
            field3644[var0] = (long) Math.pow(37.0D, (double) var0);
        }
    }

    public class299() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ia.x(Ljava/lang/CharSequence;I)J")
    public static long method4012(CharSequence arg0) {
        long var1 = 0L;
        int var3 = arg0.length();
        for (int var4 = 0; var4 < var3; var4++) {
            var1 *= 37L;
            char var5 = arg0.charAt(var4);
            if (var5 >= 'A' && var5 <= 'Z') {
                var1 += (long) (var5 + 1 - 65);
            } else if (var5 >= 'a' && var5 <= 'z') {
                var1 += (long) (var5 + 1 - 97);
            } else if (var5 >= '0' && var5 <= '9') {
                var1 += (long) (var5 + 27 - 48);
            }
            if (var1 >= 177917621779460413L) {
                break;
            }
        }
        while (var1 % 37L == 0L && var1 != 0L) {
            var1 /= 37L;
        }
        return var1;
    }

    @ObfuscatedName("ek.m(J)Ljava/lang/String;")
    public static String method3119(long arg0) {
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
                var5.append(field3645[(int) (var6 - arg0 * 37L)]);
            }
            return var5.reverse().toString();
        }
    }

    @ObfuscatedName("bd.d(Ljava/lang/CharSequence;I)Ljava/lang/String;")
    public static String method792(CharSequence arg0) {
        String var1 = Statics.method5354(method4012(arg0));
        if (var1 == null) {
            var1 = "";
        }
        return var1;
    }
}
