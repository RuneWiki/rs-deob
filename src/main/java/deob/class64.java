package deob;

@ObfuscatedName("bg")
public class class64 extends class193 {

    @ObfuscatedName("bg.i")
    public static class191 field774 = new class191(32);

    @ObfuscatedName("bg.h")
    public int[] field768 = new int[] { -1 };

    @ObfuscatedName("bg.u")
    public int[] field770 = new int[] { 0 };

    @ObfuscatedName("ab.i(III)I")
    public static int method681(int arg0, int arg1) {
        class64 var2 = (class64) field774.method3331((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field770.length) {
            return var2.field770[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("f.h(IIIII)V")
    public static void method153(int arg0, int arg1, int arg2, int arg3) {
        class64 var4 = (class64) field774.method3331((long) arg0);
        if (var4 == null) {
            var4 = new class64();
            field774.method3333(var4, (long) arg0);
        }
        if (var4.field768.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field768.length; var7++) {
                var5[var7] = var4.field768[var7];
                var6[var7] = var4.field770[var7];
            }
            for (int var8 = var4.field768.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field768 = var5;
            var4.field770 = var6;
        }
        var4.field768[arg1] = arg2;
        var4.field770[arg1] = arg3;
    }

    @ObfuscatedName("ad.u(II)V")
    public static void method461(int arg0) {
        class64 var1 = (class64) field774.method3331((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field768.length; var2++) {
                var1.field768[var2] = -1;
                var1.field770[var2] = 0;
            }
        }
    }

    @ObfuscatedName("hz.q(I)V")
    public static void method3650() {
        field774 = new class191(32);
    }
}
