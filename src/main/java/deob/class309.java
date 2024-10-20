package deob;

@ObfuscatedName("kw")
public final class class309 {

    public class309() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ev.f(Ljava/lang/CharSequence;I)Z")
    public static boolean method3054(CharSequence arg0) {
        return Statics.method3786(arg0, 10, true);
    }

    @ObfuscatedName("bb.w(Ljava/lang/CharSequence;I)I")
    public static int method947(CharSequence arg0) {
        return method5021(arg0, 10, true);
    }

    @ObfuscatedName("hf.o(Ljava/lang/CharSequence;II)I")
    public static int method3799(CharSequence arg0, int arg1) {
        return method5021(arg0, arg1, true);
    }

    @ObfuscatedName("kj.u(Ljava/lang/CharSequence;IZB)I")
    public static int method5021(CharSequence arg0, int arg1, boolean arg2) {
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

    @ObfuscatedName("gi.g(IZI)Ljava/lang/String;")
    public static String method3650(int arg0, boolean arg1) {
        if (!arg1 || arg0 < 0) {
            return Integer.toString(arg0);
        }
        int var2 = arg0;
        String var9;
        if (arg1 && arg0 >= 0) {
            int var3 = 2;
            int var4 = arg0 / 10;
            while (var4 != 0) {
                var4 /= 10;
                var3++;
            }
            char[] var5 = new char[var3];
            var5[0] = '+';
            for (int var6 = var3 - 1; var6 > 0; var6--) {
                int var7 = var2;
                var2 /= 10;
                int var8 = var7 - var2 * 10;
                if (var8 >= 10) {
                    var5[var6] = (char) (var8 + 87);
                } else {
                    var5[var6] = (char) (var8 + 48);
                }
            }
            var9 = new String(var5);
        } else {
            var9 = Integer.toString(arg0, 10);
        }
        return var9;
    }

    @ObfuscatedName("client.l(Ljava/lang/CharSequence;I)I")
    public static int method1532(CharSequence arg0) {
        int var1 = arg0.length();
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            var2 = (var2 << 5) - var2 + class305.method1827(arg0.charAt(var3));
        }
        return var2;
    }

    @ObfuscatedName("jx.e(Ljava/lang/CharSequence;I)I")
    public static int method4940(CharSequence arg0) {
        int var1 = arg0.length();
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            var2 = (var2 << 5) - var2 + arg0.charAt(var3);
        }
        return var2;
    }

    @ObfuscatedName("ey.x(CI)Z")
    public static boolean method3001(char arg0) {
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @ObfuscatedName("fc.d(CI)Z")
    public static boolean method3109(char arg0) {
        return arg0 >= '0' && arg0 <= '9';
    }

    @ObfuscatedName("iw.a(CI)Z")
    public static boolean method4393(char arg0) {
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @ObfuscatedName("hk.z(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method4130(String arg0) {
        int var1 = arg0.length();
        char[] var2 = new char[var1];
        byte var3 = 2;
        for (int var4 = 0; var4 < var1; var4++) {
            char var5 = arg0.charAt(var4);
            if (var3 == 0) {
                var5 = Character.toLowerCase(var5);
            } else if (var3 == 2 || Character.isUpperCase(var5)) {
                char var6;
                if (var5 == 181 || var5 == 402) {
                    var6 = var5;
                } else {
                    var6 = Character.toTitleCase(var5);
                }
                var5 = var6;
            }
            if (Character.isLetter(var5)) {
                var3 = 0;
            } else if (var5 == '.' || var5 == '?' || var5 == '!') {
                var3 = 2;
            } else if (!Character.isSpaceChar(var5)) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var2[var4] = var5;
        }
        return new String(var2);
    }

    @ObfuscatedName("fs.j(CIB)Ljava/lang/String;")
    public static String method3161(char arg0, int arg1) {
        char[] var2 = new char[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            var2[var3] = arg0;
        }
        return new String(var2);
    }

    @ObfuscatedName("cp.s(CI)Z")
    public static boolean method2051(char arg0) {
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= 160 && arg0 <= 255) {
            return true;
        } else {
            return arg0 == 8364 || arg0 == 338 || arg0 == 8212 || arg0 == 339 || arg0 == 376;
        }
    }

    @ObfuscatedName("eq.t(II)I")
    public static int method2986(int arg0) {
        if (arg0 > 0) {
            return 1;
        } else if (arg0 < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
