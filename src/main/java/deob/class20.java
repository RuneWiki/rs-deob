package deob;

@ObfuscatedName("v")
public final class class20 extends class186 {

    @ObfuscatedName("v.k")
    public static class177 field550 = new class177();

    @ObfuscatedName("v.b")
    public int field543;

    @ObfuscatedName("v.e")
    public int field544;

    @ObfuscatedName("v.i")
    public int field545;

    @ObfuscatedName("v.t")
    public int field554;

    @ObfuscatedName("v.z")
    public int field547;

    @ObfuscatedName("v.g")
    public int field548;

    @ObfuscatedName("v.c")
    public int field546;

    @ObfuscatedName("v.o")
    public class58 field559;

    @ObfuscatedName("v.q")
    public int field551;

    @ObfuscatedName("v.w")
    public int field552;

    @ObfuscatedName("v.y")
    public int[] field553;

    @ObfuscatedName("v.p")
    public int field555;

    @ObfuscatedName("v.m")
    public class58 field557;

    @ObfuscatedName("v.a")
    public class36 field556;

    @ObfuscatedName("cm.k(I)V")
    public static void method1959() {
        for (class20 var0 = (class20) field550.method3228(); var0 != null; var0 = (class20) field550.method3254()) {
            if (var0.field559 != null) {
                Statics.field571.method944(var0.field559);
                var0.field559 = null;
            }
            if (var0.field557 != null) {
                Statics.field571.method944(var0.field557);
                var0.field557 = null;
            }
        }
        field550.method3245();
    }

    @ObfuscatedName("cd.b(B)V")
    public static void method1773() {
        for (class20 var0 = (class20) field550.method3228(); var0 != null; var0 = (class20) field550.method3254()) {
            if (var0.field556 != null) {
                var0.method474();
            }
        }
    }

    @ObfuscatedName("v.e(I)V")
    public void method474() {
        int var1 = this.field546;
        class36 var2 = this.field556.method648();
        if (var2 == null) {
            this.field546 = -1;
            this.field548 = 0;
            this.field551 = 0;
            this.field552 = 0;
            this.field553 = null;
        } else {
            this.field546 = var2.field866;
            this.field548 = var2.field877 * 128;
            this.field551 = var2.field878;
            this.field552 = var2.field879;
            this.field553 = var2.field846;
        }
        if (this.field546 != var1 && this.field559 != null) {
            Statics.field571.method944(this.field559);
            this.field559 = null;
        }
    }

    @ObfuscatedName("ci.i(IIIII)V")
    public static void method2066(int arg0, int arg1, int arg2, int arg3) {
        for (class20 var4 = (class20) field550.method3228(); var4 != null; var4 = (class20) field550.method3254()) {
            if (var4.field546 != -1 || var4.field553 != null) {
                int var5 = 0;
                if (arg1 > var4.field554) {
                    var5 += arg1 - var4.field554;
                } else if (arg1 < var4.field544) {
                    var5 += var4.field544 - arg1;
                }
                if (arg2 > var4.field547) {
                    var5 += arg2 - var4.field547;
                } else if (arg2 < var4.field545) {
                    var5 += var4.field545 - arg2;
                }
                if (var5 - 64 > var4.field548 || client.field494 == 0 || var4.field543 != arg0) {
                    if (var4.field559 != null) {
                        Statics.field571.method944(var4.field559);
                        var4.field559 = null;
                    }
                    if (var4.field557 != null) {
                        Statics.field571.method944(var4.field557);
                        var4.field557 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field494 * (var4.field548 - var5) / var4.field548;
                    if (var4.field559 != null) {
                        var4.field559.method1203(var6);
                    } else if (var4.field546 >= 0) {
                        class52 var7 = class52.method1047(Statics.field2766, var4.field546, 0);
                        if (var7 != null) {
                            class56 var8 = var7.method1037().method1072(Statics.field57);
                            class58 var9 = class58.method1190(var8, 100, var6);
                            var9.method1097(-1);
                            Statics.field571.method958(var9);
                            var4.field559 = var9;
                        }
                    }
                    if (var4.field557 != null) {
                        var4.field557.method1203(var6);
                        if (!var4.field557.method3323()) {
                            var4.field557 = null;
                        }
                    } else if (var4.field553 != null && (var4.field555 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field553.length);
                        class52 var11 = class52.method1047(Statics.field2766, var4.field553[var10], 0);
                        if (var11 != null) {
                            class56 var12 = var11.method1037().method1072(Statics.field57);
                            class58 var13 = class58.method1190(var12, 100, var6);
                            var13.method1097(0);
                            Statics.field571.method958(var13);
                            var4.field557 = var13;
                            var4.field555 = var4.field551 + (int) (Math.random() * (double) (var4.field552 - var4.field551));
                        }
                    }
                }
            }
        }
    }
}
