package deob;

@ObfuscatedName("bs")
public final class class75 extends class212 {

    @ObfuscatedName("bs.a")
    public static class213 field1062 = new class213();

    @ObfuscatedName("bs.s")
    public int field1060;

    @ObfuscatedName("bs.g")
    public int field1052;

    @ObfuscatedName("bs.x")
    public int field1058;

    @ObfuscatedName("bs.h")
    public int field1053;

    @ObfuscatedName("bs.f")
    public int field1063;

    @ObfuscatedName("bs.p")
    public int field1056;

    @ObfuscatedName("bs.m")
    public int field1057;

    @ObfuscatedName("bs.q")
    public int field1054;

    @ObfuscatedName("bs.b")
    public class111 field1059;

    @ObfuscatedName("bs.n")
    public int field1064;

    @ObfuscatedName("bs.e")
    public int[] field1055;

    @ObfuscatedName("bs.r")
    public class275 field1065;

    @ObfuscatedName("bs.t")
    public int field1067;

    @ObfuscatedName("bs.l")
    public class111 field1051;

    @ObfuscatedName("bs.a(I)V")
    public void method1757() {
        int var1 = this.field1054;
        class275 var2 = this.field1065.method4852();
        if (var2 == null) {
            this.field1054 = -1;
            this.field1057 = 0;
            this.field1060 = 0;
            this.field1064 = 0;
            this.field1055 = null;
        } else {
            this.field1054 = var2.field3497;
            this.field1057 = var2.field3501 * 128;
            this.field1060 = var2.field3455;
            this.field1064 = var2.field3500;
            this.field1055 = var2.field3452;
        }
        if (this.field1054 != var1 && this.field1059 != null) {
            Statics.field61.method2120(this.field1059);
            this.field1059 = null;
        }
    }

    @ObfuscatedName("ek.s(IIILjy;II)V")
    public static void method3058(int arg0, int arg1, int arg2, class275 arg3, int arg4) {
        class75 var5 = new class75();
        var5.field1052 = arg0;
        var5.field1053 = arg1 * 128;
        var5.field1058 = arg2 * 128;
        int var6 = arg3.field3491;
        int var7 = arg3.field3469;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3469;
            var7 = arg3.field3491;
        }
        var5.field1063 = (arg1 + var6) * 128;
        var5.field1056 = (arg2 + var7) * 128;
        var5.field1054 = arg3.field3497;
        var5.field1057 = arg3.field3501 * 128;
        var5.field1060 = arg3.field3455;
        var5.field1064 = arg3.field3500;
        var5.field1055 = arg3.field3452;
        if (arg3.field3494 != null) {
            var5.field1065 = arg3;
            var5.method1757();
        }
        field1062.method3966(var5);
        if (var5.field1055 != null) {
            var5.field1067 = var5.field1060 + (int) (Math.random() * (double) (var5.field1064 - var5.field1060));
        }
    }
}
