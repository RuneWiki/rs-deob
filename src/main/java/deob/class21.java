package deob;

@ObfuscatedName("x")
public final class class21 extends class189 {

    @ObfuscatedName("x.g")
    public static class180 field553 = new class180();

    @ObfuscatedName("x.j")
    public int field543;

    @ObfuscatedName("x.z")
    public int field551;

    @ObfuscatedName("x.b")
    public int field544;

    @ObfuscatedName("x.k")
    public int field545;

    @ObfuscatedName("x.c")
    public int field547;

    @ObfuscatedName("x.w")
    public int field542;

    @ObfuscatedName("x.l")
    public int field548;

    @ObfuscatedName("x.n")
    public class59 field558;

    @ObfuscatedName("x.d")
    public int field549;

    @ObfuscatedName("x.h")
    public int field552;

    @ObfuscatedName("x.y")
    public int[] field559;

    @ObfuscatedName("x.p")
    public int field554;

    @ObfuscatedName("x.i")
    public class59 field555;

    @ObfuscatedName("x.s")
    public class37 field556;

    @ObfuscatedName("x.g(B)V")
    public void method472() {
        int var1 = this.field548;
        class37 var2 = this.field556.method614();
        if (var2 == null) {
            this.field548 = -1;
            this.field542 = 0;
            this.field549 = 0;
            this.field552 = 0;
            this.field559 = null;
        } else {
            this.field548 = var2.field894;
            this.field542 = var2.field895 * 128;
            this.field549 = var2.field896;
            this.field552 = var2.field870;
            this.field559 = var2.field898;
        }
        if (this.field548 != var1 && this.field558 != null) {
            Statics.field1842.method918(this.field558);
            this.field558 = null;
        }
    }

    @ObfuscatedName("dp.j(IIIII)V")
    public static void method2420(int arg0, int arg1, int arg2, int arg3) {
        for (class21 var4 = (class21) field553.method3174(); var4 != null; var4 = (class21) field553.method3176()) {
            if (var4.field548 != -1 || var4.field559 != null) {
                int var5 = 0;
                if (arg1 > var4.field551) {
                    var5 += arg1 - var4.field551;
                } else if (arg1 < var4.field544) {
                    var5 += var4.field544 - arg1;
                }
                if (arg2 > var4.field547) {
                    var5 += arg2 - var4.field547;
                } else if (arg2 < var4.field545) {
                    var5 += var4.field545 - arg2;
                }
                if (var5 - 64 > var4.field542 || client.field430 == 0 || var4.field543 != arg0) {
                    if (var4.field558 != null) {
                        Statics.field1842.method918(var4.field558);
                        var4.field558 = null;
                    }
                    if (var4.field555 != null) {
                        Statics.field1842.method918(var4.field555);
                        var4.field555 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field430 * (var4.field542 - var5) / var4.field542;
                    if (var4.field558 != null) {
                        var4.field558.method1069(var6);
                    } else if (var4.field548 >= 0) {
                        class53 var7 = class53.method1019(Statics.field215, var4.field548, 0);
                        if (var7 != null) {
                            class57 var8 = var7.method1011().method1044(Statics.field164);
                            class59 var9 = class59.method1127(var8, 100, var6);
                            var9.method1068(-1);
                            Statics.field1842.method913(var9);
                            var4.field558 = var9;
                        }
                    }
                    if (var4.field555 != null) {
                        var4.field555.method1069(var6);
                        if (!var4.field555.method3256()) {
                            var4.field555 = null;
                        }
                    } else if (var4.field559 != null && (var4.field554 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field559.length);
                        class53 var11 = class53.method1019(Statics.field215, var4.field559[var10], 0);
                        if (var11 != null) {
                            class57 var12 = var11.method1011().method1044(Statics.field164);
                            class59 var13 = class59.method1127(var12, 100, var6);
                            var13.method1068(0);
                            Statics.field1842.method913(var13);
                            var4.field555 = var13;
                            var4.field554 = var4.field549 + (int) (Math.random() * (double) (var4.field552 - var4.field549));
                        }
                    }
                }
            }
        }
    }
}
