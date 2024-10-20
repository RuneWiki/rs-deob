package deob;

@ObfuscatedName("bs")
public class class55 extends class208 {

    @ObfuscatedName("bs.e")
    public static class197 field1150 = new class197(64);

    @ObfuscatedName("bs.n")
    public int field1144 = 0;

    @ObfuscatedName("o.f(II)Lbs;")
    public static class55 method182(int arg0) {
        class55 var1 = (class55) field1150.method3569((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1143.method3107(5, arg0);
        class55 var3 = new class55();
        if (var2 != null) {
            var3.method1079(new class123(var2));
        }
        field1150.method3571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bs.e(Ldx;I)V")
    public void method1079(class123 arg0) {
        while (true) {
            int var2 = arg0.method2522();
            if (var2 == 0) {
                return;
            }
            this.method1068(arg0, var2);
        }
    }

    @ObfuscatedName("bs.n(Ldx;IB)V")
    public void method1068(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1144 = arg0.method2401();
        }
    }
}
