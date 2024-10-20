package deob;

@ObfuscatedName("fz")
public class class176 {

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IB)I")
    public static int method2195(CharSequence arg0, CharSequence arg1, int arg2) {
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
            var7 = method971(var21);
            var8 = method971(var23);
            char var25 = method55(var21, arg2);
            char var26 = method55(var23, arg2);
            if (var25 != var26 && Character.toUpperCase(var25) != Character.toUpperCase(var26)) {
                char var27 = Character.toLowerCase(var25);
                char var28 = Character.toLowerCase(var26);
                if (var27 != var28) {
                    return method2807(var27, arg2) - method2807(var28, arg2);
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
                    return method2807(var15, arg2) - method2807(var16, arg2);
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
                return method2807(var19, arg2) - method2807(var20, arg2);
            }
        }
        return 0;
    }

    @ObfuscatedName("n.w(CII)C")
    public static char method55(char arg0, int arg1) {
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

    @ObfuscatedName("bv.e(CI)C")
    public static char method971(char arg0) {
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

    @ObfuscatedName("fl.k(CII)I")
    public static int method2807(char arg0, int arg1) {
        int var2 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            char var3 = Character.toLowerCase(arg0);
            var2 = (var3 << 4) + 1;
        }
        return var2;
    }
}
