package deob;

@ObfuscatedName("e")
public final class class7 extends class181 {

    @ObfuscatedName("e.i")
    public static class179 field95 = new class179();

    @ObfuscatedName("e.b")
    public int field89;

    @ObfuscatedName("e.r")
    public class33 field91;

    @ObfuscatedName("e.l")
    public int field102;

    @ObfuscatedName("e.s")
    public int field97;

    @ObfuscatedName("e.d")
    public int field88;

    @ObfuscatedName("e.e")
    public int field101;

    @ObfuscatedName("e.u")
    public int field93;

    @ObfuscatedName("e.q")
    public int field94;

    @ObfuscatedName("e.o")
    public int field90;

    @ObfuscatedName("e.v")
    public class46 field96;

    @ObfuscatedName("e.m")
    public int field92;

    @ObfuscatedName("e.x")
    public int[] field99;

    @ObfuscatedName("e.w")
    public int field100;

    @ObfuscatedName("e.p")
    public class46 field98;

    @ObfuscatedName("af.i(I)V")
    public static void method263() {
        for (class7 var0 = (class7) field95.method3339(); var0 != null; var0 = (class7) field95.method3353()) {
            if (var0.field96 != null) {
                Statics.field875.method1109(var0.field96);
                var0.field96 = null;
            }
            if (var0.field98 != null) {
                Statics.field875.method1109(var0.field98);
                var0.field98 = null;
            }
        }
        field95.method3333();
    }

    @ObfuscatedName("e.b(I)V")
    public void method43() {
        int var1 = this.field90;
        class33 var2 = this.field91.method662();
        if (var2 == null) {
            this.field90 = -1;
            this.field94 = 0;
            this.field97 = 0;
            this.field92 = 0;
            this.field99 = null;
        } else {
            this.field90 = var2.field858;
            this.field94 = var2.field824 * 128;
            this.field97 = var2.field836;
            this.field92 = var2.field866;
            this.field99 = var2.field862;
        }
        if (this.field90 != var1 && this.field96 != null) {
            Statics.field875.method1109(this.field96);
            this.field96 = null;
        }
    }

    @ObfuscatedName("bx.r(IIILay;II)V")
    public static void method1490(int arg0, int arg1, int arg2, class33 arg3, int arg4) {
        class7 var5 = new class7();
        var5.field89 = arg0;
        var5.field102 = arg1 * 128;
        var5.field88 = arg2 * 128;
        int var6 = arg3.field819;
        int var7 = arg3.field830;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field830;
            var7 = arg3.field819;
        }
        var5.field101 = (arg1 + var6) * 128;
        var5.field93 = (arg2 + var7) * 128;
        var5.field90 = arg3.field858;
        var5.field94 = arg3.field824 * 128;
        var5.field97 = arg3.field836;
        var5.field92 = arg3.field866;
        var5.field99 = arg3.field862;
        if (arg3.field855 != null) {
            var5.field91 = arg3;
            var5.method43();
        }
        field95.method3334(var5);
        if (var5.field99 != null) {
            var5.field100 = var5.field97 + (int) (Math.random() * (double) (var5.field92 - var5.field97));
        }
    }

    @ObfuscatedName("ae.l(IIIII)V")
    public static void method911(int arg0, int arg1, int arg2, int arg3) {
        for (class7 var4 = (class7) field95.method3339(); var4 != null; var4 = (class7) field95.method3353()) {
            if (var4.field90 != -1 || var4.field99 != null) {
                int var5 = 0;
                if (arg1 > var4.field101) {
                    var5 += arg1 - var4.field101;
                } else if (arg1 < var4.field102) {
                    var5 += var4.field102 - arg1;
                }
                if (arg2 > var4.field93) {
                    var5 += arg2 - var4.field93;
                } else if (arg2 < var4.field88) {
                    var5 += var4.field88 - arg2;
                }
                if (var5 - 64 > var4.field94 || client.field719 == 0 || var4.field89 != arg0) {
                    if (var4.field96 != null) {
                        Statics.field875.method1109(var4.field96);
                        var4.field96 = null;
                    }
                    if (var4.field98 != null) {
                        Statics.field875.method1109(var4.field98);
                        var4.field98 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field719 * (var4.field94 - var5) / var4.field94;
                    if (var4.field96 != null) {
                        var4.field96.method960(var6);
                    } else if (var4.field90 >= 0) {
                        class58 var7 = class58.method1261(Statics.field1037, var4.field90, 0);
                        if (var7 != null) {
                            class64 var8 = var7.method1256().method1313(Statics.field2118);
                            class46 var9 = class46.method957(var8, 100, var6);
                            var9.method1033(-1);
                            Statics.field875.method1120(var9);
                            var4.field96 = var9;
                        }
                    }
                    if (var4.field98 != null) {
                        var4.field98.method960(var6);
                        if (!var4.field98.method3364()) {
                            var4.field98 = null;
                        }
                    } else if (var4.field99 != null && (var4.field100 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field99.length);
                        class58 var11 = class58.method1261(Statics.field1037, var4.field99[var10], 0);
                        if (var11 != null) {
                            class64 var12 = var11.method1256().method1313(Statics.field2118);
                            class46 var13 = class46.method957(var12, 100, var6);
                            var13.method1033(0);
                            Statics.field875.method1120(var13);
                            var4.field98 = var13;
                            var4.field100 = var4.field97 + (int) (Math.random() * (double) (var4.field92 - var4.field97));
                        }
                    }
                }
            }
        }
    }
}
