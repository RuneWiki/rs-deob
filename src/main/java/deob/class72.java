package deob;

@ObfuscatedName("cs")
public final class class72 extends class506 {

    @ObfuscatedName("cs.ab")
    public static class408 field844 = new class408();

    @ObfuscatedName("cs.ay")
    public int field832;

    @ObfuscatedName("cs.an")
    public int field833;

    @ObfuscatedName("cs.au")
    public int field834;

    @ObfuscatedName("cs.ax")
    public int field846;

    @ObfuscatedName("cs.ao")
    public int field836;

    @ObfuscatedName("cs.am")
    public int field837;

    @ObfuscatedName("cs.ac")
    public int field835;

    @ObfuscatedName("cs.ae")
    public int field839;

    @ObfuscatedName("cs.ad")
    public class49 field841;

    @ObfuscatedName("cs.aq")
    public int field838;

    @ObfuscatedName("cs.al")
    public int field842;

    @ObfuscatedName("cs.aj")
    public int[] field843;

    @ObfuscatedName("cs.as")
    public int field840;

    @ObfuscatedName("cs.aw")
    public class49 field845;

    @ObfuscatedName("cs.af")
    public class261 field831;

    @ObfuscatedName("li.ab(I)V")
    public static void method5455() {
        for (class72 var0 = (class72) field844.method6907(); var0 != null; var0 = (class72) field844.method6896()) {
            if (var0.field841 != null) {
                Statics.field445.method676(var0.field841);
                var0.field841 = null;
            }
            if (var0.field845 != null) {
                Statics.field445.method676(var0.field845);
                var0.field845 = null;
            }
        }
        field844.method6898();
    }

    @ObfuscatedName("cs.ay(B)V")
    public void method1924() {
        int var1 = this.field839;
        class261 var2 = this.field831.method4719();
        if (var2 == null) {
            this.field839 = -1;
            this.field837 = 0;
            this.field835 = 0;
            this.field838 = 0;
            this.field842 = 0;
            this.field843 = null;
        } else {
            this.field839 = var2.field2775;
            this.field837 = var2.field2776 * 128;
            this.field835 = var2.field2777 * 128;
            this.field838 = var2.field2736;
            this.field842 = var2.field2779;
            this.field843 = var2.field2741;
        }
        if (this.field839 != var1 && this.field841 != null) {
            Statics.field445.method676(this.field841);
            this.field841 = null;
        }
    }

    @ObfuscatedName("ib.an(IIILkt;II)V")
    public static void method4349(int arg0, int arg1, int arg2, class261 arg3, int arg4) {
        class72 var5 = new class72();
        var5.field832 = arg0;
        var5.field833 = arg1 * 128;
        var5.field834 = arg2 * 128;
        int var6 = arg3.field2746;
        int var7 = arg3.field2759;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2759;
            var7 = arg3.field2746;
        }
        var5.field846 = (arg1 + var6) * 128;
        var5.field836 = (arg2 + var7) * 128;
        var5.field839 = arg3.field2775;
        var5.field837 = arg3.field2776 * 128;
        var5.field835 = Math.max(arg3.field2777 * 128 - 128, 0);
        var5.field838 = arg3.field2736;
        var5.field842 = arg3.field2779;
        var5.field843 = arg3.field2741;
        if (arg3.field2783 != null) {
            var5.field831 = arg3;
            var5.method1924();
        }
        field844.method6892(var5);
        if (var5.field843 != null) {
            var5.field840 = var5.field838 + (int) (Math.random() * (double) (var5.field842 - var5.field838));
        }
    }

    @ObfuscatedName("ma.au(IIIII)V")
    public static void method5876(int arg0, int arg1, int arg2, int arg3) {
        for (class72 var4 = (class72) field844.method6907(); var4 != null; var4 = (class72) field844.method6896()) {
            if (var4.field839 != -1 || var4.field843 != null) {
                int var5 = 0;
                if (arg1 > var4.field846) {
                    var5 += arg1 - var4.field846;
                } else if (arg1 < var4.field833) {
                    var5 += var4.field833 - arg1;
                }
                if (arg2 > var4.field836) {
                    var5 += arg2 - var4.field836;
                } else if (arg2 < var4.field834) {
                    var5 += var4.field834 - arg2;
                }
                int var6 = Math.max(var5 - 64, 0);
                if (var6 >= var4.field837 || Statics.field1385.method2601() == 0 || var4.field832 != arg0) {
                    if (var4.field841 != null) {
                        Statics.field445.method676(var4.field841);
                        var4.field841 = null;
                    }
                    if (var4.field845 != null) {
                        Statics.field445.method676(var4.field845);
                        var4.field845 = null;
                    }
                } else {
                    float var7 = var4.field835 < var4.field837 ? Math.min(Math.max((float) (var4.field837 - var6) / (float) (var4.field837 - var4.field835), 0.0F), 1.0F) : 1.0F;
                    int var8 = (int) (var7 * (float) Statics.field1385.method2601());
                    if (var4.field841 != null) {
                        var4.field841.method833(var8);
                    } else if (var4.field839 >= 0) {
                        class40 var9 = class40.method723(Statics.field975, var4.field839, 0);
                        if (var9 != null) {
                            class41 var10 = var9.method712().method725(Statics.field3668);
                            class49 var11 = class49.method829(var10, 100, var8);
                            var11.method832(-1);
                            Statics.field445.method675(var11);
                            var4.field841 = var11;
                        }
                    }
                    if (var4.field845 != null) {
                        var4.field845.method833(var8);
                        if (!var4.field845.method8221()) {
                            var4.field845 = null;
                        }
                    } else if (var4.field843 != null && (var4.field840 -= arg3) <= 0) {
                        int var12 = (int) (Math.random() * (double) var4.field843.length);
                        class40 var13 = class40.method723(Statics.field975, var4.field843[var12], 0);
                        if (var13 != null) {
                            class41 var14 = var13.method712().method725(Statics.field3668);
                            class49 var15 = class49.method829(var14, 100, var8);
                            var15.method832(0);
                            Statics.field445.method675(var15);
                            var4.field845 = var15;
                            var4.field840 = var4.field838 + (int) (Math.random() * (double) (var4.field842 - var4.field838));
                        }
                    }
                }
            }
        }
    }
}
