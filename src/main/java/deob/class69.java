package deob;

@ObfuscatedName("bs")
public final class class69 extends class205 {

    @ObfuscatedName("bs.z")
    public int field985;

    @ObfuscatedName("bs.w")
    public static class206 field986 = new class206();

    @ObfuscatedName("bs.s")
    public int field990;

    @ObfuscatedName("bs.l")
    public int field982;

    @ObfuscatedName("bs.u")
    public int field989;

    @ObfuscatedName("bs.q")
    public int field984;

    @ObfuscatedName("bs.k")
    public int field993;

    @ObfuscatedName("bs.i")
    public int field992;

    @ObfuscatedName("bs.x")
    public int field988;

    @ObfuscatedName("bs.e")
    public class104 field994;

    @ObfuscatedName("bs.p")
    public int field983;

    @ObfuscatedName("bs.b")
    public int[] field987;

    @ObfuscatedName("bs.n")
    public int field991;

    @ObfuscatedName("bs.f")
    public class104 field981;

    @ObfuscatedName("bs.g")
    public class269 field995;

    @ObfuscatedName("k.z(I)V")
    public static void method76() {
        for (class69 var0 = (class69) field986.method3790(); var0 != null; var0 = (class69) field986.method3771()) {
            if (var0.field995 != null) {
                var0.method1581();
            }
        }
    }

    @ObfuscatedName("bs.w(B)V")
    public void method1581() {
        int var1 = this.field988;
        class269 var2 = this.field995.method4665();
        if (var2 == null) {
            this.field988 = -1;
            this.field992 = 0;
            this.field990 = 0;
            this.field983 = 0;
            this.field987 = null;
        } else {
            this.field988 = var2.field3414;
            this.field992 = var2.field3415 * 128;
            this.field990 = var2.field3381;
            this.field983 = var2.field3409;
            this.field987 = var2.field3418;
        }
        if (this.field988 != var1 && this.field994 != null) {
            Statics.field311.method1876(this.field994);
            this.field994 = null;
        }
    }

    @ObfuscatedName("fb.s(IIILjj;II)V")
    public static void method3231(int arg0, int arg1, int arg2, class269 arg3, int arg4) {
        class69 var5 = new class69();
        var5.field982 = arg0;
        var5.field989 = arg1 * 128;
        var5.field984 = arg2 * 128;
        int var6 = arg3.field3385;
        int var7 = arg3.field3386;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3386;
            var7 = arg3.field3385;
        }
        var5.field985 = (arg1 + var6) * 128;
        var5.field993 = (arg2 + var7) * 128;
        var5.field988 = arg3.field3414;
        var5.field992 = arg3.field3415 * 128;
        var5.field990 = arg3.field3381;
        var5.field983 = arg3.field3409;
        var5.field987 = arg3.field3418;
        if (arg3.field3411 != null) {
            var5.field995 = arg3;
            var5.method1581();
        }
        field986.method3765(var5);
        if (var5.field987 != null) {
            var5.field991 = var5.field990 + (int) (Math.random() * (double) (var5.field983 - var5.field990));
        }
    }
}
