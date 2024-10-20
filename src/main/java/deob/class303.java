package deob;

@ObfuscatedName("ku")
public final class class303 {

    public class303() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("w.f([Ljava/lang/CharSequence;III)Ljava/lang/String;")
    public static String method197(CharSequence[] arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            CharSequence var3 = arg0[arg1];
            return var3 == null ? "null" : var3.toString();
        } else {
            int var4 = arg1 + arg2;
            int var5 = 0;
            for (int var6 = arg1; var6 < var4; var6++) {
                CharSequence var7 = arg0[var6];
                if (var7 == null) {
                    var5 += 4;
                } else {
                    var5 += var7.length();
                }
            }
            StringBuilder var8 = new StringBuilder(var5);
            for (int var9 = arg1; var9 < var4; var9++) {
                CharSequence var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @ObfuscatedName("eq.o(Ljava/lang/CharSequence;I)Z")
    public static boolean method2462(CharSequence arg0) {
        return method187(arg0, 10, true);
    }

    @ObfuscatedName("i.u(Ljava/lang/CharSequence;IZB)Z")
    public static boolean method187(CharSequence arg0, int arg1, boolean arg2) {
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("" + arg1);
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
                return false;
            }
            if (var10 >= arg1) {
                return false;
            }
            if (var3) {
                var10 = -var10;
            }
            int var9 = arg1 * var5 + var10;
            if (var9 / arg1 != var5) {
                return false;
            }
            var5 = var9;
            var4 = true;
        }
        return var4;
    }

    @ObfuscatedName("bv.p(Ljava/lang/CharSequence;I)I")
    public static int method931(CharSequence arg0) {
        boolean var1 = false;
        boolean var2 = false;
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg0.charAt(var5);
            if (var5 == 0) {
                if (var6 == '-') {
                    var1 = true;
                    continue;
                }
                if (var6 == '+') {
                    continue;
                }
            }
            int var9;
            if (var6 >= '0' && var6 <= '9') {
                var9 = var6 - '0';
            } else if (var6 >= 'A' && var6 <= 'Z') {
                var9 = var6 - '7';
            } else if (var6 >= 'a' && var6 <= 'z') {
                var9 = var6 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var9 >= 10) {
                throw new NumberFormatException();
            }
            if (var1) {
                var9 = -var9;
            }
            int var7 = var3 * 10 + var9;
            if (var7 / 10 != var3) {
                throw new NumberFormatException();
            }
            var3 = var7;
            var2 = true;
        }
        if (!var2) {
            throw new NumberFormatException();
        }
        return var3;
    }

    @ObfuscatedName("fk.b(Ljava/lang/CharSequence;II)I")
    public static int method2837(CharSequence arg0, int arg1) {
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("" + arg1);
        }
        boolean var2 = false;
        boolean var3 = false;
        int var4 = 0;
        int var5 = arg0.length();
        for (int var6 = 0; var6 < var5; var6++) {
            char var7 = arg0.charAt(var6);
            if (var6 == 0) {
                if (var7 == '-') {
                    var2 = true;
                    continue;
                }
                if (var7 == '+') {
                    continue;
                }
            }
            int var10;
            if (var7 >= '0' && var7 <= '9') {
                var10 = var7 - '0';
            } else if (var7 >= 'A' && var7 <= 'Z') {
                var10 = var7 - '7';
            } else if (var7 >= 'a' && var7 <= 'z') {
                var10 = var7 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var10 >= arg1) {
                throw new NumberFormatException();
            }
            if (var2) {
                var10 = -var10;
            }
            int var8 = arg1 * var4 + var10;
            if (var8 / arg1 != var4) {
                throw new NumberFormatException();
            }
            var4 = var8;
            var3 = true;
        }
        if (!var3) {
            throw new NumberFormatException();
        }
        return var4;
    }

    @ObfuscatedName("gh.e(IZI)Ljava/lang/String;")
    public static String method3346(int arg0, boolean arg1) {
        return arg1 && arg0 >= 0 ? method345(arg0, 10, arg1) : Integer.toString(arg0);
    }

    @ObfuscatedName("ab.k(IIZI)Ljava/lang/String;")
    public static String method345(int arg0, int arg1, boolean arg2) {
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("" + arg1);
        } else if (arg2 && arg0 >= 0) {
            int var3 = 2;
            int var4 = arg0 / arg1;
            while (var4 != 0) {
                var4 /= arg1;
                var3++;
            }
            char[] var5 = new char[var3];
            var5[0] = '+';
            for (int var6 = var3 - 1; var6 > 0; var6--) {
                int var7 = arg0;
                arg0 /= arg1;
                int var8 = var7 - arg0 * arg1;
                if (var8 >= 10) {
                    var5[var6] = (char) (var8 + 87);
                } else {
                    var5[var6] = (char) (var8 + 48);
                }
            }
            return new String(var5);
        } else {
            return Integer.toString(arg0, arg1);
        }
    }

    @ObfuscatedName("di.g(Ljava/lang/CharSequence;I)I")
    public static int method2172(CharSequence arg0) {
        int var1 = arg0.length();
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            var2 = (var2 << 5) - var2 + class301.method2075(arg0.charAt(var3));
        }
        return var2;
    }

    @ObfuscatedName("bv.h(CB)Z")
    public static boolean method920(char arg0) {
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @ObfuscatedName("dz.n(CI)Z")
    public static boolean method2131(char arg0) {
        return arg0 >= '0' && arg0 <= '9';
    }

    @ObfuscatedName("il.l(CB)Z")
    public static boolean method3851(char arg0) {
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @ObfuscatedName("iv.m(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method4054(String arg0) {
        int var1 = arg0.length();
        char[] var2 = new char[var1];
        byte var3 = 2;
        for (int var4 = 0; var4 < var1; var4++) {
            char var5 = arg0.charAt(var4);
            if (var3 == 0) {
                var5 = Character.toLowerCase(var5);
            } else if (var3 == 2 || Character.isUpperCase(var5)) {
                var5 = class301.method1884(var5);
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

    @ObfuscatedName("ci.d(CI)Z")
    public static boolean method1940(char arg0) {
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= 160 && arg0 <= 255) {
            return true;
        } else {
            return arg0 == 8364 || arg0 == 338 || arg0 == 8212 || arg0 == 339 || arg0 == 376;
        }
    }

    @ObfuscatedName("ek.c(II)I")
    public static int method2294(int arg0) {
        if (arg0 > 0) {
            return 1;
        } else if (arg0 < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
