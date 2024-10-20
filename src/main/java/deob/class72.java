package deob;

@ObfuscatedName("cc")
public final class class72 extends class505 {

    @ObfuscatedName("cc.aq")
    public static class407 field856 = new class407();

    @ObfuscatedName("cc.ad")
    public int field845;

    @ObfuscatedName("cc.ag")
    public int field842;

    @ObfuscatedName("cc.ak")
    public int field843;

    @ObfuscatedName("cc.ap")
    public int field844;

    @ObfuscatedName("cc.an")
    public int field852;

    @ObfuscatedName("cc.aj")
    public int field846;

    @ObfuscatedName("cc.av")
    public int field847;

    @ObfuscatedName("cc.ab")
    public int field848;

    @ObfuscatedName("cc.ai")
    public class49 field849;

    @ObfuscatedName("cc.ae")
    public int field850;

    @ObfuscatedName("cc.au")
    public int field851;

    @ObfuscatedName("cc.ah")
    public int[] field853;

    @ObfuscatedName("cc.az")
    public int field841;

    @ObfuscatedName("cc.ax")
    public class49 field840;

    @ObfuscatedName("cc.ac")
    public class207 field855;

    @ObfuscatedName("co.aq(I)V")
    public static void method1098() {
        for (class72 var0 = (class72) field856.method6814(); var0 != null; var0 = (class72) field856.method6799()) {
            if (var0.field849 != null) {
                Statics.field2515.method744(var0.field849);
                var0.field849 = null;
            }
            if (var0.field840 != null) {
                Statics.field2515.method744(var0.field840);
                var0.field840 = null;
            }
        }
        field856.method6806();
    }

    @ObfuscatedName("jf.ad(B)V")
    public static void method4138() {
        for (class72 var0 = (class72) field856.method6814(); var0 != null; var0 = (class72) field856.method6799()) {
            if (var0.field855 != null) {
                var0.method1886();
            }
        }
    }

    @ObfuscatedName("cc.ag(I)V")
    public void method1886() {
        int var1 = this.field848;
        class207 var2 = this.field855.method3616();
        if (var2 == null) {
            this.field848 = -1;
            this.field846 = 0;
            this.field847 = 0;
            this.field850 = 0;
            this.field851 = 0;
            this.field853 = null;
        } else {
            this.field848 = var2.field2197;
            this.field846 = var2.field2198 * 128;
            this.field847 = var2.field2199 * 128;
            this.field850 = var2.field2200;
            this.field851 = var2.field2201;
            this.field853 = var2.field2202;
        }
        if (this.field848 != var1 && this.field849 != null) {
            Statics.field2515.method744(this.field849);
            this.field849 = null;
        }
    }

    @ObfuscatedName("fg.ak(IIILho;IB)V")
    public static void method2973(int arg0, int arg1, int arg2, class207 arg3, int arg4) {
        class72 var5 = new class72();
        var5.field845 = arg0;
        var5.field842 = arg1 * 128;
        var5.field843 = arg2 * 128;
        int var6 = arg3.field2168;
        int var7 = arg3.field2169;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2169;
            var7 = arg3.field2168;
        }
        var5.field844 = (arg1 + var6) * 128;
        var5.field852 = (arg2 + var7) * 128;
        var5.field848 = arg3.field2197;
        var5.field846 = arg3.field2198 * 128;
        var5.field847 = Math.max(arg3.field2199 * 128 - 128, 0);
        var5.field850 = arg3.field2200;
        var5.field851 = arg3.field2201;
        var5.field853 = arg3.field2202;
        if (arg3.field2194 != null) {
            var5.field855 = arg3;
            var5.method1886();
        }
        field856.method6794(var5);
        if (var5.field853 != null) {
            var5.field841 = var5.field850 + (int) (Math.random() * (double) (var5.field851 - var5.field850));
        }
    }

    @ObfuscatedName("im.ap(IIIIB)V")
    public static void method4006(int arg0, int arg1, int arg2, int arg3) {
        for (class72 var4 = (class72) field856.method6814(); var4 != null; var4 = (class72) field856.method6799()) {
            if (var4.field848 != -1 || var4.field853 != null) {
                int var5 = 0;
                if (arg1 > var4.field844) {
                    var5 += arg1 - var4.field844;
                } else if (arg1 < var4.field842) {
                    var5 += var4.field842 - arg1;
                }
                if (arg2 > var4.field852) {
                    var5 += arg2 - var4.field852;
                } else if (arg2 < var4.field843) {
                    var5 += var4.field843 - arg2;
                }
                int var6 = Math.max(var5 - 64, 0);
                if (var6 >= var4.field846 || Statics.field1379.method2489() == 0 || var4.field845 != arg0) {
                    if (var4.field849 != null) {
                        Statics.field2515.method744(var4.field849);
                        var4.field849 = null;
                    }
                    if (var4.field840 != null) {
                        Statics.field2515.method744(var4.field840);
                        var4.field840 = null;
                    }
                } else {
                    float var7 = var4.field847 < var4.field846 ? Math.min(Math.max((float) (var4.field846 - var6) / (float) (var4.field846 - var4.field847), 0.0F), 1.0F) : 1.0F;
                    int var8 = (int) (var7 * (float) Statics.field1379.method2489());
                    if (var4.field849 != null) {
                        var4.field849.method881(var8);
                    } else if (var4.field848 >= 0) {
                        class40 var9 = class40.method765(Statics.field4704, var4.field848, 0);
                        if (var9 != null) {
                            class41 var10 = var9.method754().method766(Statics.field1868);
                            class49 var11 = class49.method933(var10, 100, var8);
                            var11.method963(-1);
                            Statics.field2515.method711(var11);
                            var4.field849 = var11;
                        }
                    }
                    if (var4.field840 != null) {
                        var4.field840.method881(var8);
                        if (!var4.field840.method8131()) {
                            var4.field840 = null;
                        }
                    } else if (var4.field853 != null && (var4.field841 -= arg3) <= 0) {
                        int var12 = (int) (Math.random() * (double) var4.field853.length);
                        class40 var13 = class40.method765(Statics.field4704, var4.field853[var12], 0);
                        if (var13 != null) {
                            class41 var14 = var13.method754().method766(Statics.field1868);
                            class49 var15 = class49.method933(var14, 100, var8);
                            var15.method963(0);
                            Statics.field2515.method711(var15);
                            var4.field840 = var15;
                            var4.field841 = var4.field850 + (int) (Math.random() * (double) (var4.field851 - var4.field850));
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bh.an(IIILho;IB)V")
    public static void method864(int arg0, int arg1, int arg2, class207 arg3, int arg4) {
        if (arg3 == null || !arg3.method3619()) {
            return;
        }
        int var5 = arg3.field2168;
        int var6 = arg3.field2169;
        if (arg4 == 1 || arg4 == 3) {
            var5 = arg3.field2169;
            var6 = arg3.field2168;
        }
        int var7 = (arg1 + var5) * 128;
        int var8 = (arg2 + var6) * 128;
        int var9 = arg1 * 128;
        int var10 = arg2 * 128;
        int var11 = arg3.field2197;
        int var12 = arg3.field2198 * 128;
        int var13 = arg3.field2199 * 128;
        if (arg3.field2194 != null) {
            class207 var14 = arg3.method3616();
            if (var14 != null) {
                var11 = var14.field2197;
                var12 = var14.field2198 * 128;
                var13 = var14.field2199 * 128;
            }
        }
        for (class72 var15 = (class72) field856.method6814(); var15 != null; var15 = (class72) field856.method6799()) {
            if (var15.field845 == arg0 && var15.field842 == var9 && var15.field843 == var10 && var15.field844 == var7 && var15.field852 == var8 && var15.field848 == var11 && var15.field846 == var12 && var15.field847 == var13) {
                if (var15.field849 != null) {
                    Statics.field2515.method744(var15.field849);
                    var15.field849 = null;
                }
                if (var15.field840 != null) {
                    Statics.field2515.method744(var15.field840);
                    var15.field840 = null;
                }
                var15.method8130();
                break;
            }
        }
    }
}
