package deob;

@ObfuscatedName("gv")
public final class class189 {

    public class189() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.k([Ljava/lang/CharSequence;IIB)Ljava/lang/String;")
    public static String method48(CharSequence[] arg0, int arg1, int arg2) {
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

    @ObfuscatedName("de.y(Ljava/lang/CharSequence;I)I")
    public static int method2557(CharSequence arg0) {
        return Statics.method1864(arg0, 10, true);
    }

    @ObfuscatedName("fb.g(Ljava/lang/CharSequence;IB)I")
    public static int method3125(CharSequence arg0, int arg1) {
        return Statics.method1864(arg0, arg1, true);
    }

    @ObfuscatedName("eh.i(Ljava/lang/CharSequence;S)I")
    public static int method2669(CharSequence arg0) {
        int var1 = arg0.length();
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            var2 = (var2 << 5) - var2 + class191.method1004(arg0.charAt(var3));
        }
        return var2;
    }

    @ObfuscatedName("ar.f(CI)Z")
    public static boolean method745(char arg0) {
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @ObfuscatedName("ed.a(CI)Z")
    public static boolean method2864(char arg0) {
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @ObfuscatedName("n.w(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method481(String arg0) {
        int var1 = arg0.length();
        char[] var2 = new char[var1];
        byte var3 = 2;
        for (int var4 = 0; var4 < var1; var4++) {
            char var5 = arg0.charAt(var4);
            if (var3 == 0) {
                var5 = Character.toLowerCase(var5);
            } else if (var3 == 2 || Character.isUpperCase(var5)) {
                var5 = class191.method3122(var5);
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

    @ObfuscatedName("fs.d(Ljava/lang/CharSequence;B)Ljava/lang/String;")
    public static String method3237(CharSequence arg0) {
        return Statics.method509('*', arg0.length());
    }
}
