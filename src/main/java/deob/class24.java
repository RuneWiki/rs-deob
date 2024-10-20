package deob;

@ObfuscatedName("l")
public final class class24 extends class209 {

    @ObfuscatedName("l.a")
    public static class200 field628 = new class200();

    @ObfuscatedName("l.w")
    public int field625;

    @ObfuscatedName("l.d")
    public int field619;

    @ObfuscatedName("l.c")
    public int field614;

    @ObfuscatedName("l.y")
    public int field615;

    @ObfuscatedName("l.k")
    public int field620;

    @ObfuscatedName("l.r")
    public class41 field613;

    @ObfuscatedName("l.p")
    public int field617;

    @ObfuscatedName("l.q")
    public int field621;

    @ObfuscatedName("l.m")
    public class65 field616;

    @ObfuscatedName("l.e")
    public int field611;

    @ObfuscatedName("l.x")
    public int field618;

    @ObfuscatedName("l.z")
    public int[] field622;

    @ObfuscatedName("l.i")
    public int field623;

    @ObfuscatedName("l.t")
    public class65 field624;

    @ObfuscatedName("a.a(I)V")
    public static void method6() {
        for (class24 var0 = (class24) field628.method3665(); var0 != null; var0 = (class24) field628.method3641()) {
            if (var0.field613 != null) {
                var0.method653();
            }
        }
    }

    @ObfuscatedName("l.w(I)V")
    public void method653() {
        int var1 = this.field621;
        class41 var2 = this.field613.method872();
        if (var2 == null) {
            this.field621 = -1;
            this.field617 = 0;
            this.field611 = 0;
            this.field618 = 0;
            this.field622 = null;
        } else {
            this.field621 = var2.field968;
            this.field617 = var2.field969 * 128;
            this.field611 = var2.field963;
            this.field618 = var2.field949;
            this.field622 = var2.field972;
        }
        if (this.field621 != var1 && this.field616 != null) {
            Statics.field179.method1213(this.field616);
            this.field616 = null;
        }
    }

    @ObfuscatedName("x.d(IIILae;II)V")
    public static void method173(int arg0, int arg1, int arg2, class41 arg3, int arg4) {
        class24 var5 = new class24();
        var5.field625 = arg0;
        var5.field619 = arg1 * 128;
        var5.field614 = arg2 * 128;
        int var6 = arg3.field939;
        int var7 = arg3.field940;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field940;
            var7 = arg3.field939;
        }
        var5.field615 = (arg1 + var6) * 128;
        var5.field620 = (arg2 + var7) * 128;
        var5.field621 = arg3.field968;
        var5.field617 = arg3.field969 * 128;
        var5.field611 = arg3.field963;
        var5.field618 = arg3.field949;
        var5.field622 = arg3.field972;
        if (arg3.field926 != null) {
            var5.field613 = arg3;
            var5.method653();
        }
        field628.method3639(var5);
        if (var5.field622 != null) {
            var5.field623 = var5.field611 + (int) (Math.random() * (double) (var5.field618 - var5.field611));
        }
    }

    @ObfuscatedName("ae.c(IIIIB)V")
    public static void method880(int arg0, int arg1, int arg2, int arg3) {
        for (class24 var4 = (class24) field628.method3665(); var4 != null; var4 = (class24) field628.method3641()) {
            if (var4.field621 != -1 || var4.field622 != null) {
                int var5 = 0;
                if (arg1 > var4.field615) {
                    var5 += arg1 - var4.field615;
                } else if (arg1 < var4.field619) {
                    var5 += var4.field619 - arg1;
                }
                if (arg2 > var4.field620) {
                    var5 += arg2 - var4.field620;
                } else if (arg2 < var4.field614) {
                    var5 += var4.field614 - arg2;
                }
                if (var5 - 64 > var4.field617 || client.field515 == 0 || var4.field625 != arg0) {
                    if (var4.field616 != null) {
                        Statics.field179.method1213(var4.field616);
                        var4.field616 = null;
                    }
                    if (var4.field624 != null) {
                        Statics.field179.method1213(var4.field624);
                        var4.field624 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field515 * (var4.field617 - var5) / var4.field617;
                    if (var4.field616 != null) {
                        var4.field616.method1360(var6);
                    } else if (var4.field621 >= 0) {
                        class59 var7 = class59.method1301(Statics.field1968, var4.field621, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1290().method1330(Statics.field1440);
                            class65 var9 = class65.method1356(var8, 100, var6);
                            var9.method1359(-1);
                            Statics.field179.method1231(var9);
                            var4.field616 = var9;
                        }
                    }
                    if (var4.field624 != null) {
                        var4.field624.method1360(var6);
                        if (!var4.field624.method3742()) {
                            var4.field624 = null;
                        }
                    } else if (var4.field622 != null && (var4.field623 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field622.length);
                        class59 var11 = class59.method1301(Statics.field1968, var4.field622[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1290().method1330(Statics.field1440);
                            class65 var13 = class65.method1356(var12, 100, var6);
                            var13.method1359(0);
                            Statics.field179.method1231(var13);
                            var4.field624 = var13;
                            var4.field623 = var4.field611 + (int) (Math.random() * (double) (var4.field618 - var4.field611));
                        }
                    }
                }
            }
        }
    }
}
