package deob;

@ObfuscatedName("b")
public final class class20 extends class183 {

    @ObfuscatedName("b.y")
    public static class176 field538 = new class176();

    @ObfuscatedName("b.u")
    public int field532;

    @ObfuscatedName("b.k")
    public int field548;

    @ObfuscatedName("b.v")
    public int field534;

    @ObfuscatedName("b.l")
    public int field535;

    @ObfuscatedName("b.g")
    public int field539;

    @ObfuscatedName("b.a")
    public int field537;

    @ObfuscatedName("b.x")
    public int field533;

    @ObfuscatedName("b.r")
    public class36 field549;

    @ObfuscatedName("b.w")
    public class58 field531;

    @ObfuscatedName("b.c")
    public int field540;

    @ObfuscatedName("b.f")
    public int field541;

    @ObfuscatedName("b.o")
    public int[] field542;

    @ObfuscatedName("b.p")
    public int field543;

    @ObfuscatedName("b.n")
    public class58 field544;

    @ObfuscatedName("ep.y(I)V")
    public static void method2897() {
        for (class20 var0 = (class20) field538.method3234(); var0 != null; var0 = (class20) field538.method3209()) {
            if (var0.field531 != null) {
                Statics.field1832.method944(var0.field531);
                var0.field531 = null;
            }
            if (var0.field544 != null) {
                Statics.field1832.method944(var0.field544);
                var0.field544 = null;
            }
        }
        field538.method3201();
    }

    @ObfuscatedName("b.u(I)V")
    public void method440() {
        int var1 = this.field533;
        class36 var2 = this.field549.method628();
        if (var2 == null) {
            this.field533 = -1;
            this.field537 = 0;
            this.field540 = 0;
            this.field541 = 0;
            this.field542 = null;
        } else {
            this.field533 = var2.field863;
            this.field537 = var2.field864 * 128;
            this.field540 = var2.field865;
            this.field541 = var2.field866;
            this.field542 = var2.field867;
        }
        if (this.field533 != var1 && this.field531 != null) {
            Statics.field1832.method944(this.field531);
            this.field531 = null;
        }
    }

    @ObfuscatedName("ap.k(IIILax;II)V")
    public static void method792(int arg0, int arg1, int arg2, class36 arg3, int arg4) {
        class20 var5 = new class20();
        var5.field532 = arg0;
        var5.field548 = arg1 * 128;
        var5.field534 = arg2 * 128;
        int var6 = arg3.field834;
        int var7 = arg3.field851;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field851;
            var7 = arg3.field834;
        }
        var5.field535 = (arg1 + var6) * 128;
        var5.field539 = (arg2 + var7) * 128;
        var5.field533 = arg3.field863;
        var5.field537 = arg3.field864 * 128;
        var5.field540 = arg3.field865;
        var5.field541 = arg3.field866;
        var5.field542 = arg3.field867;
        if (arg3.field831 != null) {
            var5.field549 = arg3;
            var5.method440();
        }
        field538.method3202(var5);
        if (var5.field542 != null) {
            var5.field543 = var5.field540 + (int) (Math.random() * (double) (var5.field541 - var5.field540));
        }
    }

    @ObfuscatedName("s.v(IIIII)V")
    public static void method151(int arg0, int arg1, int arg2, int arg3) {
        for (class20 var4 = (class20) field538.method3234(); var4 != null; var4 = (class20) field538.method3209()) {
            if (var4.field533 != -1 || var4.field542 != null) {
                int var5 = 0;
                if (arg1 > var4.field535) {
                    var5 += arg1 - var4.field535;
                } else if (arg1 < var4.field548) {
                    var5 += var4.field548 - arg1;
                }
                if (arg2 > var4.field539) {
                    var5 += arg2 - var4.field539;
                } else if (arg2 < var4.field534) {
                    var5 += var4.field534 - arg2;
                }
                if (var5 - 64 > var4.field537 || client.field488 == 0 || var4.field532 != arg0) {
                    if (var4.field531 != null) {
                        Statics.field1832.method944(var4.field531);
                        var4.field531 = null;
                    }
                    if (var4.field544 != null) {
                        Statics.field1832.method944(var4.field544);
                        var4.field544 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field488 * (var4.field537 - var5) / var4.field537;
                    if (var4.field531 != null) {
                        var4.field531.method1092(var6);
                    } else if (var4.field533 >= 0) {
                        class52 var7 = class52.method1033(Statics.field879, var4.field533, 0);
                        if (var7 != null) {
                            class56 var8 = var7.method1026().method1063(Statics.field180);
                            class58 var9 = class58.method1088(var8, 100, var6);
                            var9.method1174(-1);
                            Statics.field1832.method973(var9);
                            var4.field531 = var9;
                        }
                    }
                    if (var4.field544 != null) {
                        var4.field544.method1092(var6);
                        if (!var4.field544.method3269()) {
                            var4.field544 = null;
                        }
                    } else if (var4.field542 != null && (var4.field543 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field542.length);
                        class52 var11 = class52.method1033(Statics.field879, var4.field542[var10], 0);
                        if (var11 != null) {
                            class56 var12 = var11.method1026().method1063(Statics.field180);
                            class58 var13 = class58.method1088(var12, 100, var6);
                            var13.method1174(0);
                            Statics.field1832.method973(var13);
                            var4.field544 = var13;
                            var4.field543 = var4.field540 + (int) (Math.random() * (double) (var4.field541 - var4.field540));
                        }
                    }
                }
            }
        }
    }
}
