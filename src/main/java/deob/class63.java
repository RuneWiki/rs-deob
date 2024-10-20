package deob;

@ObfuscatedName("bp")
public final class class63 extends class412 {

    @ObfuscatedName("bp.c")
    public static class336 field821 = new class336();

    @ObfuscatedName("bp.p")
    public int field819;

    @ObfuscatedName("bp.f")
    public int field818;

    @ObfuscatedName("bp.n")
    public int field827;

    @ObfuscatedName("bp.k")
    public int field822;

    @ObfuscatedName("bp.w")
    public int field829;

    @ObfuscatedName("bp.s")
    public int field820;

    @ObfuscatedName("bp.q")
    public int field824;

    @ObfuscatedName("bp.m")
    public int field825;

    @ObfuscatedName("bp.x")
    public class45 field823;

    @ObfuscatedName("bp.j")
    public int field828;

    @ObfuscatedName("bp.v")
    public int[] field826;

    @ObfuscatedName("bp.h")
    public int field830;

    @ObfuscatedName("bp.t")
    public class45 field831;

    @ObfuscatedName("bp.u")
    public class188 field832;

    @ObfuscatedName("ku.c(B)V")
    public static void method5333() {
        for (class63 var0 = (class63) field821.method5647(); var0 != null; var0 = (class63) field821.method5649()) {
            if (var0.field823 != null) {
                Statics.field89.method646(var0.field823);
                var0.field823 = null;
            }
            if (var0.field831 != null) {
                Statics.field89.method646(var0.field831);
                var0.field831 = null;
            }
        }
        field821.method5641();
    }

    @ObfuscatedName("co.p(B)V")
    public static void method2414() {
        for (class63 var0 = (class63) field821.method5647(); var0 != null; var0 = (class63) field821.method5649()) {
            if (var0.field832 != null) {
                var0.method1749();
            }
        }
    }

    @ObfuscatedName("bp.f(I)V")
    public void method1749() {
        int var1 = this.field825;
        class188 var2 = this.field832.method3424();
        if (var2 == null) {
            this.field825 = -1;
            this.field824 = 0;
            this.field820 = 0;
            this.field828 = 0;
            this.field826 = null;
        } else {
            this.field825 = var2.field2090;
            this.field824 = var2.field2083 * 128;
            this.field820 = var2.field2116;
            this.field828 = var2.field2080;
            this.field826 = var2.field2118;
        }
        if (this.field825 != var1 && this.field823 != null) {
            Statics.field89.method646(this.field823);
            this.field823 = null;
        }
    }

    @ObfuscatedName("kk.n(IIILgz;IS)V")
    public static void method5144(int arg0, int arg1, int arg2, class188 arg3, int arg4) {
        class63 var5 = new class63();
        var5.field819 = arg0;
        var5.field818 = arg1 * 128;
        var5.field827 = arg2 * 128;
        int var6 = arg3.field2073;
        int var7 = arg3.field2086;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2086;
            var7 = arg3.field2073;
        }
        var5.field822 = (arg1 + var6) * 128;
        var5.field829 = (arg2 + var7) * 128;
        var5.field825 = arg3.field2090;
        var5.field824 = arg3.field2083 * 128;
        var5.field820 = arg3.field2116;
        var5.field828 = arg3.field2080;
        var5.field826 = arg3.field2118;
        if (arg3.field2111 != null) {
            var5.field832 = arg3;
            var5.method1749();
        }
        field821.method5660(var5);
        if (var5.field826 != null) {
            var5.field830 = var5.field820 + (int) (Math.random() * (double) (var5.field828 - var5.field820));
        }
    }

    @ObfuscatedName("ff.k(IIIII)V")
    public static void method3143(int arg0, int arg1, int arg2, int arg3) {
        for (class63 var4 = (class63) field821.method5647(); var4 != null; var4 = (class63) field821.method5649()) {
            if (var4.field825 != -1 || var4.field826 != null) {
                int var5 = 0;
                if (arg1 > var4.field822) {
                    var5 += arg1 - var4.field822;
                } else if (arg1 < var4.field818) {
                    var5 += var4.field818 - arg1;
                }
                if (arg2 > var4.field829) {
                    var5 += arg2 - var4.field829;
                } else if (arg2 < var4.field827) {
                    var5 += var4.field827 - arg2;
                }
                if (var5 - 64 > var4.field824 || Statics.field1108.method2366() == 0 || var4.field819 != arg0) {
                    if (var4.field823 != null) {
                        Statics.field89.method646(var4.field823);
                        var4.field823 = null;
                    }
                    if (var4.field831 != null) {
                        Statics.field89.method646(var4.field831);
                        var4.field831 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = (var4.field824 - var5) * Statics.field1108.method2366() / var4.field824;
                    if (var4.field823 != null) {
                        var4.field823.method827(var6);
                    } else if (var4.field825 >= 0) {
                        class37 var7 = class37.method685(Statics.field1393, var4.field825, 0);
                        if (var7 != null) {
                            class38 var8 = var7.method686().method701(Statics.field4120);
                            class45 var9 = class45.method887(var8, 100, var6);
                            var9.method826(-1);
                            Statics.field89.method645(var9);
                            var4.field823 = var9;
                        }
                    }
                    if (var4.field831 != null) {
                        var4.field831.method827(var6);
                        if (!var4.field831.method6658()) {
                            var4.field831 = null;
                        }
                    } else if (var4.field826 != null && (var4.field830 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field826.length);
                        class37 var11 = class37.method685(Statics.field1393, var4.field826[var10], 0);
                        if (var11 != null) {
                            class38 var12 = var11.method686().method701(Statics.field4120);
                            class45 var13 = class45.method887(var12, 100, var6);
                            var13.method826(0);
                            Statics.field89.method645(var13);
                            var4.field831 = var13;
                            var4.field830 = var4.field820 + (int) (Math.random() * (double) (var4.field828 - var4.field820));
                        }
                    }
                }
            }
        }
    }
}
