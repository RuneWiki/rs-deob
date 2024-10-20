package deob;

@ObfuscatedName("bj")
public class class69 extends class190 {

    @ObfuscatedName("bj.h")
    public static class329 field547 = new class329(32);

    @ObfuscatedName("bj.v")
    public int[] field541 = new int[] { -1 };

    @ObfuscatedName("bj.x")
    public int[] field540 = new int[] { 0 };

    @ObfuscatedName("bm.h(IIB)I")
    public static int method821(int arg0, int arg1) {
        class69 var2 = (class69) field547.method5543((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field541.length) {
            return var2.field541[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("l.v(III)I")
    public static int method76(int arg0, int arg1) {
        class69 var2 = (class69) field547.method5543((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field540.length) {
            return var2.field540[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ep.x(IIB)I")
    public static int method3118(int arg0, int arg1) {
        class69 var2 = (class69) field547.method5543((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field540.length; var4++) {
                if (var2.field541[var4] == arg1) {
                    var3 += var2.field540[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("q.w(IIIII)V")
    public static void method188(int arg0, int arg1, int arg2, int arg3) {
        class69 var4 = (class69) field547.method5543((long) arg0);
        if (var4 == null) {
            var4 = new class69();
            field547.method5531(var4, (long) arg0);
        }
        if (var4.field541.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field541.length; var7++) {
                var5[var7] = var4.field541[var7];
                var6[var7] = var4.field540[var7];
            }
            for (int var8 = var4.field541.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field541 = var5;
            var4.field540 = var6;
        }
        var4.field541[arg1] = arg2;
        var4.field540[arg1] = arg3;
    }

    @ObfuscatedName("gi.t(II)V")
    public static void method3407(int arg0) {
        class69 var1 = (class69) field547.method5543((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field541.length; var2++) {
                var1.field541[var2] = -1;
                var1.field540[var2] = 0;
            }
        }
    }

    @ObfuscatedName("cx.j(II)V")
    public static void method1671(int arg0) {
        class69 var1 = (class69) field547.method5543((long) arg0);
        if (var1 != null) {
            var1.method3359();
        }
    }
}
