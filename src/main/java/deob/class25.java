package deob;

@ObfuscatedName("a")
public final class class25 extends class212 {

    @ObfuscatedName("a.l")
    public static class203 field631 = new class203();

    @ObfuscatedName("a.g")
    public int field622;

    @ObfuscatedName("a.r")
    public class43 field635;

    @ObfuscatedName("a.e")
    public int field636;

    @ObfuscatedName("a.h")
    public int field624;

    @ObfuscatedName("a.s")
    public int field632;

    @ObfuscatedName("a.k")
    public int field625;

    @ObfuscatedName("a.u")
    public int field629;

    @ObfuscatedName("a.n")
    public int field627;

    @ObfuscatedName("a.b")
    public int field628;

    @ObfuscatedName("a.m")
    public class68 field623;

    @ObfuscatedName("a.q")
    public int field626;

    @ObfuscatedName("a.p")
    public int[] field630;

    @ObfuscatedName("a.w")
    public int field633;

    @ObfuscatedName("a.o")
    public class68 field634;

    @ObfuscatedName("ej.l(I)V")
    public static void method2940() {
        for (class25 var0 = (class25) field631.method3728(); var0 != null; var0 = (class25) field631.method3718()) {
            if (var0.field623 != null) {
                Statics.field586.method1260(var0.field623);
                var0.field623 = null;
            }
            if (var0.field634 != null) {
                Statics.field586.method1260(var0.field634);
                var0.field634 = null;
            }
        }
        field631.method3744();
    }

    @ObfuscatedName("a.g(I)V")
    public void method596() {
        int var1 = this.field628;
        class43 var2 = this.field635.method822();
        if (var2 == null) {
            this.field628 = -1;
            this.field627 = 0;
            this.field632 = 0;
            this.field626 = 0;
            this.field630 = null;
        } else {
            this.field628 = var2.field990;
            this.field627 = var2.field991 * 128;
            this.field632 = var2.field968;
            this.field626 = var2.field993;
            this.field630 = var2.field994;
        }
        if (this.field628 != var1 && this.field623 != null) {
            Statics.field586.method1260(this.field623);
            this.field623 = null;
        }
    }

    @ObfuscatedName("dn.r(IIILae;IB)V")
    public static void method2353(int arg0, int arg1, int arg2, class43 arg3, int arg4) {
        class25 var5 = new class25();
        var5.field622 = arg0;
        var5.field636 = arg1 * 128;
        var5.field624 = arg2 * 128;
        int var6 = arg3.field961;
        int var7 = arg3.field971;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field971;
            var7 = arg3.field961;
        }
        var5.field625 = (arg1 + var6) * 128;
        var5.field629 = (arg2 + var7) * 128;
        var5.field628 = arg3.field990;
        var5.field627 = arg3.field991 * 128;
        var5.field632 = arg3.field968;
        var5.field626 = arg3.field993;
        var5.field630 = arg3.field994;
        if (arg3.field987 != null) {
            var5.field635 = arg3;
            var5.method596();
        }
        field631.method3711(var5);
        if (var5.field630 != null) {
            var5.field633 = var5.field632 + (int) (Math.random() * (double) (var5.field626 - var5.field632));
        }
    }

    @ObfuscatedName("dz.e(IIIII)V")
    public static void method2409(int arg0, int arg1, int arg2, int arg3) {
        for (class25 var4 = (class25) field631.method3728(); var4 != null; var4 = (class25) field631.method3718()) {
            if (var4.field628 != -1 || var4.field630 != null) {
                int var5 = 0;
                if (arg1 > var4.field625) {
                    var5 += arg1 - var4.field625;
                } else if (arg1 < var4.field636) {
                    var5 += var4.field636 - arg1;
                }
                if (arg2 > var4.field629) {
                    var5 += arg2 - var4.field629;
                } else if (arg2 < var4.field624) {
                    var5 += var4.field624 - arg2;
                }
                if (var5 - 64 > var4.field627 || client.field536 == 0 || var4.field622 != arg0) {
                    if (var4.field623 != null) {
                        Statics.field586.method1260(var4.field623);
                        var4.field623 = null;
                    }
                    if (var4.field634 != null) {
                        Statics.field586.method1260(var4.field634);
                        var4.field634 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field536 * (var4.field627 - var5) / var4.field627;
                    if (var4.field623 != null) {
                        var4.field623.method1435(var6);
                    } else if (var4.field628 >= 0) {
                        class62 var7 = class62.method1355(Statics.field2040, var4.field628, 0);
                        if (var7 != null) {
                            class66 var8 = var7.method1344().method1382(Statics.field1464);
                            class68 var9 = class68.method1401(var8, 100, var6);
                            var9.method1404(-1);
                            Statics.field586.method1226(var9);
                            var4.field623 = var9;
                        }
                    }
                    if (var4.field634 != null) {
                        var4.field634.method1435(var6);
                        if (!var4.field634.method3816()) {
                            var4.field634 = null;
                        }
                    } else if (var4.field630 != null && (var4.field633 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field630.length);
                        class62 var11 = class62.method1355(Statics.field2040, var4.field630[var10], 0);
                        if (var11 != null) {
                            class66 var12 = var11.method1344().method1382(Statics.field1464);
                            class68 var13 = class68.method1401(var12, 100, var6);
                            var13.method1404(0);
                            Statics.field586.method1226(var13);
                            var4.field634 = var13;
                            var4.field633 = var4.field632 + (int) (Math.random() * (double) (var4.field626 - var4.field632));
                        }
                    }
                }
            }
        }
    }
}
