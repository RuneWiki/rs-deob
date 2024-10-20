package deob;

@ObfuscatedName("ga")
public class class186 {

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.d(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I")
    public static int method2371(CharSequence arg0, CharSequence arg1, int arg2) {
        int var3 = arg0.length();
        int var4 = arg1.length();
        int var5 = 0;
        int var6 = 0;
        char var7 = 0;
        char var8 = 0;
        while (var5 - var7 < var3 || var6 - var8 < var4) {
            if (var5 - var7 >= var3) {
                return -1;
            }
            if (var6 - var8 >= var4) {
                return 1;
            }
            char var21;
            if (var7 == 0) {
                var21 = arg0.charAt(var5++);
            } else {
                var21 = var7;
                boolean var22 = false;
            }
            char var23;
            if (var8 == 0) {
                var23 = arg1.charAt(var6++);
            } else {
                var23 = var8;
                boolean var24 = false;
            }
            var7 = method470(var21);
            var8 = method470(var23);
            char var25 = Statics.method3043(var21, arg2);
            char var26 = Statics.method3043(var23, arg2);
            if (var25 != var26 && Character.toUpperCase(var25) != Character.toUpperCase(var26)) {
                char var27 = Character.toLowerCase(var25);
                char var28 = Character.toLowerCase(var26);
                if (var27 != var28) {
                    return method1939(var27, arg2) - method1939(var28, arg2);
                }
            }
        }
        int var9 = Math.min(var3, var4);
        for (int var10 = 0; var10 < var9; var10++) {
            char var13 = arg0.charAt(var10);
            char var14 = arg1.charAt(var10);
            if (var13 != var14 && Character.toUpperCase(var13) != Character.toUpperCase(var14)) {
                char var15 = Character.toLowerCase(var13);
                char var16 = Character.toLowerCase(var14);
                if (var15 != var16) {
                    return method1939(var15, arg2) - method1939(var16, arg2);
                }
            }
        }
        int var17 = var3 - var4;
        if (var17 != 0) {
            return var17;
        }
        for (int var18 = 0; var18 < var9; var18++) {
            char var19 = arg0.charAt(var18);
            char var20 = arg1.charAt(var18);
            if (var19 != var20) {
                return method1939(var19, arg2) - method1939(var20, arg2);
            }
        }
        return 0;
    }

    @ObfuscatedName("ae.n(CB)C")
    public static char method470(char arg0) {
        if (arg0 == 198) {
            return 'E';
        } else if (arg0 == 230) {
            return 'e';
        } else if (arg0 == 223) {
            return 's';
        } else if (arg0 == 338) {
            return 'E';
        } else {
            return (char) (arg0 == 339 ? 'e' : '\u0000');
        }
    }

    @ObfuscatedName("cb.r(CII)I")
    public static int method1939(char arg0, int arg1) {
        int var2 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            char var3 = Character.toLowerCase(arg0);
            var2 = (var3 << 4) + 1;
        }
        return var2;
    }
}
