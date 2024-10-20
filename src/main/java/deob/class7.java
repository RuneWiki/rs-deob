package deob;

@ObfuscatedName("p")
public final class class7 extends class179 {

    @ObfuscatedName("p.t")
    public static class177 field117 = new class177();

    @ObfuscatedName("p.l")
    public int field104;

    @ObfuscatedName("p.c")
    public int field105;

    @ObfuscatedName("p.d")
    public int field106;

    @ObfuscatedName("p.b")
    public int field122;

    @ObfuscatedName("p.i")
    public int field108;

    @ObfuscatedName("p.p")
    public int field109;

    @ObfuscatedName("p.y")
    public int field103;

    @ObfuscatedName("p.u")
    public class45 field110;

    @ObfuscatedName("p.z")
    public int field112;

    @ObfuscatedName("p.j")
    public int field113;

    @ObfuscatedName("p.h")
    public int[] field114;

    @ObfuscatedName("p.x")
    public int field121;

    @ObfuscatedName("p.q")
    public class45 field116;

    @ObfuscatedName("p.w")
    public class32 field115;

    @ObfuscatedName("bg.t(B)V")
    public static void method1529() {
        for (class7 var0 = (class7) field117.method3345(); var0 != null; var0 = (class7) field117.method3324()) {
            if (var0.field110 != null) {
                Statics.field97.method1137(var0.field110);
                var0.field110 = null;
            }
            if (var0.field116 != null) {
                Statics.field97.method1137(var0.field116);
                var0.field116 = null;
            }
        }
        field117.method3316();
    }

    @ObfuscatedName("p.l(I)V")
    public void method63() {
        int var1 = this.field103;
        class32 var2 = this.field115.method667();
        if (var2 == null) {
            this.field103 = -1;
            this.field109 = 0;
            this.field112 = 0;
            this.field113 = 0;
            this.field114 = null;
        } else {
            this.field103 = var2.field878;
            this.field109 = var2.field871 * 128;
            this.field112 = var2.field879;
            this.field113 = var2.field881;
            this.field114 = var2.field855;
        }
        if (this.field103 != var1 && this.field110 != null) {
            Statics.field97.method1137(this.field110);
            this.field110 = null;
        }
    }

    @ObfuscatedName("m.c(IIILaq;IB)V")
    public static void method228(int arg0, int arg1, int arg2, class32 arg3, int arg4) {
        class7 var5 = new class7();
        var5.field104 = arg0;
        var5.field105 = arg1 * 128;
        var5.field106 = arg2 * 128;
        int var6 = arg3.field847;
        int var7 = arg3.field849;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field849;
            var7 = arg3.field847;
        }
        var5.field122 = (arg1 + var6) * 128;
        var5.field108 = (arg2 + var7) * 128;
        var5.field103 = arg3.field878;
        var5.field109 = arg3.field871 * 128;
        var5.field112 = arg3.field879;
        var5.field113 = arg3.field881;
        var5.field114 = arg3.field855;
        if (arg3.field875 != null) {
            var5.field115 = arg3;
            var5.method63();
        }
        field117.method3317(var5);
        if (var5.field114 != null) {
            var5.field121 = var5.field112 + (int) (Math.random() * (double) (var5.field113 - var5.field112));
        }
    }

    @ObfuscatedName("ee.d(IIIIB)V")
    public static void method2833(int arg0, int arg1, int arg2, int arg3) {
        for (class7 var4 = (class7) field117.method3345(); var4 != null; var4 = (class7) field117.method3324()) {
            if (var4.field103 != -1 || var4.field114 != null) {
                int var5 = 0;
                if (arg1 > var4.field122) {
                    var5 += arg1 - var4.field122;
                } else if (arg1 < var4.field105) {
                    var5 += var4.field105 - arg1;
                }
                if (arg2 > var4.field108) {
                    var5 += arg2 - var4.field108;
                } else if (arg2 < var4.field106) {
                    var5 += var4.field106 - arg2;
                }
                if (var5 - 64 > var4.field109 || client.field735 == 0 || var4.field104 != arg0) {
                    if (var4.field110 != null) {
                        Statics.field97.method1137(var4.field110);
                        var4.field110 = null;
                    }
                    if (var4.field116 != null) {
                        Statics.field97.method1137(var4.field116);
                        var4.field116 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field735 * (var4.field109 - var5) / var4.field109;
                    if (var4.field110 != null) {
                        var4.field110.method1052(var6);
                    } else if (var4.field103 >= 0) {
                        class57 var7 = class57.method1276(Statics.field2058, var4.field103, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1267().method1338(Statics.field58);
                            class45 var9 = class45.method978(var8, 100, var6);
                            var9.method981(-1);
                            Statics.field97.method1123(var9);
                            var4.field110 = var9;
                        }
                    }
                    if (var4.field116 != null) {
                        var4.field116.method1052(var6);
                        if (!var4.field116.method3365()) {
                            var4.field116 = null;
                        }
                    } else if (var4.field114 != null && (var4.field121 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field114.length);
                        class57 var11 = class57.method1276(Statics.field2058, var4.field114[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1267().method1338(Statics.field58);
                            class45 var13 = class45.method978(var12, 100, var6);
                            var13.method981(0);
                            Statics.field97.method1123(var13);
                            var4.field116 = var13;
                            var4.field121 = var4.field112 + (int) (Math.random() * (double) (var4.field113 - var4.field112));
                        }
                    }
                }
            }
        }
    }
}
