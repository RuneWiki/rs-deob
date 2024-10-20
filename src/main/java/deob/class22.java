package deob;

@ObfuscatedName("f")
public final class class22 extends class199 {

    @ObfuscatedName("f.b")
    public static class190 field576 = new class190();

    @ObfuscatedName("f.e")
    public int field562;

    @ObfuscatedName("f.a")
    public int field573;

    @ObfuscatedName("f.k")
    public int field564;

    @ObfuscatedName("f.p")
    public int field565;

    @ObfuscatedName("f.l")
    public int field566;

    @ObfuscatedName("f.u")
    public int field567;

    @ObfuscatedName("f.o")
    public int field568;

    @ObfuscatedName("f.m")
    public class60 field569;

    @ObfuscatedName("f.q")
    public int field570;

    @ObfuscatedName("f.v")
    public int field571;

    @ObfuscatedName("f.n")
    public int[] field572;

    @ObfuscatedName("f.z")
    public int field561;

    @ObfuscatedName("f.r")
    public class38 field578;

    @ObfuscatedName("f.i")
    public class60 field574;

    @ObfuscatedName("ea.b(B)V")
    public static void method2752() {
        for (class22 var0 = (class22) field576.method3324(); var0 != null; var0 = (class22) field576.method3326()) {
            if (var0.field578 != null) {
                var0.method513();
            }
        }
    }

    @ObfuscatedName("f.e(I)V")
    public void method513() {
        int var1 = this.field568;
        class38 var2 = this.field578.method679();
        if (var2 == null) {
            this.field568 = -1;
            this.field567 = 0;
            this.field570 = 0;
            this.field571 = 0;
            this.field572 = null;
        } else {
            this.field568 = var2.field871;
            this.field567 = var2.field894 * 128;
            this.field570 = var2.field895;
            this.field571 = var2.field896;
            this.field572 = var2.field897;
        }
        if (this.field568 != var1 && this.field569 != null) {
            Statics.field2061.method972(this.field569);
            this.field569 = null;
        }
    }

    @ObfuscatedName("cs.a(IIILam;II)V")
    public static void method1766(int arg0, int arg1, int arg2, class38 arg3, int arg4) {
        class22 var5 = new class22();
        var5.field562 = arg0;
        var5.field573 = arg1 * 128;
        var5.field564 = arg2 * 128;
        int var6 = arg3.field864;
        int var7 = arg3.field852;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field852;
            var7 = arg3.field864;
        }
        var5.field565 = (arg1 + var6) * 128;
        var5.field566 = (arg2 + var7) * 128;
        var5.field568 = arg3.field871;
        var5.field567 = arg3.field894 * 128;
        var5.field570 = arg3.field895;
        var5.field571 = arg3.field896;
        var5.field572 = arg3.field897;
        if (arg3.field890 != null) {
            var5.field578 = arg3;
            var5.method513();
        }
        field576.method3319(var5);
        if (var5.field572 != null) {
            var5.field561 = var5.field570 + (int) (Math.random() * (double) (var5.field571 - var5.field570));
        }
    }
}
