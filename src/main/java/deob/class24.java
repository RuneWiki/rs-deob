package deob;

@ObfuscatedName("e")
public final class class24 extends class208 {

    @ObfuscatedName("e.h")
    public static class199 field629 = new class199();

    @ObfuscatedName("e.q")
    public int field620;

    @ObfuscatedName("e.v")
    public int field625;

    @ObfuscatedName("e.n")
    public int field622;

    @ObfuscatedName("e.f")
    public int field623;

    @ObfuscatedName("e.g")
    public int field636;

    @ObfuscatedName("e.o")
    public int field633;

    @ObfuscatedName("e.s")
    public int field621;

    @ObfuscatedName("e.k")
    public int field626;

    @ObfuscatedName("e.b")
    public class65 field627;

    @ObfuscatedName("e.c")
    public int field632;

    @ObfuscatedName("e.l")
    public int[] field619;

    @ObfuscatedName("e.p")
    public int field631;

    @ObfuscatedName("e.d")
    public class65 field624;

    @ObfuscatedName("e.i")
    public class41 field628;

    @ObfuscatedName("ay.h(I)V")
    public static void method805() {
        for (class24 var0 = (class24) field629.method3611(); var0 != null; var0 = (class24) field629.method3616()) {
            if (var0.field627 != null) {
                Statics.field645.method1120(var0.field627);
                var0.field627 = null;
            }
            if (var0.field624 != null) {
                Statics.field645.method1120(var0.field624);
                var0.field624 = null;
            }
        }
        field629.method3608();
    }

    @ObfuscatedName("e.q(I)V")
    public void method573() {
        int var1 = this.field626;
        class41 var2 = this.field628.method775();
        if (var2 == null) {
            this.field626 = -1;
            this.field633 = 0;
            this.field621 = 0;
            this.field632 = 0;
            this.field619 = null;
        } else {
            this.field626 = var2.field939;
            this.field633 = var2.field973 * 128;
            this.field621 = var2.field957;
            this.field632 = var2.field975;
            this.field619 = var2.field976;
        }
        if (this.field626 != var1 && this.field627 != null) {
            Statics.field645.method1120(this.field627);
            this.field627 = null;
        }
    }

    @ObfuscatedName("hg.v(IIILay;II)V")
    public static void method3752(int arg0, int arg1, int arg2, class41 arg3, int arg4) {
        class24 var5 = new class24();
        var5.field620 = arg0;
        var5.field625 = arg1 * 128;
        var5.field622 = arg2 * 128;
        int var6 = arg3.field928;
        int var7 = arg3.field978;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field978;
            var7 = arg3.field928;
        }
        var5.field623 = (arg1 + var6) * 128;
        var5.field636 = (arg2 + var7) * 128;
        var5.field626 = arg3.field939;
        var5.field633 = arg3.field973 * 128;
        var5.field621 = arg3.field957;
        var5.field632 = arg3.field975;
        var5.field619 = arg3.field976;
        if (arg3.field969 != null) {
            var5.field628 = arg3;
            var5.method573();
        }
        field629.method3609(var5);
        if (var5.field619 != null) {
            var5.field631 = var5.field621 + (int) (Math.random() * (double) (var5.field632 - var5.field621));
        }
    }

    @ObfuscatedName("ct.n(IIIII)V")
    public static void method2060(int arg0, int arg1, int arg2, int arg3) {
        for (class24 var4 = (class24) field629.method3611(); var4 != null; var4 = (class24) field629.method3616()) {
            if (var4.field626 != -1 || var4.field619 != null) {
                int var5 = 0;
                if (arg1 > var4.field623) {
                    var5 += arg1 - var4.field623;
                } else if (arg1 < var4.field625) {
                    var5 += var4.field625 - arg1;
                }
                if (arg2 > var4.field636) {
                    var5 += arg2 - var4.field636;
                } else if (arg2 < var4.field622) {
                    var5 += var4.field622 - arg2;
                }
                if (var5 - 64 > var4.field633 || client.field328 == 0 || var4.field620 != arg0) {
                    if (var4.field627 != null) {
                        Statics.field645.method1120(var4.field627);
                        var4.field627 = null;
                    }
                    if (var4.field624 != null) {
                        Statics.field645.method1120(var4.field624);
                        var4.field624 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field328 * (var4.field633 - var5) / var4.field633;
                    if (var4.field627 != null) {
                        var4.field627.method1288(var6);
                    } else if (var4.field626 >= 0) {
                        class59 var7 = class59.method1226(Statics.field1897, var4.field626, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1214().method1261(Statics.field12);
                            class65 var9 = class65.method1284(var8, 100, var6);
                            var9.method1287(-1);
                            Statics.field645.method1119(var9);
                            var4.field627 = var9;
                        }
                    }
                    if (var4.field624 != null) {
                        var4.field624.method1288(var6);
                        if (!var4.field624.method3712()) {
                            var4.field624 = null;
                        }
                    } else if (var4.field619 != null && (var4.field631 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field619.length);
                        class59 var11 = class59.method1226(Statics.field1897, var4.field619[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1214().method1261(Statics.field12);
                            class65 var13 = class65.method1284(var12, 100, var6);
                            var13.method1287(0);
                            Statics.field645.method1119(var13);
                            var4.field624 = var13;
                            var4.field631 = var4.field621 + (int) (Math.random() * (double) (var4.field632 - var4.field621));
                        }
                    }
                }
            }
        }
    }
}
