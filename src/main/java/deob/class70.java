package deob;

@ObfuscatedName("cq")
public final class class70 extends class461 {

    @ObfuscatedName("cq.at")
    public static class376 field850 = new class376();

    @ObfuscatedName("cq.an")
    public int field838;

    @ObfuscatedName("cq.av")
    public int field839;

    @ObfuscatedName("cq.as")
    public int field847;

    @ObfuscatedName("cq.ax")
    public int field848;

    @ObfuscatedName("cq.ap")
    public int field842;

    @ObfuscatedName("cq.ab")
    public int field844;

    @ObfuscatedName("cq.ak")
    public int field843;

    @ObfuscatedName("cq.ae")
    public class49 field845;

    @ObfuscatedName("cq.af")
    public int field846;

    @ObfuscatedName("cq.ao")
    public int field837;

    @ObfuscatedName("cq.aa")
    public int[] field841;

    @ObfuscatedName("cq.aj")
    public int field849;

    @ObfuscatedName("cq.ad")
    public class49 field840;

    @ObfuscatedName("cq.ac")
    public class205 field851;

    @ObfuscatedName("fh.at(I)V")
    public static void method2945() {
        for (class70 var0 = (class70) field850.method6309(); var0 != null; var0 = (class70) field850.method6311()) {
            if (var0.field845 != null) {
                Statics.field1945.method676(var0.field845);
                var0.field845 = null;
            }
            if (var0.field840 != null) {
                Statics.field1945.method676(var0.field840);
                var0.field840 = null;
            }
        }
        field850.method6314();
    }

    @ObfuscatedName("dr.an(B)V")
    public static void method2525() {
        for (class70 var0 = (class70) field850.method6309(); var0 != null; var0 = (class70) field850.method6311()) {
            if (var0.field851 != null) {
                var0.method1787();
            }
        }
    }

    @ObfuscatedName("cq.av(B)V")
    public void method1787() {
        int var1 = this.field843;
        class205 var2 = this.field851.method3578();
        if (var2 == null) {
            this.field843 = -1;
            this.field844 = 0;
            this.field846 = 0;
            this.field837 = 0;
            this.field841 = null;
        } else {
            this.field843 = var2.field2186;
            this.field844 = var2.field2190 * 128;
            this.field846 = var2.field2191;
            this.field837 = var2.field2148;
            this.field841 = var2.field2193;
        }
        if (this.field843 != var1 && this.field845 != null) {
            Statics.field1945.method676(this.field845);
            this.field845 = null;
        }
    }

    @ObfuscatedName("sb.as(IIILhx;IB)V")
    public static void method7829(int arg0, int arg1, int arg2, class205 arg3, int arg4) {
        class70 var5 = new class70();
        var5.field838 = arg0;
        var5.field839 = arg1 * 128;
        var5.field847 = arg2 * 128;
        int var6 = arg3.field2160;
        int var7 = arg3.field2161;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2161;
            var7 = arg3.field2160;
        }
        var5.field848 = (arg1 + var6) * 128;
        var5.field842 = (arg2 + var7) * 128;
        var5.field843 = arg3.field2186;
        var5.field844 = arg3.field2190 * 128;
        var5.field846 = arg3.field2191;
        var5.field837 = arg3.field2148;
        var5.field841 = arg3.field2193;
        if (arg3.field2152 != null) {
            var5.field851 = arg3;
            var5.method1787();
        }
        field850.method6303(var5);
        if (var5.field841 != null) {
            var5.field849 = var5.field846 + (int) (Math.random() * (double) (var5.field837 - var5.field846));
        }
    }
}
