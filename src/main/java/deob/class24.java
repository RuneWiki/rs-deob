package deob;

@ObfuscatedName("a")
public final class class24 extends class209 {

    @ObfuscatedName("a.f")
    public static class200 field609 = new class200();

    @ObfuscatedName("a.u")
    public int field605;

    @ObfuscatedName("a.x")
    public int field607;

    @ObfuscatedName("a.b")
    public int field606;

    @ObfuscatedName("a.l")
    public int field616;

    @ObfuscatedName("a.d")
    public int field617;

    @ObfuscatedName("a.n")
    public int field604;

    @ObfuscatedName("a.m")
    public int field611;

    @ObfuscatedName("a.g")
    public class65 field612;

    @ObfuscatedName("a.s")
    public int field613;

    @ObfuscatedName("a.r")
    public class41 field618;

    @ObfuscatedName("a.k")
    public int field614;

    @ObfuscatedName("a.o")
    public int[] field615;

    @ObfuscatedName("a.q")
    public int field610;

    @ObfuscatedName("a.p")
    public class65 field608;

    @ObfuscatedName("aa.f(I)V")
    public static void method911() {
        for (class24 var0 = (class24) field609.method3585(); var0 != null; var0 = (class24) field609.method3590()) {
            if (var0.field612 != null) {
                Statics.field2015.method1173(var0.field612);
                var0.field612 = null;
            }
            if (var0.field608 != null) {
                Statics.field2015.method1173(var0.field608);
                var0.field608 = null;
            }
        }
        field609.method3582();
    }

    @ObfuscatedName("a.u(I)V")
    public void method617() {
        int var1 = this.field611;
        class41 var2 = this.field618.method823();
        if (var2 == null) {
            this.field611 = -1;
            this.field604 = 0;
            this.field613 = 0;
            this.field614 = 0;
            this.field615 = null;
        } else {
            this.field611 = var2.field982;
            this.field604 = var2.field936 * 128;
            this.field613 = var2.field983;
            this.field614 = var2.field984;
            this.field615 = var2.field985;
        }
        if (this.field611 != var1 && this.field612 != null) {
            Statics.field2015.method1173(this.field612);
            this.field612 = null;
        }
    }

    @ObfuscatedName("du.x(IIIIB)V")
    public static void method2334(int arg0, int arg1, int arg2, int arg3) {
        for (class24 var4 = (class24) field609.method3585(); var4 != null; var4 = (class24) field609.method3590()) {
            if (var4.field611 != -1 || var4.field615 != null) {
                int var5 = 0;
                if (arg1 > var4.field616) {
                    var5 += arg1 - var4.field616;
                } else if (arg1 < var4.field606) {
                    var5 += var4.field606 - arg1;
                }
                if (arg2 > var4.field617) {
                    var5 += arg2 - var4.field617;
                } else if (arg2 < var4.field607) {
                    var5 += var4.field607 - arg2;
                }
                if (var5 - 64 > var4.field604 || client.field350 == 0 || var4.field605 != arg0) {
                    if (var4.field612 != null) {
                        Statics.field2015.method1173(var4.field612);
                        var4.field612 = null;
                    }
                    if (var4.field608 != null) {
                        Statics.field2015.method1173(var4.field608);
                        var4.field608 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field350 * (var4.field604 - var5) / var4.field604;
                    if (var4.field612 != null) {
                        var4.field612.method1313(var6);
                    } else if (var4.field611 >= 0) {
                        class59 var7 = class59.method1263(Statics.field2102, var4.field611, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1257().method1289(Statics.field195);
                            class65 var9 = class65.method1310(var8, 100, var6);
                            var9.method1328(-1);
                            Statics.field2015.method1202(var9);
                            var4.field612 = var9;
                        }
                    }
                    if (var4.field608 != null) {
                        var4.field608.method1313(var6);
                        if (!var4.field608.method3675()) {
                            var4.field608 = null;
                        }
                    } else if (var4.field615 != null && (var4.field610 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field615.length);
                        class59 var11 = class59.method1263(Statics.field2102, var4.field615[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1257().method1289(Statics.field195);
                            class65 var13 = class65.method1310(var12, 100, var6);
                            var13.method1328(0);
                            Statics.field2015.method1202(var13);
                            var4.field608 = var13;
                            var4.field610 = var4.field613 + (int) (Math.random() * (double) (var4.field614 - var4.field613));
                        }
                    }
                }
            }
        }
    }
}
