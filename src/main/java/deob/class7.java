package deob;

@ObfuscatedName("s")
public final class class7 extends class177 {

    @ObfuscatedName("s.j")
    public static class175 field103 = new class175();

    @ObfuscatedName("s.y")
    public int field100;

    @ObfuscatedName("s.x")
    public int field93;

    @ObfuscatedName("s.z")
    public int field92;

    @ObfuscatedName("s.c")
    public int field94;

    @ObfuscatedName("s.e")
    public int field91;

    @ObfuscatedName("s.s")
    public int field98;

    @ObfuscatedName("s.i")
    public int field96;

    @ObfuscatedName("s.g")
    public int field97;

    @ObfuscatedName("s.q")
    public class44 field90;

    @ObfuscatedName("s.w")
    public int field95;

    @ObfuscatedName("s.k")
    public int[] field101;

    @ObfuscatedName("s.v")
    public int field102;

    @ObfuscatedName("s.o")
    public class44 field99;

    @ObfuscatedName("s.m")
    public class31 field104;

    @ObfuscatedName("ay.j(I)V")
    public static void method874() {
        for (class7 var0 = (class7) field103.method3279(); var0 != null; var0 = (class7) field103.method3249()) {
            if (var0.field90 != null) {
                Statics.field2415.method1081(var0.field90);
                var0.field90 = null;
            }
            if (var0.field99 != null) {
                Statics.field2415.method1081(var0.field99);
                var0.field99 = null;
            }
        }
        field103.method3255();
    }

    @ObfuscatedName("z.y(I)V")
    public static void method24() {
        for (class7 var0 = (class7) field103.method3279(); var0 != null; var0 = (class7) field103.method3249()) {
            if (var0.field104 != null) {
                var0.method46();
            }
        }
    }

    @ObfuscatedName("s.x(B)V")
    public void method46() {
        int var1 = this.field97;
        class31 var2 = this.field104.method630();
        if (var2 == null) {
            this.field97 = -1;
            this.field96 = 0;
            this.field98 = 0;
            this.field95 = 0;
            this.field101 = null;
        } else {
            this.field97 = var2.field838;
            this.field96 = var2.field836 * 128;
            this.field98 = var2.field831;
            this.field95 = var2.field841;
            this.field101 = var2.field839;
        }
        if (this.field97 != var1 && this.field90 != null) {
            Statics.field2415.method1081(this.field90);
            this.field90 = null;
        }
    }

    @ObfuscatedName("el.z(IIILad;II)V")
    public static void method2630(int arg0, int arg1, int arg2, class31 arg3, int arg4) {
        class7 var5 = new class7();
        var5.field100 = arg0;
        var5.field94 = arg1 * 128;
        var5.field93 = arg2 * 128;
        int var6 = arg3.field808;
        int var7 = arg3.field814;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field814;
            var7 = arg3.field808;
        }
        var5.field92 = (arg1 + var6) * 128;
        var5.field91 = (arg2 + var7) * 128;
        var5.field97 = arg3.field838;
        var5.field96 = arg3.field836 * 128;
        var5.field98 = arg3.field831;
        var5.field95 = arg3.field841;
        var5.field101 = arg3.field839;
        if (arg3.field835 != null) {
            var5.field104 = arg3;
            var5.method46();
        }
        field103.method3283(var5);
        if (var5.field101 != null) {
            var5.field102 = var5.field98 + (int) (Math.random() * (double) (var5.field95 - var5.field98));
        }
    }
}
