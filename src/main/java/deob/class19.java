package deob;

@ObfuscatedName("c")
public final class class19 extends class176 {

    @ObfuscatedName("c.m")
    public static class171 field537 = new class171();

    @ObfuscatedName("c.k")
    public int field543;

    @ObfuscatedName("c.y")
    public int field538;

    @ObfuscatedName("c.g")
    public int field539;

    @ObfuscatedName("c.r")
    public class33 field550;

    @ObfuscatedName("c.i")
    public int field540;

    @ObfuscatedName("c.f")
    public int field555;

    @ObfuscatedName("c.a")
    public int field542;

    @ObfuscatedName("c.w")
    public int field552;

    @ObfuscatedName("c.u")
    public class55 field544;

    @ObfuscatedName("c.d")
    public int field536;

    @ObfuscatedName("c.t")
    public int field553;

    @ObfuscatedName("c.j")
    public int[] field547;

    @ObfuscatedName("c.q")
    public int field548;

    @ObfuscatedName("c.p")
    public class55 field549;

    @ObfuscatedName("at.m(I)V")
    public static void method1045() {
        for (class19 var0 = (class19) field537.method3178(); var0 != null; var0 = (class19) field537.method3179()) {
            if (var0.field544 != null) {
                Statics.field1962.method946(var0.field544);
                var0.field544 = null;
            }
            if (var0.field549 != null) {
                Statics.field1962.method946(var0.field549);
                var0.field549 = null;
            }
        }
        field537.method3171();
    }

    @ObfuscatedName("eh.k(B)V")
    public static void method2668() {
        for (class19 var0 = (class19) field537.method3178(); var0 != null; var0 = (class19) field537.method3179()) {
            if (var0.field550 != null) {
                var0.method486();
            }
        }
    }

    @ObfuscatedName("c.y(I)V")
    public void method486() {
        int var1 = this.field552;
        class33 var2 = this.field550.method621();
        if (var2 == null) {
            this.field552 = -1;
            this.field542 = 0;
            this.field536 = 0;
            this.field553 = 0;
            this.field547 = null;
        } else {
            this.field552 = var2.field842;
            this.field542 = var2.field843 * 128;
            this.field536 = var2.field844;
            this.field553 = var2.field845;
            this.field547 = var2.field847;
        }
        if (this.field552 != var1 && this.field544 != null) {
            Statics.field1962.method946(this.field544);
            this.field544 = null;
        }
    }

    @ObfuscatedName("cy.g(IIILad;II)V")
    public static void method2080(int arg0, int arg1, int arg2, class33 arg3, int arg4) {
        class19 var5 = new class19();
        var5.field543 = arg0;
        var5.field538 = arg1 * 128;
        var5.field539 = arg2 * 128;
        int var6 = arg3.field813;
        int var7 = arg3.field816;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field816;
            var7 = arg3.field813;
        }
        var5.field540 = (arg1 + var6) * 128;
        var5.field555 = (arg2 + var7) * 128;
        var5.field552 = arg3.field842;
        var5.field542 = arg3.field843 * 128;
        var5.field536 = arg3.field844;
        var5.field553 = arg3.field845;
        var5.field547 = arg3.field847;
        if (arg3.field839 != null) {
            var5.field550 = arg3;
            var5.method486();
        }
        field537.method3180(var5);
        if (var5.field547 != null) {
            var5.field548 = var5.field536 + (int) (Math.random() * (double) (var5.field553 - var5.field536));
        }
    }

    @ObfuscatedName("y.r(IIIIB)V")
    public static void method30(int arg0, int arg1, int arg2, int arg3) {
        for (class19 var4 = (class19) field537.method3178(); var4 != null; var4 = (class19) field537.method3179()) {
            if (var4.field552 != -1 || var4.field547 != null) {
                int var5 = 0;
                if (arg1 > var4.field540) {
                    var5 += arg1 - var4.field540;
                } else if (arg1 < var4.field538) {
                    var5 += var4.field538 - arg1;
                }
                if (arg2 > var4.field555) {
                    var5 += arg2 - var4.field555;
                } else if (arg2 < var4.field539) {
                    var5 += var4.field539 - arg2;
                }
                if (var5 - 64 > var4.field542 || client.field302 == 0 || var4.field543 != arg0) {
                    if (var4.field544 != null) {
                        Statics.field1962.method946(var4.field544);
                        var4.field544 = null;
                    }
                    if (var4.field549 != null) {
                        Statics.field1962.method946(var4.field549);
                        var4.field549 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field302 * (var4.field542 - var5) / var4.field542;
                    if (var4.field544 != null) {
                        var4.field544.method1088(var6);
                    } else if (var4.field552 >= 0) {
                        class49 var7 = class49.method1027(Statics.field1085, var4.field552, 0);
                        if (var7 != null) {
                            class53 var8 = var7.method1021().method1063(Statics.field27);
                            class55 var9 = class55.method1085(var8, 100, var6);
                            var9.method1179(-1);
                            Statics.field1962.method914(var9);
                            var4.field544 = var9;
                        }
                    }
                    if (var4.field549 != null) {
                        var4.field549.method1088(var6);
                        if (!var4.field549.method3224()) {
                            var4.field549 = null;
                        }
                    } else if (var4.field547 != null && (var4.field548 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field547.length);
                        class49 var11 = class49.method1027(Statics.field1085, var4.field547[var10], 0);
                        if (var11 != null) {
                            class53 var12 = var11.method1021().method1063(Statics.field27);
                            class55 var13 = class55.method1085(var12, 100, var6);
                            var13.method1179(0);
                            Statics.field1962.method914(var13);
                            var4.field549 = var13;
                            var4.field548 = var4.field536 + (int) (Math.random() * (double) (var4.field553 - var4.field536));
                        }
                    }
                }
            }
        }
    }
}
