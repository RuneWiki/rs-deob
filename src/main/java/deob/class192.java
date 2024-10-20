package deob;

@ObfuscatedName("gn")
public class class192 {

    public class192() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ao.z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I")
    public static int method805(CharSequence arg0, CharSequence arg1, int arg2) {
        int var3 = arg0.length();
        int var4 = arg1.length();
        int var5 = 0;
        int var6 = 0;
        byte var7 = 0;
        byte var8 = 0;
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
                var21 = (char) var7;
                boolean var22 = false;
            }
            char var23;
            if (var8 == 0) {
                var23 = arg1.charAt(var6++);
            } else {
                var23 = (char) var8;
                boolean var24 = false;
            }
            byte var25;
            if (var21 == 198) {
                var25 = 69;
            } else if (var21 == 230) {
                var25 = 101;
            } else if (var21 == 223) {
                var25 = 115;
            } else if (var21 == 338) {
                var25 = 69;
            } else if (var21 == 339) {
                var25 = 101;
            } else {
                var25 = 0;
            }
            var7 = var25;
            byte var26;
            if (var23 == 198) {
                var26 = 69;
            } else if (var23 == 230) {
                var26 = 101;
            } else if (var23 == 223) {
                var26 = 115;
            } else if (var23 == 338) {
                var26 = 69;
            } else if (var23 == 339) {
                var26 = 101;
            } else {
                var26 = 0;
            }
            var8 = var26;
            char var27 = Statics.method609(var21, arg2);
            char var28 = Statics.method609(var23, arg2);
            if (var27 != var28 && Character.toUpperCase(var27) != Character.toUpperCase(var28)) {
                char var29 = Character.toLowerCase(var27);
                char var30 = Character.toLowerCase(var28);
                if (var29 != var30) {
                    return method2501(var29, arg2) - method2501(var30, arg2);
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
                    return method2501(var15, arg2) - method2501(var16, arg2);
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
                return method2501(var19, arg2) - method2501(var20, arg2);
            }
        }
        return 0;
    }

    @ObfuscatedName("dw.u(CIB)I")
    public static int method2501(char arg0, int arg1) {
        int var2 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            char var3 = Character.toLowerCase(arg0);
            var2 = (var3 << 4) + 1;
        }
        return var2;
    }
}
