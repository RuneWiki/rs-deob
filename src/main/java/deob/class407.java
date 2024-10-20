package deob;

@ObfuscatedName("pw")
public class class407 {

    public class407() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("oo.aq(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lpe;S)I")
    public static int method6349(CharSequence arg0, CharSequence arg1, class393 arg2) {
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
            var7 = method5087(var21);
            var8 = method5087(var23);
            char var25 = Statics.method6574(var21, arg2);
            char var26 = Statics.method6574(var23, arg2);
            if (var25 != var26 && Character.toUpperCase(var25) != Character.toUpperCase(var26)) {
                char var27 = Character.toLowerCase(var25);
                char var28 = Character.toLowerCase(var26);
                if (var27 != var28) {
                    return Statics.method4035(var27, arg2) - Statics.method4035(var28, arg2);
                }
            }
        }
        int var9 = Math.min(var3, var4);
        for (int var10 = 0; var10 < var9; var10++) {
            int var11;
            int var12;
            if (class393.field4488 == arg2) {
                var11 = var3 - 1 - var10;
                var12 = var4 - 1 - var10;
            } else {
                var12 = var10;
                var11 = var10;
            }
            char var13 = arg0.charAt(var11);
            char var14 = arg1.charAt(var12);
            if (var13 != var14 && Character.toUpperCase(var13) != Character.toUpperCase(var14)) {
                char var15 = Character.toLowerCase(var13);
                char var16 = Character.toLowerCase(var14);
                if (var15 != var16) {
                    return Statics.method4035(var15, arg2) - Statics.method4035(var16, arg2);
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
                return Statics.method4035(var19, arg2) - Statics.method4035(var20, arg2);
            }
        }
        return 0;
    }

    @ObfuscatedName("kt.al(CI)C")
    public static char method5087(char arg0) {
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
}
