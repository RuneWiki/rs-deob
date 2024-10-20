package deob;

@ObfuscatedName("bb")
public final class class70 extends class207 {

    @ObfuscatedName("bb.y")
    public static class208 field1044 = new class208();

    @ObfuscatedName("bb.c")
    public int field1030;

    @ObfuscatedName("bb.n")
    public int field1045;

    @ObfuscatedName("bb.u")
    public int field1032;

    @ObfuscatedName("bb.i")
    public int field1029;

    @ObfuscatedName("bb.r")
    public class271 field1031;

    @ObfuscatedName("bb.j")
    public int field1034;

    @ObfuscatedName("bb.p")
    public int field1035;

    @ObfuscatedName("bb.e")
    public int field1043;

    @ObfuscatedName("bb.s")
    public int field1038;

    @ObfuscatedName("bb.v")
    public class106 field1037;

    @ObfuscatedName("bb.k")
    public int field1039;

    @ObfuscatedName("bb.o")
    public int[] field1040;

    @ObfuscatedName("bb.q")
    public int field1041;

    @ObfuscatedName("bb.l")
    public class106 field1042;

    @ObfuscatedName("m.y(I)V")
    public static void method395() {
        for (class70 var0 = (class70) field1044.method3799(); var0 != null; var0 = (class70) field1044.method3780()) {
            if (var0.field1031 != null) {
                var0.method1591();
            }
        }
    }

    @ObfuscatedName("bb.c(I)V")
    public void method1591() {
        int var1 = this.field1043;
        class271 var2 = this.field1031.method4677();
        if (var2 == null) {
            this.field1043 = -1;
            this.field1035 = 0;
            this.field1038 = 0;
            this.field1039 = 0;
            this.field1040 = null;
        } else {
            this.field1043 = var2.field3441;
            this.field1035 = var2.field3424 * 128;
            this.field1038 = var2.field3466;
            this.field1039 = var2.field3469;
            this.field1040 = var2.field3470;
        }
        if (this.field1043 != var1 && this.field1037 != null) {
            Statics.field392.method1924(this.field1037);
            this.field1037 = null;
        }
    }

    @ObfuscatedName("ef.n(IIILjc;II)V")
    public static void method2864(int arg0, int arg1, int arg2, class271 arg3, int arg4) {
        class70 var5 = new class70();
        var5.field1030 = arg0;
        var5.field1045 = arg1 * 128;
        var5.field1032 = arg2 * 128;
        int var6 = arg3.field3437;
        int var7 = arg3.field3438;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3438;
            var7 = arg3.field3437;
        }
        var5.field1029 = (arg1 + var6) * 128;
        var5.field1034 = (arg2 + var7) * 128;
        var5.field1043 = arg3.field3441;
        var5.field1035 = arg3.field3424 * 128;
        var5.field1038 = arg3.field3466;
        var5.field1039 = arg3.field3469;
        var5.field1040 = arg3.field3470;
        if (arg3.field3439 != null) {
            var5.field1031 = arg3;
            var5.method1591();
        }
        field1044.method3773(var5);
        if (var5.field1040 != null) {
            var5.field1041 = var5.field1038 + (int) (Math.random() * (double) (var5.field1039 - var5.field1038));
        }
    }
}
