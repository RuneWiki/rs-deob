package deob;

@ObfuscatedName("bm")
public final class class63 extends class370 {

    @ObfuscatedName("bm.l")
    public static class309 field806 = new class309();

    @ObfuscatedName("bm.q")
    public int field801;

    @ObfuscatedName("bm.f")
    public int field802;

    @ObfuscatedName("bm.j")
    public int field811;

    @ObfuscatedName("bm.m")
    public int field808;

    @ObfuscatedName("bm.k")
    public int field804;

    @ObfuscatedName("bm.t")
    public int field805;

    @ObfuscatedName("bm.a")
    public int field807;

    @ObfuscatedName("bm.e")
    public class43 field813;

    @ObfuscatedName("bm.i")
    public int field809;

    @ObfuscatedName("bm.y")
    public int field810;

    @ObfuscatedName("bm.w")
    public int[] field800;

    @ObfuscatedName("bm.g")
    public int field812;

    @ObfuscatedName("bm.v")
    public class43 field803;

    @ObfuscatedName("bm.s")
    public class169 field814;

    @ObfuscatedName("hq.l(I)V")
    public static void method4177() {
        for (class63 var0 = (class63) field806.method5035(); var0 != null; var0 = (class63) field806.method5022()) {
            if (var0.field814 != null) {
                var0.method1633();
            }
        }
    }

    @ObfuscatedName("bm.q(I)V")
    public void method1633() {
        int var1 = this.field807;
        class169 var2 = this.field814.method2967();
        if (var2 == null) {
            this.field807 = -1;
            this.field805 = 0;
            this.field809 = 0;
            this.field810 = 0;
            this.field800 = null;
        } else {
            this.field807 = var2.field1823;
            this.field805 = var2.field1862 * 128;
            this.field809 = var2.field1873;
            this.field810 = var2.field1869;
            this.field800 = var2.field1870;
        }
        if (this.field807 != var1 && this.field813 != null) {
            Statics.field474.method611(this.field813);
            this.field813 = null;
        }
    }

    @ObfuscatedName("kj.f(IIILfo;IB)V")
    public static void method4983(int arg0, int arg1, int arg2, class169 arg3, int arg4) {
        class63 var5 = new class63();
        var5.field801 = arg0;
        var5.field802 = arg1 * 128;
        var5.field811 = arg2 * 128;
        int var6 = arg3.field1845;
        int var7 = arg3.field1829;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field1829;
            var7 = arg3.field1845;
        }
        var5.field808 = (arg1 + var6) * 128;
        var5.field804 = (arg2 + var7) * 128;
        var5.field807 = arg3.field1823;
        var5.field805 = arg3.field1862 * 128;
        var5.field809 = arg3.field1873;
        var5.field810 = arg3.field1869;
        var5.field800 = arg3.field1870;
        if (arg3.field1863 != null) {
            var5.field814 = arg3;
            var5.method1633();
        }
        field806.method5015(var5);
        if (var5.field800 != null) {
            var5.field812 = var5.field809 + (int) (Math.random() * (double) (var5.field810 - var5.field809));
        }
    }

    @ObfuscatedName("gr.j(IIIIB)V")
    public static void method3553(int arg0, int arg1, int arg2, int arg3) {
        for (class63 var4 = (class63) field806.method5035(); var4 != null; var4 = (class63) field806.method5022()) {
            if (var4.field807 != -1 || var4.field800 != null) {
                int var5 = 0;
                if (arg1 > var4.field808) {
                    var5 += arg1 - var4.field808;
                } else if (arg1 < var4.field802) {
                    var5 += var4.field802 - arg1;
                }
                if (arg2 > var4.field804) {
                    var5 += arg2 - var4.field804;
                } else if (arg2 < var4.field811) {
                    var5 += var4.field811 - arg2;
                }
                if (var5 - 64 > var4.field805 || Statics.field3227.field1201 == 0 || var4.field801 != arg0) {
                    if (var4.field813 != null) {
                        Statics.field474.method611(var4.field813);
                        var4.field813 = null;
                    }
                    if (var4.field803 != null) {
                        Statics.field474.method611(var4.field803);
                        var4.field803 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = Statics.field3227.field1201 * (var4.field805 - var5) / var4.field805;
                    if (var4.field813 != null) {
                        var4.field813.method856(var6);
                    } else if (var4.field807 >= 0) {
                        class35 var7 = class35.method653(Statics.field3030, var4.field807, 0);
                        if (var7 != null) {
                            class36 var8 = var7.method651().method657(Statics.field1990);
                            class43 var9 = class43.method766(var8, 100, var6);
                            var9.method769(-1);
                            Statics.field474.method636(var9);
                            var4.field813 = var9;
                        }
                    }
                    if (var4.field803 != null) {
                        var4.field803.method856(var6);
                        if (!var4.field803.method5779()) {
                            var4.field803 = null;
                        }
                    } else if (var4.field800 != null && (var4.field812 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field800.length);
                        class35 var11 = class35.method653(Statics.field3030, var4.field800[var10], 0);
                        if (var11 != null) {
                            class36 var12 = var11.method651().method657(Statics.field1990);
                            class43 var13 = class43.method766(var12, 100, var6);
                            var13.method769(0);
                            Statics.field474.method636(var13);
                            var4.field803 = var13;
                            var4.field812 = var4.field809 + (int) (Math.random() * (double) (var4.field810 - var4.field809));
                        }
                    }
                }
            }
        }
    }
}
