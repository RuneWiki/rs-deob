package deob;

@ObfuscatedName("ab")
public class class38 extends class174 {

    @ObfuscatedName("ab.m")
    public static class170 field940 = new class170(64);

    @ObfuscatedName("ab.d")
    public int field942;

    @ObfuscatedName("ab.k")
    public int field944;

    @ObfuscatedName("ab.n")
    public int field943;

    @ObfuscatedName("al.y(II)Lab;")
    public static class38 method788(int arg0) {
        class38 var1 = (class38) field940.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field941.method2991(14, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method816(new class127(var2));
        }
        field940.method3291(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.m(Ldp;B)V")
    public void method816(class127 arg0) {
        while (true) {
            int var2 = arg0.method2534();
            if (var2 == 0) {
                return;
            }
            this.method815(arg0, var2);
        }
    }

    @ObfuscatedName("ab.d(Ldp;II)V")
    public void method815(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field942 = arg0.method2460();
            this.field944 = arg0.method2534();
            this.field943 = arg0.method2534();
        }
    }
}
