package deob;

@ObfuscatedName("bu")
public final class class63 extends class392 {

    @ObfuscatedName("bu.c")
    public static class326 field830 = new class326();

    @ObfuscatedName("bu.l")
    public int field816;

    @ObfuscatedName("bu.s")
    public int field821;

    @ObfuscatedName("bu.e")
    public int field817;

    @ObfuscatedName("bu.r")
    public class180 field815;

    @ObfuscatedName("bu.o")
    public int field825;

    @ObfuscatedName("bu.i")
    public int field819;

    @ObfuscatedName("bu.w")
    public int field820;

    @ObfuscatedName("bu.v")
    public int field823;

    @ObfuscatedName("bu.a")
    public int field822;

    @ObfuscatedName("bu.y")
    public class45 field824;

    @ObfuscatedName("bu.u")
    public int field831;

    @ObfuscatedName("bu.h")
    public int[] field826;

    @ObfuscatedName("bu.q")
    public int field827;

    @ObfuscatedName("bu.x")
    public class45 field828;

    @ObfuscatedName("gm.c(B)V")
    public static void method3307() {
        for (class63 var0 = (class63) field830.method5269(); var0 != null; var0 = (class63) field830.method5270()) {
            if (var0.field824 != null) {
                Statics.field1509.method630(var0.field824);
                var0.field824 = null;
            }
            if (var0.field828 != null) {
                Statics.field1509.method630(var0.field828);
                var0.field828 = null;
            }
        }
        field830.method5262();
    }

    @ObfuscatedName("bu.l(I)V")
    public void method1641() {
        int var1 = this.field822;
        class180 var2 = this.field815.method3151();
        if (var2 == null) {
            this.field822 = -1;
            this.field823 = 0;
            this.field821 = 0;
            this.field831 = 0;
            this.field826 = null;
        } else {
            this.field822 = var2.field2013;
            this.field823 = var2.field2014 * 128;
            this.field821 = var2.field2015;
            this.field831 = var2.field2016;
            this.field826 = var2.field1980;
        }
        if (this.field822 != var1 && this.field824 != null) {
            Statics.field1509.method630(this.field824);
            this.field824 = null;
        }
    }

    @ObfuscatedName("fy.s(IIILfg;IB)V")
    public static void method3140(int arg0, int arg1, int arg2, class180 arg3, int arg4) {
        class63 var5 = new class63();
        var5.field816 = arg0;
        var5.field817 = arg1 * 128;
        var5.field825 = arg2 * 128;
        int var6 = arg3.field1995;
        int var7 = arg3.field1985;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field1985;
            var7 = arg3.field1995;
        }
        var5.field819 = (arg1 + var6) * 128;
        var5.field820 = (arg2 + var7) * 128;
        var5.field822 = arg3.field2013;
        var5.field823 = arg3.field2014 * 128;
        var5.field821 = arg3.field2015;
        var5.field831 = arg3.field2016;
        var5.field826 = arg3.field1980;
        if (arg3.field2010 != null) {
            var5.field815 = arg3;
            var5.method1641();
        }
        field830.method5264(var5);
        if (var5.field826 != null) {
            var5.field827 = var5.field821 + (int) (Math.random() * (double) (var5.field831 - var5.field821));
        }
    }

    @ObfuscatedName("au.e(IIIII)V")
    public static void method775(int arg0, int arg1, int arg2, int arg3) {
        for (class63 var4 = (class63) field830.method5269(); var4 != null; var4 = (class63) field830.method5270()) {
            if (var4.field822 != -1 || var4.field826 != null) {
                int var5 = 0;
                if (arg1 > var4.field819) {
                    var5 += arg1 - var4.field819;
                } else if (arg1 < var4.field817) {
                    var5 += var4.field817 - arg1;
                }
                if (arg2 > var4.field820) {
                    var5 += arg2 - var4.field820;
                } else if (arg2 < var4.field825) {
                    var5 += var4.field825 - arg2;
                }
                if (var5 - 64 > var4.field823 || Statics.field4567.field1231 == 0 || var4.field816 != arg0) {
                    if (var4.field824 != null) {
                        Statics.field1509.method630(var4.field824);
                        var4.field824 = null;
                    }
                    if (var4.field828 != null) {
                        Statics.field1509.method630(var4.field828);
                        var4.field828 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = Statics.field4567.field1231 * (var4.field823 - var5) / var4.field823;
                    if (var4.field824 != null) {
                        var4.field824.method787(var6);
                    } else if (var4.field822 >= 0) {
                        class37 var7 = class37.method668(Statics.field4446, var4.field822, 0);
                        if (var7 != null) {
                            class38 var8 = var7.method672().method677(Statics.field1549);
                            class45 var9 = class45.method825(var8, 100, var6);
                            var9.method847(-1);
                            Statics.field1509.method629(var9);
                            var4.field824 = var9;
                        }
                    }
                    if (var4.field828 != null) {
                        var4.field828.method787(var6);
                        if (!var4.field828.method6168()) {
                            var4.field828 = null;
                        }
                    } else if (var4.field826 != null && (var4.field827 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field826.length);
                        class37 var11 = class37.method668(Statics.field4446, var4.field826[var10], 0);
                        if (var11 != null) {
                            class38 var12 = var11.method672().method677(Statics.field1549);
                            class45 var13 = class45.method825(var12, 100, var6);
                            var13.method847(0);
                            Statics.field1509.method629(var13);
                            var4.field828 = var13;
                            var4.field827 = var4.field821 + (int) (Math.random() * (double) (var4.field831 - var4.field821));
                        }
                    }
                }
            }
        }
    }
}
