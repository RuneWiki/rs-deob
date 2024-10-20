package deob;

@ObfuscatedName("s")
public final class class24 extends class209 {

    @ObfuscatedName("s.b")
    public static class200 field607 = new class200();

    @ObfuscatedName("s.g")
    public int field601;

    @ObfuscatedName("s.j")
    public int field602;

    @ObfuscatedName("s.d")
    public int field609;

    @ObfuscatedName("s.x")
    public int field606;

    @ObfuscatedName("s.y")
    public int field605;

    @ObfuscatedName("s.r")
    public class41 field600;

    @ObfuscatedName("s.c")
    public int field604;

    @ObfuscatedName("s.l")
    public int field603;

    @ObfuscatedName("s.u")
    public class65 field608;

    @ObfuscatedName("s.p")
    public int field613;

    @ObfuscatedName("s.n")
    public int field610;

    @ObfuscatedName("s.w")
    public int[] field614;

    @ObfuscatedName("s.z")
    public int field612;

    @ObfuscatedName("s.k")
    public class65 field611;

    @ObfuscatedName("cx.b(I)V")
    public static void method2044() {
        for (class24 var0 = (class24) field607.method3575(); var0 != null; var0 = (class24) field607.method3565()) {
            if (var0.field608 != null) {
                Statics.field1135.method1113(var0.field608);
                var0.field608 = null;
            }
            if (var0.field611 != null) {
                Statics.field1135.method1113(var0.field611);
                var0.field611 = null;
            }
        }
        field607.method3554();
    }

    @ObfuscatedName("client.g(I)V")
    public static void method543() {
        for (class24 var0 = (class24) field607.method3575(); var0 != null; var0 = (class24) field607.method3565()) {
            if (var0.field600 != null) {
                var0.method570();
            }
        }
    }

    @ObfuscatedName("s.j(I)V")
    public void method570() {
        int var1 = this.field603;
        class41 var2 = this.field600.method786();
        if (var2 == null) {
            this.field603 = -1;
            this.field604 = 0;
            this.field613 = 0;
            this.field610 = 0;
            this.field614 = null;
        } else {
            this.field603 = var2.field945;
            this.field604 = var2.field907 * 128;
            this.field613 = var2.field932;
            this.field610 = var2.field948;
            this.field614 = var2.field949;
        }
        if (this.field603 != var1 && this.field608 != null) {
            Statics.field1135.method1113(this.field608);
            this.field608 = null;
        }
    }

    @ObfuscatedName("k.d(IIILas;II)V")
    public static void method160(int arg0, int arg1, int arg2, class41 arg3, int arg4) {
        class24 var5 = new class24();
        var5.field601 = arg0;
        var5.field602 = arg1 * 128;
        var5.field609 = arg2 * 128;
        int var6 = arg3.field916;
        int var7 = arg3.field905;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field905;
            var7 = arg3.field916;
        }
        var5.field606 = (arg1 + var6) * 128;
        var5.field605 = (arg2 + var7) * 128;
        var5.field603 = arg3.field945;
        var5.field604 = arg3.field907 * 128;
        var5.field613 = arg3.field932;
        var5.field610 = arg3.field948;
        var5.field614 = arg3.field949;
        if (arg3.field950 != null) {
            var5.field600 = arg3;
            var5.method570();
        }
        field607.method3550(var5);
        if (var5.field614 != null) {
            var5.field612 = var5.field613 + (int) (Math.random() * (double) (var5.field610 - var5.field613));
        }
    }

    @ObfuscatedName("k.x(IIIII)V")
    public static void method162(int arg0, int arg1, int arg2, int arg3) {
        for (class24 var4 = (class24) field607.method3575(); var4 != null; var4 = (class24) field607.method3565()) {
            if (var4.field603 != -1 || var4.field614 != null) {
                int var5 = 0;
                if (arg1 > var4.field606) {
                    var5 += arg1 - var4.field606;
                } else if (arg1 < var4.field602) {
                    var5 += var4.field602 - arg1;
                }
                if (arg2 > var4.field605) {
                    var5 += arg2 - var4.field605;
                } else if (arg2 < var4.field609) {
                    var5 += var4.field609 - arg2;
                }
                if (var5 - 64 > var4.field604 || client.field366 == 0 || var4.field601 != arg0) {
                    if (var4.field608 != null) {
                        Statics.field1135.method1113(var4.field608);
                        var4.field608 = null;
                    }
                    if (var4.field611 != null) {
                        Statics.field1135.method1113(var4.field611);
                        var4.field611 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field366 * (var4.field604 - var5) / var4.field604;
                    if (var4.field608 != null) {
                        var4.field608.method1266(var6);
                    } else if (var4.field603 >= 0) {
                        class59 var7 = class59.method1203(Statics.field467, var4.field603, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1209().method1238(Statics.field1590);
                            class65 var9 = class65.method1262(var8, 100, var6);
                            var9.method1265(-1);
                            Statics.field1135.method1148(var9);
                            var4.field608 = var9;
                        }
                    }
                    if (var4.field611 != null) {
                        var4.field611.method1266(var6);
                        if (!var4.field611.method3642()) {
                            var4.field611 = null;
                        }
                    } else if (var4.field614 != null && (var4.field612 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field614.length);
                        class59 var11 = class59.method1203(Statics.field467, var4.field614[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1209().method1238(Statics.field1590);
                            class65 var13 = class65.method1262(var12, 100, var6);
                            var13.method1265(0);
                            Statics.field1135.method1148(var13);
                            var4.field611 = var13;
                            var4.field612 = var4.field613 + (int) (Math.random() * (double) (var4.field610 - var4.field613));
                        }
                    }
                }
            }
        }
    }
}
