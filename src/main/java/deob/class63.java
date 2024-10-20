package deob;

@ObfuscatedName("by")
public final class class63 extends class411 {

    @ObfuscatedName("by.s")
    public int field808;

    @ObfuscatedName("by.h")
    public static class335 field811 = new class335();

    @ObfuscatedName("by.w")
    public int field805;

    @ObfuscatedName("by.v")
    public int field801;

    @ObfuscatedName("by.c")
    public int field799;

    @ObfuscatedName("by.q")
    public int field803;

    @ObfuscatedName("by.i")
    public int field804;

    @ObfuscatedName("by.k")
    public int field813;

    @ObfuscatedName("by.o")
    public int field806;

    @ObfuscatedName("by.n")
    public class45 field807;

    @ObfuscatedName("by.d")
    public int field812;

    @ObfuscatedName("by.a")
    public int[] field810;

    @ObfuscatedName("by.m")
    public int field816;

    @ObfuscatedName("by.u")
    public class45 field809;

    @ObfuscatedName("by.l")
    public class187 field800;

    @ObfuscatedName("ch.s(B)V")
    public static void method1974() {
        for (class63 var0 = (class63) field811.method5442(); var0 != null; var0 = (class63) field811.method5426()) {
            if (var0.field807 != null) {
                Statics.field4123.method578(var0.field807);
                var0.field807 = null;
            }
            if (var0.field809 != null) {
                Statics.field4123.method578(var0.field809);
                var0.field809 = null;
            }
        }
        field811.method5438();
    }

    @ObfuscatedName("do.h(B)V")
    public static void method2481() {
        for (class63 var0 = (class63) field811.method5442(); var0 != null; var0 = (class63) field811.method5426()) {
            if (var0.field800 != null) {
                var0.method1611();
            }
        }
    }

    @ObfuscatedName("by.w(S)V")
    public void method1611() {
        int var1 = this.field806;
        class187 var2 = this.field800.method3247();
        if (var2 == null) {
            this.field806 = -1;
            this.field813 = 0;
            this.field808 = 0;
            this.field812 = 0;
            this.field810 = null;
        } else {
            this.field806 = var2.field2080;
            this.field813 = var2.field2081 * 128;
            this.field808 = var2.field2082;
            this.field812 = var2.field2083;
            this.field810 = var2.field2084;
        }
        if (this.field806 != var1 && this.field807 != null) {
            Statics.field4123.method578(this.field807);
            this.field807 = null;
        }
    }

    @ObfuscatedName("cq.v(IIILgc;II)V")
    public static void method2031(int arg0, int arg1, int arg2, class187 arg3, int arg4) {
        class63 var5 = new class63();
        var5.field805 = arg0;
        var5.field801 = arg1 * 128;
        var5.field799 = arg2 * 128;
        int var6 = arg3.field2051;
        int var7 = arg3.field2052;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2052;
            var7 = arg3.field2051;
        }
        var5.field803 = (arg1 + var6) * 128;
        var5.field804 = (arg2 + var7) * 128;
        var5.field806 = arg3.field2080;
        var5.field813 = arg3.field2081 * 128;
        var5.field808 = arg3.field2082;
        var5.field812 = arg3.field2083;
        var5.field810 = arg3.field2084;
        if (arg3.field2077 != null) {
            var5.field800 = arg3;
            var5.method1611();
        }
        field811.method5425(var5);
        if (var5.field810 != null) {
            var5.field816 = var5.field808 + (int) (Math.random() * (double) (var5.field812 - var5.field808));
        }
    }

    @ObfuscatedName("i.c(IIIII)V")
    public static void method40(int arg0, int arg1, int arg2, int arg3) {
        for (class63 var4 = (class63) field811.method5442(); var4 != null; var4 = (class63) field811.method5426()) {
            if (var4.field806 != -1 || var4.field810 != null) {
                int var5 = 0;
                if (arg1 > var4.field803) {
                    var5 += arg1 - var4.field803;
                } else if (arg1 < var4.field801) {
                    var5 += var4.field801 - arg1;
                }
                if (arg2 > var4.field804) {
                    var5 += arg2 - var4.field804;
                } else if (arg2 < var4.field799) {
                    var5 += var4.field799 - arg2;
                }
                if (var5 - 64 > var4.field813 || Statics.field4303.method2108() == 0 || var4.field805 != arg0) {
                    if (var4.field807 != null) {
                        Statics.field4123.method578(var4.field807);
                        var4.field807 = null;
                    }
                    if (var4.field809 != null) {
                        Statics.field4123.method578(var4.field809);
                        var4.field809 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = (var4.field813 - var5) * Statics.field4303.method2108() / var4.field813;
                    if (var4.field807 != null) {
                        var4.field807.method794(var6);
                    } else if (var4.field806 >= 0) {
                        class37 var7 = class37.method628(Statics.field3183, var4.field806, 0);
                        if (var7 != null) {
                            class38 var8 = var7.method630().method635(Statics.field1047);
                            class45 var9 = class45.method741(var8, 100, var6);
                            var9.method758(-1);
                            Statics.field4123.method590(var9);
                            var4.field807 = var9;
                        }
                    }
                    if (var4.field809 != null) {
                        var4.field809.method794(var6);
                        if (!var4.field809.method6412()) {
                            var4.field809 = null;
                        }
                    } else if (var4.field810 != null && (var4.field816 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field810.length);
                        class37 var11 = class37.method628(Statics.field3183, var4.field810[var10], 0);
                        if (var11 != null) {
                            class38 var12 = var11.method630().method635(Statics.field1047);
                            class45 var13 = class45.method741(var12, 100, var6);
                            var13.method758(0);
                            Statics.field4123.method590(var13);
                            var4.field809 = var13;
                            var4.field816 = var4.field808 + (int) (Math.random() * (double) (var4.field812 - var4.field808));
                        }
                    }
                }
            }
        }
    }
}
