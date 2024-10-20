package deob;

@ObfuscatedName("bv")
public final class class76 extends class181 {

    @ObfuscatedName("bv.c")
    public static class263 field1068 = new class263();

    @ObfuscatedName("bv.t")
    public int field1080;

    @ObfuscatedName("bv.o")
    public int field1067;

    @ObfuscatedName("bv.e")
    public int field1066;

    @ObfuscatedName("bv.i")
    public int field1070;

    @ObfuscatedName("bv.g")
    public int field1081;

    @ObfuscatedName("bv.d")
    public int field1071;

    @ObfuscatedName("bv.l")
    public int field1073;

    @ObfuscatedName("bv.j")
    public class114 field1069;

    @ObfuscatedName("bv.m")
    public int field1075;

    @ObfuscatedName("bv.p")
    public int field1076;

    @ObfuscatedName("bv.h")
    public int[] field1077;

    @ObfuscatedName("bv.v")
    public int field1078;

    @ObfuscatedName("bv.n")
    public class114 field1079;

    @ObfuscatedName("bv.x")
    public class255 field1082;

    @ObfuscatedName("eg.c(B)V")
    public static void method3090() {
        for (class76 var0 = (class76) field1068.method4543(); var0 != null; var0 = (class76) field1068.method4564()) {
            if (var0.field1069 != null) {
                Statics.field12.method2174(var0.field1069);
                var0.field1069 = null;
            }
            if (var0.field1079 != null) {
                Statics.field12.method2174(var0.field1079);
                var0.field1079 = null;
            }
        }
        field1068.method4557();
    }

    @ObfuscatedName("gm.t(I)V")
    public static void method3387() {
        for (class76 var0 = (class76) field1068.method4543(); var0 != null; var0 = (class76) field1068.method4564()) {
            if (var0.field1082 != null) {
                var0.method1759();
            }
        }
    }

    @ObfuscatedName("bv.o(I)V")
    public void method1759() {
        int var1 = this.field1073;
        class255 var2 = this.field1082.method4304();
        if (var2 == null) {
            this.field1073 = -1;
            this.field1071 = 0;
            this.field1075 = 0;
            this.field1076 = 0;
            this.field1077 = null;
        } else {
            this.field1073 = var2.field3389;
            this.field1071 = var2.field3390 * 128;
            this.field1075 = var2.field3387;
            this.field1076 = var2.field3392;
            this.field1077 = var2.field3345;
        }
        if (this.field1073 != var1 && this.field1069 != null) {
            Statics.field12.method2174(this.field1069);
            this.field1069 = null;
        }
    }

    @ObfuscatedName("bv.e(IIILir;II)V")
    public static void method1761(int arg0, int arg1, int arg2, class255 arg3, int arg4) {
        class76 var5 = new class76();
        var5.field1080 = arg0;
        var5.field1067 = arg1 * 128;
        var5.field1066 = arg2 * 128;
        int var6 = arg3.field3360;
        int var7 = arg3.field3361;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3361;
            var7 = arg3.field3360;
        }
        var5.field1070 = (arg1 + var6) * 128;
        var5.field1081 = (arg2 + var7) * 128;
        var5.field1073 = arg3.field3389;
        var5.field1071 = arg3.field3390 * 128;
        var5.field1075 = arg3.field3387;
        var5.field1076 = arg3.field3392;
        var5.field1077 = arg3.field3345;
        if (arg3.field3386 != null) {
            var5.field1082 = arg3;
            var5.method1759();
        }
        field1068.method4545(var5);
        if (var5.field1077 != null) {
            var5.field1078 = var5.field1075 + (int) (Math.random() * (double) (var5.field1076 - var5.field1075));
        }
    }
}
