package deob;

@ObfuscatedName("pw")
public class class442 {

    public class442() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hh.c([Ljava/lang/String;[SI)V")
    public static void method4601(String[] arg0, short[] arg1) {
        method7056(arg0, arg1, 0, arg0.length - 1);
    }

    @ObfuscatedName("pz.p([Ljava/lang/String;[SIII)V")
    public static void method7056(String[] arg0, short[] arg1, int arg2, int arg3) {
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
        method7056(arg0, arg1, arg2, var5 - 1);
        method7056(arg0, arg1, var5 + 1, arg3);
    }

    @ObfuscatedName("cr.f([Ljava/lang/String;[IS)V")
    public static void method2387(String[] arg0, int[] arg1) {
        method6065(arg0, arg1, 0, arg0.length - 1);
    }

    @ObfuscatedName("mm.n([Ljava/lang/String;[IIII)V")
    public static void method6065(String[] arg0, int[] arg1, int arg2, int arg3) {
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
        method6065(arg0, arg1, arg2, var5 - 1);
        method6065(arg0, arg1, var5 + 1, arg3);
    }
}
