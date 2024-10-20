package deob;

@ObfuscatedName("bw")
public final class class69 extends class205 {

    @ObfuscatedName("bw.w")
    public static class206 field1003 = new class206();

    @ObfuscatedName("bw.m")
    public int field999;

    @ObfuscatedName("bw.q")
    public int field1001;

    @ObfuscatedName("bw.b")
    public int field1008;

    @ObfuscatedName("bw.f")
    public int field1002;

    @ObfuscatedName("bw.n")
    public int field1006;

    @ObfuscatedName("bw.h")
    public int field1012;

    @ObfuscatedName("bw.x")
    public int field1005;

    @ObfuscatedName("bw.j")
    public class104 field1007;

    @ObfuscatedName("bw.a")
    public int field998;

    @ObfuscatedName("bw.l")
    public int field1004;

    @ObfuscatedName("bw.d")
    public int[] field1009;

    @ObfuscatedName("bw.s")
    public int field1010;

    @ObfuscatedName("bw.p")
    public class104 field1011;

    @ObfuscatedName("bw.g")
    public class269 field1000;

    @ObfuscatedName("bp.w(I)V")
    public static void method1035() {
        for (class69 var0 = (class69) field1003.method3797(); var0 != null; var0 = (class69) field1003.method3788()) {
            if (var0.field1007 != null) {
                Statics.field1907.method1904(var0.field1007);
                var0.field1007 = null;
            }
            if (var0.field1011 != null) {
                Statics.field1907.method1904(var0.field1011);
                var0.field1011 = null;
            }
        }
        field1003.method3789();
    }

    @ObfuscatedName("fy.m(B)V")
    public static void method3156() {
        for (class69 var0 = (class69) field1003.method3797(); var0 != null; var0 = (class69) field1003.method3788()) {
            if (var0.field1000 != null) {
                var0.method1614();
            }
        }
    }

    @ObfuscatedName("bw.q(I)V")
    public void method1614() {
        int var1 = this.field1005;
        class269 var2 = this.field1000.method4689();
        if (var2 == null) {
            this.field1005 = -1;
            this.field1012 = 0;
            this.field998 = 0;
            this.field1004 = 0;
            this.field1009 = null;
        } else {
            this.field1005 = var2.field3434;
            this.field1012 = var2.field3435 * 128;
            this.field998 = var2.field3436;
            this.field1004 = var2.field3406;
            this.field1009 = var2.field3438;
        }
        if (this.field1005 != var1 && this.field1007 != null) {
            Statics.field1907.method1904(this.field1007);
            this.field1007 = null;
        }
    }

    @ObfuscatedName("jo.x(IIILjp;II)V")
    public static void method4863(int arg0, int arg1, int arg2, class269 arg3, int arg4) {
        class69 var5 = new class69();
        var5.field999 = arg0;
        var5.field1001 = arg1 * 128;
        var5.field1008 = arg2 * 128;
        int var6 = arg3.field3405;
        int var7 = arg3.field3421;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3421;
            var7 = arg3.field3405;
        }
        var5.field1002 = (arg1 + var6) * 128;
        var5.field1006 = (arg2 + var7) * 128;
        var5.field1005 = arg3.field3434;
        var5.field1012 = arg3.field3435 * 128;
        var5.field998 = arg3.field3436;
        var5.field1004 = arg3.field3406;
        var5.field1009 = arg3.field3438;
        if (arg3.field3431 != null) {
            var5.field1000 = arg3;
            var5.method1614();
        }
        field1003.method3810(var5);
        if (var5.field1009 != null) {
            var5.field1010 = var5.field998 + (int) (Math.random() * (double) (var5.field1004 - var5.field998));
        }
    }
}
