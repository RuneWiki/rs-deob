package deob;

@ObfuscatedName("r")
public final class class7 extends class179 {

    @ObfuscatedName("r.f")
    public static class177 field90 = new class177();

    @ObfuscatedName("r.t")
    public int field85;

    @ObfuscatedName("r.n")
    public int field86;

    @ObfuscatedName("r.e")
    public int field87;

    @ObfuscatedName("r.l")
    public int field91;

    @ObfuscatedName("r.d")
    public int field89;

    @ObfuscatedName("r.r")
    public class32 field98;

    @ObfuscatedName("r.k")
    public int field84;

    @ObfuscatedName("r.u")
    public int field101;

    @ObfuscatedName("r.o")
    public class45 field92;

    @ObfuscatedName("r.g")
    public int field95;

    @ObfuscatedName("r.s")
    public int field94;

    @ObfuscatedName("r.b")
    public int[] field93;

    @ObfuscatedName("r.v")
    public int field96;

    @ObfuscatedName("r.j")
    public class45 field88;

    @ObfuscatedName("bf.f(I)V")
    public static void method1559() {
        for (class7 var0 = (class7) field90.method3362(); var0 != null; var0 = (class7) field90.method3350()) {
            if (var0.field92 != null) {
                Statics.field1909.method1098(var0.field92);
                var0.field92 = null;
            }
            if (var0.field88 != null) {
                Statics.field1909.method1098(var0.field88);
                var0.field88 = null;
            }
        }
        field90.method3336();
    }

    @ObfuscatedName("bj.t(I)V")
    public static void method1518() {
        for (class7 var0 = (class7) field90.method3362(); var0 != null; var0 = (class7) field90.method3350()) {
            if (var0.field98 != null) {
                var0.method48();
            }
        }
    }

    @ObfuscatedName("r.n(I)V")
    public void method48() {
        int var1 = this.field101;
        class32 var2 = this.field98.method638();
        if (var2 == null) {
            this.field101 = -1;
            this.field84 = 0;
            this.field95 = 0;
            this.field94 = 0;
            this.field93 = null;
        } else {
            this.field101 = var2.field846;
            this.field84 = var2.field847 * 128;
            this.field95 = var2.field848;
            this.field94 = var2.field840;
            this.field93 = var2.field853;
        }
        if (this.field101 != var1 && this.field92 != null) {
            Statics.field1909.method1098(this.field92);
            this.field92 = null;
        }
    }

    @ObfuscatedName("co.e(IIIII)V")
    public static void method1871(int arg0, int arg1, int arg2, int arg3) {
        for (class7 var4 = (class7) field90.method3362(); var4 != null; var4 = (class7) field90.method3350()) {
            if (var4.field101 != -1 || var4.field93 != null) {
                int var5 = 0;
                if (arg1 > var4.field91) {
                    var5 += arg1 - var4.field91;
                } else if (arg1 < var4.field86) {
                    var5 += var4.field86 - arg1;
                }
                if (arg2 > var4.field89) {
                    var5 += arg2 - var4.field89;
                } else if (arg2 < var4.field87) {
                    var5 += var4.field87 - arg2;
                }
                if (var5 - 64 > var4.field84 || client.field698 == 0 || var4.field85 != arg0) {
                    if (var4.field92 != null) {
                        Statics.field1909.method1098(var4.field92);
                        var4.field92 = null;
                    }
                    if (var4.field88 != null) {
                        Statics.field1909.method1098(var4.field88);
                        var4.field88 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field698 * (var4.field84 - var5) / var4.field84;
                    if (var4.field92 != null) {
                        var4.field92.method948(var6);
                    } else if (var4.field101 >= 0) {
                        class57 var7 = class57.method1274(Statics.field488, var4.field101, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1269().method1344(Statics.field253);
                            class45 var9 = class45.method944(var8, 100, var6);
                            var9.method947(-1);
                            Statics.field1909.method1096(var9);
                            var4.field92 = var9;
                        }
                    }
                    if (var4.field88 != null) {
                        var4.field88.method948(var6);
                        if (!var4.field88.method3369()) {
                            var4.field88 = null;
                        }
                    } else if (var4.field93 != null && (var4.field96 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field93.length);
                        class57 var11 = class57.method1274(Statics.field488, var4.field93[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1269().method1344(Statics.field253);
                            class45 var13 = class45.method944(var12, 100, var6);
                            var13.method947(0);
                            Statics.field1909.method1096(var13);
                            var4.field88 = var13;
                            var4.field96 = var4.field95 + (int) (Math.random() * (double) (var4.field94 - var4.field95));
                        }
                    }
                }
            }
        }
    }
}
