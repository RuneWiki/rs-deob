package deob;

@ObfuscatedName("ab")
public final class class32 extends class128 {

    @ObfuscatedName("ab.f")
    public static class129 field733 = new class129();

    @ObfuscatedName("ab.i")
    public int field724;

    @ObfuscatedName("ab.u")
    public int field725;

    @ObfuscatedName("ab.h")
    public int field726;

    @ObfuscatedName("ab.r")
    public class198 field730;

    @ObfuscatedName("ab.o")
    public int field727;

    @ObfuscatedName("ab.l")
    public int field723;

    @ObfuscatedName("ab.n")
    public int field729;

    @ObfuscatedName("ab.m")
    public int field735;

    @ObfuscatedName("ab.w")
    public class67 field737;

    @ObfuscatedName("ab.j")
    public int field732;

    @ObfuscatedName("ab.s")
    public int field728;

    @ObfuscatedName("ab.q")
    public int[] field734;

    @ObfuscatedName("ab.d")
    public int field731;

    @ObfuscatedName("ab.p")
    public class67 field736;

    @ObfuscatedName("n.f(B)V")
    public static void method89() {
        for (class32 var0 = (class32) field733.method2301(); var0 != null; var0 = (class32) field733.method2309()) {
            if (var0.field737 != null) {
                Statics.field225.method921(var0.field737);
                var0.field737 = null;
            }
            if (var0.field736 != null) {
                Statics.field225.method921(var0.field736);
                var0.field736 = null;
            }
        }
        field733.method2295();
    }

    @ObfuscatedName("ab.i(I)V")
    public void method662() {
        int var1 = this.field735;
        class198 var2 = this.field730.method3423();
        if (var2 == null) {
            this.field735 = -1;
            this.field729 = 0;
            this.field732 = 0;
            this.field728 = 0;
            this.field734 = null;
        } else {
            this.field735 = var2.field2911;
            this.field729 = var2.field2910 * 128;
            this.field732 = var2.field2944;
            this.field728 = var2.field2945;
            this.field734 = var2.field2940;
        }
        if (this.field735 != var1 && this.field737 != null) {
            Statics.field225.method921(this.field737);
            this.field737 = null;
        }
    }

    @ObfuscatedName("x.u(IIILgn;II)V")
    public static void method177(int arg0, int arg1, int arg2, class198 arg3, int arg4) {
        class32 var5 = new class32();
        var5.field724 = arg0;
        var5.field725 = arg1 * 128;
        var5.field726 = arg2 * 128;
        int var6 = arg3.field2943;
        int var7 = arg3.field2914;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2914;
            var7 = arg3.field2943;
        }
        var5.field727 = (arg1 + var6) * 128;
        var5.field723 = (arg2 + var7) * 128;
        var5.field735 = arg3.field2911;
        var5.field729 = arg3.field2910 * 128;
        var5.field732 = arg3.field2944;
        var5.field728 = arg3.field2945;
        var5.field734 = arg3.field2940;
        if (arg3.field2939 != null) {
            var5.field730 = arg3;
            var5.method662();
        }
        field733.method2296(var5);
        if (var5.field734 != null) {
            var5.field731 = var5.field732 + (int) (Math.random() * (double) (var5.field728 - var5.field732));
        }
    }
}
