package deob;

@ObfuscatedName("c")
public final class class21 extends class191 {

    @ObfuscatedName("c.b")
    public static class182 field546 = new class182();

    @ObfuscatedName("c.e")
    public int field539;

    @ObfuscatedName("c.i")
    public int field540;

    @ObfuscatedName("c.k")
    public int field541;

    @ObfuscatedName("c.h")
    public int field542;

    @ObfuscatedName("c.p")
    public int field538;

    @ObfuscatedName("c.n")
    public int field544;

    @ObfuscatedName("c.o")
    public int field554;

    @ObfuscatedName("c.g")
    public class59 field550;

    @ObfuscatedName("c.z")
    public int field547;

    @ObfuscatedName("c.t")
    public int field553;

    @ObfuscatedName("c.y")
    public int[] field549;

    @ObfuscatedName("c.w")
    public int field545;

    @ObfuscatedName("c.x")
    public class59 field551;

    @ObfuscatedName("c.v")
    public class37 field552;

    @ObfuscatedName("de.b(I)V")
    public static void method2078() {
        for (class21 var0 = (class21) field546.method3293(); var0 != null; var0 = (class21) field546.method3288()) {
            if (var0.field550 != null) {
                Statics.field58.method939(var0.field550);
                var0.field550 = null;
            }
            if (var0.field551 != null) {
                Statics.field58.method939(var0.field551);
                var0.field551 = null;
            }
        }
        field546.method3287();
    }

    @ObfuscatedName("c.e(I)V")
    public void method482() {
        int var1 = this.field554;
        class37 var2 = this.field552.method656();
        if (var2 == null) {
            this.field554 = -1;
            this.field544 = 0;
            this.field547 = 0;
            this.field553 = 0;
            this.field549 = null;
        } else {
            this.field554 = var2.field860;
            this.field544 = var2.field885 * 128;
            this.field547 = var2.field853;
            this.field553 = var2.field887;
            this.field549 = var2.field888;
        }
        if (this.field554 != var1 && this.field550 != null) {
            Statics.field58.method939(this.field550);
            this.field550 = null;
        }
    }

    @ObfuscatedName("bg.i(IIILat;II)V")
    public static void method1406(int arg0, int arg1, int arg2, class37 arg3, int arg4) {
        class21 var5 = new class21();
        var5.field539 = arg0;
        var5.field540 = arg1 * 128;
        var5.field541 = arg2 * 128;
        int var6 = arg3.field855;
        int var7 = arg3.field856;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field856;
            var7 = arg3.field855;
        }
        var5.field542 = (arg1 + var6) * 128;
        var5.field538 = (arg2 + var7) * 128;
        var5.field554 = arg3.field860;
        var5.field544 = arg3.field885 * 128;
        var5.field547 = arg3.field853;
        var5.field553 = arg3.field887;
        var5.field549 = arg3.field888;
        if (arg3.field881 != null) {
            var5.field552 = arg3;
            var5.method482();
        }
        field546.method3302(var5);
        if (var5.field549 != null) {
            var5.field545 = var5.field547 + (int) (Math.random() * (double) (var5.field553 - var5.field547));
        }
    }

    @ObfuscatedName("aq.k(IIIII)V")
    public static void method803(int arg0, int arg1, int arg2, int arg3) {
        for (class21 var4 = (class21) field546.method3293(); var4 != null; var4 = (class21) field546.method3288()) {
            if (var4.field554 != -1 || var4.field549 != null) {
                int var5 = 0;
                if (arg1 > var4.field542) {
                    var5 += arg1 - var4.field542;
                } else if (arg1 < var4.field540) {
                    var5 += var4.field540 - arg1;
                }
                if (arg2 > var4.field538) {
                    var5 += arg2 - var4.field538;
                } else if (arg2 < var4.field541) {
                    var5 += var4.field541 - arg2;
                }
                if (var5 - 64 > var4.field544 || client.field481 == 0 || var4.field539 != arg0) {
                    if (var4.field550 != null) {
                        Statics.field58.method939(var4.field550);
                        var4.field550 = null;
                    }
                    if (var4.field551 != null) {
                        Statics.field58.method939(var4.field551);
                        var4.field551 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field481 * (var4.field544 - var5) / var4.field544;
                    if (var4.field550 != null) {
                        var4.field550.method1102(var6);
                    } else if (var4.field554 >= 0) {
                        class53 var7 = class53.method1033(Statics.field2715, var4.field554, 0);
                        if (var7 != null) {
                            class57 var8 = var7.method1024().method1063(Statics.field2047);
                            class59 var9 = class59.method1116(var8, 100, var6);
                            var9.method1108(-1);
                            Statics.field58.method955(var9);
                            var4.field550 = var9;
                        }
                    }
                    if (var4.field551 != null) {
                        var4.field551.method1102(var6);
                        if (!var4.field551.method3400()) {
                            var4.field551 = null;
                        }
                    } else if (var4.field549 != null && (var4.field545 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field549.length);
                        class53 var11 = class53.method1033(Statics.field2715, var4.field549[var10], 0);
                        if (var11 != null) {
                            class57 var12 = var11.method1024().method1063(Statics.field2047);
                            class59 var13 = class59.method1116(var12, 100, var6);
                            var13.method1108(0);
                            Statics.field58.method955(var13);
                            var4.field551 = var13;
                            var4.field545 = var4.field547 + (int) (Math.random() * (double) (var4.field553 - var4.field547));
                        }
                    }
                }
            }
        }
    }
}
