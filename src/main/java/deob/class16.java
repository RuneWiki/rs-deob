package deob;

@ObfuscatedName("w")
public class class16 extends class208 {

    @ObfuscatedName("w.o")
    public static class196 field220 = new class196(32);

    @ObfuscatedName("w.f")
    public int[] field221 = new int[] { -1 };

    @ObfuscatedName("w.i")
    public int[] field219 = new int[] { 0 };

    @ObfuscatedName("cw.o(III)I")
    public static int method2087(int arg0, int arg1) {
        class16 var2 = (class16) field220.method3482((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field219.length; var4++) {
                if (var2.field221[var4] == arg1) {
                    var3 += var2.field219[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("de.f(IIIII)V")
    public static void method2242(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field220.method3482((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field220.method3495(var4, (long) arg0);
        }
        if (var4.field221.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field221.length; var7++) {
                var5[var7] = var4.field221[var7];
                var6[var7] = var4.field219[var7];
            }
            for (int var8 = var4.field221.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field221 = var5;
            var4.field219 = var6;
        }
        var4.field221[arg1] = arg2;
        var4.field219[arg1] = arg3;
    }

    @ObfuscatedName("client.i(II)V")
    public static void method527(int arg0) {
        class16 var1 = (class16) field220.method3482((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field221.length; var2++) {
                var1.field221[var2] = -1;
                var1.field219[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ev.h(IB)V")
    public static void method2787(int arg0) {
        class16 var1 = (class16) field220.method3482((long) arg0);
        if (var1 != null) {
            var1.method3605();
        }
    }

    @ObfuscatedName("er.q(B)V")
    public static void method2690() {
        field220 = new class196(32);
    }
}
