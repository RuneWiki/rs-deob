package deob;

@ObfuscatedName("w")
public final class class24 extends class208 {

    @ObfuscatedName("w.m")
    public static class199 field575 = new class199();

    @ObfuscatedName("w.l")
    public int field572;

    @ObfuscatedName("w.y")
    public int field573;

    @ObfuscatedName("w.u")
    public int field589;

    @ObfuscatedName("w.k")
    public int field590;

    @ObfuscatedName("w.j")
    public int field576;

    @ObfuscatedName("w.i")
    public int field571;

    @ObfuscatedName("w.x")
    public int field574;

    @ObfuscatedName("w.g")
    public class65 field579;

    @ObfuscatedName("w.e")
    public int field580;

    @ObfuscatedName("w.p")
    public int field581;

    @ObfuscatedName("w.a")
    public int[] field582;

    @ObfuscatedName("w.v")
    public int field583;

    @ObfuscatedName("w.c")
    public class65 field584;

    @ObfuscatedName("w.s")
    public class41 field585;

    @ObfuscatedName("ax.m(I)V")
    public static void method967() {
        for (class24 var0 = (class24) field575.method3611(); var0 != null; var0 = (class24) field575.method3613()) {
            if (var0.field585 != null) {
                var0.method605();
            }
        }
    }

    @ObfuscatedName("w.l(B)V")
    public void method605() {
        int var1 = this.field574;
        class41 var2 = this.field585.method832();
        if (var2 == null) {
            this.field574 = -1;
            this.field571 = 0;
            this.field580 = 0;
            this.field581 = 0;
            this.field582 = null;
        } else {
            this.field574 = var2.field914;
            this.field571 = var2.field897 * 128;
            this.field580 = var2.field928;
            this.field581 = var2.field929;
            this.field582 = var2.field905;
        }
        if (this.field574 != var1 && this.field579 != null) {
            Statics.field1822.method1151(this.field579);
            this.field579 = null;
        }
    }

    @ObfuscatedName("ac.y(IIILaz;II)V")
    public static void method679(int arg0, int arg1, int arg2, class41 arg3, int arg4) {
        class24 var5 = new class24();
        var5.field572 = arg0;
        var5.field573 = arg1 * 128;
        var5.field589 = arg2 * 128;
        int var6 = arg3.field930;
        int var7 = arg3.field898;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field898;
            var7 = arg3.field930;
        }
        var5.field590 = (arg1 + var6) * 128;
        var5.field576 = (arg2 + var7) * 128;
        var5.field574 = arg3.field914;
        var5.field571 = arg3.field897 * 128;
        var5.field580 = arg3.field928;
        var5.field581 = arg3.field929;
        var5.field582 = arg3.field905;
        if (arg3.field923 != null) {
            var5.field585 = arg3;
            var5.method605();
        }
        field575.method3606(var5);
        if (var5.field582 != null) {
            var5.field583 = var5.field580 + (int) (Math.random() * (double) (var5.field581 - var5.field580));
        }
    }

    @ObfuscatedName("de.u(IIIII)V")
    public static void method2667(int arg0, int arg1, int arg2, int arg3) {
        for (class24 var4 = (class24) field575.method3611(); var4 != null; var4 = (class24) field575.method3613()) {
            if (var4.field574 != -1 || var4.field582 != null) {
                int var5 = 0;
                if (arg1 > var4.field590) {
                    var5 += arg1 - var4.field590;
                } else if (arg1 < var4.field573) {
                    var5 += var4.field573 - arg1;
                }
                if (arg2 > var4.field576) {
                    var5 += arg2 - var4.field576;
                } else if (arg2 < var4.field589) {
                    var5 += var4.field589 - arg2;
                }
                if (var5 - 64 > var4.field571 || client.field498 == 0 || var4.field572 != arg0) {
                    if (var4.field579 != null) {
                        Statics.field1822.method1151(var4.field579);
                        var4.field579 = null;
                    }
                    if (var4.field584 != null) {
                        Statics.field1822.method1151(var4.field584);
                        var4.field584 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field498 * (var4.field571 - var5) / var4.field571;
                    if (var4.field579 != null) {
                        var4.field579.method1360(var6);
                    } else if (var4.field574 >= 0) {
                        class59 var7 = class59.method1243(Statics.field732, var4.field574, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1244().method1286(Statics.field2110);
                            class65 var9 = class65.method1304(var8, 100, var6);
                            var9.method1344(-1);
                            Statics.field1822.method1150(var9);
                            var4.field579 = var9;
                        }
                    }
                    if (var4.field584 != null) {
                        var4.field584.method1360(var6);
                        if (!var4.field584.method3706()) {
                            var4.field584 = null;
                        }
                    } else if (var4.field582 != null && (var4.field583 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field582.length);
                        class59 var11 = class59.method1243(Statics.field732, var4.field582[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1244().method1286(Statics.field2110);
                            class65 var13 = class65.method1304(var12, 100, var6);
                            var13.method1344(0);
                            Statics.field1822.method1150(var13);
                            var4.field584 = var13;
                            var4.field583 = var4.field580 + (int) (Math.random() * (double) (var4.field581 - var4.field580));
                        }
                    }
                }
            }
        }
    }
}
