package deob;

@ObfuscatedName("m")
public final class class20 extends class186 {

    @ObfuscatedName("m.i")
    public static class177 field553 = new class177();

    @ObfuscatedName("m.c")
    public int field550;

    @ObfuscatedName("m.h")
    public int field564;

    @ObfuscatedName("m.v")
    public int field549;

    @ObfuscatedName("m.q")
    public int field554;

    @ObfuscatedName("m.s")
    public int field561;

    @ObfuscatedName("m.g")
    public int field559;

    @ObfuscatedName("m.u")
    public int field555;

    @ObfuscatedName("m.d")
    public int field556;

    @ObfuscatedName("m.y")
    public class58 field557;

    @ObfuscatedName("m.e")
    public int field568;

    @ObfuscatedName("m.l")
    public int[] field560;

    @ObfuscatedName("m.o")
    public int field565;

    @ObfuscatedName("m.w")
    public class58 field562;

    @ObfuscatedName("m.t")
    public class36 field563;

    @ObfuscatedName("bd.i(I)V")
    public static void method1321() {
        for (class20 var0 = (class20) field553.method3257(); var0 != null; var0 = (class20) field553.method3249()) {
            if (var0.field557 != null) {
                Statics.field1650.method954(var0.field557);
                var0.field557 = null;
            }
            if (var0.field562 != null) {
                Statics.field1650.method954(var0.field562);
                var0.field562 = null;
            }
        }
        field553.method3250();
    }

    @ObfuscatedName("m.c(I)V")
    public void method480() {
        int var1 = this.field556;
        class36 var2 = this.field563.method664();
        if (var2 == null) {
            this.field556 = -1;
            this.field555 = 0;
            this.field561 = 0;
            this.field568 = 0;
            this.field560 = null;
        } else {
            this.field556 = var2.field885;
            this.field555 = var2.field886 * 128;
            this.field561 = var2.field840;
            this.field568 = var2.field870;
            this.field560 = var2.field867;
        }
        if (this.field556 != var1 && this.field557 != null) {
            Statics.field1650.method954(this.field557);
            this.field557 = null;
        }
    }

    @ObfuscatedName("ag.h(IIILai;IB)V")
    public static void method574(int arg0, int arg1, int arg2, class36 arg3, int arg4) {
        class20 var5 = new class20();
        var5.field550 = arg0;
        var5.field564 = arg1 * 128;
        var5.field549 = arg2 * 128;
        int var6 = arg3.field856;
        int var7 = arg3.field857;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field857;
            var7 = arg3.field856;
        }
        var5.field554 = (arg1 + var6) * 128;
        var5.field559 = (arg2 + var7) * 128;
        var5.field556 = arg3.field885;
        var5.field555 = arg3.field886 * 128;
        var5.field561 = arg3.field840;
        var5.field568 = arg3.field870;
        var5.field560 = arg3.field867;
        if (arg3.field882 != null) {
            var5.field563 = arg3;
            var5.method480();
        }
        field553.method3251(var5);
        if (var5.field560 != null) {
            var5.field565 = var5.field561 + (int) (Math.random() * (double) (var5.field568 - var5.field561));
        }
    }

    @ObfuscatedName("x.v(IIIII)V")
    public static void method520(int arg0, int arg1, int arg2, int arg3) {
        for (class20 var4 = (class20) field553.method3257(); var4 != null; var4 = (class20) field553.method3249()) {
            if (var4.field556 != -1 || var4.field560 != null) {
                int var5 = 0;
                if (arg1 > var4.field554) {
                    var5 += arg1 - var4.field554;
                } else if (arg1 < var4.field564) {
                    var5 += var4.field564 - arg1;
                }
                if (arg2 > var4.field559) {
                    var5 += arg2 - var4.field559;
                } else if (arg2 < var4.field549) {
                    var5 += var4.field549 - arg2;
                }
                if (var5 - 64 > var4.field555 || client.field497 == 0 || var4.field550 != arg0) {
                    if (var4.field557 != null) {
                        Statics.field1650.method954(var4.field557);
                        var4.field557 = null;
                    }
                    if (var4.field562 != null) {
                        Statics.field1650.method954(var4.field562);
                        var4.field562 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field497 * (var4.field555 - var5) / var4.field555;
                    if (var4.field557 != null) {
                        var4.field557.method1194(var6);
                    } else if (var4.field556 >= 0) {
                        class52 var7 = class52.method1049(Statics.field166, var4.field556, 0);
                        if (var7 != null) {
                            class56 var8 = var7.method1045().method1082(Statics.field1801);
                            class58 var9 = class58.method1112(var8, 100, var6);
                            var9.method1115(-1);
                            Statics.field1650.method953(var9);
                            var4.field557 = var9;
                        }
                    }
                    if (var4.field562 != null) {
                        var4.field562.method1194(var6);
                        if (!var4.field562.method3330()) {
                            var4.field562 = null;
                        }
                    } else if (var4.field560 != null && (var4.field565 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field560.length);
                        class52 var11 = class52.method1049(Statics.field166, var4.field560[var10], 0);
                        if (var11 != null) {
                            class56 var12 = var11.method1045().method1082(Statics.field1801);
                            class58 var13 = class58.method1112(var12, 100, var6);
                            var13.method1115(0);
                            Statics.field1650.method953(var13);
                            var4.field562 = var13;
                            var4.field565 = var4.field561 + (int) (Math.random() * (double) (var4.field568 - var4.field561));
                        }
                    }
                }
            }
        }
    }
}
