package deob;

@ObfuscatedName("u")
public final class class7 extends class179 {

    @ObfuscatedName("u.c")
    public static class177 field103 = new class177();

    @ObfuscatedName("u.q")
    public int field95;

    @ObfuscatedName("u.y")
    public int field96;

    @ObfuscatedName("u.v")
    public int field97;

    @ObfuscatedName("u.g")
    public int field98;

    @ObfuscatedName("u.x")
    public int field99;

    @ObfuscatedName("u.u")
    public int field100;

    @ObfuscatedName("u.l")
    public int field101;

    @ObfuscatedName("u.a")
    public class45 field102;

    @ObfuscatedName("u.h")
    public int field114;

    @ObfuscatedName("u.t")
    public int field108;

    @ObfuscatedName("u.m")
    public int[] field105;

    @ObfuscatedName("u.s")
    public int field106;

    @ObfuscatedName("u.j")
    public class45 field107;

    @ObfuscatedName("u.b")
    public class32 field109;

    @ObfuscatedName("fv.c(I)V")
    public static void method3201() {
        for (class7 var0 = (class7) field103.method3163(); var0 != null; var0 = (class7) field103.method3165()) {
            if (var0.field102 != null) {
                Statics.field113.method1063(var0.field102);
                var0.field102 = null;
            }
            if (var0.field107 != null) {
                Statics.field113.method1063(var0.field107);
                var0.field107 = null;
            }
        }
        field103.method3175();
    }

    @ObfuscatedName("u.q(I)V")
    public void method40() {
        int var1 = this.field101;
        class32 var2 = this.field109.method628();
        if (var2 == null) {
            this.field101 = -1;
            this.field100 = 0;
            this.field114 = 0;
            this.field108 = 0;
            this.field105 = null;
        } else {
            this.field101 = var2.field871;
            this.field100 = var2.field872 * 128;
            this.field114 = var2.field826;
            this.field108 = var2.field857;
            this.field105 = var2.field869;
        }
        if (this.field101 != var1 && this.field102 != null) {
            Statics.field113.method1063(this.field102);
            this.field102 = null;
        }
    }

    @ObfuscatedName("y.y(IIILaj;II)V")
    public static void method23(int arg0, int arg1, int arg2, class32 arg3, int arg4) {
        class7 var5 = new class7();
        var5.field95 = arg0;
        var5.field96 = arg1 * 128;
        var5.field97 = arg2 * 128;
        int var6 = arg3.field842;
        int var7 = arg3.field835;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field835;
            var7 = arg3.field842;
        }
        var5.field98 = (arg1 + var6) * 128;
        var5.field99 = (arg2 + var7) * 128;
        var5.field101 = arg3.field871;
        var5.field100 = arg3.field872 * 128;
        var5.field114 = arg3.field826;
        var5.field108 = arg3.field857;
        var5.field105 = arg3.field869;
        if (arg3.field868 != null) {
            var5.field109 = arg3;
            var5.method40();
        }
        field103.method3158(var5);
        if (var5.field105 != null) {
            var5.field106 = var5.field114 + (int) (Math.random() * (double) (var5.field108 - var5.field114));
        }
    }
}
