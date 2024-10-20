package deob;

@ObfuscatedName("l")
public final class class7 extends class179 {

    @ObfuscatedName("l.p")
    public static class177 field105 = new class177();

    @ObfuscatedName("l.e")
    public int field86;

    @ObfuscatedName("l.a")
    public int field85;

    @ObfuscatedName("l.h")
    public int field88;

    @ObfuscatedName("l.y")
    public int field89;

    @ObfuscatedName("l.j")
    public int field87;

    @ObfuscatedName("l.l")
    public int field91;

    @ObfuscatedName("l.f")
    public int field92;

    @ObfuscatedName("l.n")
    public class45 field93;

    @ObfuscatedName("l.k")
    public int field94;

    @ObfuscatedName("l.q")
    public int field95;

    @ObfuscatedName("l.w")
    public int[] field98;

    @ObfuscatedName("l.v")
    public int field97;

    @ObfuscatedName("l.z")
    public class45 field90;

    @ObfuscatedName("l.m")
    public class32 field99;

    @ObfuscatedName("l.p(I)V")
    public void method49() {
        int var1 = this.field92;
        class32 var2 = this.field99.method660();
        if (var2 == null) {
            this.field92 = -1;
            this.field91 = 0;
            this.field94 = 0;
            this.field95 = 0;
            this.field98 = null;
        } else {
            this.field92 = var2.field821;
            this.field91 = var2.field828 * 128;
            this.field94 = var2.field853;
            this.field95 = var2.field854;
            this.field98 = var2.field855;
        }
        if (this.field92 != var1 && this.field93 != null) {
            Statics.field106.method1122(this.field93);
            this.field93 = null;
        }
    }

    @ObfuscatedName("j.e(IIILaf;II)V")
    public static void method45(int arg0, int arg1, int arg2, class32 arg3, int arg4) {
        class7 var5 = new class7();
        var5.field86 = arg0;
        var5.field85 = arg1 * 128;
        var5.field88 = arg2 * 128;
        int var6 = arg3.field822;
        int var7 = arg3.field807;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field807;
            var7 = arg3.field822;
        }
        var5.field89 = (arg1 + var6) * 128;
        var5.field87 = (arg2 + var7) * 128;
        var5.field92 = arg3.field821;
        var5.field91 = arg3.field828 * 128;
        var5.field94 = arg3.field853;
        var5.field95 = arg3.field854;
        var5.field98 = arg3.field855;
        if (arg3.field846 != null) {
            var5.field99 = arg3;
            var5.method49();
        }
        field105.method3332(var5);
        if (var5.field98 != null) {
            var5.field97 = var5.field94 + (int) (Math.random() * (double) (var5.field95 - var5.field94));
        }
    }

    @ObfuscatedName("p.a(IIIIB)V")
    public static void method1(int arg0, int arg1, int arg2, int arg3) {
        for (class7 var4 = (class7) field105.method3325(); var4 != null; var4 = (class7) field105.method3333()) {
            if (var4.field92 != -1 || var4.field98 != null) {
                int var5 = 0;
                if (arg1 > var4.field89) {
                    var5 += arg1 - var4.field89;
                } else if (arg1 < var4.field85) {
                    var5 += var4.field85 - arg1;
                }
                if (arg2 > var4.field87) {
                    var5 += arg2 - var4.field87;
                } else if (arg2 < var4.field88) {
                    var5 += var4.field88 - arg2;
                }
                if (var5 - 64 > var4.field91 || client.field706 == 0 || var4.field86 != arg0) {
                    if (var4.field93 != null) {
                        Statics.field106.method1122(var4.field93);
                        var4.field93 = null;
                    }
                    if (var4.field90 != null) {
                        Statics.field106.method1122(var4.field90);
                        var4.field90 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field706 * (var4.field91 - var5) / var4.field91;
                    if (var4.field93 != null) {
                        var4.field93.method971(var6);
                    } else if (var4.field92 >= 0) {
                        class57 var7 = class57.method1280(Statics.field1392, var4.field92, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1275().method1346(Statics.field914);
                            class45 var9 = class45.method992(var8, 100, var6);
                            var9.method970(-1);
                            Statics.field106.method1121(var9);
                            var4.field93 = var9;
                        }
                    }
                    if (var4.field90 != null) {
                        var4.field90.method971(var6);
                        if (!var4.field90.method3364()) {
                            var4.field90 = null;
                        }
                    } else if (var4.field98 != null && (var4.field97 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field98.length);
                        class57 var11 = class57.method1280(Statics.field1392, var4.field98[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1275().method1346(Statics.field914);
                            class45 var13 = class45.method992(var12, 100, var6);
                            var13.method970(0);
                            Statics.field106.method1121(var13);
                            var4.field90 = var13;
                            var4.field97 = var4.field94 + (int) (Math.random() * (double) (var4.field95 - var4.field94));
                        }
                    }
                }
            }
        }
    }
}
