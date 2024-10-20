package deob;

@ObfuscatedName("g")
public final class class7 extends class178 {

    @ObfuscatedName("g.p")
    public static class176 field121 = new class176();

    @ObfuscatedName("g.j")
    public int field98;

    @ObfuscatedName("g.w")
    public int field109;

    @ObfuscatedName("g.h")
    public int field100;

    @ObfuscatedName("g.v")
    public int field118;

    @ObfuscatedName("g.k")
    public int field102;

    @ObfuscatedName("g.g")
    public int field103;

    @ObfuscatedName("g.n")
    public int field110;

    @ObfuscatedName("g.c")
    public class44 field113;

    @ObfuscatedName("g.o")
    public int field106;

    @ObfuscatedName("g.u")
    public int field107;

    @ObfuscatedName("g.z")
    public int[] field108;

    @ObfuscatedName("g.e")
    public int field97;

    @ObfuscatedName("g.l")
    public class44 field105;

    @ObfuscatedName("g.m")
    public class31 field101;

    @ObfuscatedName("h.p(I)V")
    public static void method30() {
        for (class7 var0 = (class7) field121.method3285(); var0 != null; var0 = (class7) field121.method3299()) {
            if (var0.field113 != null) {
                Statics.field1291.method1075(var0.field113);
                var0.field113 = null;
            }
            if (var0.field105 != null) {
                Statics.field1291.method1075(var0.field105);
                var0.field105 = null;
            }
        }
        field121.method3287();
    }

    @ObfuscatedName("ds.j(I)V")
    public static void method2169() {
        for (class7 var0 = (class7) field121.method3285(); var0 != null; var0 = (class7) field121.method3299()) {
            if (var0.field101 != null) {
                var0.method52();
            }
        }
    }

    @ObfuscatedName("g.w(B)V")
    public void method52() {
        int var1 = this.field110;
        class31 var2 = this.field101.method607();
        if (var2 == null) {
            this.field110 = -1;
            this.field103 = 0;
            this.field106 = 0;
            this.field107 = 0;
            this.field108 = null;
        } else {
            this.field110 = var2.field860;
            this.field103 = var2.field861 * 128;
            this.field106 = var2.field862;
            this.field107 = var2.field863;
            this.field108 = var2.field864;
        }
        if (this.field110 != var1 && this.field113 != null) {
            Statics.field1291.method1075(this.field113);
            this.field113 = null;
        }
    }

    @ObfuscatedName("fp.h(IIIII)V")
    public static void method3335(int arg0, int arg1, int arg2, int arg3) {
        for (class7 var4 = (class7) field121.method3285(); var4 != null; var4 = (class7) field121.method3299()) {
            if (var4.field110 != -1 || var4.field108 != null) {
                int var5 = 0;
                if (arg1 > var4.field118) {
                    var5 += arg1 - var4.field118;
                } else if (arg1 < var4.field109) {
                    var5 += var4.field109 - arg1;
                }
                if (arg2 > var4.field102) {
                    var5 += arg2 - var4.field102;
                } else if (arg2 < var4.field100) {
                    var5 += var4.field100 - arg2;
                }
                if (var5 - 64 > var4.field103 || client.field718 == 0 || var4.field98 != arg0) {
                    if (var4.field113 != null) {
                        Statics.field1291.method1075(var4.field113);
                        var4.field113 = null;
                    }
                    if (var4.field105 != null) {
                        Statics.field1291.method1075(var4.field105);
                        var4.field105 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field718 * (var4.field103 - var5) / var4.field103;
                    if (var4.field113 != null) {
                        var4.field113.method937(var6);
                    } else if (var4.field110 >= 0) {
                        class56 var7 = class56.method1217(Statics.field1026, var4.field110, 0);
                        if (var7 != null) {
                            class62 var8 = var7.method1219().method1283(Statics.field1025);
                            class44 var9 = class44.method915(var8, 100, var6);
                            var9.method1009(-1);
                            Statics.field1291.method1062(var9);
                            var4.field113 = var9;
                        }
                    }
                    if (var4.field105 != null) {
                        var4.field105.method937(var6);
                        if (!var4.field105.method3322()) {
                            var4.field105 = null;
                        }
                    } else if (var4.field108 != null && (var4.field97 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field108.length);
                        class56 var11 = class56.method1217(Statics.field1026, var4.field108[var10], 0);
                        if (var11 != null) {
                            class62 var12 = var11.method1219().method1283(Statics.field1025);
                            class44 var13 = class44.method915(var12, 100, var6);
                            var13.method1009(0);
                            Statics.field1291.method1062(var13);
                            var4.field105 = var13;
                            var4.field97 = var4.field106 + (int) (Math.random() * (double) (var4.field107 - var4.field106));
                        }
                    }
                }
            }
        }
    }
}
