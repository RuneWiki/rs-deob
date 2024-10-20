package deob;

@ObfuscatedName("x")
public final class class20 extends class183 {

    @ObfuscatedName("x.e")
    public static class176 field551 = new class176();

    @ObfuscatedName("x.p")
    public int field536;

    @ObfuscatedName("x.a")
    public int field535;

    @ObfuscatedName("x.g")
    public int field538;

    @ObfuscatedName("x.u")
    public int field537;

    @ObfuscatedName("x.k")
    public int field544;

    @ObfuscatedName("x.m")
    public int field539;

    @ObfuscatedName("x.t")
    public int field540;

    @ObfuscatedName("x.l")
    public class58 field541;

    @ObfuscatedName("x.f")
    public int field542;

    @ObfuscatedName("x.c")
    public int field543;

    @ObfuscatedName("x.i")
    public int[] field534;

    @ObfuscatedName("x.o")
    public int field545;

    @ObfuscatedName("x.d")
    public class58 field546;

    @ObfuscatedName("x.b")
    public class36 field547;

    @ObfuscatedName("a.e(B)V")
    public static void method21() {
        for (class20 var0 = (class20) field551.method3225(); var0 != null; var0 = (class20) field551.method3227()) {
            if (var0.field541 != null) {
                Statics.field1654.method975(var0.field541);
                var0.field541 = null;
            }
            if (var0.field546 != null) {
                Statics.field1654.method975(var0.field546);
                var0.field546 = null;
            }
        }
        field551.method3231();
    }

    @ObfuscatedName("x.p(I)V")
    public void method484() {
        int var1 = this.field540;
        class36 var2 = this.field547.method649();
        if (var2 == null) {
            this.field540 = -1;
            this.field539 = 0;
            this.field542 = 0;
            this.field543 = 0;
            this.field534 = null;
        } else {
            this.field540 = var2.field869;
            this.field539 = var2.field854 * 128;
            this.field542 = var2.field871;
            this.field543 = var2.field835;
            this.field534 = var2.field862;
        }
        if (this.field540 != var1 && this.field541 != null) {
            Statics.field1654.method975(this.field541);
            this.field541 = null;
        }
    }

    @ObfuscatedName("v.a(IIILac;II)V")
    public static void method148(int arg0, int arg1, int arg2, class36 arg3, int arg4) {
        class20 var5 = new class20();
        var5.field536 = arg0;
        var5.field535 = arg1 * 128;
        var5.field538 = arg2 * 128;
        int var6 = arg3.field840;
        int var7 = arg3.field824;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field824;
            var7 = arg3.field840;
        }
        var5.field537 = (arg1 + var6) * 128;
        var5.field544 = (arg2 + var7) * 128;
        var5.field540 = arg3.field869;
        var5.field539 = arg3.field854 * 128;
        var5.field542 = arg3.field871;
        var5.field543 = arg3.field835;
        var5.field534 = arg3.field862;
        if (arg3.field866 != null) {
            var5.field547 = arg3;
            var5.method484();
        }
        field551.method3222(var5);
        if (var5.field534 != null) {
            var5.field545 = var5.field542 + (int) (Math.random() * (double) (var5.field543 - var5.field542));
        }
    }

    @ObfuscatedName("c.g(IIIII)V")
    public static void method116(int arg0, int arg1, int arg2, int arg3) {
        for (class20 var4 = (class20) field551.method3225(); var4 != null; var4 = (class20) field551.method3227()) {
            if (var4.field540 != -1 || var4.field534 != null) {
                int var5 = 0;
                if (arg1 > var4.field537) {
                    var5 += arg1 - var4.field537;
                } else if (arg1 < var4.field535) {
                    var5 += var4.field535 - arg1;
                }
                if (arg2 > var4.field544) {
                    var5 += arg2 - var4.field544;
                } else if (arg2 < var4.field538) {
                    var5 += var4.field538 - arg2;
                }
                if (var5 - 64 > var4.field539 || client.field492 == 0 || var4.field536 != arg0) {
                    if (var4.field541 != null) {
                        Statics.field1654.method975(var4.field541);
                        var4.field541 = null;
                    }
                    if (var4.field546 != null) {
                        Statics.field1654.method975(var4.field546);
                        var4.field546 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field492 * (var4.field539 - var5) / var4.field539;
                    if (var4.field541 != null) {
                        var4.field541.method1127(var6);
                    } else if (var4.field540 >= 0) {
                        class52 var7 = class52.method1072(Statics.field142, var4.field540, 0);
                        if (var7 != null) {
                            class56 var8 = var7.method1065().method1102(Statics.field549);
                            class58 var9 = class58.method1142(var8, 100, var6);
                            var9.method1126(-1);
                            Statics.field1654.method974(var9);
                            var4.field541 = var9;
                        }
                    }
                    if (var4.field546 != null) {
                        var4.field546.method1127(var6);
                        if (!var4.field546.method3304()) {
                            var4.field546 = null;
                        }
                    } else if (var4.field534 != null && (var4.field545 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field534.length);
                        class52 var11 = class52.method1072(Statics.field142, var4.field534[var10], 0);
                        if (var11 != null) {
                            class56 var12 = var11.method1065().method1102(Statics.field549);
                            class58 var13 = class58.method1142(var12, 100, var6);
                            var13.method1126(0);
                            Statics.field1654.method974(var13);
                            var4.field546 = var13;
                            var4.field545 = var4.field542 + (int) (Math.random() * (double) (var4.field543 - var4.field542));
                        }
                    }
                }
            }
        }
    }
}
