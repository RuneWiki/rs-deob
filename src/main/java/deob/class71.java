package deob;

@ObfuscatedName("cv")
public final class class71 extends class493 {

    @ObfuscatedName("cv.az")
    public static class398 field856 = new class398();

    @ObfuscatedName("cv.ah")
    public int field845;

    @ObfuscatedName("cv.af")
    public int field843;

    @ObfuscatedName("cv.at")
    public int field841;

    @ObfuscatedName("cv.an")
    public int field854;

    @ObfuscatedName("cv.ao")
    public int field846;

    @ObfuscatedName("cv.ab")
    public int field847;

    @ObfuscatedName("cv.aw")
    public int field848;

    @ObfuscatedName("cv.ad")
    public int field849;

    @ObfuscatedName("cv.al")
    public class49 field850;

    @ObfuscatedName("cv.as")
    public int field842;

    @ObfuscatedName("cv.ag")
    public int field855;

    @ObfuscatedName("cv.ai")
    public int[] field853;

    @ObfuscatedName("cv.ax")
    public int field844;

    @ObfuscatedName("cv.ar")
    public class49 field852;

    @ObfuscatedName("cv.aj")
    public class222 field851;

    @ObfuscatedName("ac.az(B)V")
    public static void method290() {
        for (class71 var0 = (class71) field856.method6591(); var0 != null; var0 = (class71) field856.method6605()) {
            if (var0.field850 != null) {
                Statics.field1283.method669(var0.field850);
                var0.field850 = null;
            }
            if (var0.field852 != null) {
                Statics.field1283.method669(var0.field852);
                var0.field852 = null;
            }
        }
        field856.method6610();
    }

    @ObfuscatedName("cv.ah(I)V")
    public void method1818() {
        int var1 = this.field849;
        class222 var2 = this.field851.method3755();
        if (var2 == null) {
            this.field849 = -1;
            this.field847 = 0;
            this.field848 = 0;
            this.field842 = 0;
            this.field855 = 0;
            this.field853 = null;
        } else {
            this.field849 = var2.field2253;
            this.field847 = var2.field2285 * 128;
            this.field848 = var2.field2297 * 128;
            this.field842 = var2.field2294;
            this.field855 = var2.field2295;
            this.field853 = var2.field2296;
        }
        if (this.field849 != var1 && this.field850 != null) {
            Statics.field1283.method669(this.field850);
            this.field850 = null;
        }
    }

    @ObfuscatedName("ow.af(IIILis;IB)V")
    public static void method6436(int arg0, int arg1, int arg2, class222 arg3, int arg4) {
        class71 var5 = new class71();
        var5.field845 = arg0;
        var5.field843 = arg1 * 128;
        var5.field841 = arg2 * 128;
        int var6 = arg3.field2262;
        int var7 = arg3.field2263;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2263;
            var7 = arg3.field2262;
        }
        var5.field854 = (arg1 + var6) * 128;
        var5.field846 = (arg2 + var7) * 128;
        var5.field849 = arg3.field2253;
        var5.field847 = arg3.field2285 * 128;
        var5.field848 = Math.max(arg3.field2297 * 128 - 128, 0);
        var5.field842 = arg3.field2294;
        var5.field855 = arg3.field2295;
        var5.field853 = arg3.field2296;
        if (arg3.field2290 != null) {
            var5.field851 = arg3;
            var5.method1818();
        }
        field856.method6581(var5);
        if (var5.field853 != null) {
            var5.field844 = var5.field842 + (int) (Math.random() * (double) (var5.field855 - var5.field842));
        }
    }
}
