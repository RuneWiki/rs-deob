package deob;

@ObfuscatedName("j")
public final class class24 extends class208 {

    @ObfuscatedName("j.i")
    public static class199 field604 = new class199();

    @ObfuscatedName("j.v")
    public int field600;

    @ObfuscatedName("j.r")
    public class41 field620;

    @ObfuscatedName("j.n")
    public int field602;

    @ObfuscatedName("j.x")
    public int field603;

    @ObfuscatedName("j.q")
    public int field605;

    @ObfuscatedName("j.h")
    public int field606;

    @ObfuscatedName("j.d")
    public int field619;

    @ObfuscatedName("j.c")
    public int field610;

    @ObfuscatedName("j.y")
    public class65 field608;

    @ObfuscatedName("j.m")
    public int field609;

    @ObfuscatedName("j.e")
    public int field607;

    @ObfuscatedName("j.z")
    public int[] field611;

    @ObfuscatedName("j.t")
    public int field612;

    @ObfuscatedName("j.b")
    public class65 field613;

    @ObfuscatedName("av.i(B)V")
    public static void method693() {
        for (class24 var0 = (class24) field604.method3534(); var0 != null; var0 = (class24) field604.method3536()) {
            if (var0.field608 != null) {
                Statics.field1038.method1134(var0.field608);
                var0.field608 = null;
            }
            if (var0.field613 != null) {
                Statics.field1038.method1134(var0.field613);
                var0.field613 = null;
            }
        }
        field604.method3553();
    }

    @ObfuscatedName("j.v(B)V")
    public void method589() {
        int var1 = this.field610;
        class41 var2 = this.field620.method809();
        if (var2 == null) {
            this.field610 = -1;
            this.field619 = 0;
            this.field609 = 0;
            this.field607 = 0;
            this.field611 = null;
        } else {
            this.field610 = var2.field965;
            this.field619 = var2.field947 * 128;
            this.field609 = var2.field967;
            this.field607 = var2.field968;
            this.field611 = var2.field920;
        }
        if (this.field610 != var1 && this.field608 != null) {
            Statics.field1038.method1134(this.field608);
            this.field608 = null;
        }
    }

    @ObfuscatedName("ez.r(IIIIB)V")
    public static void method2796(int arg0, int arg1, int arg2, int arg3) {
        for (class24 var4 = (class24) field604.method3534(); var4 != null; var4 = (class24) field604.method3536()) {
            if (var4.field610 != -1 || var4.field611 != null) {
                int var5 = 0;
                if (arg1 > var4.field605) {
                    var5 += arg1 - var4.field605;
                } else if (arg1 < var4.field602) {
                    var5 += var4.field602 - arg1;
                }
                if (arg2 > var4.field606) {
                    var5 += arg2 - var4.field606;
                } else if (arg2 < var4.field603) {
                    var5 += var4.field603 - arg2;
                }
                if (var5 - 64 > var4.field619 || client.field528 == 0 || var4.field600 != arg0) {
                    if (var4.field608 != null) {
                        Statics.field1038.method1134(var4.field608);
                        var4.field608 = null;
                    }
                    if (var4.field613 != null) {
                        Statics.field1038.method1134(var4.field613);
                        var4.field613 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field528 * (var4.field619 - var5) / var4.field619;
                    if (var4.field608 != null) {
                        var4.field608.method1304(var6);
                    } else if (var4.field610 >= 0) {
                        class59 var7 = class59.method1240(Statics.field669, var4.field610, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1235().method1279(Statics.field3052);
                            class65 var9 = class65.method1297(var8, 100, var6);
                            var9.method1303(-1);
                            Statics.field1038.method1158(var9);
                            var4.field608 = var9;
                        }
                    }
                    if (var4.field613 != null) {
                        var4.field613.method1304(var6);
                        if (!var4.field613.method3624()) {
                            var4.field613 = null;
                        }
                    } else if (var4.field611 != null && (var4.field612 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field611.length);
                        class59 var11 = class59.method1240(Statics.field669, var4.field611[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1235().method1279(Statics.field3052);
                            class65 var13 = class65.method1297(var12, 100, var6);
                            var13.method1303(0);
                            Statics.field1038.method1158(var13);
                            var4.field613 = var13;
                            var4.field612 = var4.field609 + (int) (Math.random() * (double) (var4.field607 - var4.field609));
                        }
                    }
                }
            }
        }
    }
}
