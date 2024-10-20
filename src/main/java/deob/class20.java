package deob;

@ObfuscatedName("m")
public final class class20 extends class184 {

    @ObfuscatedName("m.j")
    public static class177 field560 = new class177();

    @ObfuscatedName("m.z")
    public int field564;

    @ObfuscatedName("m.y")
    public int field554;

    @ObfuscatedName("m.h")
    public int field552;

    @ObfuscatedName("m.r")
    public class36 field565;

    @ObfuscatedName("m.e")
    public int field553;

    @ObfuscatedName("m.k")
    public int field555;

    @ObfuscatedName("m.b")
    public int field556;

    @ObfuscatedName("m.n")
    public int field551;

    @ObfuscatedName("m.a")
    public class58 field558;

    @ObfuscatedName("m.q")
    public int field567;

    @ObfuscatedName("m.i")
    public int field557;

    @ObfuscatedName("m.f")
    public int[] field561;

    @ObfuscatedName("m.o")
    public int field562;

    @ObfuscatedName("m.t")
    public class58 field563;

    @ObfuscatedName("di.j(B)V")
    public static void method2601() {
        for (class20 var0 = (class20) field560.method3236(); var0 != null; var0 = (class20) field560.method3243()) {
            if (var0.field565 != null) {
                var0.method452();
            }
        }
    }

    @ObfuscatedName("m.z(I)V")
    public void method452() {
        int var1 = this.field551;
        class36 var2 = this.field565.method626();
        if (var2 == null) {
            this.field551 = -1;
            this.field556 = 0;
            this.field567 = 0;
            this.field557 = 0;
            this.field561 = null;
        } else {
            this.field551 = var2.field883;
            this.field556 = var2.field884 * 128;
            this.field567 = var2.field885;
            this.field557 = var2.field886;
            this.field561 = var2.field887;
        }
        if (this.field551 != var1 && this.field558 != null) {
            Statics.field144.method948(this.field558);
            this.field558 = null;
        }
    }

    @ObfuscatedName("az.y(IIIIB)V")
    public static void method824(int arg0, int arg1, int arg2, int arg3) {
        for (class20 var4 = (class20) field560.method3236(); var4 != null; var4 = (class20) field560.method3243()) {
            if (var4.field551 != -1 || var4.field561 != null) {
                int var5 = 0;
                if (arg1 > var4.field564) {
                    var5 += arg1 - var4.field564;
                } else if (arg1 < var4.field552) {
                    var5 += var4.field552 - arg1;
                }
                if (arg2 > var4.field555) {
                    var5 += arg2 - var4.field555;
                } else if (arg2 < var4.field553) {
                    var5 += var4.field553 - arg2;
                }
                if (var5 - 64 > var4.field556 || client.field501 == 0 || var4.field554 != arg0) {
                    if (var4.field558 != null) {
                        Statics.field144.method948(var4.field558);
                        var4.field558 = null;
                    }
                    if (var4.field563 != null) {
                        Statics.field144.method948(var4.field563);
                        var4.field563 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field501 * (var4.field556 - var5) / var4.field556;
                    if (var4.field558 != null) {
                        var4.field558.method1092(var6);
                    } else if (var4.field551 >= 0) {
                        class52 var7 = class52.method1022(Statics.field71, var4.field551, 0);
                        if (var7 != null) {
                            class56 var8 = var7.method1026().method1065(Statics.field2027);
                            class58 var9 = class58.method1088(var8, 100, var6);
                            var9.method1091(-1);
                            Statics.field144.method957(var9);
                            var4.field558 = var9;
                        }
                    }
                    if (var4.field563 != null) {
                        var4.field563.method1092(var6);
                        if (!var4.field563.method3310()) {
                            var4.field563 = null;
                        }
                    } else if (var4.field561 != null && (var4.field562 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field561.length);
                        class52 var11 = class52.method1022(Statics.field71, var4.field561[var10], 0);
                        if (var11 != null) {
                            class56 var12 = var11.method1026().method1065(Statics.field2027);
                            class58 var13 = class58.method1088(var12, 100, var6);
                            var13.method1091(0);
                            Statics.field144.method957(var13);
                            var4.field563 = var13;
                            var4.field562 = var4.field567 + (int) (Math.random() * (double) (var4.field557 - var4.field567));
                        }
                    }
                }
            }
        }
    }
}
