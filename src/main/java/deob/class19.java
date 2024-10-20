package deob;

@ObfuscatedName("q")
public final class class19 extends class176 {

    @ObfuscatedName("q.z")
    public int field555;

    @ObfuscatedName("q.n")
    public static class171 field557 = new class171();

    @ObfuscatedName("q.u")
    public int field552;

    @ObfuscatedName("q.t")
    public int field553;

    @ObfuscatedName("q.e")
    public int field554;

    @ObfuscatedName("q.a")
    public int field569;

    @ObfuscatedName("q.l")
    public int field565;

    @ObfuscatedName("q.v")
    public int field558;

    @ObfuscatedName("q.j")
    public class55 field568;

    @ObfuscatedName("q.k")
    public int field560;

    @ObfuscatedName("q.g")
    public int field561;

    @ObfuscatedName("q.d")
    public int[] field562;

    @ObfuscatedName("q.b")
    public int field556;

    @ObfuscatedName("q.i")
    public class55 field564;

    @ObfuscatedName("q.o")
    public class33 field559;

    @ObfuscatedName("eg.z(I)V")
    public static void method2718() {
        for (class19 var0 = (class19) field557.method3236(); var0 != null; var0 = (class19) field557.method3228()) {
            if (var0.field568 != null) {
                Statics.field531.method951(var0.field568);
                var0.field568 = null;
            }
            if (var0.field564 != null) {
                Statics.field531.method951(var0.field564);
                var0.field564 = null;
            }
        }
        field557.method3220();
    }

    @ObfuscatedName("q.n(I)V")
    public void method519() {
        int var1 = this.field558;
        class33 var2 = this.field559.method676();
        if (var2 == null) {
            this.field558 = -1;
            this.field565 = 0;
            this.field560 = 0;
            this.field561 = 0;
            this.field562 = null;
        } else {
            this.field558 = var2.field857;
            this.field565 = var2.field834 * 128;
            this.field560 = var2.field859;
            this.field561 = var2.field844;
            this.field562 = var2.field837;
        }
        if (this.field558 != var1 && this.field568 != null) {
            Statics.field531.method951(this.field568);
            this.field568 = null;
        }
    }

    @ObfuscatedName("co.u(IIIIB)V")
    public static void method1786(int arg0, int arg1, int arg2, int arg3) {
        for (class19 var4 = (class19) field557.method3236(); var4 != null; var4 = (class19) field557.method3228()) {
            if (var4.field558 != -1 || var4.field562 != null) {
                int var5 = 0;
                if (arg1 > var4.field555) {
                    var5 += arg1 - var4.field555;
                } else if (arg1 < var4.field553) {
                    var5 += var4.field553 - arg1;
                }
                if (arg2 > var4.field569) {
                    var5 += arg2 - var4.field569;
                } else if (arg2 < var4.field554) {
                    var5 += var4.field554 - arg2;
                }
                if (var5 - 64 > var4.field565 || client.field505 == 0 || var4.field552 != arg0) {
                    if (var4.field568 != null) {
                        Statics.field531.method951(var4.field568);
                        var4.field568 = null;
                    }
                    if (var4.field564 != null) {
                        Statics.field531.method951(var4.field564);
                        var4.field564 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field505 * (var4.field565 - var5) / var4.field565;
                    if (var4.field568 != null) {
                        var4.field568.method1103(var6);
                    } else if (var4.field558 >= 0) {
                        class49 var7 = class49.method1040(Statics.field2089, var4.field558, 0);
                        if (var7 != null) {
                            class53 var8 = var7.method1036().method1077(Statics.field899);
                            class55 var9 = class55.method1099(var8, 100, var6);
                            var9.method1135(-1);
                            Statics.field531.method967(var9);
                            var4.field568 = var9;
                        }
                    }
                    if (var4.field564 != null) {
                        var4.field564.method1103(var6);
                        if (!var4.field564.method3289()) {
                            var4.field564 = null;
                        }
                    } else if (var4.field562 != null && (var4.field556 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field562.length);
                        class49 var11 = class49.method1040(Statics.field2089, var4.field562[var10], 0);
                        if (var11 != null) {
                            class53 var12 = var11.method1036().method1077(Statics.field899);
                            class55 var13 = class55.method1099(var12, 100, var6);
                            var13.method1135(0);
                            Statics.field531.method967(var13);
                            var4.field564 = var13;
                            var4.field556 = var4.field560 + (int) (Math.random() * (double) (var4.field561 - var4.field560));
                        }
                    }
                }
            }
        }
    }
}
