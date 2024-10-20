package deob;

@ObfuscatedName("ma")
public class class346 {

    public class346() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cp.c(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Llj;B)I")
    public static int method2447(CharSequence arg0, CharSequence arg1, class332 arg2) {
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
            char var27 = method5842(var21, arg2);
            char var28 = method5842(var23, arg2);
            if (var27 != var28 && Character.toUpperCase(var27) != Character.toUpperCase(var28)) {
                char var29 = Character.toLowerCase(var27);
                char var30 = Character.toLowerCase(var28);
                if (var29 != var30) {
                    return method6604(var29, arg2) - method6604(var30, arg2);
                }
            }
        }
        int var9 = Math.min(var3, var4);
        for (int var10 = 0; var10 < var9; var10++) {
            int var11;
            int var12;
            if (class332.field4148 == arg2) {
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
                    return method6604(var15, arg2) - method6604(var16, arg2);
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
                return method6604(var19, arg2) - method6604(var20, arg2);
            }
        }
        return 0;
    }

    @ObfuscatedName("mi.p(CLlj;I)C")
    public static char method5842(char arg0, class332 arg1) {
        if (arg0 >= 192 && arg0 <= 255) {
            if (arg0 >= 192 && arg0 <= 198) {
                return 'A';
            }
            if (arg0 == 199) {
                return 'C';
            }
            if (arg0 >= 200 && arg0 <= 203) {
                return 'E';
            }
            if (arg0 >= 204 && arg0 <= 207) {
                return 'I';
            }
            if (arg0 == 209 && class332.field4140 != arg1) {
                return 'N';
            }
            if (arg0 >= 210 && arg0 <= 214) {
                return 'O';
            }
            if (arg0 >= 217 && arg0 <= 220) {
                return 'U';
            }
            if (arg0 == 221) {
                return 'Y';
            }
            if (arg0 == 223) {
                return 's';
            }
            if (arg0 >= 224 && arg0 <= 230) {
                return 'a';
            }
            if (arg0 == 231) {
                return 'c';
            }
            if (arg0 >= 232 && arg0 <= 235) {
                return 'e';
            }
            if (arg0 >= 236 && arg0 <= 239) {
                return 'i';
            }
            if (arg0 == 241 && class332.field4140 != arg1) {
                return 'n';
            }
            if (arg0 >= 242 && arg0 <= 246) {
                return 'o';
            }
            if (arg0 >= 249 && arg0 <= 252) {
                return 'u';
            }
            if (arg0 == 253 || arg0 == 255) {
                return 'y';
            }
        }
        if (arg0 == 338) {
            return 'O';
        } else if (arg0 == 339) {
            return 'o';
        } else if (arg0 == 376) {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("op.f(CLlj;B)I")
    public static int method6604(char arg0, class332 arg1) {
        int var2 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var2 = (arg0 << 4) + 1;
        }
        if (arg0 == 241 && class332.field4140 == arg1) {
            var2 = 1762;
        }
        return var2;
    }
}
