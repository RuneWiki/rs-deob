package deob;

@ObfuscatedName("s")
public final class class24 extends class208 {

    @ObfuscatedName("s.k")
    public static class199 field595 = new class199();

    @ObfuscatedName("s.h")
    public int field602;

    @ObfuscatedName("s.o")
    public int field592;

    @ObfuscatedName("s.z")
    public int field594;

    @ObfuscatedName("s.c")
    public int field591;

    @ObfuscatedName("s.d")
    public int field601;

    @ObfuscatedName("s.l")
    public int field596;

    @ObfuscatedName("s.b")
    public int field597;

    @ObfuscatedName("s.j")
    public class65 field598;

    @ObfuscatedName("s.f")
    public int field599;

    @ObfuscatedName("s.i")
    public int field600;

    @ObfuscatedName("s.g")
    public int[] field593;

    @ObfuscatedName("s.t")
    public int field604;

    @ObfuscatedName("s.e")
    public class65 field603;

    @ObfuscatedName("s.q")
    public class41 field590;

    @ObfuscatedName("s.k(B)V")
    public void method547() {
        int var1 = this.field597;
        class41 var2 = this.field590.method754();
        if (var2 == null) {
            this.field597 = -1;
            this.field596 = 0;
            this.field599 = 0;
            this.field600 = 0;
            this.field593 = null;
        } else {
            this.field597 = var2.field941;
            this.field596 = var2.field942 * 128;
            this.field599 = var2.field943;
            this.field600 = var2.field944;
            this.field593 = var2.field945;
        }
        if (this.field597 != var1 && this.field598 != null) {
            Statics.field1419.method1085(this.field598);
            this.field598 = null;
        }
    }

    @ObfuscatedName("ed.h(IIIII)V")
    public static void method2828(int arg0, int arg1, int arg2, int arg3) {
        for (class24 var4 = (class24) field595.method3581(); var4 != null; var4 = (class24) field595.method3583()) {
            if (var4.field597 != -1 || var4.field593 != null) {
                int var5 = 0;
                if (arg1 > var4.field594) {
                    var5 += arg1 - var4.field594;
                } else if (arg1 < var4.field592) {
                    var5 += var4.field592 - arg1;
                }
                if (arg2 > var4.field601) {
                    var5 += arg2 - var4.field601;
                } else if (arg2 < var4.field591) {
                    var5 += var4.field591 - arg2;
                }
                if (var5 - 64 > var4.field596 || client.field285 == 0 || var4.field602 != arg0) {
                    if (var4.field598 != null) {
                        Statics.field1419.method1085(var4.field598);
                        var4.field598 = null;
                    }
                    if (var4.field603 != null) {
                        Statics.field1419.method1085(var4.field603);
                        var4.field603 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field285 * (var4.field596 - var5) / var4.field596;
                    if (var4.field598 != null) {
                        var4.field598.method1275(var6);
                    } else if (var4.field597 >= 0) {
                        class59 var7 = class59.method1184(Statics.field188, var4.field597, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1179().method1223(Statics.field132);
                            class65 var9 = class65.method1246(var8, 100, var6);
                            var9.method1249(-1);
                            Statics.field1419.method1084(var9);
                            var4.field598 = var9;
                        }
                    }
                    if (var4.field603 != null) {
                        var4.field603.method1275(var6);
                        if (!var4.field603.method3678()) {
                            var4.field603 = null;
                        }
                    } else if (var4.field593 != null && (var4.field604 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field593.length);
                        class59 var11 = class59.method1184(Statics.field188, var4.field593[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1179().method1223(Statics.field132);
                            class65 var13 = class65.method1246(var12, 100, var6);
                            var13.method1249(0);
                            Statics.field1419.method1084(var13);
                            var4.field603 = var13;
                            var4.field604 = var4.field599 + (int) (Math.random() * (double) (var4.field600 - var4.field599));
                        }
                    }
                }
            }
        }
    }
}
