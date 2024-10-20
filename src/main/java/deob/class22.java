package deob;

@ObfuscatedName("u")
public final class class22 extends class199 {

    @ObfuscatedName("u.p")
    public static class190 field586 = new class190();

    @ObfuscatedName("u.k")
    public int field579;

    @ObfuscatedName("u.e")
    public int field589;

    @ObfuscatedName("u.f")
    public int field580;

    @ObfuscatedName("u.w")
    public int field581;

    @ObfuscatedName("u.t")
    public int field582;

    @ObfuscatedName("u.s")
    public int field595;

    @ObfuscatedName("u.c")
    public int field583;

    @ObfuscatedName("u.d")
    public int field584;

    @ObfuscatedName("u.v")
    public class60 field585;

    @ObfuscatedName("u.m")
    public int field587;

    @ObfuscatedName("u.h")
    public int[] field588;

    @ObfuscatedName("u.n")
    public int field598;

    @ObfuscatedName("u.x")
    public class60 field590;

    @ObfuscatedName("u.o")
    public class38 field591;

    @ObfuscatedName("ah.p(B)V")
    public static void method930() {
        for (class22 var0 = (class22) field586.method3442(); var0 != null; var0 = (class22) field586.method3444()) {
            if (var0.field585 != null) {
                Statics.field127.method985(var0.field585);
                var0.field585 = null;
            }
            if (var0.field590 != null) {
                Statics.field127.method985(var0.field590);
                var0.field590 = null;
            }
        }
        field586.method3445();
    }

    @ObfuscatedName("u.k(B)V")
    public void method507() {
        int var1 = this.field584;
        class38 var2 = this.field591.method684();
        if (var2 == null) {
            this.field584 = -1;
            this.field583 = 0;
            this.field595 = 0;
            this.field587 = 0;
            this.field588 = null;
        } else {
            this.field584 = var2.field919;
            this.field583 = var2.field920 * 128;
            this.field595 = var2.field921;
            this.field587 = var2.field884;
            this.field588 = var2.field923;
        }
        if (this.field584 != var1 && this.field585 != null) {
            Statics.field127.method985(this.field585);
            this.field585 = null;
        }
    }

    @ObfuscatedName("l.e(IIILai;II)V")
    public static void method496(int arg0, int arg1, int arg2, class38 arg3, int arg4) {
        class22 var5 = new class22();
        var5.field579 = arg0;
        var5.field589 = arg1 * 128;
        var5.field580 = arg2 * 128;
        int var6 = arg3.field890;
        int var7 = arg3.field910;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field910;
            var7 = arg3.field890;
        }
        var5.field581 = (arg1 + var6) * 128;
        var5.field582 = (arg2 + var7) * 128;
        var5.field584 = arg3.field919;
        var5.field583 = arg3.field920 * 128;
        var5.field595 = arg3.field921;
        var5.field587 = arg3.field884;
        var5.field588 = arg3.field923;
        if (arg3.field895 != null) {
            var5.field591 = arg3;
            var5.method507();
        }
        field586.method3437(var5);
        if (var5.field588 != null) {
            var5.field598 = var5.field595 + (int) (Math.random() * (double) (var5.field587 - var5.field595));
        }
    }

    @ObfuscatedName("l.f(IIIII)V")
    public static void method504(int arg0, int arg1, int arg2, int arg3) {
        for (class22 var4 = (class22) field586.method3442(); var4 != null; var4 = (class22) field586.method3444()) {
            if (var4.field584 != -1 || var4.field588 != null) {
                int var5 = 0;
                if (arg1 > var4.field581) {
                    var5 += arg1 - var4.field581;
                } else if (arg1 < var4.field589) {
                    var5 += var4.field589 - arg1;
                }
                if (arg2 > var4.field582) {
                    var5 += arg2 - var4.field582;
                } else if (arg2 < var4.field580) {
                    var5 += var4.field580 - arg2;
                }
                if (var5 - 64 > var4.field583 || client.field422 == 0 || var4.field579 != arg0) {
                    if (var4.field585 != null) {
                        Statics.field127.method985(var4.field585);
                        var4.field585 = null;
                    }
                    if (var4.field590 != null) {
                        Statics.field127.method985(var4.field590);
                        var4.field590 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field422 * (var4.field583 - var5) / var4.field583;
                    if (var4.field585 != null) {
                        var4.field585.method1211(var6);
                    } else if (var4.field584 >= 0) {
                        class54 var7 = class54.method1082(Statics.field1527, var4.field584, 0);
                        if (var7 != null) {
                            class58 var8 = var7.method1075().method1114(Statics.field548);
                            class60 var9 = class60.method1137(var8, 100, var6);
                            var9.method1140(-1);
                            Statics.field127.method1006(var9);
                            var4.field585 = var9;
                        }
                    }
                    if (var4.field590 != null) {
                        var4.field590.method1211(var6);
                        if (!var4.field590.method3534()) {
                            var4.field590 = null;
                        }
                    } else if (var4.field588 != null && (var4.field598 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field588.length);
                        class54 var11 = class54.method1082(Statics.field1527, var4.field588[var10], 0);
                        if (var11 != null) {
                            class58 var12 = var11.method1075().method1114(Statics.field548);
                            class60 var13 = class60.method1137(var12, 100, var6);
                            var13.method1140(0);
                            Statics.field127.method1006(var13);
                            var4.field590 = var13;
                            var4.field598 = var4.field595 + (int) (Math.random() * (double) (var4.field587 - var4.field595));
                        }
                    }
                }
            }
        }
    }
}
