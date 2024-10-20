package deob;

@ObfuscatedName("p")
public final class class7 extends class179 {

    @ObfuscatedName("p.i")
    public static class177 field91 = new class177();

    @ObfuscatedName("p.w")
    public int field80;

    @ObfuscatedName("p.f")
    public int field81;

    @ObfuscatedName("p.e")
    public int field82;

    @ObfuscatedName("p.t")
    public int field83;

    @ObfuscatedName("p.d")
    public int field96;

    @ObfuscatedName("p.p")
    public int field85;

    @ObfuscatedName("p.k")
    public int field86;

    @ObfuscatedName("p.r")
    public class32 field101;

    @ObfuscatedName("p.l")
    public class45 field87;

    @ObfuscatedName("p.a")
    public int field97;

    @ObfuscatedName("p.z")
    public int field89;

    @ObfuscatedName("p.s")
    public int[] field84;

    @ObfuscatedName("p.m")
    public int field98;

    @ObfuscatedName("p.u")
    public class45 field92;

    @ObfuscatedName("p.i(B)V")
    public void method45() {
        int var1 = this.field86;
        class32 var2 = this.field101.method650();
        if (var2 == null) {
            this.field86 = -1;
            this.field85 = 0;
            this.field97 = 0;
            this.field89 = 0;
            this.field84 = null;
        } else {
            this.field86 = var2.field840;
            this.field85 = var2.field842 * 128;
            this.field97 = var2.field868;
            this.field89 = var2.field872;
            this.field84 = var2.field869;
        }
        if (this.field86 != var1 && this.field87 != null) {
            Statics.field292.method1103(this.field87);
            this.field87 = null;
        }
    }

    @ObfuscatedName("bn.w(IIILan;II)V")
    public static void method1223(int arg0, int arg1, int arg2, class32 arg3, int arg4) {
        class7 var5 = new class7();
        var5.field80 = arg0;
        var5.field81 = arg1 * 128;
        var5.field82 = arg2 * 128;
        int var6 = arg3.field836;
        int var7 = arg3.field837;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field837;
            var7 = arg3.field836;
        }
        var5.field83 = (arg1 + var6) * 128;
        var5.field96 = (arg2 + var7) * 128;
        var5.field86 = arg3.field840;
        var5.field85 = arg3.field842 * 128;
        var5.field97 = arg3.field868;
        var5.field89 = arg3.field872;
        var5.field84 = arg3.field869;
        if (arg3.field829 != null) {
            var5.field101 = arg3;
            var5.method45();
        }
        field91.method3289(var5);
        if (var5.field84 != null) {
            var5.field98 = var5.field97 + (int) (Math.random() * (double) (var5.field89 - var5.field97));
        }
    }

    @ObfuscatedName("ci.f(IIIII)V")
    public static void method2036(int arg0, int arg1, int arg2, int arg3) {
        for (class7 var4 = (class7) field91.method3294(); var4 != null; var4 = (class7) field91.method3296()) {
            if (var4.field86 != -1 || var4.field84 != null) {
                int var5 = 0;
                if (arg1 > var4.field83) {
                    var5 += arg1 - var4.field83;
                } else if (arg1 < var4.field81) {
                    var5 += var4.field81 - arg1;
                }
                if (arg2 > var4.field96) {
                    var5 += arg2 - var4.field96;
                } else if (arg2 < var4.field82) {
                    var5 += var4.field82 - arg2;
                }
                if (var5 - 64 > var4.field85 || client.field539 == 0 || var4.field80 != arg0) {
                    if (var4.field87 != null) {
                        Statics.field292.method1103(var4.field87);
                        var4.field87 = null;
                    }
                    if (var4.field92 != null) {
                        Statics.field292.method1103(var4.field92);
                        var4.field92 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field539 * (var4.field85 - var5) / var4.field85;
                    if (var4.field87 != null) {
                        var4.field87.method959(var6);
                    } else if (var4.field86 >= 0) {
                        class57 var7 = class57.method1251(Statics.field103, var4.field86, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1242().method1312(Statics.field1393);
                            class45 var9 = class45.method1068(var8, 100, var6);
                            var9.method1032(-1);
                            Statics.field292.method1102(var9);
                            var4.field87 = var9;
                        }
                    }
                    if (var4.field92 != null) {
                        var4.field92.method959(var6);
                        if (!var4.field92.method3327()) {
                            var4.field92 = null;
                        }
                    } else if (var4.field84 != null && (var4.field98 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field84.length);
                        class57 var11 = class57.method1251(Statics.field103, var4.field84[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1242().method1312(Statics.field1393);
                            class45 var13 = class45.method1068(var12, 100, var6);
                            var13.method1032(0);
                            Statics.field292.method1102(var13);
                            var4.field92 = var13;
                            var4.field98 = var4.field97 + (int) (Math.random() * (double) (var4.field89 - var4.field97));
                        }
                    }
                }
            }
        }
    }
}
