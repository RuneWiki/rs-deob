package deob;

@ObfuscatedName("y")
public final class class21 extends class189 {

    @ObfuscatedName("y.e")
    public static class180 field541 = new class180();

    @ObfuscatedName("y.v")
    public int field545;

    @ObfuscatedName("y.k")
    public int field548;

    @ObfuscatedName("y.g")
    public int field543;

    @ObfuscatedName("y.q")
    public int field544;

    @ObfuscatedName("y.l")
    public int field540;

    @ObfuscatedName("y.a")
    public int field546;

    @ObfuscatedName("y.b")
    public int field547;

    @ObfuscatedName("y.z")
    public class59 field557;

    @ObfuscatedName("y.w")
    public int field549;

    @ObfuscatedName("y.j")
    public int field563;

    @ObfuscatedName("y.p")
    public int[] field551;

    @ObfuscatedName("y.n")
    public int field552;

    @ObfuscatedName("y.r")
    public class37 field554;

    @ObfuscatedName("y.s")
    public class59 field553;

    @ObfuscatedName("af.e(B)V")
    public static void method548() {
        for (class21 var0 = (class21) field541.method3226(); var0 != null; var0 = (class21) field541.method3231()) {
            if (var0.field557 != null) {
                Statics.field3011.method948(var0.field557);
                var0.field557 = null;
            }
            if (var0.field553 != null) {
                Statics.field3011.method948(var0.field553);
                var0.field553 = null;
            }
        }
        field541.method3223();
    }

    @ObfuscatedName("dc.v(I)V")
    public static void method2443() {
        for (class21 var0 = (class21) field541.method3226(); var0 != null; var0 = (class21) field541.method3231()) {
            if (var0.field554 != null) {
                var0.method468();
            }
        }
    }

    @ObfuscatedName("y.k(I)V")
    public void method468() {
        int var1 = this.field547;
        class37 var2 = this.field554.method661();
        if (var2 == null) {
            this.field547 = -1;
            this.field546 = 0;
            this.field549 = 0;
            this.field563 = 0;
            this.field551 = null;
        } else {
            this.field547 = var2.field864;
            this.field546 = var2.field862 * 128;
            this.field549 = var2.field889;
            this.field563 = var2.field890;
            this.field551 = var2.field891;
        }
        if (this.field547 != var1 && this.field557 != null) {
            Statics.field3011.method948(this.field557);
            this.field557 = null;
        }
    }

    @ObfuscatedName("gy.g(IIILai;II)V")
    public static void method3357(int arg0, int arg1, int arg2, class37 arg3, int arg4) {
        class21 var5 = new class21();
        var5.field545 = arg0;
        var5.field548 = arg1 * 128;
        var5.field543 = arg2 * 128;
        int var6 = arg3.field858;
        int var7 = arg3.field859;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field859;
            var7 = arg3.field858;
        }
        var5.field544 = (arg1 + var6) * 128;
        var5.field540 = (arg2 + var7) * 128;
        var5.field547 = arg3.field864;
        var5.field546 = arg3.field862 * 128;
        var5.field549 = arg3.field889;
        var5.field563 = arg3.field890;
        var5.field551 = arg3.field891;
        if (arg3.field884 != null) {
            var5.field554 = arg3;
            var5.method468();
        }
        field541.method3224(var5);
        if (var5.field551 != null) {
            var5.field552 = var5.field549 + (int) (Math.random() * (double) (var5.field563 - var5.field549));
        }
    }

    @ObfuscatedName("dv.q(IIIII)V")
    public static void method2455(int arg0, int arg1, int arg2, int arg3) {
        for (class21 var4 = (class21) field541.method3226(); var4 != null; var4 = (class21) field541.method3231()) {
            if (var4.field547 != -1 || var4.field551 != null) {
                int var5 = 0;
                if (arg1 > var4.field544) {
                    var5 += arg1 - var4.field544;
                } else if (arg1 < var4.field548) {
                    var5 += var4.field548 - arg1;
                }
                if (arg2 > var4.field540) {
                    var5 += arg2 - var4.field540;
                } else if (arg2 < var4.field543) {
                    var5 += var4.field543 - arg2;
                }
                if (var5 - 64 > var4.field546 || client.field487 == 0 || var4.field545 != arg0) {
                    if (var4.field557 != null) {
                        Statics.field3011.method948(var4.field557);
                        var4.field557 = null;
                    }
                    if (var4.field553 != null) {
                        Statics.field3011.method948(var4.field553);
                        var4.field553 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field487 * (var4.field546 - var5) / var4.field546;
                    if (var4.field557 != null) {
                        var4.field557.method1158(var6);
                    } else if (var4.field547 >= 0) {
                        class53 var7 = class53.method1048(Statics.field1864, var4.field547, 0);
                        if (var7 != null) {
                            class57 var8 = var7.method1045().method1089(Statics.field1772);
                            class59 var9 = class59.method1110(var8, 100, var6);
                            var9.method1113(-1);
                            Statics.field3011.method956(var9);
                            var4.field557 = var9;
                        }
                    }
                    if (var4.field553 != null) {
                        var4.field553.method1158(var6);
                        if (!var4.field553.method3325()) {
                            var4.field553 = null;
                        }
                    } else if (var4.field551 != null && (var4.field552 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field551.length);
                        class53 var11 = class53.method1048(Statics.field1864, var4.field551[var10], 0);
                        if (var11 != null) {
                            class57 var12 = var11.method1045().method1089(Statics.field1772);
                            class59 var13 = class59.method1110(var12, 100, var6);
                            var13.method1113(0);
                            Statics.field3011.method956(var13);
                            var4.field553 = var13;
                            var4.field552 = var4.field549 + (int) (Math.random() * (double) (var4.field563 - var4.field549));
                        }
                    }
                }
            }
        }
    }
}
