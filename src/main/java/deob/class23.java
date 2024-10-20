package deob;

@ObfuscatedName("x")
public final class class23 extends class202 {

    @ObfuscatedName("x.j")
    public static class193 field622 = new class193();

    @ObfuscatedName("x.y")
    public int field610;

    @ObfuscatedName("x.z")
    public int field619;

    @ObfuscatedName("x.l")
    public int field611;

    @ObfuscatedName("x.w")
    public int field618;

    @ObfuscatedName("x.d")
    public int field616;

    @ObfuscatedName("x.f")
    public int field615;

    @ObfuscatedName("x.i")
    public int field613;

    @ObfuscatedName("x.a")
    public class63 field617;

    @ObfuscatedName("x.o")
    public int field612;

    @ObfuscatedName("x.u")
    public int field614;

    @ObfuscatedName("x.m")
    public int[] field620;

    @ObfuscatedName("x.e")
    public int field621;

    @ObfuscatedName("x.v")
    public class63 field609;

    @ObfuscatedName("x.r")
    public class39 field623;

    @ObfuscatedName("l.j(I)V")
    public static void method32() {
        for (class23 var0 = (class23) field622.method3490(); var0 != null; var0 = (class23) field622.method3492()) {
            if (var0.field617 != null) {
                Statics.field2060.method1151(var0.field617);
                var0.field617 = null;
            }
            if (var0.field609 != null) {
                Statics.field2060.method1151(var0.field609);
                var0.field609 = null;
            }
        }
        field622.method3509();
    }

    @ObfuscatedName("x.y(B)V")
    public void method581() {
        int var1 = this.field613;
        class39 var2 = this.field623.method771();
        if (var2 == null) {
            this.field613 = -1;
            this.field615 = 0;
            this.field612 = 0;
            this.field614 = 0;
            this.field620 = null;
        } else {
            this.field613 = var2.field947;
            this.field615 = var2.field948 * 128;
            this.field612 = var2.field924;
            this.field614 = var2.field950;
            this.field620 = var2.field938;
        }
        if (this.field613 != var1 && this.field617 != null) {
            Statics.field2060.method1151(this.field617);
            this.field617 = null;
        }
    }

    @ObfuscatedName("dv.z(IIILai;II)V")
    public static void method2255(int arg0, int arg1, int arg2, class39 arg3, int arg4) {
        class23 var5 = new class23();
        var5.field610 = arg0;
        var5.field611 = arg1 * 128;
        var5.field618 = arg2 * 128;
        int var6 = arg3.field918;
        int var7 = arg3.field949;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field949;
            var7 = arg3.field918;
        }
        var5.field619 = (arg1 + var6) * 128;
        var5.field616 = (arg2 + var7) * 128;
        var5.field613 = arg3.field947;
        var5.field615 = arg3.field948 * 128;
        var5.field612 = arg3.field924;
        var5.field614 = arg3.field950;
        var5.field620 = arg3.field938;
        if (arg3.field944 != null) {
            var5.field623 = arg3;
            var5.method581();
        }
        field622.method3485(var5);
        if (var5.field620 != null) {
            var5.field621 = var5.field612 + (int) (Math.random() * (double) (var5.field614 - var5.field612));
        }
    }

    @ObfuscatedName("z.l(IIIII)V")
    public static void method24(int arg0, int arg1, int arg2, int arg3) {
        for (class23 var4 = (class23) field622.method3490(); var4 != null; var4 = (class23) field622.method3492()) {
            if (var4.field613 != -1 || var4.field620 != null) {
                int var5 = 0;
                if (arg1 > var4.field619) {
                    var5 += arg1 - var4.field619;
                } else if (arg1 < var4.field611) {
                    var5 += var4.field611 - arg1;
                }
                if (arg2 > var4.field616) {
                    var5 += arg2 - var4.field616;
                } else if (arg2 < var4.field618) {
                    var5 += var4.field618 - arg2;
                }
                if (var5 - 64 > var4.field615 || client.field525 == 0 || var4.field610 != arg0) {
                    if (var4.field617 != null) {
                        Statics.field2060.method1151(var4.field617);
                        var4.field617 = null;
                    }
                    if (var4.field609 != null) {
                        Statics.field2060.method1151(var4.field609);
                        var4.field609 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field525 * (var4.field615 - var5) / var4.field615;
                    if (var4.field617 != null) {
                        var4.field617.method1313(var6);
                    } else if (var4.field613 >= 0) {
                        class57 var7 = class57.method1242(Statics.field1807, var4.field613, 0);
                        if (var7 != null) {
                            class61 var8 = var7.method1243().method1283(Statics.field107);
                            class63 var9 = class63.method1309(var8, 100, var6);
                            var9.method1355(-1);
                            Statics.field2060.method1184(var9);
                            var4.field617 = var9;
                        }
                    }
                    if (var4.field609 != null) {
                        var4.field609.method1313(var6);
                        if (!var4.field609.method3564()) {
                            var4.field609 = null;
                        }
                    } else if (var4.field620 != null && (var4.field621 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field620.length);
                        class57 var11 = class57.method1242(Statics.field1807, var4.field620[var10], 0);
                        if (var11 != null) {
                            class61 var12 = var11.method1243().method1283(Statics.field107);
                            class63 var13 = class63.method1309(var12, 100, var6);
                            var13.method1355(0);
                            Statics.field2060.method1184(var13);
                            var4.field609 = var13;
                            var4.field621 = var4.field612 + (int) (Math.random() * (double) (var4.field614 - var4.field612));
                        }
                    }
                }
            }
        }
    }
}
