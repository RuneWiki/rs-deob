package deob;

@ObfuscatedName("w")
public final class class24 extends class208 {

    @ObfuscatedName("w.a")
    public static class199 field607 = new class199();

    @ObfuscatedName("w.r")
    public class41 field621;

    @ObfuscatedName("w.f")
    public int field608;

    @ObfuscatedName("w.s")
    public int field616;

    @ObfuscatedName("w.y")
    public int field610;

    @ObfuscatedName("w.e")
    public int field620;

    @ObfuscatedName("w.g")
    public int field611;

    @ObfuscatedName("w.m")
    public int field612;

    @ObfuscatedName("w.j")
    public int field613;

    @ObfuscatedName("w.n")
    public int field614;

    @ObfuscatedName("w.l")
    public class65 field615;

    @ObfuscatedName("w.h")
    public int field617;

    @ObfuscatedName("w.i")
    public int[] field618;

    @ObfuscatedName("w.v")
    public int field619;

    @ObfuscatedName("w.z")
    public class65 field609;

    @ObfuscatedName("s.a(I)V")
    public static void method50() {
        for (class24 var0 = (class24) field607.method3575(); var0 != null; var0 = (class24) field607.method3576()) {
            if (var0.field615 != null) {
                Statics.field974.method1128(var0.field615);
                var0.field615 = null;
            }
            if (var0.field609 != null) {
                Statics.field974.method1128(var0.field609);
                var0.field609 = null;
            }
        }
        field607.method3569();
    }

    @ObfuscatedName("n.r(B)V")
    public static void method133() {
        for (class24 var0 = (class24) field607.method3575(); var0 != null; var0 = (class24) field607.method3576()) {
            if (var0.field621 != null) {
                var0.method575();
            }
        }
    }

    @ObfuscatedName("w.f(I)V")
    public void method575() {
        int var1 = this.field614;
        class41 var2 = this.field621.method823();
        if (var2 == null) {
            this.field614 = -1;
            this.field613 = 0;
            this.field616 = 0;
            this.field617 = 0;
            this.field618 = null;
        } else {
            this.field614 = var2.field968;
            this.field613 = var2.field969 * 128;
            this.field616 = var2.field970;
            this.field617 = var2.field971;
            this.field618 = var2.field929;
        }
        if (this.field614 != var1 && this.field615 != null) {
            Statics.field974.method1128(this.field615);
            this.field615 = null;
        }
    }

    @ObfuscatedName("i.s(IIIIS)V")
    public static void method168(int arg0, int arg1, int arg2, int arg3) {
        for (class24 var4 = (class24) field607.method3575(); var4 != null; var4 = (class24) field607.method3576()) {
            if (var4.field614 != -1 || var4.field618 != null) {
                int var5 = 0;
                if (arg1 > var4.field611) {
                    var5 += arg1 - var4.field611;
                } else if (arg1 < var4.field610) {
                    var5 += var4.field610 - arg1;
                }
                if (arg2 > var4.field612) {
                    var5 += arg2 - var4.field612;
                } else if (arg2 < var4.field620) {
                    var5 += var4.field620 - arg2;
                }
                if (var5 - 64 > var4.field613 || client.field536 == 0 || var4.field608 != arg0) {
                    if (var4.field615 != null) {
                        Statics.field974.method1128(var4.field615);
                        var4.field615 = null;
                    }
                    if (var4.field609 != null) {
                        Statics.field974.method1128(var4.field609);
                        var4.field609 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field536 * (var4.field613 - var5) / var4.field613;
                    if (var4.field615 != null) {
                        var4.field615.method1281(var6);
                    } else if (var4.field614 >= 0) {
                        class59 var7 = class59.method1224(Statics.field182, var4.field614, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1222().method1257(Statics.field151);
                            class65 var9 = class65.method1366(var8, 100, var6);
                            var9.method1280(-1);
                            Statics.field974.method1127(var9);
                            var4.field615 = var9;
                        }
                    }
                    if (var4.field609 != null) {
                        var4.field609.method1281(var6);
                        if (!var4.field609.method3659()) {
                            var4.field609 = null;
                        }
                    } else if (var4.field618 != null && (var4.field619 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field618.length);
                        class59 var11 = class59.method1224(Statics.field182, var4.field618[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1222().method1257(Statics.field151);
                            class65 var13 = class65.method1366(var12, 100, var6);
                            var13.method1280(0);
                            Statics.field974.method1127(var13);
                            var4.field609 = var13;
                            var4.field619 = var4.field616 + (int) (Math.random() * (double) (var4.field617 - var4.field616));
                        }
                    }
                }
            }
        }
    }
}
