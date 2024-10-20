package deob;

@ObfuscatedName("ch")
public final class class82 extends class200 {

    @ObfuscatedName("ch.b")
    public static class201 field1241 = new class201();

    @ObfuscatedName("ch.s")
    public int field1246;

    @ObfuscatedName("ch.r")
    public class263 field1251;

    @ObfuscatedName("ch.g")
    public int field1240;

    @ObfuscatedName("ch.x")
    public int field1253;

    @ObfuscatedName("ch.f")
    public int field1249;

    @ObfuscatedName("ch.u")
    public int field1243;

    @ObfuscatedName("ch.t")
    public int field1242;

    @ObfuscatedName("ch.k")
    public int field1239;

    @ObfuscatedName("ch.n")
    public int field1244;

    @ObfuscatedName("ch.d")
    public class117 field1245;

    @ObfuscatedName("ch.o")
    public int field1247;

    @ObfuscatedName("ch.a")
    public int[] field1248;

    @ObfuscatedName("ch.q")
    public int field1238;

    @ObfuscatedName("ch.j")
    public class117 field1250;

    @ObfuscatedName("hx.b(I)V")
    public static void method3784() {
        for (class82 var0 = (class82) field1241.method3405(); var0 != null; var0 = (class82) field1241.method3414()) {
            if (var0.field1245 != null) {
                Statics.field1088.method1740(var0.field1245);
                var0.field1245 = null;
            }
            if (var0.field1250 != null) {
                Statics.field1088.method1740(var0.field1250);
                var0.field1250 = null;
            }
        }
        field1241.method3399();
    }

    @ObfuscatedName("ch.s(B)V")
    public void method1462() {
        int var1 = this.field1244;
        class263 var2 = this.field1251.method4228();
        if (var2 == null) {
            this.field1244 = -1;
            this.field1239 = 0;
            this.field1246 = 0;
            this.field1247 = 0;
            this.field1248 = null;
        } else {
            this.field1244 = var2.field3531;
            this.field1239 = var2.field3532 * 128;
            this.field1246 = var2.field3504;
            this.field1247 = var2.field3534;
            this.field1248 = var2.field3533;
        }
        if (this.field1244 != var1 && this.field1245 != null) {
            Statics.field1088.method1740(this.field1245);
            this.field1245 = null;
        }
    }

    @ObfuscatedName("ax.r(IIILjt;II)V")
    public static void method599(int arg0, int arg1, int arg2, class263 arg3, int arg4) {
        class82 var5 = new class82();
        var5.field1240 = arg0;
        var5.field1249 = arg1 * 128;
        var5.field1253 = arg2 * 128;
        int var6 = arg3.field3502;
        int var7 = arg3.field3503;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3503;
            var7 = arg3.field3502;
        }
        var5.field1243 = (arg1 + var6) * 128;
        var5.field1242 = (arg2 + var7) * 128;
        var5.field1244 = arg3.field3531;
        var5.field1239 = arg3.field3532 * 128;
        var5.field1246 = arg3.field3504;
        var5.field1247 = arg3.field3534;
        var5.field1248 = arg3.field3533;
        if (arg3.field3528 != null) {
            var5.field1251 = arg3;
            var5.method1462();
        }
        field1241.method3400(var5);
        if (var5.field1248 != null) {
            var5.field1238 = var5.field1246 + (int) (Math.random() * (double) (var5.field1247 - var5.field1246));
        }
    }

    @ObfuscatedName("ak.g(IIIIS)V")
    public static void method207(int arg0, int arg1, int arg2, int arg3) {
        for (class82 var4 = (class82) field1241.method3405(); var4 != null; var4 = (class82) field1241.method3414()) {
            if (var4.field1244 != -1 || var4.field1248 != null) {
                int var5 = 0;
                if (arg1 > var4.field1243) {
                    var5 += arg1 - var4.field1243;
                } else if (arg1 < var4.field1249) {
                    var5 += var4.field1249 - arg1;
                }
                if (arg2 > var4.field1242) {
                    var5 += arg2 - var4.field1242;
                } else if (arg2 < var4.field1253) {
                    var5 += var4.field1253 - arg2;
                }
                if (var5 - 64 > var4.field1239 || client.field1052 == 0 || var4.field1240 != arg0) {
                    if (var4.field1245 != null) {
                        Statics.field1088.method1740(var4.field1245);
                        var4.field1245 = null;
                    }
                    if (var4.field1250 != null) {
                        Statics.field1088.method1740(var4.field1250);
                        var4.field1250 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field1052 * (var4.field1239 - var5) / var4.field1239;
                    if (var4.field1245 != null) {
                        var4.field1245.method1970(var6);
                    } else if (var4.field1244 >= 0) {
                        class105 var7 = class105.method1805(Statics.field327, var4.field1244, 0);
                        if (var7 != null) {
                            class107 var8 = var7.method1791().method1846(Statics.field498);
                            class117 var9 = class117.method1978(var8, 100, var6);
                            var9.method2012(-1);
                            Statics.field1088.method1774(var9);
                            var4.field1245 = var9;
                        }
                    }
                    if (var4.field1250 != null) {
                        var4.field1250.method1970(var6);
                        if (!var4.field1250.method3393()) {
                            var4.field1250 = null;
                        }
                    } else if (var4.field1248 != null && (var4.field1238 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1248.length);
                        class105 var11 = class105.method1805(Statics.field327, var4.field1248[var10], 0);
                        if (var11 != null) {
                            class107 var12 = var11.method1791().method1846(Statics.field498);
                            class117 var13 = class117.method1978(var12, 100, var6);
                            var13.method2012(0);
                            Statics.field1088.method1774(var13);
                            var4.field1250 = var13;
                            var4.field1238 = var4.field1246 + (int) (Math.random() * (double) (var4.field1247 - var4.field1246));
                        }
                    }
                }
            }
        }
    }
}
