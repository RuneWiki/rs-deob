package deob;

@ObfuscatedName("e")
public final class class7 extends class178 {

    @ObfuscatedName("e.v")
    public static class176 field101 = new class176();

    @ObfuscatedName("e.f")
    public int field93;

    @ObfuscatedName("e.n")
    public int field94;

    @ObfuscatedName("e.c")
    public int field95;

    @ObfuscatedName("e.r")
    public class31 field106;

    @ObfuscatedName("e.k")
    public int field96;

    @ObfuscatedName("e.e")
    public int field111;

    @ObfuscatedName("e.q")
    public int field98;

    @ObfuscatedName("e.u")
    public int field108;

    @ObfuscatedName("e.s")
    public int field110;

    @ObfuscatedName("e.l")
    public class44 field100;

    @ObfuscatedName("e.o")
    public int field97;

    @ObfuscatedName("e.h")
    public int[] field103;

    @ObfuscatedName("e.p")
    public int field104;

    @ObfuscatedName("e.d")
    public class44 field105;

    @ObfuscatedName("m.v(I)V")
    public static void method130() {
        for (class7 var0 = (class7) field101.method3294(); var0 != null; var0 = (class7) field101.method3296()) {
            if (var0.field100 != null) {
                Statics.field754.method1142(var0.field100);
                var0.field100 = null;
            }
            if (var0.field105 != null) {
                Statics.field754.method1142(var0.field105);
                var0.field105 = null;
            }
        }
        field101.method3288();
    }

    @ObfuscatedName("e.f(B)V")
    public void method39() {
        int var1 = this.field108;
        class31 var2 = this.field106.method648();
        if (var2 == null) {
            this.field108 = -1;
            this.field98 = 0;
            this.field110 = 0;
            this.field97 = 0;
            this.field103 = null;
        } else {
            this.field108 = var2.field825;
            this.field98 = var2.field828 * 128;
            this.field110 = var2.field841;
            this.field97 = var2.field842;
            this.field103 = var2.field795;
        }
        if (this.field108 != var1 && this.field100 != null) {
            Statics.field754.method1142(this.field100);
            this.field100 = null;
        }
    }

    @ObfuscatedName("s.n(IIIII)V")
    public static void method101(int arg0, int arg1, int arg2, int arg3) {
        for (class7 var4 = (class7) field101.method3294(); var4 != null; var4 = (class7) field101.method3296()) {
            if (var4.field108 != -1 || var4.field103 != null) {
                int var5 = 0;
                if (arg1 > var4.field96) {
                    var5 += arg1 - var4.field96;
                } else if (arg1 < var4.field94) {
                    var5 += var4.field94 - arg1;
                }
                if (arg2 > var4.field111) {
                    var5 += arg2 - var4.field111;
                } else if (arg2 < var4.field95) {
                    var5 += var4.field95 - arg2;
                }
                if (var5 - 64 > var4.field98 || client.field701 == 0 || var4.field93 != arg0) {
                    if (var4.field100 != null) {
                        Statics.field754.method1142(var4.field100);
                        var4.field100 = null;
                    }
                    if (var4.field105 != null) {
                        Statics.field754.method1142(var4.field105);
                        var4.field105 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field701 * (var4.field98 - var5) / var4.field98;
                    if (var4.field100 != null) {
                        var4.field100.method967(var6);
                    } else if (var4.field108 >= 0) {
                        class56 var7 = class56.method1280(Statics.field23, var4.field108, 0);
                        if (var7 != null) {
                            class62 var8 = var7.method1281().method1349(Statics.field724);
                            class44 var9 = class44.method1000(var8, 100, var6);
                            var9.method1101(-1);
                            Statics.field754.method1120(var9);
                            var4.field100 = var9;
                        }
                    }
                    if (var4.field105 != null) {
                        var4.field105.method967(var6);
                        if (!var4.field105.method3321()) {
                            var4.field105 = null;
                        }
                    } else if (var4.field103 != null && (var4.field104 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field103.length);
                        class56 var11 = class56.method1280(Statics.field23, var4.field103[var10], 0);
                        if (var11 != null) {
                            class62 var12 = var11.method1281().method1349(Statics.field724);
                            class44 var13 = class44.method1000(var12, 100, var6);
                            var13.method1101(0);
                            Statics.field754.method1120(var13);
                            var4.field105 = var13;
                            var4.field104 = var4.field110 + (int) (Math.random() * (double) (var4.field97 - var4.field110));
                        }
                    }
                }
            }
        }
    }
}
