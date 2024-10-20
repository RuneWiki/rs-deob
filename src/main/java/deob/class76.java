package deob;

@ObfuscatedName("bf")
public final class class76 extends class181 {

    @ObfuscatedName("bf.a")
    public static class262 field1051 = new class262();

    @ObfuscatedName("bf.t")
    public int field1050;

    @ObfuscatedName("bf.n")
    public int field1060;

    @ObfuscatedName("bf.q")
    public int field1052;

    @ObfuscatedName("bf.v")
    public int field1061;

    @ObfuscatedName("bf.l")
    public int field1054;

    @ObfuscatedName("bf.c")
    public int field1053;

    @ObfuscatedName("bf.o")
    public int field1056;

    @ObfuscatedName("bf.i")
    public class114 field1057;

    @ObfuscatedName("bf.d")
    public int field1058;

    @ObfuscatedName("bf.m")
    public int field1059;

    @ObfuscatedName("bf.p")
    public int[] field1049;

    @ObfuscatedName("bf.h")
    public int field1055;

    @ObfuscatedName("bf.k")
    public class114 field1062;

    @ObfuscatedName("bf.x")
    public class254 field1063;

    @ObfuscatedName("bg.a(I)V")
    public static void method967() {
        for (class76 var0 = (class76) field1051.method4581(); var0 != null; var0 = (class76) field1051.method4589()) {
            if (var0.field1057 != null) {
                Statics.field3248.method2211(var0.field1057);
                var0.field1057 = null;
            }
            if (var0.field1062 != null) {
                Statics.field3248.method2211(var0.field1062);
                var0.field1062 = null;
            }
        }
        field1051.method4575();
    }

    @ObfuscatedName("bf.t(B)V")
    public void method1832() {
        int var1 = this.field1056;
        class254 var2 = this.field1063.method4333();
        if (var2 == null) {
            this.field1056 = -1;
            this.field1053 = 0;
            this.field1058 = 0;
            this.field1059 = 0;
            this.field1049 = null;
        } else {
            this.field1056 = var2.field3382;
            this.field1053 = var2.field3372 * 128;
            this.field1058 = var2.field3384;
            this.field1059 = var2.field3385;
            this.field1049 = var2.field3386;
        }
        if (this.field1056 != var1 && this.field1057 != null) {
            Statics.field3248.method2211(this.field1057);
            this.field1057 = null;
        }
    }

    @ObfuscatedName("bi.n(IIILix;IB)V")
    public static void method1100(int arg0, int arg1, int arg2, class254 arg3, int arg4) {
        class76 var5 = new class76();
        var5.field1050 = arg0;
        var5.field1060 = arg1 * 128;
        var5.field1052 = arg2 * 128;
        int var6 = arg3.field3342;
        int var7 = arg3.field3378;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3378;
            var7 = arg3.field3342;
        }
        var5.field1061 = (arg1 + var6) * 128;
        var5.field1054 = (arg2 + var7) * 128;
        var5.field1056 = arg3.field3382;
        var5.field1053 = arg3.field3372 * 128;
        var5.field1058 = arg3.field3384;
        var5.field1059 = arg3.field3385;
        var5.field1049 = arg3.field3386;
        if (arg3.field3354 != null) {
            var5.field1063 = arg3;
            var5.method1832();
        }
        field1051.method4576(var5);
        if (var5.field1049 != null) {
            var5.field1055 = var5.field1058 + (int) (Math.random() * (double) (var5.field1059 - var5.field1058));
        }
    }
}
