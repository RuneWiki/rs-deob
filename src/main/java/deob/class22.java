package deob;

@ObfuscatedName("o")
public final class class22 extends class199 {

    @ObfuscatedName("o.n")
    public static class190 field564 = new class190();

    @ObfuscatedName("o.d")
    public int field558;

    @ObfuscatedName("o.z")
    public int field557;

    @ObfuscatedName("o.y")
    public int field555;

    @ObfuscatedName("o.e")
    public int field556;

    @ObfuscatedName("o.g")
    public int field561;

    @ObfuscatedName("o.f")
    public int field563;

    @ObfuscatedName("o.m")
    public int field560;

    @ObfuscatedName("o.a")
    public class60 field554;

    @ObfuscatedName("o.h")
    public int field562;

    @ObfuscatedName("o.l")
    public int field553;

    @ObfuscatedName("o.u")
    public int[] field559;

    @ObfuscatedName("o.q")
    public int field565;

    @ObfuscatedName("o.k")
    public class60 field566;

    @ObfuscatedName("o.x")
    public class38 field567;

    @ObfuscatedName("bg.n(I)V")
    public static void method1389() {
        for (class22 var0 = (class22) field564.method3497(); var0 != null; var0 = (class22) field564.method3475()) {
            if (var0.field554 != null) {
                Statics.field1290.method1005(var0.field554);
                var0.field554 = null;
            }
            if (var0.field566 != null) {
                Statics.field1290.method1005(var0.field566);
                var0.field566 = null;
            }
        }
        field564.method3483();
    }

    @ObfuscatedName("o.d(I)V")
    public void method531() {
        int var1 = this.field560;
        class38 var2 = this.field567.method731();
        if (var2 == null) {
            this.field560 = -1;
            this.field563 = 0;
            this.field562 = 0;
            this.field553 = 0;
            this.field559 = null;
        } else {
            this.field560 = var2.field885;
            this.field563 = var2.field887 * 128;
            this.field562 = var2.field907;
            this.field553 = var2.field908;
            this.field559 = var2.field909;
        }
        if (this.field560 != var1 && this.field554 != null) {
            Statics.field1290.method1005(this.field554);
            this.field554 = null;
        }
    }

    @ObfuscatedName("ab.z(IIILat;II)V")
    public static void method659(int arg0, int arg1, int arg2, class38 arg3, int arg4) {
        class22 var5 = new class22();
        var5.field558 = arg0;
        var5.field555 = arg1 * 128;
        var5.field556 = arg2 * 128;
        int var6 = arg3.field877;
        int var7 = arg3.field872;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field872;
            var7 = arg3.field877;
        }
        var5.field557 = (arg1 + var6) * 128;
        var5.field561 = (arg2 + var7) * 128;
        var5.field560 = arg3.field885;
        var5.field563 = arg3.field887 * 128;
        var5.field562 = arg3.field907;
        var5.field553 = arg3.field908;
        var5.field559 = arg3.field909;
        if (arg3.field902 != null) {
            var5.field567 = arg3;
            var5.method531();
        }
        field564.method3477(var5);
        if (var5.field559 != null) {
            var5.field565 = var5.field562 + (int) (Math.random() * (double) (var5.field553 - var5.field562));
        }
    }
}
