package deob;

@ObfuscatedName("cr")
public final class class66 extends class449 {

    @ObfuscatedName("cr.af")
    public static class363 field828 = new class363();

    @ObfuscatedName("cr.an")
    public int field817;

    @ObfuscatedName("cr.aw")
    public int field818;

    @ObfuscatedName("cr.ac")
    public int field831;

    @ObfuscatedName("cr.au")
    public int field820;

    @ObfuscatedName("cr.ab")
    public int field821;

    @ObfuscatedName("cr.aq")
    public int field816;

    @ObfuscatedName("cr.al")
    public int field822;

    @ObfuscatedName("cr.at")
    public class48 field824;

    @ObfuscatedName("cr.aa")
    public int field825;

    @ObfuscatedName("cr.ay")
    public int field826;

    @ObfuscatedName("cr.ao")
    public int[] field827;

    @ObfuscatedName("cr.ax")
    public int field823;

    @ObfuscatedName("cr.ai")
    public class48 field829;

    @ObfuscatedName("cr.ag")
    public class201 field830;

    @ObfuscatedName("ht.af(B)V")
    public static void method3608() {
        for (class66 var0 = (class66) field828.method6329(); var0 != null; var0 = (class66) field828.method6338()) {
            if (var0.field824 != null) {
                Statics.field1574.method761(var0.field824);
                var0.field824 = null;
            }
            if (var0.field829 != null) {
                Statics.field1574.method761(var0.field829);
                var0.field829 = null;
            }
        }
        field828.method6323();
    }

    @ObfuscatedName("am.an(I)V")
    public static void method276() {
        for (class66 var0 = (class66) field828.method6329(); var0 != null; var0 = (class66) field828.method6338()) {
            if (var0.field830 != null) {
                var0.method1795();
            }
        }
    }

    @ObfuscatedName("cr.aw(I)V")
    public void method1795() {
        int var1 = this.field822;
        class201 var2 = this.field830.method3669();
        if (var2 == null) {
            this.field822 = -1;
            this.field816 = 0;
            this.field825 = 0;
            this.field826 = 0;
            this.field827 = null;
        } else {
            this.field822 = var2.field2201;
            this.field816 = var2.field2202 * 128;
            this.field825 = var2.field2205;
            this.field826 = var2.field2204;
            this.field827 = var2.field2168;
        }
        if (this.field822 != var1 && this.field824 != null) {
            Statics.field1574.method761(this.field824);
            this.field824 = null;
        }
    }

    @ObfuscatedName("bm.ac(IIILhq;IB)V")
    public static void method677(int arg0, int arg1, int arg2, class201 arg3, int arg4) {
        class66 var5 = new class66();
        var5.field817 = arg0;
        var5.field818 = arg1 * 128;
        var5.field831 = arg2 * 128;
        int var6 = arg3.field2172;
        int var7 = arg3.field2173;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2173;
            var7 = arg3.field2172;
        }
        var5.field820 = (arg1 + var6) * 128;
        var5.field821 = (arg2 + var7) * 128;
        var5.field822 = arg3.field2201;
        var5.field816 = arg3.field2202 * 128;
        var5.field825 = arg3.field2205;
        var5.field826 = arg3.field2204;
        var5.field827 = arg3.field2168;
        if (arg3.field2198 != null) {
            var5.field830 = arg3;
            var5.method1795();
        }
        field828.method6324(var5);
        if (var5.field827 != null) {
            var5.field823 = var5.field825 + (int) (Math.random() * (double) (var5.field826 - var5.field825));
        }
    }
}
