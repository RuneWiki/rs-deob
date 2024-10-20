package deob;

@ObfuscatedName("l")
public final class class24 extends class208 {

    @ObfuscatedName("l.n")
    public static class199 field598 = new class199();

    @ObfuscatedName("l.d")
    public int field583;

    @ObfuscatedName("l.s")
    public int field591;

    @ObfuscatedName("l.q")
    public int field584;

    @ObfuscatedName("l.j")
    public int field585;

    @ObfuscatedName("l.k")
    public int field586;

    @ObfuscatedName("l.i")
    public int field587;

    @ObfuscatedName("l.m")
    public int field588;

    @ObfuscatedName("l.p")
    public int field582;

    @ObfuscatedName("l.h")
    public class65 field590;

    @ObfuscatedName("l.e")
    public int field592;

    @ObfuscatedName("l.g")
    public int[] field593;

    @ObfuscatedName("l.b")
    public int field594;

    @ObfuscatedName("l.f")
    public class65 field595;

    @ObfuscatedName("l.y")
    public class41 field596;

    @ObfuscatedName("bc.n(I)V")
    public static void method1548() {
        for (class24 var0 = (class24) field598.method3574(); var0 != null; var0 = (class24) field598.method3568()) {
            if (var0.field590 != null) {
                Statics.field199.method1098(var0.field590);
                var0.field590 = null;
            }
            if (var0.field595 != null) {
                Statics.field199.method1098(var0.field595);
                var0.field595 = null;
            }
        }
        field598.method3546();
    }

    @ObfuscatedName("l.d(I)V")
    public void method578() {
        int var1 = this.field582;
        class41 var2 = this.field596.method777();
        if (var2 == null) {
            this.field582 = -1;
            this.field588 = 0;
            this.field591 = 0;
            this.field592 = 0;
            this.field593 = null;
        } else {
            this.field582 = var2.field943;
            this.field588 = var2.field944 * 128;
            this.field591 = var2.field945;
            this.field592 = var2.field940;
            this.field593 = var2.field905;
        }
        if (this.field582 != var1 && this.field590 != null) {
            Statics.field199.method1098(this.field590);
            this.field590 = null;
        }
    }

    @ObfuscatedName("hf.s(IIIII)V")
    public static void method3701(int arg0, int arg1, int arg2, int arg3) {
        for (class24 var4 = (class24) field598.method3574(); var4 != null; var4 = (class24) field598.method3568()) {
            if (var4.field582 != -1 || var4.field593 != null) {
                int var5 = 0;
                if (arg1 > var4.field586) {
                    var5 += arg1 - var4.field586;
                } else if (arg1 < var4.field584) {
                    var5 += var4.field584 - arg1;
                }
                if (arg2 > var4.field587) {
                    var5 += arg2 - var4.field587;
                } else if (arg2 < var4.field585) {
                    var5 += var4.field585 - arg2;
                }
                if (var5 - 64 > var4.field588 || client.field337 == 0 || var4.field583 != arg0) {
                    if (var4.field590 != null) {
                        Statics.field199.method1098(var4.field590);
                        var4.field590 = null;
                    }
                    if (var4.field595 != null) {
                        Statics.field199.method1098(var4.field595);
                        var4.field595 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field337 * (var4.field588 - var5) / var4.field588;
                    if (var4.field590 != null) {
                        var4.field590.method1310(var6);
                    } else if (var4.field582 >= 0) {
                        class59 var7 = class59.method1178(Statics.field441, var4.field582, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1180().method1216(Statics.field123);
                            class65 var9 = class65.method1288(var8, 100, var6);
                            var9.method1244(-1);
                            Statics.field199.method1099(var9);
                            var4.field590 = var9;
                        }
                    }
                    if (var4.field595 != null) {
                        var4.field595.method1310(var6);
                        if (!var4.field595.method3652()) {
                            var4.field595 = null;
                        }
                    } else if (var4.field593 != null && (var4.field594 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field593.length);
                        class59 var11 = class59.method1178(Statics.field441, var4.field593[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1180().method1216(Statics.field123);
                            class65 var13 = class65.method1288(var12, 100, var6);
                            var13.method1244(0);
                            Statics.field199.method1099(var13);
                            var4.field595 = var13;
                            var4.field594 = var4.field591 + (int) (Math.random() * (double) (var4.field592 - var4.field591));
                        }
                    }
                }
            }
        }
    }
}
