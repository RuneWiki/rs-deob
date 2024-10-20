package deob;

@ObfuscatedName("bt")
public final class class70 extends class207 {

    @ObfuscatedName("bt.v")
    public static class208 field1018 = new class208();

    @ObfuscatedName("bt.s")
    public int field1025;

    @ObfuscatedName("bt.o")
    public int field1016;

    @ObfuscatedName("bt.k")
    public int field1029;

    @ObfuscatedName("bt.u")
    public int field1019;

    @ObfuscatedName("bt.i")
    public int field1028;

    @ObfuscatedName("bt.t")
    public int field1030;

    @ObfuscatedName("bt.p")
    public int field1031;

    @ObfuscatedName("bt.l")
    public int field1023;

    @ObfuscatedName("bt.b")
    public class106 field1024;

    @ObfuscatedName("bt.c")
    public int field1026;

    @ObfuscatedName("bt.d")
    public int[] field1027;

    @ObfuscatedName("bt.w")
    public int field1022;

    @ObfuscatedName("bt.a")
    public class106 field1021;

    @ObfuscatedName("bt.z")
    public class271 field1032;

    @ObfuscatedName("i.v(I)V")
    public static void method80() {
        for (class70 var0 = (class70) field1018.method3792(); var0 != null; var0 = (class70) field1018.method3800()) {
            if (var0.field1024 != null) {
                Statics.field1276.method1944(var0.field1024);
                var0.field1024 = null;
            }
            if (var0.field1021 != null) {
                Statics.field1276.method1944(var0.field1021);
                var0.field1021 = null;
            }
        }
        field1018.method3807();
    }

    @ObfuscatedName("iq.s(S)V")
    public static void method4266() {
        for (class70 var0 = (class70) field1018.method3792(); var0 != null; var0 = (class70) field1018.method3800()) {
            if (var0.field1032 != null) {
                var0.method1599();
            }
        }
    }

    @ObfuscatedName("bt.o(I)V")
    public void method1599() {
        int var1 = this.field1023;
        class271 var2 = this.field1032.method4707();
        if (var2 == null) {
            this.field1023 = -1;
            this.field1031 = 0;
            this.field1025 = 0;
            this.field1026 = 0;
            this.field1027 = null;
        } else {
            this.field1023 = var2.field3420;
            this.field1031 = var2.field3446 * 128;
            this.field1025 = var2.field3448;
            this.field1026 = var2.field3416;
            this.field1027 = var2.field3450;
        }
        if (this.field1023 != var1 && this.field1024 != null) {
            Statics.field1276.method1944(this.field1024);
            this.field1024 = null;
        }
    }

    @ObfuscatedName("at.k(IIILjs;II)V")
    public static void method699(int arg0, int arg1, int arg2, class271 arg3, int arg4) {
        class70 var5 = new class70();
        var5.field1016 = arg0;
        var5.field1029 = arg1 * 128;
        var5.field1019 = arg2 * 128;
        int var6 = arg3.field3417;
        int var7 = arg3.field3418;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3418;
            var7 = arg3.field3417;
        }
        var5.field1028 = (arg1 + var6) * 128;
        var5.field1030 = (arg2 + var7) * 128;
        var5.field1023 = arg3.field3420;
        var5.field1031 = arg3.field3446 * 128;
        var5.field1025 = arg3.field3448;
        var5.field1026 = arg3.field3416;
        var5.field1027 = arg3.field3450;
        if (arg3.field3412 != null) {
            var5.field1032 = arg3;
            var5.method1599();
        }
        field1018.method3793(var5);
        if (var5.field1027 != null) {
            var5.field1022 = var5.field1025 + (int) (Math.random() * (double) (var5.field1026 - var5.field1025));
        }
    }
}
