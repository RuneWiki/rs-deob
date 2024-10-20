package deob;

@ObfuscatedName("l")
public final class class7 extends class177 {

    @ObfuscatedName("l.g")
    public static class175 field84 = new class175();

    @ObfuscatedName("l.e")
    public int field101;

    @ObfuscatedName("l.n")
    public int field83;

    @ObfuscatedName("l.j")
    public int field85;

    @ObfuscatedName("l.i")
    public int field82;

    @ObfuscatedName("l.o")
    public int field87;

    @ObfuscatedName("l.l")
    public int field88;

    @ObfuscatedName("l.p")
    public int field92;

    @ObfuscatedName("l.t")
    public class44 field90;

    @ObfuscatedName("l.w")
    public int field86;

    @ObfuscatedName("l.r")
    public class31 field89;

    @ObfuscatedName("l.a")
    public int field105;

    @ObfuscatedName("l.q")
    public int[] field93;

    @ObfuscatedName("l.z")
    public int field91;

    @ObfuscatedName("l.d")
    public class44 field95;

    @ObfuscatedName("bn.g(I)V")
    public static void method1588() {
        for (class7 var0 = (class7) field84.method3382(); var0 != null; var0 = (class7) field84.method3388()) {
            if (var0.field89 != null) {
                var0.method43();
            }
        }
    }

    @ObfuscatedName("l.e(B)V")
    public void method43() {
        int var1 = this.field92;
        class31 var2 = this.field89.method679();
        if (var2 == null) {
            this.field92 = -1;
            this.field88 = 0;
            this.field86 = 0;
            this.field105 = 0;
            this.field93 = null;
        } else {
            this.field92 = var2.field842;
            this.field88 = var2.field843 * 128;
            this.field86 = var2.field844;
            this.field105 = var2.field845;
            this.field93 = var2.field846;
        }
        if (this.field92 != var1 && this.field90 != null) {
            Statics.field1291.method1100(this.field90);
            this.field90 = null;
        }
    }

    @ObfuscatedName("f.n(IIILaf;II)V")
    public static void method199(int arg0, int arg1, int arg2, class31 arg3, int arg4) {
        class7 var5 = new class7();
        var5.field101 = arg0;
        var5.field83 = arg1 * 128;
        var5.field85 = arg2 * 128;
        int var6 = arg3.field812;
        int var7 = arg3.field813;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field813;
            var7 = arg3.field812;
        }
        var5.field82 = (arg1 + var6) * 128;
        var5.field87 = (arg2 + var7) * 128;
        var5.field92 = arg3.field842;
        var5.field88 = arg3.field843 * 128;
        var5.field86 = arg3.field844;
        var5.field105 = arg3.field845;
        var5.field93 = arg3.field846;
        if (arg3.field806 != null) {
            var5.field89 = arg3;
            var5.method43();
        }
        field84.method3379(var5);
        if (var5.field93 != null) {
            var5.field91 = var5.field86 + (int) (Math.random() * (double) (var5.field105 - var5.field86));
        }
    }

    @ObfuscatedName("a.j(IIIII)V")
    public static void method110(int arg0, int arg1, int arg2, int arg3) {
        for (class7 var4 = (class7) field84.method3382(); var4 != null; var4 = (class7) field84.method3388()) {
            if (var4.field92 != -1 || var4.field93 != null) {
                int var5 = 0;
                if (arg1 > var4.field82) {
                    var5 += arg1 - var4.field82;
                } else if (arg1 < var4.field83) {
                    var5 += var4.field83 - arg1;
                }
                if (arg2 > var4.field87) {
                    var5 += arg2 - var4.field87;
                } else if (arg2 < var4.field85) {
                    var5 += var4.field85 - arg2;
                }
                if (var5 - 64 > var4.field88 || client.field707 == 0 || var4.field101 != arg0) {
                    if (var4.field90 != null) {
                        Statics.field1291.method1100(var4.field90);
                        var4.field90 = null;
                    }
                    if (var4.field95 != null) {
                        Statics.field1291.method1100(var4.field95);
                        var4.field95 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field707 * (var4.field88 - var5) / var4.field88;
                    if (var4.field90 != null) {
                        var4.field90.method955(var6);
                    } else if (var4.field92 >= 0) {
                        class56 var7 = class56.method1253(Statics.field15, var4.field92, 0);
                        if (var7 != null) {
                            class62 var8 = var7.method1243().method1309(Statics.field733);
                            class44 var9 = class44.method951(var8, 100, var6);
                            var9.method954(-1);
                            Statics.field1291.method1107(var9);
                            var4.field90 = var9;
                        }
                    }
                    if (var4.field95 != null) {
                        var4.field95.method955(var6);
                        if (!var4.field95.method3414()) {
                            var4.field95 = null;
                        }
                    } else if (var4.field93 != null && (var4.field91 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field93.length);
                        class56 var11 = class56.method1253(Statics.field15, var4.field93[var10], 0);
                        if (var11 != null) {
                            class62 var12 = var11.method1243().method1309(Statics.field733);
                            class44 var13 = class44.method951(var12, 100, var6);
                            var13.method954(0);
                            Statics.field1291.method1107(var13);
                            var4.field95 = var13;
                            var4.field91 = var4.field86 + (int) (Math.random() * (double) (var4.field105 - var4.field86));
                        }
                    }
                }
            }
        }
    }
}
