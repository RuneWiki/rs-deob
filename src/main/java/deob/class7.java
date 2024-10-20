package deob;

@ObfuscatedName("u")
public final class class7 extends class179 {

    @ObfuscatedName("u.i")
    public static class177 field112 = new class177();

    @ObfuscatedName("u.p")
    public int field95;

    @ObfuscatedName("u.a")
    public int field96;

    @ObfuscatedName("u.l")
    public int field97;

    @ObfuscatedName("u.q")
    public int field104;

    @ObfuscatedName("u.b")
    public int field99;

    @ObfuscatedName("u.u")
    public int field100;

    @ObfuscatedName("u.d")
    public int field113;

    @ObfuscatedName("u.m")
    public class45 field103;

    @ObfuscatedName("u.v")
    public int field94;

    @ObfuscatedName("u.j")
    public int field111;

    @ObfuscatedName("u.f")
    public int[] field114;

    @ObfuscatedName("u.h")
    public int field98;

    @ObfuscatedName("u.o")
    public class45 field107;

    @ObfuscatedName("u.z")
    public class32 field108;

    @ObfuscatedName("aq.i(I)V")
    public static void method556() {
        for (class7 var0 = (class7) field112.method3313(); var0 != null; var0 = (class7) field112.method3292()) {
            if (var0.field103 != null) {
                Statics.field2325.method1058(var0.field103);
                var0.field103 = null;
            }
            if (var0.field107 != null) {
                Statics.field2325.method1058(var0.field107);
                var0.field107 = null;
            }
        }
        field112.method3284();
    }

    @ObfuscatedName("ag.p(I)V")
    public static void method722() {
        for (class7 var0 = (class7) field112.method3313(); var0 != null; var0 = (class7) field112.method3292()) {
            if (var0.field108 != null) {
                var0.method62();
            }
        }
    }

    @ObfuscatedName("u.a(I)V")
    public void method62() {
        int var1 = this.field113;
        class32 var2 = this.field108.method639();
        if (var2 == null) {
            this.field113 = -1;
            this.field100 = 0;
            this.field94 = 0;
            this.field111 = 0;
            this.field114 = null;
        } else {
            this.field113 = var2.field866;
            this.field100 = var2.field867 * 128;
            this.field94 = var2.field868;
            this.field111 = var2.field869;
            this.field114 = var2.field863;
        }
        if (this.field113 != var1 && this.field103 != null) {
            Statics.field2325.method1058(this.field103);
            this.field103 = null;
        }
    }

    @ObfuscatedName("fy.l(IIILai;II)V")
    public static void method3325(int arg0, int arg1, int arg2, class32 arg3, int arg4) {
        class7 var5 = new class7();
        var5.field95 = arg0;
        var5.field96 = arg1 * 128;
        var5.field97 = arg2 * 128;
        int var6 = arg3.field836;
        int var7 = arg3.field837;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field837;
            var7 = arg3.field836;
        }
        var5.field104 = (arg1 + var6) * 128;
        var5.field99 = (arg2 + var7) * 128;
        var5.field113 = arg3.field866;
        var5.field100 = arg3.field867 * 128;
        var5.field94 = arg3.field868;
        var5.field111 = arg3.field869;
        var5.field114 = arg3.field863;
        if (arg3.field856 != null) {
            var5.field108 = arg3;
            var5.method62();
        }
        field112.method3308(var5);
        if (var5.field114 != null) {
            var5.field98 = var5.field94 + (int) (Math.random() * (double) (var5.field111 - var5.field94));
        }
    }
}
