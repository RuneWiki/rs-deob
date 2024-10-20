package deob;

@ObfuscatedName("cj")
public final class class72 extends class515 {

    @ObfuscatedName("cj.ap")
    public static class411 field848 = new class411();

    @ObfuscatedName("cj.aw")
    public int field834;

    @ObfuscatedName("cj.ak")
    public int field835;

    @ObfuscatedName("cj.aj")
    public int field836;

    @ObfuscatedName("cj.ai")
    public int field837;

    @ObfuscatedName("cj.ay")
    public int field838;

    @ObfuscatedName("cj.as")
    public int field833;

    @ObfuscatedName("cj.ae")
    public int field840;

    @ObfuscatedName("cj.am")
    public int field841;

    @ObfuscatedName("cj.at")
    public class49 field850;

    @ObfuscatedName("cj.au")
    public int field843;

    @ObfuscatedName("cj.an")
    public int field842;

    @ObfuscatedName("cj.ao")
    public int[] field839;

    @ObfuscatedName("cj.af")
    public int field846;

    @ObfuscatedName("cj.ar")
    public class49 field847;

    @ObfuscatedName("cj.ab")
    public class210 field844;

    @ObfuscatedName("lm.ap(I)V")
    public static void method5757() {
        for (class72 var0 = (class72) field848.method7247(); var0 != null; var0 = (class72) field848.method7249()) {
            if (var0.field850 != null) {
                Statics.field4035.method699(var0.field850);
                var0.field850 = null;
            }
            if (var0.field847 != null) {
                Statics.field4035.method699(var0.field847);
                var0.field847 = null;
            }
        }
        field848.method7248();
    }

    @ObfuscatedName("aq.aw(I)V")
    public static void method317() {
        for (class72 var0 = (class72) field848.method7247(); var0 != null; var0 = (class72) field848.method7249()) {
            if (var0.field844 != null) {
                var0.method1991();
            }
        }
    }

    @ObfuscatedName("cj.ak(I)V")
    public void method1991() {
        int var1 = this.field841;
        class210 var2 = this.field844.method3968();
        if (var2 == null) {
            this.field841 = -1;
            this.field833 = 0;
            this.field840 = 0;
            this.field843 = 0;
            this.field842 = 0;
            this.field839 = null;
        } else {
            this.field841 = var2.field2177;
            this.field833 = var2.field2217 * 128;
            this.field840 = var2.field2218 * 128;
            this.field843 = var2.field2213;
            this.field842 = var2.field2181;
            this.field839 = var2.field2221;
        }
        if (this.field841 != var1 && this.field850 != null) {
            Statics.field4035.method699(this.field850);
            this.field850 = null;
        }
    }

    @ObfuscatedName("fl.aj(IIILir;IB)V")
    public static void method3333(int arg0, int arg1, int arg2, class210 arg3, int arg4) {
        class72 var5 = new class72();
        var5.field834 = arg0;
        var5.field835 = arg1 * 128;
        var5.field836 = arg2 * 128;
        int var6 = arg3.field2187;
        int var7 = arg3.field2216;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2216;
            var7 = arg3.field2187;
        }
        var5.field837 = (arg1 + var6) * 128;
        var5.field838 = (arg2 + var7) * 128;
        var5.field841 = arg3.field2177;
        var5.field833 = arg3.field2217 * 128;
        var5.field840 = Math.max(arg3.field2218 * 128 - 128, 0);
        var5.field843 = arg3.field2213;
        var5.field842 = arg3.field2181;
        var5.field839 = arg3.field2221;
        if (arg3.field2178 != null) {
            var5.field844 = arg3;
            var5.method1991();
        }
        field848.method7243(var5);
        if (var5.field839 != null) {
            var5.field846 = var5.field843 + (int) (Math.random() * (double) (var5.field842 - var5.field843));
        }
    }
}
