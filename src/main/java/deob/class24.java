package deob;

@ObfuscatedName("c")
public final class class24 extends class208 {

    @ObfuscatedName("c.o")
    public static class199 field620 = new class199();

    @ObfuscatedName("c.f")
    public int field619;

    @ObfuscatedName("c.i")
    public int field613;

    @ObfuscatedName("c.h")
    public int field614;

    @ObfuscatedName("c.q")
    public int field615;

    @ObfuscatedName("c.u")
    public int field618;

    @ObfuscatedName("c.m")
    public int field617;

    @ObfuscatedName("c.y")
    public int field623;

    @ObfuscatedName("c.p")
    public class65 field616;

    @ObfuscatedName("c.t")
    public int field612;

    @ObfuscatedName("c.g")
    public int field621;

    @ObfuscatedName("c.v")
    public int[] field622;

    @ObfuscatedName("c.l")
    public int field611;

    @ObfuscatedName("c.e")
    public class65 field624;

    @ObfuscatedName("c.a")
    public class41 field625;

    @ObfuscatedName("r.o(B)V")
    public static void method549() {
        for (class24 var0 = (class24) field620.method3520(); var0 != null; var0 = (class24) field620.method3522()) {
            if (var0.field616 != null) {
                Statics.field1533.method1103(var0.field616);
                var0.field616 = null;
            }
            if (var0.field624 != null) {
                Statics.field1533.method1103(var0.field624);
                var0.field624 = null;
            }
        }
        field620.method3535();
    }

    @ObfuscatedName("ae.f(I)V")
    public static void method696() {
        for (class24 var0 = (class24) field620.method3520(); var0 != null; var0 = (class24) field620.method3522()) {
            if (var0.field625 != null) {
                var0.method562();
            }
        }
    }

    @ObfuscatedName("c.i(I)V")
    public void method562() {
        int var1 = this.field623;
        class41 var2 = this.field625.method785();
        if (var2 == null) {
            this.field623 = -1;
            this.field617 = 0;
            this.field612 = 0;
            this.field621 = 0;
            this.field622 = null;
        } else {
            this.field623 = var2.field958;
            this.field617 = var2.field959 * 128;
            this.field612 = var2.field960;
            this.field621 = var2.field953;
            this.field622 = var2.field962;
        }
        if (this.field623 != var1 && this.field616 != null) {
            Statics.field1533.method1103(this.field616);
            this.field616 = null;
        }
    }

    @ObfuscatedName("fo.h(IIILaf;IB)V")
    public static void method2969(int arg0, int arg1, int arg2, class41 arg3, int arg4) {
        class24 var5 = new class24();
        var5.field619 = arg0;
        var5.field613 = arg1 * 128;
        var5.field614 = arg2 * 128;
        int var6 = arg3.field929;
        int var7 = arg3.field920;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field920;
            var7 = arg3.field929;
        }
        var5.field615 = (arg1 + var6) * 128;
        var5.field618 = (arg2 + var7) * 128;
        var5.field623 = arg3.field958;
        var5.field617 = arg3.field959 * 128;
        var5.field612 = arg3.field960;
        var5.field621 = arg3.field953;
        var5.field622 = arg3.field962;
        if (arg3.field949 != null) {
            var5.field625 = arg3;
            var5.method562();
        }
        field620.method3515(var5);
        if (var5.field622 != null) {
            var5.field611 = var5.field612 + (int) (Math.random() * (double) (var5.field621 - var5.field612));
        }
    }

    @ObfuscatedName("du.q(IIIII)V")
    public static void method2236(int arg0, int arg1, int arg2, int arg3) {
        for (class24 var4 = (class24) field620.method3520(); var4 != null; var4 = (class24) field620.method3522()) {
            if (var4.field623 != -1 || var4.field622 != null) {
                int var5 = 0;
                if (arg1 > var4.field615) {
                    var5 += arg1 - var4.field615;
                } else if (arg1 < var4.field613) {
                    var5 += var4.field613 - arg1;
                }
                if (arg2 > var4.field618) {
                    var5 += arg2 - var4.field618;
                } else if (arg2 < var4.field614) {
                    var5 += var4.field614 - arg2;
                }
                if (var5 - 64 > var4.field617 || client.field528 == 0 || var4.field619 != arg0) {
                    if (var4.field616 != null) {
                        Statics.field1533.method1103(var4.field616);
                        var4.field616 = null;
                    }
                    if (var4.field624 != null) {
                        Statics.field1533.method1103(var4.field624);
                        var4.field624 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field528 * (var4.field617 - var5) / var4.field617;
                    if (var4.field616 != null) {
                        var4.field616.method1229(var6);
                    } else if (var4.field623 >= 0) {
                        class59 var7 = class59.method1169(Statics.field631, var4.field623, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1163().method1204(Statics.field2140);
                            class65 var9 = class65.method1225(var8, 100, var6);
                            var9.method1228(-1);
                            Statics.field1533.method1068(var9);
                            var4.field616 = var9;
                        }
                    }
                    if (var4.field624 != null) {
                        var4.field624.method1229(var6);
                        if (!var4.field624.method3604()) {
                            var4.field624 = null;
                        }
                    } else if (var4.field622 != null && (var4.field611 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field622.length);
                        class59 var11 = class59.method1169(Statics.field631, var4.field622[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1163().method1204(Statics.field2140);
                            class65 var13 = class65.method1225(var12, 100, var6);
                            var13.method1228(0);
                            Statics.field1533.method1068(var13);
                            var4.field624 = var13;
                            var4.field611 = var4.field612 + (int) (Math.random() * (double) (var4.field621 - var4.field612));
                        }
                    }
                }
            }
        }
    }
}
