package deob;

@ObfuscatedName("v")
public final class class7 extends class179 {

    @ObfuscatedName("v.x")
    public int field87;

    @ObfuscatedName("v.p")
    public static class177 field99 = new class177();

    @ObfuscatedName("v.k")
    public int field90;

    @ObfuscatedName("v.a")
    public int field86;

    @ObfuscatedName("v.q")
    public int field104;

    @ObfuscatedName("v.j")
    public int field103;

    @ObfuscatedName("v.v")
    public int field89;

    @ObfuscatedName("v.w")
    public int field91;

    @ObfuscatedName("v.l")
    public class45 field92;

    @ObfuscatedName("v.s")
    public int field94;

    @ObfuscatedName("v.n")
    public int field85;

    @ObfuscatedName("v.c")
    public int[] field95;

    @ObfuscatedName("v.h")
    public int field96;

    @ObfuscatedName("v.u")
    public class45 field97;

    @ObfuscatedName("v.y")
    public class32 field98;

    @ObfuscatedName("ah.x(I)V")
    public static void method1155() {
        for (class7 var0 = (class7) field99.method3280(); var0 != null; var0 = (class7) field99.method3269()) {
            if (var0.field98 != null) {
                var0.method40();
            }
        }
    }

    @ObfuscatedName("v.p(B)V")
    public void method40() {
        int var1 = this.field91;
        class32 var2 = this.field98.method623();
        if (var2 == null) {
            this.field91 = -1;
            this.field89 = 0;
            this.field94 = 0;
            this.field85 = 0;
            this.field95 = null;
        } else {
            this.field91 = var2.field822;
            this.field89 = var2.field833 * 128;
            this.field94 = var2.field828;
            this.field85 = var2.field829;
            this.field95 = var2.field830;
        }
        if (this.field91 != var1 && this.field92 != null) {
            Statics.field711.method1075(this.field92);
            this.field92 = null;
        }
    }

    @ObfuscatedName("ad.a(IIIIB)V")
    public static void method842(int arg0, int arg1, int arg2, int arg3) {
        for (class7 var4 = (class7) field99.method3280(); var4 != null; var4 = (class7) field99.method3269()) {
            if (var4.field91 != -1 || var4.field95 != null) {
                int var5 = 0;
                if (arg1 > var4.field104) {
                    var5 += arg1 - var4.field104;
                } else if (arg1 < var4.field86) {
                    var5 += var4.field86 - arg1;
                }
                if (arg2 > var4.field103) {
                    var5 += arg2 - var4.field103;
                } else if (arg2 < var4.field87) {
                    var5 += var4.field87 - arg2;
                }
                if (var5 - 64 > var4.field89 || client.field575 == 0 || var4.field90 != arg0) {
                    if (var4.field92 != null) {
                        Statics.field711.method1075(var4.field92);
                        var4.field92 = null;
                    }
                    if (var4.field97 != null) {
                        Statics.field711.method1075(var4.field97);
                        var4.field97 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field575 * (var4.field89 - var5) / var4.field89;
                    if (var4.field92 != null) {
                        var4.field92.method941(var6);
                    } else if (var4.field91 >= 0) {
                        class57 var7 = class57.method1228(Statics.field1754, var4.field91, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1221().method1295(Statics.field2385);
                            class45 var9 = class45.method926(var8, 100, var6);
                            var9.method1028(-1);
                            Statics.field711.method1074(var9);
                            var4.field92 = var9;
                        }
                    }
                    if (var4.field97 != null) {
                        var4.field97.method941(var6);
                        if (!var4.field97.method3296()) {
                            var4.field97 = null;
                        }
                    } else if (var4.field95 != null && (var4.field96 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field95.length);
                        class57 var11 = class57.method1228(Statics.field1754, var4.field95[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1221().method1295(Statics.field2385);
                            class45 var13 = class45.method926(var12, 100, var6);
                            var13.method1028(0);
                            Statics.field711.method1074(var13);
                            var4.field97 = var13;
                            var4.field96 = var4.field94 + (int) (Math.random() * (double) (var4.field85 - var4.field94));
                        }
                    }
                }
            }
        }
    }
}
