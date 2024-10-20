package deob;

@ObfuscatedName("pl")
public class class437 {

    public class437() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.q([Ljava/lang/String;[II)V")
    public static void method2486(String[] arg0, int[] arg1) {
        method1967(arg0, arg1, 0, arg0.length - 1);
    }

    @ObfuscatedName("ck.l([Ljava/lang/String;[IIII)V")
    public static void method1967(String[] arg0, int[] arg1, int arg2, int arg3) {
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
        method1967(arg0, arg1, arg2, var5 - 1);
        method1967(arg0, arg1, var5 + 1, arg3);
    }
}
