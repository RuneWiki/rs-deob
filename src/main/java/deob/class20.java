package deob;

@ObfuscatedName("z")
public final class class20 extends class187 {

    @ObfuscatedName("z.g")
    public static class178 field552 = new class178();

    @ObfuscatedName("z.s")
    public int field551;

    @ObfuscatedName("z.v")
    public int field543;

    @ObfuscatedName("z.o")
    public int field560;

    @ObfuscatedName("z.k")
    public int field545;

    @ObfuscatedName("z.m")
    public int field546;

    @ObfuscatedName("z.i")
    public int field547;

    @ObfuscatedName("z.t")
    public int field548;

    @ObfuscatedName("z.l")
    public int field549;

    @ObfuscatedName("z.p")
    public class58 field555;

    @ObfuscatedName("z.r")
    public class36 field550;

    @ObfuscatedName("z.j")
    public int field544;

    @ObfuscatedName("z.c")
    public int[] field556;

    @ObfuscatedName("z.q")
    public int field553;

    @ObfuscatedName("z.n")
    public class58 field542;

    @ObfuscatedName("ag.g(B)V")
    public static void method1008() {
        for (class20 var0 = (class20) field552.method3189(); var0 != null; var0 = (class20) field552.method3182()) {
            if (var0.field555 != null) {
                Statics.field73.method930(var0.field555);
                var0.field555 = null;
            }
            if (var0.field542 != null) {
                Statics.field73.method930(var0.field542);
                var0.field542 = null;
            }
        }
        field552.method3183();
    }

    @ObfuscatedName("az.s(B)V")
    public static void method611() {
        for (class20 var0 = (class20) field552.method3189(); var0 != null; var0 = (class20) field552.method3182()) {
            if (var0.field550 != null) {
                var0.method473();
            }
        }
    }

    @ObfuscatedName("z.v(I)V")
    public void method473() {
        int var1 = this.field549;
        class36 var2 = this.field550.method651();
        if (var2 == null) {
            this.field549 = -1;
            this.field548 = 0;
            this.field551 = 0;
            this.field544 = 0;
            this.field556 = null;
        } else {
            this.field549 = var2.field851;
            this.field548 = var2.field878 * 128;
            this.field551 = var2.field874;
            this.field544 = var2.field859;
            this.field556 = var2.field876;
        }
        if (this.field549 != var1 && this.field555 != null) {
            Statics.field73.method930(this.field555);
            this.field555 = null;
        }
    }

    @ObfuscatedName("m.o(IIILam;II)V")
    public static void method44(int arg0, int arg1, int arg2, class36 arg3, int arg4) {
        class20 var5 = new class20();
        var5.field543 = arg0;
        var5.field560 = arg1 * 128;
        var5.field545 = arg2 * 128;
        int var6 = arg3.field843;
        int var7 = arg3.field844;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field844;
            var7 = arg3.field843;
        }
        var5.field546 = (arg1 + var6) * 128;
        var5.field547 = (arg2 + var7) * 128;
        var5.field549 = arg3.field851;
        var5.field548 = arg3.field878 * 128;
        var5.field551 = arg3.field874;
        var5.field544 = arg3.field859;
        var5.field556 = arg3.field876;
        if (arg3.field870 != null) {
            var5.field550 = arg3;
            var5.method473();
        }
        field552.method3184(var5);
        if (var5.field556 != null) {
            var5.field553 = var5.field551 + (int) (Math.random() * (double) (var5.field544 - var5.field551));
        }
    }
}
