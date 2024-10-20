package deob;

@ObfuscatedName("g")
public final class class7 extends class179 {

    @ObfuscatedName("g.p")
    public static class177 field106 = new class177();

    @ObfuscatedName("g.i")
    public int field102;

    @ObfuscatedName("g.o")
    public int field92;

    @ObfuscatedName("g.n")
    public int field93;

    @ObfuscatedName("g.l")
    public int field94;

    @ObfuscatedName("g.v")
    public int field96;

    @ObfuscatedName("g.g")
    public int field91;

    @ObfuscatedName("g.x")
    public int field97;

    @ObfuscatedName("g.c")
    public class45 field98;

    @ObfuscatedName("g.f")
    public int field99;

    @ObfuscatedName("g.r")
    public class32 field104;

    @ObfuscatedName("g.d")
    public int field100;

    @ObfuscatedName("g.a")
    public int[] field105;

    @ObfuscatedName("g.q")
    public int field90;

    @ObfuscatedName("g.u")
    public class45 field103;

    @ObfuscatedName("p.p(I)V")
    public static void method2() {
        for (class7 var0 = (class7) field106.method3334(); var0 != null; var0 = (class7) field106.method3355()) {
            if (var0.field98 != null) {
                Statics.field119.method1135(var0.field98);
                var0.field98 = null;
            }
            if (var0.field103 != null) {
                Statics.field119.method1135(var0.field103);
                var0.field103 = null;
            }
        }
        field106.method3352();
    }

    @ObfuscatedName("g.i(B)V")
    public void method53() {
        int var1 = this.field97;
        class32 var2 = this.field104.method677();
        if (var2 == null) {
            this.field97 = -1;
            this.field91 = 0;
            this.field99 = 0;
            this.field100 = 0;
            this.field105 = null;
        } else {
            this.field97 = var2.field823;
            this.field91 = var2.field859 * 128;
            this.field99 = var2.field860;
            this.field100 = var2.field861;
            this.field105 = var2.field862;
        }
        if (this.field97 != var1 && this.field98 != null) {
            Statics.field119.method1135(this.field98);
            this.field98 = null;
        }
    }

    @ObfuscatedName("q.o(IIIII)V")
    public static void method142(int arg0, int arg1, int arg2, int arg3) {
        for (class7 var4 = (class7) field106.method3334(); var4 != null; var4 = (class7) field106.method3355()) {
            if (var4.field97 != -1 || var4.field105 != null) {
                int var5 = 0;
                if (arg1 > var4.field94) {
                    var5 += arg1 - var4.field94;
                } else if (arg1 < var4.field92) {
                    var5 += var4.field92 - arg1;
                }
                if (arg2 > var4.field96) {
                    var5 += arg2 - var4.field96;
                } else if (arg2 < var4.field93) {
                    var5 += var4.field93 - arg2;
                }
                if (var5 - 64 > var4.field91 || client.field714 == 0 || var4.field102 != arg0) {
                    if (var4.field98 != null) {
                        Statics.field119.method1135(var4.field98);
                        var4.field98 = null;
                    }
                    if (var4.field103 != null) {
                        Statics.field119.method1135(var4.field103);
                        var4.field103 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field714 * (var4.field91 - var5) / var4.field91;
                    if (var4.field98 != null) {
                        var4.field98.method1006(var6);
                    } else if (var4.field97 >= 0) {
                        class57 var7 = class57.method1279(Statics.field197, var4.field97, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1280().method1350(Statics.field967);
                            class45 var9 = class45.method1130(var8, 100, var6);
                            var9.method974(-1);
                            Statics.field119.method1134(var9);
                            var4.field98 = var9;
                        }
                    }
                    if (var4.field103 != null) {
                        var4.field103.method1006(var6);
                        if (!var4.field103.method3359()) {
                            var4.field103 = null;
                        }
                    } else if (var4.field105 != null && (var4.field90 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field105.length);
                        class57 var11 = class57.method1279(Statics.field197, var4.field105[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1280().method1350(Statics.field967);
                            class45 var13 = class45.method1130(var12, 100, var6);
                            var13.method974(0);
                            Statics.field119.method1134(var13);
                            var4.field103 = var13;
                            var4.field90 = var4.field99 + (int) (Math.random() * (double) (var4.field100 - var4.field99));
                        }
                    }
                }
            }
        }
    }
}
