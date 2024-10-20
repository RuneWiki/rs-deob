package deob;

@ObfuscatedName("d")
public class class18 extends class177 {

    @ObfuscatedName("d.j")
    public static class173 field263 = new class173(32);

    @ObfuscatedName("d.y")
    public int[] field264 = new int[] { -1 };

    @ObfuscatedName("d.x")
    public int[] field268 = new int[] { 0 };

    @ObfuscatedName("aw.j(III)I")
    public static int method603(int arg0, int arg1) {
        class18 var2 = (class18) field263.method3222((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field264.length) {
            return var2.field264[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("av.y(IIB)I")
    public static int method681(int arg0, int arg1) {
        class18 var2 = (class18) field263.method3222((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field268.length; var4++) {
                if (var2.field264[var4] == arg1) {
                    var3 += var2.field268[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("p.x(IIIII)V")
    public static void method204(int arg0, int arg1, int arg2, int arg3) {
        class18 var4 = (class18) field263.method3222((long) arg0);
        if (var4 == null) {
            var4 = new class18();
            field263.method3223(var4, (long) arg0);
        }
        if (var4.field264.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field264.length; var7++) {
                var5[var7] = var4.field264[var7];
                var6[var7] = var4.field268[var7];
            }
            for (int var8 = var4.field264.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field264 = var5;
            var4.field268 = var6;
        }
        var4.field264[arg1] = arg2;
        var4.field268[arg1] = arg3;
    }

    @ObfuscatedName("at.z(II)V")
    public static void method777(int arg0) {
        class18 var1 = (class18) field263.method3222((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field264.length; var2++) {
                var1.field264[var2] = -1;
                var1.field268[var2] = 0;
            }
        }
    }

    @ObfuscatedName("bu.c(I)V")
    public static void method1520() {
        field263 = new class173(32);
    }
}
