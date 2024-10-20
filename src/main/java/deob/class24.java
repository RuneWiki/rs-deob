package deob;

@ObfuscatedName("d")
public final class class24 extends class209 {

    @ObfuscatedName("d.e")
    public static class200 field602 = new class200();

    @ObfuscatedName("d.w")
    public int field590;

    @ObfuscatedName("d.f")
    public int field591;

    @ObfuscatedName("d.s")
    public int field601;

    @ObfuscatedName("d.p")
    public int field598;

    @ObfuscatedName("d.h")
    public int field593;

    @ObfuscatedName("d.g")
    public int field594;

    @ObfuscatedName("d.a")
    public int field595;

    @ObfuscatedName("d.r")
    public class41 field603;

    @ObfuscatedName("d.k")
    public int field589;

    @ObfuscatedName("d.m")
    public class65 field592;

    @ObfuscatedName("d.n")
    public int field599;

    @ObfuscatedName("d.y")
    public int[] field600;

    @ObfuscatedName("d.i")
    public int field596;

    @ObfuscatedName("d.j")
    public class65 field597;

    @ObfuscatedName("d.e(I)V")
    public void method580() {
        int var1 = this.field589;
        class41 var2 = this.field603.method772();
        if (var2 == null) {
            this.field589 = -1;
            this.field595 = 0;
            this.field601 = 0;
            this.field599 = 0;
            this.field600 = null;
        } else {
            this.field589 = var2.field944;
            this.field595 = var2.field936 * 128;
            this.field601 = var2.field938;
            this.field599 = var2.field947;
            this.field600 = var2.field948;
        }
        if (this.field589 != var1 && this.field592 != null) {
            Statics.field2075.method1121(this.field592);
            this.field592 = null;
        }
    }

    @ObfuscatedName("ah.w(IIIIB)V")
    public static void method685(int arg0, int arg1, int arg2, int arg3) {
        for (class24 var4 = (class24) field602.method3544(); var4 != null; var4 = (class24) field602.method3546()) {
            if (var4.field589 != -1 || var4.field600 != null) {
                int var5 = 0;
                if (arg1 > var4.field593) {
                    var5 += arg1 - var4.field593;
                } else if (arg1 < var4.field591) {
                    var5 += var4.field591 - arg1;
                }
                if (arg2 > var4.field594) {
                    var5 += arg2 - var4.field594;
                } else if (arg2 < var4.field598) {
                    var5 += var4.field598 - arg2;
                }
                if (var5 - 64 > var4.field595 || client.field520 == 0 || var4.field590 != arg0) {
                    if (var4.field592 != null) {
                        Statics.field2075.method1121(var4.field592);
                        var4.field592 = null;
                    }
                    if (var4.field597 != null) {
                        Statics.field2075.method1121(var4.field597);
                        var4.field597 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field520 * (var4.field595 - var5) / var4.field595;
                    if (var4.field592 != null) {
                        var4.field592.method1255(var6);
                    } else if (var4.field589 >= 0) {
                        class59 var7 = class59.method1197(Statics.field2176, var4.field589, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1199().method1232(Statics.field1067);
                            class65 var9 = class65.method1270(var8, 100, var6);
                            var9.method1374(-1);
                            Statics.field2075.method1103(var9);
                            var4.field592 = var9;
                        }
                    }
                    if (var4.field597 != null) {
                        var4.field597.method1255(var6);
                        if (!var4.field597.method3634()) {
                            var4.field597 = null;
                        }
                    } else if (var4.field600 != null && (var4.field596 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field600.length);
                        class59 var11 = class59.method1197(Statics.field2176, var4.field600[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1199().method1232(Statics.field1067);
                            class65 var13 = class65.method1270(var12, 100, var6);
                            var13.method1374(0);
                            Statics.field2075.method1103(var13);
                            var4.field597 = var13;
                            var4.field596 = var4.field601 + (int) (Math.random() * (double) (var4.field599 - var4.field601));
                        }
                    }
                }
            }
        }
    }
}
