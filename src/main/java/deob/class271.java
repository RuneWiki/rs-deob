package deob;

@ObfuscatedName("jd")
public final class class271 {

    public class271() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bv.e(II)Ljava/lang/String;")
    public static String method1048(int arg0) {
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @ObfuscatedName("m.o([Ljava/lang/CharSequence;III)Ljava/lang/String;")
    public static String method4(CharSequence[] arg0, int arg1, int arg2) {
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

    @ObfuscatedName("c.m(Ljava/lang/CharSequence;I)Z")
    public static boolean method62(CharSequence arg0) {
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

    @ObfuscatedName("ap.g(Ljava/lang/CharSequence;I)I")
    public static int method311(CharSequence arg0) {
        return method132(arg0, 10, true);
    }

    @ObfuscatedName("x.d(Ljava/lang/CharSequence;IZS)I")
    public static int method132(CharSequence arg0, int arg1, boolean arg2) {
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

    @ObfuscatedName("ie.b(IZB)Ljava/lang/String;")
    public static String method3904(int arg0, boolean arg1) {
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

    @ObfuscatedName("av.k(Ljava/lang/CharSequence;B)I")
    public static int method539(CharSequence arg0) {
        int var1 = arg0.length();
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            var2 = (var2 << 5) - var2 + class267.method928(arg0.charAt(var3));
        }
        return var2;
    }

    @ObfuscatedName("bl.q(Ljava/lang/CharSequence;I)I")
    public static int method959(CharSequence arg0) {
        int var1 = arg0.length();
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            var2 = (var2 << 5) - var2 + arg0.charAt(var3);
        }
        return var2;
    }

    @ObfuscatedName("au.h(CB)Z")
    public static boolean method594(char arg0) {
        return arg0 >= '0' && arg0 <= '9';
    }

    @ObfuscatedName("w.i(CB)Z")
    public static boolean method97(char arg0) {
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @ObfuscatedName("ci.s(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method1532(String arg0) {
        int var1 = arg0.length();
        char[] var2 = new char[var1];
        byte var3 = 2;
        for (int var4 = 0; var4 < var1; var4++) {
            char var5 = arg0.charAt(var4);
            if (var3 == 0) {
                var5 = Character.toLowerCase(var5);
            } else if (var3 == 2 || Character.isUpperCase(var5)) {
                var5 = class267.method476(var5);
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

    @ObfuscatedName("bt.n(Ljava/lang/CharSequence;B)Ljava/lang/String;")
    public static String method980(CharSequence arg0) {
        int var1 = arg0.length();
        char[] var2 = new char[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var2[var3] = '*';
        }
        return new String(var2);
    }

    @ObfuscatedName("fu.c(CI)Z")
    public static boolean method2859(char arg0) {
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= 160 && arg0 <= 255) {
            return true;
        } else {
            return arg0 == 8364 || arg0 == 338 || arg0 == 8212 || arg0 == 339 || arg0 == 376;
        }
    }
}
