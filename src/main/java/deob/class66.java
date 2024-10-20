package deob;

@ObfuscatedName("bd")
public final class class66 extends class440 {

    @ObfuscatedName("bd.f")
    public static class356 field847 = new class356();

    @ObfuscatedName("bd.w")
    public int field843;

    @ObfuscatedName("bd.v")
    public int field834;

    @ObfuscatedName("bd.s")
    public int field846;

    @ObfuscatedName("bd.z")
    public int field836;

    @ObfuscatedName("bd.j")
    public int field835;

    @ObfuscatedName("bd.i")
    public int field845;

    @ObfuscatedName("bd.n")
    public int field838;

    @ObfuscatedName("bd.l")
    public int field839;

    @ObfuscatedName("bd.k")
    public class48 field840;

    @ObfuscatedName("bd.c")
    public int field842;

    @ObfuscatedName("bd.r")
    public class200 field837;

    @ObfuscatedName("bd.b")
    public int[] field832;

    @ObfuscatedName("bd.m")
    public int field844;

    @ObfuscatedName("bd.t")
    public class48 field833;

    @ObfuscatedName("dm.f(I)V")
    public static void method2762() {
        for (class66 var0 = (class66) field847.method6241(); var0 != null; var0 = (class66) field847.method6248()) {
            if (var0.field840 != null) {
                Statics.field2376.method706(var0.field840);
                var0.field840 = null;
            }
            if (var0.field833 != null) {
                Statics.field2376.method706(var0.field833);
                var0.field833 = null;
            }
        }
        field847.method6235();
    }

    @ObfuscatedName("bd.w(I)V")
    public void method1822() {
        int var1 = this.field839;
        class200 var2 = this.field837.method3612();
        if (var2 == null) {
            this.field839 = -1;
            this.field838 = 0;
            this.field846 = 0;
            this.field842 = 0;
            this.field832 = null;
        } else {
            this.field839 = var2.field2164;
            this.field838 = var2.field2199 * 128;
            this.field846 = var2.field2200;
            this.field842 = var2.field2161;
            this.field832 = var2.field2202;
        }
        if (this.field839 != var1 && this.field840 != null) {
            Statics.field2376.method706(this.field840);
            this.field840 = null;
        }
    }

    @ObfuscatedName("b.v(IIIIB)V")
    public static void method165(int arg0, int arg1, int arg2, int arg3) {
        for (class66 var4 = (class66) field847.method6241(); var4 != null; var4 = (class66) field847.method6248()) {
            if (var4.field839 != -1 || var4.field832 != null) {
                int var5 = 0;
                if (arg1 > var4.field836) {
                    var5 += arg1 - var4.field836;
                } else if (arg1 < var4.field834) {
                    var5 += var4.field834 - arg1;
                }
                if (arg2 > var4.field845) {
                    var5 += arg2 - var4.field845;
                } else if (arg2 < var4.field835) {
                    var5 += var4.field835 - arg2;
                }
                if (var5 - 64 > var4.field838 || Statics.field1404.method2383() == 0 || var4.field843 != arg0) {
                    if (var4.field840 != null) {
                        Statics.field2376.method706(var4.field840);
                        var4.field840 = null;
                    }
                    if (var4.field833 != null) {
                        Statics.field2376.method706(var4.field833);
                        var4.field833 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = (var4.field838 - var5) * Statics.field1404.method2383() / var4.field838;
                    if (var4.field840 != null) {
                        var4.field840.method857(var6);
                    } else if (var4.field839 >= 0) {
                        class40 var7 = class40.method734(Statics.field1002, var4.field839, 0);
                        if (var7 != null) {
                            class41 var8 = var7.method733().method744(Statics.field2998);
                            class48 var9 = class48.method854(var8, 100, var6);
                            var9.method856(-1);
                            Statics.field2376.method693(var9);
                            var4.field840 = var9;
                        }
                    }
                    if (var4.field833 != null) {
                        var4.field833.method857(var6);
                        if (!var4.field833.method7430()) {
                            var4.field833 = null;
                        }
                    } else if (var4.field832 != null && (var4.field844 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field832.length);
                        class40 var11 = class40.method734(Statics.field1002, var4.field832[var10], 0);
                        if (var11 != null) {
                            class41 var12 = var11.method733().method744(Statics.field2998);
                            class48 var13 = class48.method854(var12, 100, var6);
                            var13.method856(0);
                            Statics.field2376.method693(var13);
                            var4.field833 = var13;
                            var4.field844 = var4.field846 + (int) (Math.random() * (double) (var4.field842 - var4.field846));
                        }
                    }
                }
            }
        }
    }
}
