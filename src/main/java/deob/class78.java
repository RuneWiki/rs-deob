package deob;

@ObfuscatedName("bc")
public final class class78 extends class352 {

    @ObfuscatedName("bc.v")
    public static class294 field968 = new class294();

    @ObfuscatedName("bc.n")
    public int field953;

    @ObfuscatedName("bc.f")
    public int field963;

    @ObfuscatedName("bc.y")
    public int field956;

    @ObfuscatedName("bc.p")
    public int field957;

    @ObfuscatedName("bc.j")
    public int field958;

    @ObfuscatedName("bc.r")
    public class154 field967;

    @ObfuscatedName("bc.b")
    public int field959;

    @ObfuscatedName("bc.d")
    public int field960;

    @ObfuscatedName("bc.s")
    public int field962;

    @ObfuscatedName("bc.u")
    public class58 field961;

    @ObfuscatedName("bc.l")
    public int field965;

    @ObfuscatedName("bc.o")
    public int[] field964;

    @ObfuscatedName("bc.c")
    public int field955;

    @ObfuscatedName("bc.e")
    public class58 field966;

    @ObfuscatedName("fd.v(I)V")
    public static void method3328() {
        for (class78 var0 = (class78) field968.method4714(); var0 != null; var0 = (class78) field968.method4741()) {
            if (var0.field961 != null) {
                Statics.field3765.method551(var0.field961);
                var0.field961 = null;
            }
            if (var0.field966 != null) {
                Statics.field3765.method551(var0.field966);
                var0.field966 = null;
            }
        }
        field968.method4735();
    }

    @ObfuscatedName("hs.n(I)V")
    public static void method3962() {
        for (class78 var0 = (class78) field968.method4714(); var0 != null; var0 = (class78) field968.method4741()) {
            if (var0.field967 != null) {
                var0.method1566();
            }
        }
    }

    @ObfuscatedName("bc.f(B)V")
    public void method1566() {
        int var1 = this.field960;
        class154 var2 = this.field967.method2720();
        if (var2 == null) {
            this.field960 = -1;
            this.field959 = 0;
            this.field962 = 0;
            this.field965 = 0;
            this.field964 = null;
        } else {
            this.field960 = var2.field1781;
            this.field959 = var2.field1798 * 128;
            this.field962 = var2.field1799;
            this.field965 = var2.field1800;
            this.field964 = var2.field1801;
        }
        if (this.field960 != var1 && this.field961 != null) {
            Statics.field3765.method551(this.field961);
            this.field961 = null;
        }
    }

    @ObfuscatedName("jn.y(IIILeg;IB)V")
    public static void method4409(int arg0, int arg1, int arg2, class154 arg3, int arg4) {
        class78 var5 = new class78();
        var5.field953 = arg0;
        var5.field963 = arg1 * 128;
        var5.field956 = arg2 * 128;
        int var6 = arg3.field1791;
        int var7 = arg3.field1803;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field1803;
            var7 = arg3.field1791;
        }
        var5.field957 = (arg1 + var6) * 128;
        var5.field958 = (arg2 + var7) * 128;
        var5.field960 = arg3.field1781;
        var5.field959 = arg3.field1798 * 128;
        var5.field962 = arg3.field1799;
        var5.field965 = arg3.field1800;
        var5.field964 = arg3.field1801;
        if (arg3.field1794 != null) {
            var5.field967 = arg3;
            var5.method1566();
        }
        field968.method4709(var5);
        if (var5.field964 != null) {
            var5.field955 = var5.field962 + (int) (Math.random() * (double) (var5.field965 - var5.field962));
        }
    }

    @ObfuscatedName("fj.p(IIIII)V")
    public static void method3282(int arg0, int arg1, int arg2, int arg3) {
        for (class78 var4 = (class78) field968.method4714(); var4 != null; var4 = (class78) field968.method4741()) {
            if (var4.field960 != -1 || var4.field964 != null) {
                int var5 = 0;
                if (arg1 > var4.field957) {
                    var5 += arg1 - var4.field957;
                } else if (arg1 < var4.field963) {
                    var5 += var4.field963 - arg1;
                }
                if (arg2 > var4.field958) {
                    var5 += arg2 - var4.field958;
                } else if (arg2 < var4.field956) {
                    var5 += var4.field956 - arg2;
                }
                if (var5 - 64 > var4.field959 || Statics.field1804.field1325 == 0 || var4.field953 != arg0) {
                    if (var4.field961 != null) {
                        Statics.field3765.method551(var4.field961);
                        var4.field961 = null;
                    }
                    if (var4.field966 != null) {
                        Statics.field3765.method551(var4.field966);
                        var4.field966 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = Statics.field1804.field1325 * (var4.field959 - var5) / var4.field959;
                    if (var4.field961 != null) {
                        var4.field961.method723(var6);
                    } else if (var4.field960 >= 0) {
                        class50 var7 = class50.method593(Statics.field243, var4.field960, 0);
                        if (var7 != null) {
                            class51 var8 = var7.method592().method601(Statics.field1370);
                            class58 var9 = class58.method719(var8, 100, var6);
                            var9.method722(-1);
                            Statics.field3765.method550(var9);
                            var4.field961 = var9;
                        }
                    }
                    if (var4.field966 != null) {
                        var4.field966.method723(var6);
                        if (!var4.field966.method5492()) {
                            var4.field966 = null;
                        }
                    } else if (var4.field964 != null && (var4.field955 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field964.length);
                        class50 var11 = class50.method593(Statics.field243, var4.field964[var10], 0);
                        if (var11 != null) {
                            class51 var12 = var11.method592().method601(Statics.field1370);
                            class58 var13 = class58.method719(var12, 100, var6);
                            var13.method722(0);
                            Statics.field3765.method550(var13);
                            var4.field966 = var13;
                            var4.field955 = var4.field962 + (int) (Math.random() * (double) (var4.field965 - var4.field962));
                        }
                    }
                }
            }
        }
    }
}
