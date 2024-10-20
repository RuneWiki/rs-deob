package deob;

@ObfuscatedName("eq")
public final class class154 {

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("et.e(IB)Ljava/lang/String;")
    public static String method2781(int arg0) {
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @ObfuscatedName("dh.a([Ljava/lang/CharSequence;IIB)Ljava/lang/String;")
    public static String method2305(CharSequence[] arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ao.l(Ljava/lang/CharSequence;I)Z")
    public static boolean method574(CharSequence arg0) {
        boolean var1 = false;
        boolean var2 = false;
        int var3 = 0;
        int var4 = arg0.length();
        int var5 = 0;
        boolean var7;
        while (true) {
            if (var5 >= var4) {
                var7 = var2;
                break;
            }
            label69: {
                char var6 = arg0.charAt(var5);
                if (var5 == 0) {
                    if (var6 == '-') {
                        var1 = true;
                        break label69;
                    }
                    if (var6 == '+') {
                        break label69;
                    }
                }
                int var9;
                if (var6 >= '0' && var6 <= '9') {
                    var9 = var6 - '0';
                } else if (var6 >= 'A' && var6 <= 'Z') {
                    var9 = var6 - '7';
                } else {
                    if (var6 < 'a' || var6 > 'z') {
                        var7 = false;
                        break;
                    }
                    var9 = var6 - 'W';
                }
                if (var9 >= 10) {
                    var7 = false;
                    break;
                }
                if (var1) {
                    var9 = -var9;
                }
                int var8 = var3 * 10 + var9;
                if (var8 / 10 != var3) {
                    var7 = false;
                    break;
                }
                var3 = var8;
                var2 = true;
            }
            var5++;
        }
        return var7;
    }

    @ObfuscatedName("ct.c(Ljava/lang/CharSequence;II)I")
    public static int method1928(CharSequence arg0, int arg1) {
        return Statics.method1113(arg0, arg1, true);
    }

    @ObfuscatedName("cm.w(IIZB)Ljava/lang/String;")
    public static String method1903(int arg0, int arg1, boolean arg2) {
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("");
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

    @ObfuscatedName("fc.i(Ljava/lang/CharSequence;B)I")
    public static int method3037(CharSequence arg0) {
        int var1 = arg0.length();
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            var2 = (var2 << 5) - var2 + class156.method204(arg0.charAt(var3));
        }
        return var2;
    }

    @ObfuscatedName("aw.r(Ljava/lang/CharSequence;S)I")
    public static int method613(CharSequence arg0) {
        int var1 = arg0.length();
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            var2 = (var2 << 5) - var2 + arg0.charAt(var3);
        }
        return var2;
    }

    @ObfuscatedName("ac.f(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method880(String arg0) {
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

    @ObfuscatedName("et.g(Ljava/lang/CharSequence;I)Ljava/lang/String;")
    public static String method2782(CharSequence arg0) {
        int var1 = arg0.length();
        char[] var2 = new char[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var2[var3] = '*';
        }
        return new String(var2);
    }

    @ObfuscatedName("eo.h(II)I")
    public static int method2669(int arg0) {
        if (arg0 > 0) {
            return 1;
        } else if (arg0 < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
