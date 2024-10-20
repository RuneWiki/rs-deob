package deob;

@ObfuscatedName("g")
public final class class24 extends class208 {

    @ObfuscatedName("g.o")
    public static class199 field600 = new class199();

    @ObfuscatedName("g.e")
    public int field605;

    @ObfuscatedName("g.u")
    public int field601;

    @ObfuscatedName("g.b")
    public int field602;

    @ObfuscatedName("g.p")
    public int field606;

    @ObfuscatedName("g.s")
    public int field608;

    @ObfuscatedName("g.y")
    public int field604;

    @ObfuscatedName("g.t")
    public int field599;

    @ObfuscatedName("g.w")
    public int field603;

    @ObfuscatedName("g.h")
    public class65 field607;

    @ObfuscatedName("g.d")
    public int field609;

    @ObfuscatedName("g.l")
    public int[] field610;

    @ObfuscatedName("g.n")
    public int field611;

    @ObfuscatedName("g.q")
    public class65 field612;

    @ObfuscatedName("g.f")
    public class41 field613;

    @ObfuscatedName("f.o(I)V")
    public static void method169() {
        for (class24 var0 = (class24) field600.method3581(); var0 != null; var0 = (class24) field600.method3583()) {
            if (var0.field607 != null) {
                Statics.field2168.method1124(var0.field607);
                var0.field607 = null;
            }
            if (var0.field612 != null) {
                Statics.field2168.method1124(var0.field612);
                var0.field612 = null;
            }
        }
        field600.method3575();
    }

    @ObfuscatedName("w.e(B)V")
    public static void method112() {
        for (class24 var0 = (class24) field600.method3581(); var0 != null; var0 = (class24) field600.method3583()) {
            if (var0.field613 != null) {
                var0.method597();
            }
        }
    }

    @ObfuscatedName("g.u(I)V")
    public void method597() {
        int var1 = this.field603;
        class41 var2 = this.field613.method790();
        if (var2 == null) {
            this.field603 = -1;
            this.field599 = 0;
            this.field608 = 0;
            this.field609 = 0;
            this.field610 = null;
        } else {
            this.field603 = var2.field955;
            this.field599 = var2.field964 * 128;
            this.field608 = var2.field965;
            this.field609 = var2.field966;
            this.field610 = var2.field967;
        }
        if (this.field603 != var1 && this.field607 != null) {
            Statics.field2168.method1124(this.field607);
            this.field607 = null;
        }
    }

    @ObfuscatedName("r.b(IIIIB)V")
    public static void method199(int arg0, int arg1, int arg2, int arg3) {
        for (class24 var4 = (class24) field600.method3581(); var4 != null; var4 = (class24) field600.method3583()) {
            if (var4.field603 != -1 || var4.field610 != null) {
                int var5 = 0;
                if (arg1 > var4.field606) {
                    var5 += arg1 - var4.field606;
                } else if (arg1 < var4.field601) {
                    var5 += var4.field601 - arg1;
                }
                if (arg2 > var4.field604) {
                    var5 += arg2 - var4.field604;
                } else if (arg2 < var4.field602) {
                    var5 += var4.field602 - arg2;
                }
                if (var5 - 64 > var4.field599 || client.field516 == 0 || var4.field605 != arg0) {
                    if (var4.field607 != null) {
                        Statics.field2168.method1124(var4.field607);
                        var4.field607 = null;
                    }
                    if (var4.field612 != null) {
                        Statics.field2168.method1124(var4.field612);
                        var4.field612 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field516 * (var4.field599 - var5) / var4.field599;
                    if (var4.field607 != null) {
                        var4.field607.method1243(var6);
                    } else if (var4.field603 >= 0) {
                        class59 var7 = class59.method1190(Statics.field151, var4.field603, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1184().method1216(Statics.field1013);
                            class65 var9 = class65.method1266(var8, 100, var6);
                            var9.method1242(-1);
                            Statics.field2168.method1090(var9);
                            var4.field607 = var9;
                        }
                    }
                    if (var4.field612 != null) {
                        var4.field612.method1243(var6);
                        if (!var4.field612.method3671()) {
                            var4.field612 = null;
                        }
                    } else if (var4.field610 != null && (var4.field611 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field610.length);
                        class59 var11 = class59.method1190(Statics.field151, var4.field610[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1184().method1216(Statics.field1013);
                            class65 var13 = class65.method1266(var12, 100, var6);
                            var13.method1242(0);
                            Statics.field2168.method1090(var13);
                            var4.field612 = var13;
                            var4.field611 = var4.field608 + (int) (Math.random() * (double) (var4.field609 - var4.field608));
                        }
                    }
                }
            }
        }
    }
}
