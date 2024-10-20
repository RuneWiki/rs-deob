package deob;

@ObfuscatedName("ck")
public final class class71 extends class492 {

    @ObfuscatedName("ck.aq")
    public static class397 field870 = new class397();

    @ObfuscatedName("ck.aw")
    public int field864;

    @ObfuscatedName("ck.al")
    public int field868;

    @ObfuscatedName("ck.ai")
    public int field866;

    @ObfuscatedName("ck.ar")
    public int field867;

    @ObfuscatedName("ck.as")
    public int field869;

    @ObfuscatedName("ck.aa")
    public int field873;

    @ObfuscatedName("ck.az")
    public int field865;

    @ObfuscatedName("ck.ao")
    public int field871;

    @ObfuscatedName("ck.au")
    public class49 field872;

    @ObfuscatedName("ck.ak")
    public int field876;

    @ObfuscatedName("ck.ah")
    public int field878;

    @ObfuscatedName("ck.aj")
    public int[] field875;

    @ObfuscatedName("ck.af")
    public int field879;

    @ObfuscatedName("ck.ax")
    public class49 field877;

    @ObfuscatedName("ck.an")
    public class204 field863;

    @ObfuscatedName("dm.aq(B)V")
    public static void method2248() {
        for (class71 var0 = (class71) field870.method6702(); var0 != null; var0 = (class71) field870.method6684()) {
            if (var0.field872 != null) {
                Statics.field3083.method659(var0.field872);
                var0.field872 = null;
            }
            if (var0.field877 != null) {
                Statics.field3083.method659(var0.field877);
                var0.field877 = null;
            }
        }
        field870.method6677();
    }

    @ObfuscatedName("ck.aw(B)V")
    public void method1851() {
        int var1 = this.field871;
        class204 var2 = this.field863.method3597();
        if (var2 == null) {
            this.field871 = -1;
            this.field873 = 0;
            this.field865 = 0;
            this.field876 = 0;
            this.field878 = 0;
            this.field875 = null;
        } else {
            this.field871 = var2.field2162;
            this.field873 = var2.field2163 * 128;
            this.field865 = var2.field2131 * 128;
            this.field876 = var2.field2124;
            this.field878 = var2.field2156;
            this.field875 = var2.field2167;
        }
        if (this.field871 != var1 && this.field872 != null) {
            Statics.field3083.method659(this.field872);
            this.field872 = null;
        }
    }

    @ObfuscatedName("kc.al(IIILhe;II)V")
    public static void method4622(int arg0, int arg1, int arg2, class204 arg3, int arg4) {
        class71 var5 = new class71();
        var5.field864 = arg0;
        var5.field868 = arg1 * 128;
        var5.field866 = arg2 * 128;
        int var6 = arg3.field2133;
        int var7 = arg3.field2134;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2134;
            var7 = arg3.field2133;
        }
        var5.field867 = (arg1 + var6) * 128;
        var5.field869 = (arg2 + var7) * 128;
        var5.field871 = arg3.field2162;
        var5.field873 = arg3.field2163 * 128;
        var5.field865 = Math.max(arg3.field2131 * 128 - 128, 0);
        var5.field876 = arg3.field2124;
        var5.field878 = arg3.field2156;
        var5.field875 = arg3.field2167;
        if (arg3.field2159 != null) {
            var5.field863 = arg3;
            var5.method1851();
        }
        field870.method6678(var5);
        if (var5.field875 != null) {
            var5.field879 = var5.field876 + (int) (Math.random() * (double) (var5.field878 - var5.field876));
        }
    }
}
