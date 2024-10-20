package deob;

@ObfuscatedName("bv")
public final class class63 extends class410 {

    @ObfuscatedName("bv.c")
    public static class334 field825 = new class334();

    @ObfuscatedName("bv.v")
    public int field808;

    @ObfuscatedName("bv.q")
    public int field809;

    @ObfuscatedName("bv.f")
    public int field816;

    @ObfuscatedName("bv.j")
    public int field811;

    @ObfuscatedName("bv.e")
    public int field807;

    @ObfuscatedName("bv.g")
    public int field813;

    @ObfuscatedName("bv.w")
    public int field814;

    @ObfuscatedName("bv.y")
    public class45 field815;

    @ObfuscatedName("bv.i")
    public int field820;

    @ObfuscatedName("bv.s")
    public int field812;

    @ObfuscatedName("bv.t")
    public int[] field818;

    @ObfuscatedName("bv.z")
    public int field810;

    @ObfuscatedName("bv.r")
    public class187 field821;

    @ObfuscatedName("bv.u")
    public class45 field819;

    @ObfuscatedName("be.c(I)V")
    public static void method948() {
        for (class63 var0 = (class63) field825.method5535(); var0 != null; var0 = (class63) field825.method5537()) {
            if (var0.field815 != null) {
                Statics.field120.method577(var0.field815);
                var0.field815 = null;
            }
            if (var0.field819 != null) {
                Statics.field120.method577(var0.field819);
                var0.field819 = null;
            }
        }
        field825.method5560();
    }

    @ObfuscatedName("bv.v(I)V")
    public void method1609() {
        int var1 = this.field814;
        class187 var2 = this.field821.method3361();
        if (var2 == null) {
            this.field814 = -1;
            this.field813 = 0;
            this.field820 = 0;
            this.field812 = 0;
            this.field818 = null;
        } else {
            this.field814 = var2.field2085;
            this.field813 = var2.field2086 * 128;
            this.field820 = var2.field2065;
            this.field812 = var2.field2087;
            this.field818 = var2.field2084;
        }
        if (this.field814 != var1 && this.field815 != null) {
            Statics.field120.method577(this.field815);
            this.field815 = null;
        }
    }

    @ObfuscatedName("g.q(IIILgk;II)V")
    public static void method36(int arg0, int arg1, int arg2, class187 arg3, int arg4) {
        class63 var5 = new class63();
        var5.field808 = arg0;
        var5.field809 = arg1 * 128;
        var5.field816 = arg2 * 128;
        int var6 = arg3.field2046;
        int var7 = arg3.field2057;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2057;
            var7 = arg3.field2046;
        }
        var5.field811 = (arg1 + var6) * 128;
        var5.field807 = (arg2 + var7) * 128;
        var5.field814 = arg3.field2085;
        var5.field813 = arg3.field2086 * 128;
        var5.field820 = arg3.field2065;
        var5.field812 = arg3.field2087;
        var5.field818 = arg3.field2084;
        if (arg3.field2082 != null) {
            var5.field821 = arg3;
            var5.method1609();
        }
        field825.method5530(var5);
        if (var5.field818 != null) {
            var5.field810 = var5.field820 + (int) (Math.random() * (double) (var5.field812 - var5.field820));
        }
    }

    @ObfuscatedName("hi.f(IIIIB)V")
    public static void method4198(int arg0, int arg1, int arg2, int arg3) {
        for (class63 var4 = (class63) field825.method5535(); var4 != null; var4 = (class63) field825.method5537()) {
            if (var4.field814 != -1 || var4.field818 != null) {
                int var5 = 0;
                if (arg1 > var4.field811) {
                    var5 += arg1 - var4.field811;
                } else if (arg1 < var4.field809) {
                    var5 += var4.field809 - arg1;
                }
                if (arg2 > var4.field807) {
                    var5 += arg2 - var4.field807;
                } else if (arg2 < var4.field816) {
                    var5 += var4.field816 - arg2;
                }
                if (var5 - 64 > var4.field813 || Statics.field109.method2154() == 0 || var4.field808 != arg0) {
                    if (var4.field815 != null) {
                        Statics.field120.method577(var4.field815);
                        var4.field815 = null;
                    }
                    if (var4.field819 != null) {
                        Statics.field120.method577(var4.field819);
                        var4.field819 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = (var4.field813 - var5) * Statics.field109.method2154() / var4.field813;
                    if (var4.field815 != null) {
                        var4.field815.method763(var6);
                    } else if (var4.field814 >= 0) {
                        class37 var7 = class37.method625(Statics.field778, var4.field814, 0);
                        if (var7 != null) {
                            class38 var8 = var7.method616().method629(Statics.field2723);
                            class45 var9 = class45.method747(var8, 100, var6);
                            var9.method785(-1);
                            Statics.field120.method592(var9);
                            var4.field815 = var9;
                        }
                    }
                    if (var4.field819 != null) {
                        var4.field819.method763(var6);
                        if (!var4.field819.method6499()) {
                            var4.field819 = null;
                        }
                    } else if (var4.field818 != null && (var4.field810 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field818.length);
                        class37 var11 = class37.method625(Statics.field778, var4.field818[var10], 0);
                        if (var11 != null) {
                            class38 var12 = var11.method616().method629(Statics.field2723);
                            class45 var13 = class45.method747(var12, 100, var6);
                            var13.method785(0);
                            Statics.field120.method592(var13);
                            var4.field819 = var13;
                            var4.field810 = var4.field820 + (int) (Math.random() * (double) (var4.field812 - var4.field820));
                        }
                    }
                }
            }
        }
    }
}
