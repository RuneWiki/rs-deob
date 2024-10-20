package deob;

@ObfuscatedName("cv")
public final class class81 extends class217 {

    @ObfuscatedName("cv.g")
    public static class218 field1248 = new class218();

    @ObfuscatedName("cv.e")
    public int field1244;

    @ObfuscatedName("cv.b")
    public int field1246;

    @ObfuscatedName("cv.z")
    public int field1254;

    @ObfuscatedName("cv.n")
    public int field1247;

    @ObfuscatedName("cv.l")
    public int field1251;

    @ObfuscatedName("cv.s")
    public int field1253;

    @ObfuscatedName("cv.y")
    public int field1250;

    @ObfuscatedName("cv.c")
    public int field1249;

    @ObfuscatedName("cv.h")
    public class116 field1252;

    @ObfuscatedName("cv.i")
    public int field1257;

    @ObfuscatedName("cv.o")
    public int[] field1255;

    @ObfuscatedName("cv.d")
    public int field1256;

    @ObfuscatedName("cv.r")
    public class283 field1258;

    @ObfuscatedName("cv.p")
    public class116 field1245;

    @ObfuscatedName("cq.g(B)V")
    public static void method2014() {
        for (class81 var0 = (class81) field1248.method3809(); var0 != null; var0 = (class81) field1248.method3832()) {
            if (var0.field1252 != null) {
                Statics.field239.method2031(var0.field1252);
                var0.field1252 = null;
            }
            if (var0.field1245 != null) {
                Statics.field239.method2031(var0.field1245);
                var0.field1245 = null;
            }
        }
        field1248.method3811();
    }

    @ObfuscatedName("cv.e(I)V")
    public void method1726() {
        int var1 = this.field1249;
        class283 var2 = this.field1258.method4699();
        if (var2 == null) {
            this.field1249 = -1;
            this.field1250 = 0;
            this.field1253 = 0;
            this.field1257 = 0;
            this.field1255 = null;
        } else {
            this.field1249 = var2.field3636;
            this.field1250 = var2.field3607 * 128;
            this.field1253 = var2.field3638;
            this.field1257 = var2.field3639;
            this.field1255 = var2.field3640;
        }
        if (this.field1249 != var1 && this.field1252 != null) {
            Statics.field239.method2031(this.field1252);
            this.field1252 = null;
        }
    }

    @ObfuscatedName("ft.b(IIILjs;II)V")
    public static void method3207(int arg0, int arg1, int arg2, class283 arg3, int arg4) {
        class81 var5 = new class81();
        var5.field1244 = arg0;
        var5.field1246 = arg1 * 128;
        var5.field1247 = arg2 * 128;
        int var6 = arg3.field3610;
        int var7 = arg3.field3608;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3608;
            var7 = arg3.field3610;
        }
        var5.field1254 = (arg1 + var6) * 128;
        var5.field1251 = (arg2 + var7) * 128;
        var5.field1249 = arg3.field3636;
        var5.field1250 = arg3.field3607 * 128;
        var5.field1253 = arg3.field3638;
        var5.field1257 = arg3.field3639;
        var5.field1255 = arg3.field3640;
        if (arg3.field3633 != null) {
            var5.field1258 = arg3;
            var5.method1726();
        }
        field1248.method3829(var5);
        if (var5.field1255 != null) {
            var5.field1256 = var5.field1253 + (int) (Math.random() * (double) (var5.field1257 - var5.field1253));
        }
    }
}
