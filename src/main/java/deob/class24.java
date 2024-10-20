package deob;

@ObfuscatedName("o")
public final class class24 extends class208 {

    @ObfuscatedName("o.j")
    public static class199 field591 = new class199();

    @ObfuscatedName("o.m")
    public int field589;

    @ObfuscatedName("o.f")
    public int field590;

    @ObfuscatedName("o.l")
    public int field593;

    @ObfuscatedName("o.u")
    public int field592;

    @ObfuscatedName("o.a")
    public int field604;

    @ObfuscatedName("o.h")
    public int field597;

    @ObfuscatedName("o.i")
    public int field595;

    @ObfuscatedName("o.t")
    public class65 field596;

    @ObfuscatedName("o.k")
    public int field599;

    @ObfuscatedName("o.s")
    public int field598;

    @ObfuscatedName("o.w")
    public int[] field588;

    @ObfuscatedName("o.e")
    public int field600;

    @ObfuscatedName("o.z")
    public class65 field601;

    @ObfuscatedName("o.p")
    public class41 field594;

    @ObfuscatedName("fh.j(I)V")
    public static void method3271() {
        for (class24 var0 = (class24) field591.method3606(); var0 != null; var0 = (class24) field591.method3608()) {
            if (var0.field596 != null) {
                Statics.field236.method1143(var0.field596);
                var0.field596 = null;
            }
            if (var0.field601 != null) {
                Statics.field236.method1143(var0.field601);
                var0.field601 = null;
            }
        }
        field591.method3600();
    }

    @ObfuscatedName("ea.m(B)V")
    public static void method2738() {
        for (class24 var0 = (class24) field591.method3606(); var0 != null; var0 = (class24) field591.method3608()) {
            if (var0.field594 != null) {
                var0.method611();
            }
        }
    }

    @ObfuscatedName("o.f(B)V")
    public void method611() {
        int var1 = this.field595;
        class41 var2 = this.field594.method813();
        if (var2 == null) {
            this.field595 = -1;
            this.field597 = 0;
            this.field599 = 0;
            this.field598 = 0;
            this.field588 = null;
        } else {
            this.field595 = var2.field907;
            this.field597 = var2.field950 * 128;
            this.field599 = var2.field951;
            this.field598 = var2.field952;
            this.field588 = var2.field956;
        }
        if (this.field595 != var1 && this.field596 != null) {
            Statics.field236.method1143(this.field596);
            this.field596 = null;
        }
    }

    @ObfuscatedName("u.l(IIILar;IB)V")
    public static void method49(int arg0, int arg1, int arg2, class41 arg3, int arg4) {
        class24 var5 = new class24();
        var5.field589 = arg0;
        var5.field590 = arg1 * 128;
        var5.field593 = arg2 * 128;
        int var6 = arg3.field920;
        int var7 = arg3.field921;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field921;
            var7 = arg3.field920;
        }
        var5.field592 = (arg1 + var6) * 128;
        var5.field604 = (arg2 + var7) * 128;
        var5.field595 = arg3.field907;
        var5.field597 = arg3.field950 * 128;
        var5.field599 = arg3.field951;
        var5.field598 = arg3.field952;
        var5.field588 = arg3.field956;
        if (arg3.field946 != null) {
            var5.field594 = arg3;
            var5.method611();
        }
        field591.method3603(var5);
        if (var5.field588 != null) {
            var5.field600 = var5.field599 + (int) (Math.random() * (double) (var5.field598 - var5.field599));
        }
    }

    @ObfuscatedName("ab.u(IIIII)V")
    public static void method1025(int arg0, int arg1, int arg2, int arg3) {
        for (class24 var4 = (class24) field591.method3606(); var4 != null; var4 = (class24) field591.method3608()) {
            if (var4.field595 != -1 || var4.field588 != null) {
                int var5 = 0;
                if (arg1 > var4.field592) {
                    var5 += arg1 - var4.field592;
                } else if (arg1 < var4.field590) {
                    var5 += var4.field590 - arg1;
                }
                if (arg2 > var4.field604) {
                    var5 += arg2 - var4.field604;
                } else if (arg2 < var4.field593) {
                    var5 += var4.field593 - arg2;
                }
                if (var5 - 64 > var4.field597 || client.field516 == 0 || var4.field589 != arg0) {
                    if (var4.field596 != null) {
                        Statics.field236.method1143(var4.field596);
                        var4.field596 = null;
                    }
                    if (var4.field601 != null) {
                        Statics.field236.method1143(var4.field601);
                        var4.field601 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field516 * (var4.field597 - var5) / var4.field597;
                    if (var4.field596 != null) {
                        var4.field596.method1291(var6);
                    } else if (var4.field595 >= 0) {
                        class59 var7 = class59.method1227(Statics.field2584, var4.field595, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1225().method1262(Statics.field1775);
                            class65 var9 = class65.method1401(var8, 100, var6);
                            var9.method1290(-1);
                            Statics.field236.method1166(var9);
                            var4.field596 = var9;
                        }
                    }
                    if (var4.field601 != null) {
                        var4.field601.method1291(var6);
                        if (!var4.field601.method3703()) {
                            var4.field601 = null;
                        }
                    } else if (var4.field588 != null && (var4.field600 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field588.length);
                        class59 var11 = class59.method1227(Statics.field2584, var4.field588[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1225().method1262(Statics.field1775);
                            class65 var13 = class65.method1401(var12, 100, var6);
                            var13.method1290(0);
                            Statics.field236.method1166(var13);
                            var4.field601 = var13;
                            var4.field600 = var4.field599 + (int) (Math.random() * (double) (var4.field598 - var4.field599));
                        }
                    }
                }
            }
        }
    }
}
