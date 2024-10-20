package deob;

@ObfuscatedName("p")
public final class class22 extends class199 {

    @ObfuscatedName("p.y")
    public static class190 field585 = new class190();

    @ObfuscatedName("p.k")
    public int field590;

    @ObfuscatedName("p.g")
    public int field588;

    @ObfuscatedName("p.n")
    public int field580;

    @ObfuscatedName("p.t")
    public int field584;

    @ObfuscatedName("p.e")
    public int field592;

    @ObfuscatedName("p.q")
    public int field586;

    @ObfuscatedName("p.z")
    public int field587;

    @ObfuscatedName("p.v")
    public class60 field582;

    @ObfuscatedName("p.b")
    public int field589;

    @ObfuscatedName("p.f")
    public int field581;

    @ObfuscatedName("p.i")
    public int[] field591;

    @ObfuscatedName("p.w")
    public int field583;

    @ObfuscatedName("p.l")
    public class60 field593;

    @ObfuscatedName("p.j")
    public class38 field594;

    @ObfuscatedName("at.y(I)V")
    public static void method656() {
        for (class22 var0 = (class22) field585.method3396(); var0 != null; var0 = (class22) field585.method3398()) {
            if (var0.field582 != null) {
                Statics.field928.method1035(var0.field582);
                var0.field582 = null;
            }
            if (var0.field593 != null) {
                Statics.field928.method1035(var0.field593);
                var0.field593 = null;
            }
        }
        field585.method3406();
    }

    @ObfuscatedName("p.k(I)V")
    public void method515() {
        int var1 = this.field587;
        class38 var2 = this.field594.method717();
        if (var2 == null) {
            this.field587 = -1;
            this.field586 = 0;
            this.field589 = 0;
            this.field581 = 0;
            this.field591 = null;
        } else {
            this.field587 = var2.field915;
            this.field586 = var2.field916 * 128;
            this.field589 = var2.field884;
            this.field581 = var2.field888;
            this.field591 = var2.field871;
        }
        if (this.field587 != var1 && this.field582 != null) {
            Statics.field928.method1035(this.field582);
            this.field582 = null;
        }
    }

    @ObfuscatedName("ac.g(IIILao;IB)V")
    public static void method882(int arg0, int arg1, int arg2, class38 arg3, int arg4) {
        class22 var5 = new class22();
        var5.field590 = arg0;
        var5.field588 = arg1 * 128;
        var5.field580 = arg2 * 128;
        int var6 = arg3.field886;
        int var7 = arg3.field887;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field887;
            var7 = arg3.field886;
        }
        var5.field584 = (arg1 + var6) * 128;
        var5.field592 = (arg2 + var7) * 128;
        var5.field587 = arg3.field915;
        var5.field586 = arg3.field916 * 128;
        var5.field589 = arg3.field884;
        var5.field581 = arg3.field888;
        var5.field591 = arg3.field871;
        if (arg3.field894 != null) {
            var5.field594 = arg3;
            var5.method515();
        }
        field585.method3391(var5);
        if (var5.field591 != null) {
            var5.field583 = var5.field589 + (int) (Math.random() * (double) (var5.field581 - var5.field589));
        }
    }

    @ObfuscatedName("gt.n(IIIII)V")
    public static void method3529(int arg0, int arg1, int arg2, int arg3) {
        for (class22 var4 = (class22) field585.method3396(); var4 != null; var4 = (class22) field585.method3398()) {
            if (var4.field587 != -1 || var4.field591 != null) {
                int var5 = 0;
                if (arg1 > var4.field584) {
                    var5 += arg1 - var4.field584;
                } else if (arg1 < var4.field588) {
                    var5 += var4.field588 - arg1;
                }
                if (arg2 > var4.field592) {
                    var5 += arg2 - var4.field592;
                } else if (arg2 < var4.field580) {
                    var5 += var4.field580 - arg2;
                }
                if (var5 - 64 > var4.field586 || client.field290 == 0 || var4.field590 != arg0) {
                    if (var4.field582 != null) {
                        Statics.field928.method1035(var4.field582);
                        var4.field582 = null;
                    }
                    if (var4.field593 != null) {
                        Statics.field928.method1035(var4.field593);
                        var4.field593 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field290 * (var4.field586 - var5) / var4.field586;
                    if (var4.field582 != null) {
                        var4.field582.method1205(var6);
                    } else if (var4.field587 >= 0) {
                        class54 var7 = class54.method1101(Statics.field1548, var4.field587, 0);
                        if (var7 != null) {
                            class58 var8 = var7.method1102().method1135(Statics.field204);
                            class60 var9 = class60.method1159(var8, 100, var6);
                            var9.method1199(-1);
                            Statics.field928.method1045(var9);
                            var4.field582 = var9;
                        }
                    }
                    if (var4.field593 != null) {
                        var4.field593.method1205(var6);
                        if (!var4.field593.method3486()) {
                            var4.field593 = null;
                        }
                    } else if (var4.field591 != null && (var4.field583 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field591.length);
                        class54 var11 = class54.method1101(Statics.field1548, var4.field591[var10], 0);
                        if (var11 != null) {
                            class58 var12 = var11.method1102().method1135(Statics.field204);
                            class60 var13 = class60.method1159(var12, 100, var6);
                            var13.method1199(0);
                            Statics.field928.method1045(var13);
                            var4.field593 = var13;
                            var4.field583 = var4.field589 + (int) (Math.random() * (double) (var4.field581 - var4.field589));
                        }
                    }
                }
            }
        }
    }
}
