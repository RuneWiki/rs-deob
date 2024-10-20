package deob;

@ObfuscatedName("j")
public final class class7 extends class179 {

    @ObfuscatedName("j.b")
    public static class177 field107 = new class177();

    @ObfuscatedName("j.e")
    public int field93;

    @ObfuscatedName("j.g")
    public int field94;

    @ObfuscatedName("j.o")
    public int field98;

    @ObfuscatedName("j.a")
    public int field108;

    @ObfuscatedName("j.h")
    public int field100;

    @ObfuscatedName("j.j")
    public int field102;

    @ObfuscatedName("j.f")
    public int field99;

    @ObfuscatedName("j.q")
    public class45 field110;

    @ObfuscatedName("j.l")
    public int field101;

    @ObfuscatedName("j.d")
    public int field96;

    @ObfuscatedName("j.z")
    public int[] field103;

    @ObfuscatedName("j.n")
    public int field104;

    @ObfuscatedName("j.t")
    public class45 field105;

    @ObfuscatedName("j.w")
    public class32 field106;

    @ObfuscatedName("du.b(I)V")
    public static void method2361() {
        for (class7 var0 = (class7) field107.method3314(); var0 != null; var0 = (class7) field107.method3325()) {
            if (var0.field110 != null) {
                Statics.field1284.method1080(var0.field110);
                var0.field110 = null;
            }
            if (var0.field105 != null) {
                Statics.field1284.method1080(var0.field105);
                var0.field105 = null;
            }
        }
        field107.method3308();
    }

    @ObfuscatedName("f.e(I)V")
    public static void method50() {
        for (class7 var0 = (class7) field107.method3314(); var0 != null; var0 = (class7) field107.method3325()) {
            if (var0.field106 != null) {
                var0.method39();
            }
        }
    }

    @ObfuscatedName("j.g(I)V")
    public void method39() {
        int var1 = this.field99;
        class32 var2 = this.field106.method641();
        if (var2 == null) {
            this.field99 = -1;
            this.field102 = 0;
            this.field101 = 0;
            this.field96 = 0;
            this.field103 = null;
        } else {
            this.field99 = var2.field820;
            this.field102 = var2.field800 * 128;
            this.field101 = var2.field847;
            this.field96 = var2.field848;
            this.field103 = var2.field849;
        }
        if (this.field99 != var1 && this.field110 != null) {
            Statics.field1284.method1080(this.field110);
            this.field110 = null;
        }
    }

    @ObfuscatedName("bm.o(IIILam;IB)V")
    public static void method1358(int arg0, int arg1, int arg2, class32 arg3, int arg4) {
        class7 var5 = new class7();
        var5.field93 = arg0;
        var5.field94 = arg1 * 128;
        var5.field98 = arg2 * 128;
        int var6 = arg3.field809;
        int var7 = arg3.field817;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field817;
            var7 = arg3.field809;
        }
        var5.field108 = (arg1 + var6) * 128;
        var5.field100 = (arg2 + var7) * 128;
        var5.field99 = arg3.field820;
        var5.field102 = arg3.field800 * 128;
        var5.field101 = arg3.field847;
        var5.field96 = arg3.field848;
        var5.field103 = arg3.field849;
        if (arg3.field842 != null) {
            var5.field106 = arg3;
            var5.method39();
        }
        field107.method3318(var5);
        if (var5.field103 != null) {
            var5.field104 = var5.field101 + (int) (Math.random() * (double) (var5.field96 - var5.field101));
        }
    }
}
