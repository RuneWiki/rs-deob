package deob;

@ObfuscatedName("hv")
public final class class211 {

    public class211() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fi.x([Ljava/lang/CharSequence;III)Ljava/lang/String;")
    public static String method3171(CharSequence[] arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ct.v(Ljava/lang/CharSequence;IZI)Z")
    public static boolean method1794(CharSequence arg0, int arg1, boolean arg2) {
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

    @ObfuscatedName("ag.m(Ljava/lang/CharSequence;I)I")
    public static int method600(CharSequence arg0) {
        return method88(arg0, 10, true);
    }

    @ObfuscatedName("al.e(Ljava/lang/CharSequence;II)I")
    public static int method853(CharSequence arg0, int arg1) {
        return method88(arg0, arg1, true);
    }

    @ObfuscatedName("u.h(Ljava/lang/CharSequence;IZI)I")
    public static int method88(CharSequence arg0, int arg1, boolean arg2) {
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

    @ObfuscatedName("bd.p(IZS)Ljava/lang/String;")
    public static String method1331(int arg0, boolean arg1) {
        return arg1 && arg0 >= 0 ? Statics.method1972(arg0, 10, arg1) : Integer.toString(arg0);
    }

    @ObfuscatedName("ej.i(Ljava/lang/CharSequence;B)I")
    public static int method2704(CharSequence arg0) {
        int var1 = arg0.length();
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            var2 = (var2 << 5) - var2 + class213.method3558(arg0.charAt(var3));
        }
        return var2;
    }

    @ObfuscatedName("i.u(CI)Z")
    public static boolean method85(char arg0) {
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @ObfuscatedName("eg.l(CI)Z")
    public static boolean method2719(char arg0) {
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @ObfuscatedName("eg.k(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method2718(String arg0) {
        int var1 = arg0.length();
        char[] var2 = new char[var1];
        byte var3 = 2;
        for (int var4 = 0; var4 < var1; var4++) {
            char var5 = arg0.charAt(var4);
            if (var3 == 0) {
                var5 = Character.toLowerCase(var5);
            } else if (var3 == 2 || Character.isUpperCase(var5)) {
                var5 = class213.method498(var5);
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

    @ObfuscatedName("ei.q(CII)Ljava/lang/String;")
    public static String method2703(char arg0, int arg1) {
        char[] var2 = new char[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            var2[var3] = arg0;
        }
        return new String(var2);
    }

    @ObfuscatedName("b.b(II)I")
    public static int method135(int arg0) {
        if (arg0 > 0) {
            return 1;
        } else if (arg0 < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
