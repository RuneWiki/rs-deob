package deob;

@ObfuscatedName("cj")
public final class class71 extends class488 {

    @ObfuscatedName("cj.ac")
    public static class393 field858 = new class393();

    @ObfuscatedName("cj.al")
    public int field853;

    @ObfuscatedName("cj.ak")
    public int field855;

    @ObfuscatedName("cj.ax")
    public int field856;

    @ObfuscatedName("cj.ao")
    public int field857;

    @ObfuscatedName("cj.ah")
    public int field860;

    @ObfuscatedName("cj.ar")
    public int field854;

    @ObfuscatedName("cj.ab")
    public int field866;

    @ObfuscatedName("cj.am")
    public class49 field859;

    @ObfuscatedName("cj.av")
    public int field861;

    @ObfuscatedName("cj.ag")
    public int field863;

    @ObfuscatedName("cj.aa")
    public int[] field864;

    @ObfuscatedName("cj.ap")
    public int field865;

    @ObfuscatedName("cj.ay")
    public class49 field862;

    @ObfuscatedName("cj.as")
    public class220 field867;

    @ObfuscatedName("bl.ac(B)V")
    public static void method836() {
        for (class71 var0 = (class71) field858.method6532(); var0 != null; var0 = (class71) field858.method6543()) {
            if (var0.field859 != null) {
                Statics.field1626.method692(var0.field859);
                var0.field859 = null;
            }
            if (var0.field862 != null) {
                Statics.field1626.method692(var0.field862);
                var0.field862 = null;
            }
        }
        field858.method6534();
    }

    @ObfuscatedName("lq.al(I)V")
    public static void method5308() {
        for (class71 var0 = (class71) field858.method6532(); var0 != null; var0 = (class71) field858.method6543()) {
            if (var0.field867 != null) {
                var0.method1852();
            }
        }
    }

    @ObfuscatedName("cj.ak(B)V")
    public void method1852() {
        int var1 = this.field866;
        class220 var2 = this.field867.method3696();
        if (var2 == null) {
            this.field866 = -1;
            this.field854 = 0;
            this.field861 = 0;
            this.field863 = 0;
            this.field864 = null;
        } else {
            this.field866 = var2.field2211;
            this.field854 = var2.field2236 * 128;
            this.field861 = var2.field2239;
            this.field863 = var2.field2238;
            this.field864 = var2.field2209;
        }
        if (this.field866 != var1 && this.field859 != null) {
            Statics.field1626.method692(this.field859);
            this.field859 = null;
        }
    }

    @ObfuscatedName("dd.ax(IIILiz;IB)V")
    public static void method2381(int arg0, int arg1, int arg2, class220 arg3, int arg4) {
        class71 var5 = new class71();
        var5.field853 = arg0;
        var5.field855 = arg1 * 128;
        var5.field856 = arg2 * 128;
        int var6 = arg3.field2206;
        int var7 = arg3.field2207;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2207;
            var7 = arg3.field2206;
        }
        var5.field857 = (arg1 + var6) * 128;
        var5.field860 = (arg2 + var7) * 128;
        var5.field866 = arg3.field2211;
        var5.field854 = arg3.field2236 * 128;
        var5.field861 = arg3.field2239;
        var5.field863 = arg3.field2238;
        var5.field864 = arg3.field2209;
        if (arg3.field2232 != null) {
            var5.field867 = arg3;
            var5.method1852();
        }
        field858.method6526(var5);
        if (var5.field864 != null) {
            var5.field865 = var5.field861 + (int) (Math.random() * (double) (var5.field863 - var5.field861));
        }
    }
}
