package deob;

@class301
@ObfuscatedName("ol")
public final class class368 {

    public class368() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("om.aj([Ljava/lang/CharSequence;III)Ljava/lang/String;")
    public static String method6262(CharSequence[] arg0, int arg1, int arg2) {
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

    @ObfuscatedName("gz.al(Ljava/lang/CharSequence;B)Z")
    public static boolean method3084(CharSequence arg0) {
        return method3211(arg0, 10, true);
    }

    @ObfuscatedName("gd.ac(Ljava/lang/CharSequence;IZI)Z")
    public static boolean method3211(CharSequence arg0, int arg1, boolean arg2) {
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

    @ObfuscatedName("nv.ab(Ljava/lang/CharSequence;I)I")
    public static int method5989(CharSequence arg0) {
        return method2965(arg0, 10, true);
    }

    @ObfuscatedName("mi.an(Ljava/lang/CharSequence;IB)I")
    public static int method5742(CharSequence arg0, int arg1) {
        return method2965(arg0, arg1, true);
    }

    @ObfuscatedName("fn.ao(Ljava/lang/CharSequence;IZB)I")
    public static int method2965(CharSequence arg0, int arg1, boolean arg2) {
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

    @ObfuscatedName("ps.av(IZB)Ljava/lang/String;")
    public static String method6806(int arg0, boolean arg1) {
        return arg1 && arg0 >= 0 ? method3792(arg0, 10, arg1) : Integer.toString(arg0);
    }

    @ObfuscatedName("ip.aq(IIZI)Ljava/lang/String;")
    public static String method3792(int arg0, int arg1, boolean arg2) {
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

    @ObfuscatedName("cp.ap(Ljava/lang/CharSequence;S)I")
    public static int method1990(CharSequence arg0) {
        int var1 = arg0.length();
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            var2 = (var2 << 5) - var2 + class366.method268(arg0.charAt(var3));
        }
        return var2;
    }

    @ObfuscatedName("mk.ar(CI)Z")
    public static boolean method5791(char arg0) {
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @ObfuscatedName("bo.ak(CI)Z")
    public static boolean method421(char arg0) {
        return arg0 >= '0' && arg0 <= '9';
    }

    @ObfuscatedName("lc.ax(CI)Z")
    public static boolean method5261(char arg0) {
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @ObfuscatedName("kp.as(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method4954(String arg0) {
        StringBuilder var1 = new StringBuilder(arg0.length());
        int var2 = 0;
        int var3 = -1;
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 == '<') {
                var1.append(arg0.substring(var2, var4));
                var3 = var4;
            } else if (var5 == '>' && var3 != -1) {
                String var6 = arg0.substring(var3 + 1, var4);
                var3 = -1;
                if (var6.equals("lt")) {
                    var1.append("<");
                } else if (var6.equals("gt")) {
                    var1.append(">");
                } else if (var6.equals("br")) {
                    var1.append("\n");
                }
                var2 = var4 + 1;
            }
        }
        if (var2 < arg0.length()) {
            var1.append(arg0.substring(var2, arg0.length()));
        }
        return var1.toString();
    }

    @ObfuscatedName("bk.ay(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method465(String arg0) {
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

    @ObfuscatedName("ld.am(CI)Z")
    public static boolean method5166(char arg0) {
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= 160 && arg0 <= 255) {
            return true;
        } else {
            return arg0 == 8364 || arg0 == 338 || arg0 == 8212 || arg0 == 339 || arg0 == 376;
        }
    }

    @ObfuscatedName("is.az(IB)I")
    public static int method3798(int arg0) {
        if (arg0 > 0) {
            return 1;
        } else if (arg0 < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
