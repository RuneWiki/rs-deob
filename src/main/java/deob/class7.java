package deob;

@ObfuscatedName("y")
public final class class7 extends class179 {

    @ObfuscatedName("y.j")
    public static class177 field91 = new class177();

    @ObfuscatedName("y.r")
    public class32 field97;

    @ObfuscatedName("y.v")
    public int field84;

    @ObfuscatedName("y.p")
    public int field83;

    @ObfuscatedName("y.e")
    public int field94;

    @ObfuscatedName("y.d")
    public int field87;

    @ObfuscatedName("y.y")
    public int field88;

    @ObfuscatedName("y.x")
    public int field89;

    @ObfuscatedName("y.t")
    public int field99;

    @ObfuscatedName("y.i")
    public class45 field90;

    @ObfuscatedName("y.z")
    public int field92;

    @ObfuscatedName("y.o")
    public int field93;

    @ObfuscatedName("y.u")
    public int[] field85;

    @ObfuscatedName("y.f")
    public int field95;

    @ObfuscatedName("y.k")
    public class45 field96;

    @ObfuscatedName("k.j(B)V")
    public static void method154() {
        for (class7 var0 = (class7) field91.method3326(); var0 != null; var0 = (class7) field91.method3347()) {
            if (var0.field97 != null) {
                var0.method50();
            }
        }
    }

    @ObfuscatedName("y.r(I)V")
    public void method50() {
        int var1 = this.field99;
        class32 var2 = this.field97.method642();
        if (var2 == null) {
            this.field99 = -1;
            this.field89 = 0;
            this.field92 = 0;
            this.field93 = 0;
            this.field85 = null;
        } else {
            this.field99 = var2.field831;
            this.field89 = var2.field852 * 128;
            this.field92 = var2.field822;
            this.field93 = var2.field858;
            this.field85 = var2.field859;
        }
        if (this.field99 != var1 && this.field90 != null) {
            Statics.field2021.method1100(this.field90);
            this.field90 = null;
        }
    }

    @ObfuscatedName("e.v(IIILas;IB)V")
    public static void method42(int arg0, int arg1, int arg2, class32 arg3, int arg4) {
        class7 var5 = new class7();
        var5.field84 = arg0;
        var5.field83 = arg1 * 128;
        var5.field94 = arg2 * 128;
        int var6 = arg3.field825;
        int var7 = arg3.field856;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field856;
            var7 = arg3.field825;
        }
        var5.field87 = (arg1 + var6) * 128;
        var5.field88 = (arg2 + var7) * 128;
        var5.field99 = arg3.field831;
        var5.field89 = arg3.field852 * 128;
        var5.field92 = arg3.field822;
        var5.field93 = arg3.field858;
        var5.field85 = arg3.field859;
        if (arg3.field857 != null) {
            var5.field97 = arg3;
            var5.method50();
        }
        field91.method3328(var5);
        if (var5.field85 != null) {
            var5.field95 = var5.field92 + (int) (Math.random() * (double) (var5.field93 - var5.field92));
        }
    }

    @ObfuscatedName("ad.p(IIIII)V")
    public static void method748(int arg0, int arg1, int arg2, int arg3) {
        for (class7 var4 = (class7) field91.method3326(); var4 != null; var4 = (class7) field91.method3347()) {
            if (var4.field99 != -1 || var4.field85 != null) {
                int var5 = 0;
                if (arg1 > var4.field87) {
                    var5 += arg1 - var4.field87;
                } else if (arg1 < var4.field83) {
                    var5 += var4.field83 - arg1;
                }
                if (arg2 > var4.field88) {
                    var5 += arg2 - var4.field88;
                } else if (arg2 < var4.field94) {
                    var5 += var4.field94 - arg2;
                }
                if (var5 - 64 > var4.field89 || client.field710 == 0 || var4.field84 != arg0) {
                    if (var4.field90 != null) {
                        Statics.field2021.method1100(var4.field90);
                        var4.field90 = null;
                    }
                    if (var4.field96 != null) {
                        Statics.field2021.method1100(var4.field96);
                        var4.field96 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field710 * (var4.field89 - var5) / var4.field89;
                    if (var4.field90 != null) {
                        var4.field90.method947(var6);
                    } else if (var4.field99 >= 0) {
                        class57 var7 = class57.method1254(Statics.field1316, var4.field99, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1260().method1319(Statics.field2019);
                            class45 var9 = class45.method996(var8, 100, var6);
                            var9.method967(-1);
                            Statics.field2021.method1123(var9);
                            var4.field90 = var9;
                        }
                    }
                    if (var4.field96 != null) {
                        var4.field96.method947(var6);
                        if (!var4.field96.method3358()) {
                            var4.field96 = null;
                        }
                    } else if (var4.field85 != null && (var4.field95 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field85.length);
                        class57 var11 = class57.method1254(Statics.field1316, var4.field85[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1260().method1319(Statics.field2019);
                            class45 var13 = class45.method996(var12, 100, var6);
                            var13.method967(0);
                            Statics.field2021.method1123(var13);
                            var4.field96 = var13;
                            var4.field95 = var4.field92 + (int) (Math.random() * (double) (var4.field93 - var4.field92));
                        }
                    }
                }
            }
        }
    }
}
