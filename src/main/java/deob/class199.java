package deob;

@ObfuscatedName("gu")
public final class class199 {

    public class199() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.g(II)Ljava/lang/String;")
    public static String method2451(int arg0) {
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @ObfuscatedName("cz.v(Ljava/lang/CharSequence;I)I")
    public static int method1889(CharSequence arg0) {
        return method40(arg0, 10, true);
    }

    @ObfuscatedName("ev.z(Ljava/lang/CharSequence;IB)I")
    public static int method2693(CharSequence arg0, int arg1) {
        return method40(arg0, arg1, true);
    }

    @ObfuscatedName("k.h(Ljava/lang/CharSequence;IZI)I")
    public static int method40(CharSequence arg0, int arg1, boolean arg2) {
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("");
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        int var6 = arg0.length();
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg0.charAt(var7);
            if (var7 == 0) {
                if (var8 == '-') {
                    var3 = true;
                    continue;
                }
                if (var8 == '+' && arg2) {
                    continue;
                }
            }
            int var10;
            if (var8 >= '0' && var8 <= '9') {
                var10 = var8 - '0';
            } else if (var8 >= 'A' && var8 <= 'Z') {
                var10 = var8 - '7';
            } else if (var8 >= 'a' && var8 <= 'z') {
                var10 = var8 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var10 >= arg1) {
                throw new NumberFormatException();
            }
            if (var3) {
                var10 = -var10;
            }
            int var9 = arg1 * var5 + var10;
            if (var9 / arg1 != var5) {
                throw new NumberFormatException();
            }
            var5 = var9;
            var4 = true;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @ObfuscatedName("dh.k(Ljava/lang/CharSequence;I)I")
    public static int method2547(CharSequence arg0) {
        int var1 = arg0.length();
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            var2 = (var2 << 5) - var2 + class201.method1995(arg0.charAt(var3));
        }
        return var2;
    }

    @ObfuscatedName("bf.l(Ljava/lang/CharSequence;I)I")
    public static int method1396(CharSequence arg0) {
        int var1 = arg0.length();
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            var2 = (var2 << 5) - var2 + arg0.charAt(var3);
        }
        return var2;
    }

    @ObfuscatedName("at.e(CI)Z")
    public static boolean method705(char arg0) {
        return arg0 >= '0' && arg0 <= '9';
    }

    @ObfuscatedName("aa.n(IB)I")
    public static int method581(int arg0) {
        if (arg0 > 0) {
            return 1;
        } else if (arg0 < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
