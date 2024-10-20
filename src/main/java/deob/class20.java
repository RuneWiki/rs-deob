package deob;

@ObfuscatedName("d")
public final class class20 extends class186 {

    @ObfuscatedName("d.g")
    public static class177 field545 = new class177();

    @ObfuscatedName("d.v")
    public int field544;

    @ObfuscatedName("d.z")
    public int field550;

    @ObfuscatedName("d.h")
    public int field555;

    @ObfuscatedName("d.k")
    public int field546;

    @ObfuscatedName("d.l")
    public int field548;

    @ObfuscatedName("d.e")
    public int field549;

    @ObfuscatedName("d.j")
    public int field559;

    @ObfuscatedName("d.n")
    public class58 field551;

    @ObfuscatedName("d.f")
    public int field552;

    @ObfuscatedName("d.a")
    public int field553;

    @ObfuscatedName("d.i")
    public int[] field554;

    @ObfuscatedName("d.y")
    public int field547;

    @ObfuscatedName("d.p")
    public class58 field556;

    @ObfuscatedName("d.q")
    public class36 field557;

    @ObfuscatedName("aa.g(S)V")
    public static void method570() {
        for (class20 var0 = (class20) field545.method3237(); var0 != null; var0 = (class20) field545.method3239()) {
            if (var0.field551 != null) {
                Statics.field153.method975(var0.field551);
                var0.field551 = null;
            }
            if (var0.field556 != null) {
                Statics.field153.method975(var0.field556);
                var0.field556 = null;
            }
        }
        field545.method3231();
    }

    @ObfuscatedName("c.v(I)V")
    public static void method502() {
        for (class20 var0 = (class20) field545.method3237(); var0 != null; var0 = (class20) field545.method3239()) {
            if (var0.field557 != null) {
                var0.method473();
            }
        }
    }

    @ObfuscatedName("d.z(I)V")
    public void method473() {
        int var1 = this.field559;
        class36 var2 = this.field557.method648();
        if (var2 == null) {
            this.field559 = -1;
            this.field549 = 0;
            this.field552 = 0;
            this.field553 = 0;
            this.field554 = null;
        } else {
            this.field559 = var2.field875;
            this.field549 = var2.field848 * 128;
            this.field552 = var2.field877;
            this.field553 = var2.field878;
            this.field554 = var2.field849;
        }
        if (this.field559 != var1 && this.field551 != null) {
            Statics.field153.method975(this.field551);
            this.field551 = null;
        }
    }

    @ObfuscatedName("k.h(IIILan;II)V")
    public static void method36(int arg0, int arg1, int arg2, class36 arg3, int arg4) {
        class20 var5 = new class20();
        var5.field544 = arg0;
        var5.field555 = arg1 * 128;
        var5.field546 = arg2 * 128;
        int var6 = arg3.field846;
        int var7 = arg3.field847;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field847;
            var7 = arg3.field846;
        }
        var5.field550 = (arg1 + var6) * 128;
        var5.field548 = (arg2 + var7) * 128;
        var5.field559 = arg3.field875;
        var5.field549 = arg3.field848 * 128;
        var5.field552 = arg3.field877;
        var5.field553 = arg3.field878;
        var5.field554 = arg3.field849;
        if (arg3.field872 != null) {
            var5.field557 = arg3;
            var5.method473();
        }
        field545.method3232(var5);
        if (var5.field554 != null) {
            var5.field547 = var5.field552 + (int) (Math.random() * (double) (var5.field553 - var5.field552));
        }
    }

    @ObfuscatedName("r.k(IIIII)V")
    public static void method160(int arg0, int arg1, int arg2, int arg3) {
        for (class20 var4 = (class20) field545.method3237(); var4 != null; var4 = (class20) field545.method3239()) {
            if (var4.field559 != -1 || var4.field554 != null) {
                int var5 = 0;
                if (arg1 > var4.field550) {
                    var5 += arg1 - var4.field550;
                } else if (arg1 < var4.field555) {
                    var5 += var4.field555 - arg1;
                }
                if (arg2 > var4.field548) {
                    var5 += arg2 - var4.field548;
                } else if (arg2 < var4.field546) {
                    var5 += var4.field546 - arg2;
                }
                if (var5 - 64 > var4.field549 || client.field484 == 0 || var4.field544 != arg0) {
                    if (var4.field551 != null) {
                        Statics.field153.method975(var4.field551);
                        var4.field551 = null;
                    }
                    if (var4.field556 != null) {
                        Statics.field153.method975(var4.field556);
                        var4.field556 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field484 * (var4.field549 - var5) / var4.field549;
                    if (var4.field551 != null) {
                        var4.field551.method1125(var6);
                    } else if (var4.field559 >= 0) {
                        class52 var7 = class52.method1066(Statics.field2962, var4.field559, 0);
                        if (var7 != null) {
                            class56 var8 = var7.method1065().method1104(Statics.field168);
                            class58 var9 = class58.method1122(var8, 100, var6);
                            var9.method1154(-1);
                            Statics.field153.method993(var9);
                            var4.field551 = var9;
                        }
                    }
                    if (var4.field556 != null) {
                        var4.field556.method1125(var6);
                        if (!var4.field556.method3320()) {
                            var4.field556 = null;
                        }
                    } else if (var4.field554 != null && (var4.field547 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field554.length);
                        class52 var11 = class52.method1066(Statics.field2962, var4.field554[var10], 0);
                        if (var11 != null) {
                            class56 var12 = var11.method1065().method1104(Statics.field168);
                            class58 var13 = class58.method1122(var12, 100, var6);
                            var13.method1154(0);
                            Statics.field153.method993(var13);
                            var4.field556 = var13;
                            var4.field547 = var4.field552 + (int) (Math.random() * (double) (var4.field553 - var4.field552));
                        }
                    }
                }
            }
        }
    }
}
