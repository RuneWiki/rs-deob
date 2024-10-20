package deob;

@ObfuscatedName("t")
public final class class25 extends class212 {

    @ObfuscatedName("t.i")
    public static class203 field635 = new class203();

    @ObfuscatedName("t.h")
    public int field626;

    @ObfuscatedName("t.e")
    public int field627;

    @ObfuscatedName("t.g")
    public int field628;

    @ObfuscatedName("t.n")
    public int field629;

    @ObfuscatedName("t.u")
    public int field637;

    @ObfuscatedName("t.d")
    public int field630;

    @ObfuscatedName("t.l")
    public int field638;

    @ObfuscatedName("t.m")
    public class68 field633;

    @ObfuscatedName("t.j")
    public int field634;

    @ObfuscatedName("t.y")
    public int field631;

    @ObfuscatedName("t.s")
    public int[] field625;

    @ObfuscatedName("t.p")
    public int field632;

    @ObfuscatedName("t.v")
    public class68 field636;

    @ObfuscatedName("t.r")
    public class43 field639;

    @ObfuscatedName("m.i(I)V")
    public static void method111() {
        for (class25 var0 = (class25) field635.method3597(); var0 != null; var0 = (class25) field635.method3599()) {
            if (var0.field633 != null) {
                Statics.field12.method1144(var0.field633);
                var0.field633 = null;
            }
            if (var0.field636 != null) {
                Statics.field12.method1144(var0.field636);
                var0.field636 = null;
            }
        }
        field635.method3615();
    }

    @ObfuscatedName("fp.h(I)V")
    public static void method3181() {
        for (class25 var0 = (class25) field635.method3597(); var0 != null; var0 = (class25) field635.method3599()) {
            if (var0.field639 != null) {
                var0.method557();
            }
        }
    }

    @ObfuscatedName("t.e(B)V")
    public void method557() {
        int var1 = this.field638;
        class43 var2 = this.field639.method847();
        if (var2 == null) {
            this.field638 = -1;
            this.field630 = 0;
            this.field634 = 0;
            this.field631 = 0;
            this.field625 = null;
        } else {
            this.field638 = var2.field989;
            this.field630 = var2.field953 * 128;
            this.field634 = var2.field991;
            this.field631 = var2.field992;
            this.field625 = var2.field944;
        }
        if (this.field638 != var1 && this.field633 != null) {
            Statics.field12.method1144(this.field633);
            this.field633 = null;
        }
    }

    @ObfuscatedName("ak.g(IIILai;II)V")
    public static void method643(int arg0, int arg1, int arg2, class43 arg3, int arg4) {
        class25 var5 = new class25();
        var5.field626 = arg0;
        var5.field627 = arg1 * 128;
        var5.field628 = arg2 * 128;
        int var6 = arg3.field960;
        int var7 = arg3.field961;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field961;
            var7 = arg3.field960;
        }
        var5.field629 = (arg1 + var6) * 128;
        var5.field637 = (arg2 + var7) * 128;
        var5.field638 = arg3.field989;
        var5.field630 = arg3.field953 * 128;
        var5.field634 = arg3.field991;
        var5.field631 = arg3.field992;
        var5.field625 = arg3.field944;
        if (arg3.field986 != null) {
            var5.field639 = arg3;
            var5.method557();
        }
        field635.method3617(var5);
        if (var5.field625 != null) {
            var5.field632 = var5.field634 + (int) (Math.random() * (double) (var5.field631 - var5.field634));
        }
    }
}
