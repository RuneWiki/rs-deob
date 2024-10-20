package deob;

@ObfuscatedName("j")
public final class class22 extends class199 {

    @ObfuscatedName("j.n")
    public static class190 field585 = new class190();

    @ObfuscatedName("j.o")
    public int field593;

    @ObfuscatedName("j.a")
    public int field583;

    @ObfuscatedName("j.w")
    public int field584;

    @ObfuscatedName("j.m")
    public int field598;

    @ObfuscatedName("j.h")
    public int field586;

    @ObfuscatedName("j.i")
    public int field587;

    @ObfuscatedName("j.r")
    public class38 field581;

    @ObfuscatedName("j.l")
    public int field588;

    @ObfuscatedName("j.f")
    public class60 field589;

    @ObfuscatedName("j.e")
    public int field590;

    @ObfuscatedName("j.z")
    public int field591;

    @ObfuscatedName("j.v")
    public int[] field595;

    @ObfuscatedName("j.x")
    public int field582;

    @ObfuscatedName("j.q")
    public class60 field594;

    @ObfuscatedName("bi.n(I)V")
    public static void method1418() {
        for (class22 var0 = (class22) field585.method3451(); var0 != null; var0 = (class22) field585.method3448()) {
            if (var0.field589 != null) {
                Statics.field189.method1032(var0.field589);
                var0.field589 = null;
            }
            if (var0.field594 != null) {
                Statics.field189.method1032(var0.field594);
                var0.field594 = null;
            }
        }
        field585.method3440();
    }

    @ObfuscatedName("j.o(B)V")
    public void method512() {
        int var1 = this.field588;
        class38 var2 = this.field581.method696();
        if (var2 == null) {
            this.field588 = -1;
            this.field587 = 0;
            this.field590 = 0;
            this.field591 = 0;
            this.field595 = null;
        } else {
            this.field588 = var2.field932;
            this.field587 = var2.field933 * 128;
            this.field590 = var2.field934;
            this.field591 = var2.field920;
            this.field595 = var2.field936;
        }
        if (this.field588 != var1 && this.field589 != null) {
            Statics.field189.method1032(this.field589);
            this.field589 = null;
        }
    }

    @ObfuscatedName("e.a(IIILar;II)V")
    public static void method131(int arg0, int arg1, int arg2, class38 arg3, int arg4) {
        class22 var5 = new class22();
        var5.field593 = arg0;
        var5.field583 = arg1 * 128;
        var5.field584 = arg2 * 128;
        int var6 = arg3.field907;
        int var7 = arg3.field904;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field904;
            var7 = arg3.field907;
        }
        var5.field598 = (arg1 + var6) * 128;
        var5.field586 = (arg2 + var7) * 128;
        var5.field588 = arg3.field932;
        var5.field587 = arg3.field933 * 128;
        var5.field590 = arg3.field934;
        var5.field591 = arg3.field920;
        var5.field595 = arg3.field936;
        if (arg3.field929 != null) {
            var5.field581 = arg3;
            var5.method512();
        }
        field585.method3441(var5);
        if (var5.field595 != null) {
            var5.field582 = var5.field590 + (int) (Math.random() * (double) (var5.field591 - var5.field590));
        }
    }

    @ObfuscatedName("t.w(IIIIB)V")
    public static void method162(int arg0, int arg1, int arg2, int arg3) {
        for (class22 var4 = (class22) field585.method3451(); var4 != null; var4 = (class22) field585.method3448()) {
            if (var4.field588 != -1 || var4.field595 != null) {
                int var5 = 0;
                if (arg1 > var4.field598) {
                    var5 += arg1 - var4.field598;
                } else if (arg1 < var4.field583) {
                    var5 += var4.field583 - arg1;
                }
                if (arg2 > var4.field586) {
                    var5 += arg2 - var4.field586;
                } else if (arg2 < var4.field584) {
                    var5 += var4.field584 - arg2;
                }
                if (var5 - 64 > var4.field587 || client.field518 == 0 || var4.field593 != arg0) {
                    if (var4.field589 != null) {
                        Statics.field189.method1032(var4.field589);
                        var4.field589 = null;
                    }
                    if (var4.field594 != null) {
                        Statics.field189.method1032(var4.field594);
                        var4.field594 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field518 * (var4.field587 - var5) / var4.field587;
                    if (var4.field589 != null) {
                        var4.field589.method1192(var6);
                    } else if (var4.field588 >= 0) {
                        class54 var7 = class54.method1125(Statics.field544, var4.field588, 0);
                        if (var7 != null) {
                            class58 var8 = var7.method1123().method1158(Statics.field2547);
                            class60 var9 = class60.method1280(var8, 100, var6);
                            var9.method1191(-1);
                            Statics.field189.method1031(var9);
                            var4.field589 = var9;
                        }
                    }
                    if (var4.field594 != null) {
                        var4.field594.method1192(var6);
                        if (!var4.field594.method3541()) {
                            var4.field594 = null;
                        }
                    } else if (var4.field595 != null && (var4.field582 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field595.length);
                        class54 var11 = class54.method1125(Statics.field544, var4.field595[var10], 0);
                        if (var11 != null) {
                            class58 var12 = var11.method1123().method1158(Statics.field2547);
                            class60 var13 = class60.method1280(var12, 100, var6);
                            var13.method1191(0);
                            Statics.field189.method1031(var13);
                            var4.field594 = var13;
                            var4.field582 = var4.field590 + (int) (Math.random() * (double) (var4.field591 - var4.field590));
                        }
                    }
                }
            }
        }
    }
}
