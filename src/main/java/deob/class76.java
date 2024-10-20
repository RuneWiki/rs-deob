package deob;

@ObfuscatedName("bc")
public final class class76 extends class181 {

    @ObfuscatedName("bc.u")
    public static class262 field1074 = new class262();

    @ObfuscatedName("bc.f")
    public int field1069;

    @ObfuscatedName("bc.b")
    public int field1081;

    @ObfuscatedName("bc.g")
    public int field1070;

    @ObfuscatedName("bc.z")
    public int field1075;

    @ObfuscatedName("bc.p")
    public int field1072;

    @ObfuscatedName("bc.h")
    public int field1073;

    @ObfuscatedName("bc.y")
    public int field1067;

    @ObfuscatedName("bc.w")
    public class114 field1078;

    @ObfuscatedName("bc.i")
    public int field1076;

    @ObfuscatedName("bc.k")
    public int field1077;

    @ObfuscatedName("bc.x")
    public int[] field1071;

    @ObfuscatedName("bc.o")
    public int field1079;

    @ObfuscatedName("bc.e")
    public class114 field1080;

    @ObfuscatedName("bc.n")
    public class254 field1068;

    @ObfuscatedName("bc.u(I)V")
    public void method1749() {
        int var1 = this.field1067;
        class254 var2 = this.field1068.method4321();
        if (var2 == null) {
            this.field1067 = -1;
            this.field1073 = 0;
            this.field1076 = 0;
            this.field1077 = 0;
            this.field1071 = null;
        } else {
            this.field1067 = var2.field3379;
            this.field1073 = var2.field3375 * 128;
            this.field1076 = var2.field3400;
            this.field1077 = var2.field3401;
            this.field1071 = var2.field3391;
        }
        if (this.field1067 != var1 && this.field1078 != null) {
            Statics.field2240.method2112(this.field1078);
            this.field1078 = null;
        }
    }

    @ObfuscatedName("ac.f(IIILil;IB)V")
    public static void method610(int arg0, int arg1, int arg2, class254 arg3, int arg4) {
        class76 var5 = new class76();
        var5.field1069 = arg0;
        var5.field1081 = arg1 * 128;
        var5.field1070 = arg2 * 128;
        int var6 = arg3.field3369;
        int var7 = arg3.field3370;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3370;
            var7 = arg3.field3369;
        }
        var5.field1075 = (arg1 + var6) * 128;
        var5.field1072 = (arg2 + var7) * 128;
        var5.field1067 = arg3.field3379;
        var5.field1073 = arg3.field3375 * 128;
        var5.field1076 = arg3.field3400;
        var5.field1077 = arg3.field3401;
        var5.field1071 = arg3.field3391;
        if (arg3.field3395 != null) {
            var5.field1068 = arg3;
            var5.method1749();
        }
        field1074.method4563(var5);
        if (var5.field1071 != null) {
            var5.field1079 = var5.field1076 + (int) (Math.random() * (double) (var5.field1077 - var5.field1076));
        }
    }
}
