package deob;

@ObfuscatedName("z")
public final class class22 extends class199 {

    @ObfuscatedName("z.n")
    public static class190 field611 = new class190();

    @ObfuscatedName("z.g")
    public int field601;

    @ObfuscatedName("z.a")
    public int field607;

    @ObfuscatedName("z.m")
    public int field603;

    @ObfuscatedName("z.s")
    public int field609;

    @ObfuscatedName("z.j")
    public int field604;

    @ObfuscatedName("z.f")
    public int field605;

    @ObfuscatedName("z.b")
    public int field612;

    @ObfuscatedName("z.t")
    public int field606;

    @ObfuscatedName("z.i")
    public class60 field610;

    @ObfuscatedName("z.c")
    public int field600;

    @ObfuscatedName("z.k")
    public int[] field602;

    @ObfuscatedName("z.x")
    public int field617;

    @ObfuscatedName("z.e")
    public class60 field613;

    @ObfuscatedName("z.q")
    public class38 field614;

    @ObfuscatedName("ch.n(I)V")
    public static void method1859() {
        for (class22 var0 = (class22) field611.method3468(); var0 != null; var0 = (class22) field611.method3470()) {
            if (var0.field614 != null) {
                var0.method515();
            }
        }
    }

    @ObfuscatedName("z.g(I)V")
    public void method515() {
        int var1 = this.field606;
        class38 var2 = this.field614.method692();
        if (var2 == null) {
            this.field606 = -1;
            this.field612 = 0;
            this.field609 = 0;
            this.field600 = 0;
            this.field602 = null;
        } else {
            this.field606 = var2.field933;
            this.field612 = var2.field888 * 128;
            this.field609 = var2.field935;
            this.field600 = var2.field907;
            this.field602 = var2.field937;
        }
        if (this.field606 != var1 && this.field610 != null) {
            Statics.field2476.method994(this.field610);
            this.field610 = null;
        }
    }

    @ObfuscatedName("dw.a(IIIIB)V")
    public static void method2480(int arg0, int arg1, int arg2, int arg3) {
        for (class22 var4 = (class22) field611.method3468(); var4 != null; var4 = (class22) field611.method3470()) {
            if (var4.field606 != -1 || var4.field602 != null) {
                int var5 = 0;
                if (arg1 > var4.field604) {
                    var5 += arg1 - var4.field604;
                } else if (arg1 < var4.field607) {
                    var5 += var4.field607 - arg1;
                }
                if (arg2 > var4.field605) {
                    var5 += arg2 - var4.field605;
                } else if (arg2 < var4.field603) {
                    var5 += var4.field603 - arg2;
                }
                if (var5 - 64 > var4.field612 || client.field526 == 0 || var4.field601 != arg0) {
                    if (var4.field610 != null) {
                        Statics.field2476.method994(var4.field610);
                        var4.field610 = null;
                    }
                    if (var4.field613 != null) {
                        Statics.field2476.method994(var4.field613);
                        var4.field613 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field526 * (var4.field612 - var5) / var4.field612;
                    if (var4.field610 != null) {
                        var4.field610.method1236(var6);
                    } else if (var4.field606 >= 0) {
                        class54 var7 = class54.method1100(Statics.field2200, var4.field606, 0);
                        if (var7 != null) {
                            class58 var8 = var7.method1105().method1140(Statics.field799);
                            class60 var9 = class60.method1182(var8, 100, var6);
                            var9.method1170(-1);
                            Statics.field2476.method993(var9);
                            var4.field610 = var9;
                        }
                    }
                    if (var4.field613 != null) {
                        var4.field613.method1236(var6);
                        if (!var4.field613.method3555()) {
                            var4.field613 = null;
                        }
                    } else if (var4.field602 != null && (var4.field617 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field602.length);
                        class54 var11 = class54.method1100(Statics.field2200, var4.field602[var10], 0);
                        if (var11 != null) {
                            class58 var12 = var11.method1105().method1140(Statics.field799);
                            class60 var13 = class60.method1182(var12, 100, var6);
                            var13.method1170(0);
                            Statics.field2476.method993(var13);
                            var4.field613 = var13;
                            var4.field617 = var4.field609 + (int) (Math.random() * (double) (var4.field600 - var4.field609));
                        }
                    }
                }
            }
        }
    }
}
