package deob;

@ObfuscatedName("ca")
public final class class70 extends class485 {

    @ObfuscatedName("ca.at")
    public static class390 field832 = new class390();

    @ObfuscatedName("ca.ah")
    public int field820;

    @ObfuscatedName("ca.ar")
    public int field821;

    @ObfuscatedName("ca.ao")
    public int field827;

    @ObfuscatedName("ca.ab")
    public int field831;

    @ObfuscatedName("ca.au")
    public int field824;

    @ObfuscatedName("ca.aa")
    public int field825;

    @ObfuscatedName("ca.ac")
    public int field826;

    @ObfuscatedName("ca.al")
    public class49 field822;

    @ObfuscatedName("ca.az")
    public int field828;

    @ObfuscatedName("ca.ap")
    public int field829;

    @ObfuscatedName("ca.av")
    public int[] field830;

    @ObfuscatedName("ca.ax")
    public int field833;

    @ObfuscatedName("ca.as")
    public class49 field819;

    @ObfuscatedName("ca.ay")
    public class202 field823;

    @ObfuscatedName("jn.at(I)V")
    public static void method4434() {
        for (class70 var0 = (class70) field832.method6579(); var0 != null; var0 = (class70) field832.method6549()) {
            if (var0.field822 != null) {
                Statics.field1266.method739(var0.field822);
                var0.field822 = null;
            }
            if (var0.field819 != null) {
                Statics.field1266.method739(var0.field819);
                var0.field819 = null;
            }
        }
        field832.method6576();
    }

    @ObfuscatedName("ge.ah(B)V")
    public static void method3159() {
        for (class70 var0 = (class70) field832.method6579(); var0 != null; var0 = (class70) field832.method6549()) {
            if (var0.field823 != null) {
                var0.method1864();
            }
        }
    }

    @ObfuscatedName("ca.ar(I)V")
    public void method1864() {
        int var1 = this.field826;
        class202 var2 = this.field823.method3592();
        if (var2 == null) {
            this.field826 = -1;
            this.field825 = 0;
            this.field828 = 0;
            this.field829 = 0;
            this.field830 = null;
        } else {
            this.field826 = var2.field2120;
            this.field825 = var2.field2121 * 128;
            this.field828 = var2.field2122;
            this.field829 = var2.field2117;
            this.field830 = var2.field2124;
        }
        if (this.field826 != var1 && this.field822 != null) {
            Statics.field1266.method739(this.field822);
            this.field822 = null;
        }
    }

    @ObfuscatedName("el.ao(IIILhs;II)V")
    public static void method2752(int arg0, int arg1, int arg2, class202 arg3, int arg4) {
        class70 var5 = new class70();
        var5.field820 = arg0;
        var5.field821 = arg1 * 128;
        var5.field827 = arg2 * 128;
        int var6 = arg3.field2091;
        int var7 = arg3.field2100;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2100;
            var7 = arg3.field2091;
        }
        var5.field831 = (arg1 + var6) * 128;
        var5.field824 = (arg2 + var7) * 128;
        var5.field826 = arg3.field2120;
        var5.field825 = arg3.field2121 * 128;
        var5.field828 = arg3.field2122;
        var5.field829 = arg3.field2117;
        var5.field830 = arg3.field2124;
        if (arg3.field2114 != null) {
            var5.field823 = arg3;
            var5.method1864();
        }
        field832.method6547(var5);
        if (var5.field830 != null) {
            var5.field833 = var5.field828 + (int) (Math.random() * (double) (var5.field829 - var5.field828));
        }
    }

    @ObfuscatedName("qs.ab(IIIIB)V")
    public static void method7346(int arg0, int arg1, int arg2, int arg3) {
        for (class70 var4 = (class70) field832.method6579(); var4 != null; var4 = (class70) field832.method6549()) {
            if (var4.field826 != -1 || var4.field830 != null) {
                int var5 = 0;
                if (arg1 > var4.field831) {
                    var5 += arg1 - var4.field831;
                } else if (arg1 < var4.field821) {
                    var5 += var4.field821 - arg1;
                }
                if (arg2 > var4.field824) {
                    var5 += arg2 - var4.field824;
                } else if (arg2 < var4.field827) {
                    var5 += var4.field827 - arg2;
                }
                if (var5 - 64 > var4.field825 || Statics.field2450.method2477() == 0 || var4.field820 != arg0) {
                    if (var4.field822 != null) {
                        Statics.field1266.method739(var4.field822);
                        var4.field822 = null;
                    }
                    if (var4.field819 != null) {
                        Statics.field1266.method739(var4.field819);
                        var4.field819 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = (var4.field825 - var5) * Statics.field2450.method2477() / var4.field825;
                    if (var4.field822 != null) {
                        var4.field822.method951(var6);
                    } else if (var4.field826 >= 0) {
                        class40 var7 = class40.method755(Statics.field4413, var4.field826, 0);
                        if (var7 != null) {
                            class41 var8 = var7.method761().method766(Statics.field5093);
                            class49 var9 = class49.method907(var8, 100, var6);
                            var9.method925(-1);
                            Statics.field1266.method707(var9);
                            var4.field822 = var9;
                        }
                    }
                    if (var4.field819 != null) {
                        var4.field819.method951(var6);
                        if (!var4.field819.method7827()) {
                            var4.field819 = null;
                        }
                    } else if (var4.field830 != null && (var4.field833 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field830.length);
                        class40 var11 = class40.method755(Statics.field4413, var4.field830[var10], 0);
                        if (var11 != null) {
                            class41 var12 = var11.method761().method766(Statics.field5093);
                            class49 var13 = class49.method907(var12, 100, var6);
                            var13.method925(0);
                            Statics.field1266.method707(var13);
                            var4.field819 = var13;
                            var4.field833 = var4.field828 + (int) (Math.random() * (double) (var4.field829 - var4.field828));
                        }
                    }
                }
            }
        }
    }
}
