package deob;

@ObfuscatedName("ua")
public class class542 {

    public class542() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gd.aq([Ljava/lang/String;[SI)V")
    public static void method3260(String[] arg0, short[] arg1) {
        method3448(arg0, arg1, 0, arg0.length - 1);
    }

    @ObfuscatedName("hb.ad([Ljava/lang/String;[SIII)V")
    public static void method3448(String[] arg0, short[] arg1, int arg2, int arg3) {
        if (arg2 >= arg3) {
            return;
        }
        int var4 = (arg2 + arg3) / 2;
        int var5 = arg2;
        String var6 = arg0[var4];
        arg0[var4] = arg0[arg3];
        arg0[arg3] = var6;
        short var7 = arg1[var4];
        arg1[var4] = arg1[arg3];
        arg1[arg3] = var7;
        for (int var8 = arg2; var8 < arg3; var8++) {
            if (var6 == null || arg0[var8] != null && arg0[var8].compareTo(var6) < (var8 & 0x1)) {
                String var9 = arg0[var8];
                arg0[var8] = arg0[var5];
                arg0[var5] = var9;
                short var10 = arg1[var8];
                arg1[var8] = arg1[var5];
                arg1[var5++] = var10;
            }
        }
        arg0[arg3] = arg0[var5];
        arg0[var5] = var6;
        arg1[arg3] = arg1[var5];
        arg1[var5] = var7;
        method3448(arg0, arg1, arg2, var5 - 1);
        method3448(arg0, arg1, var5 + 1, arg3);
    }

    @ObfuscatedName("hr.ag([Ljava/lang/String;[II)V")
    public static void method3324(String[] arg0, int[] arg1) {
        method2545(arg0, arg1, 0, arg0.length - 1);
    }

    @ObfuscatedName("dq.ak([Ljava/lang/String;[IIII)V")
    public static void method2545(String[] arg0, int[] arg1, int arg2, int arg3) {
        if (arg2 >= arg3) {
            return;
        }
        int var4 = (arg2 + arg3) / 2;
        int var5 = arg2;
        String var6 = arg0[var4];
        arg0[var4] = arg0[arg3];
        arg0[arg3] = var6;
        int var7 = arg1[var4];
        arg1[var4] = arg1[arg3];
        arg1[arg3] = var7;
        for (int var8 = arg2; var8 < arg3; var8++) {
            if (var6 == null || arg0[var8] != null && arg0[var8].compareTo(var6) < (var8 & 0x1)) {
                String var9 = arg0[var8];
                arg0[var8] = arg0[var5];
                arg0[var5] = var9;
                int var10 = arg1[var8];
                arg1[var8] = arg1[var5];
                arg1[var5++] = var10;
            }
        }
        arg0[arg3] = arg0[var5];
        arg0[var5] = var6;
        arg1[arg3] = arg1[var5];
        arg1[var5] = var7;
        method2545(arg0, arg1, arg2, var5 - 1);
        method2545(arg0, arg1, var5 + 1, arg3);
    }

    @ObfuscatedName("gf.ap([I[IIIB)V")
    public static void method3237(int[] arg0, int[] arg1, int arg2, int arg3) {
        if (arg2 >= arg3) {
            return;
        }
        int var4 = (arg2 + arg3) / 2;
        int var5 = arg2;
        int var6 = arg0[var4];
        arg0[var4] = arg0[arg3];
        arg0[arg3] = var6;
        int var7 = arg1[var4];
        arg1[var4] = arg1[arg3];
        arg1[arg3] = var7;
        int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;
        for (int var9 = arg2; var9 < arg3; var9++) {
            if (arg0[var9] < (var9 & var8) + var6) {
                int var10 = arg0[var9];
                arg0[var9] = arg0[var5];
                arg0[var5] = var10;
                int var11 = arg1[var9];
                arg1[var9] = arg1[var5];
                arg1[var5++] = var11;
            }
        }
        arg0[arg3] = arg0[var5];
        arg0[var5] = var6;
        arg1[arg3] = arg1[var5];
        arg1[var5] = var7;
        method3237(arg0, arg1, arg2, var5 - 1);
        method3237(arg0, arg1, var5 + 1, arg3);
    }
}
