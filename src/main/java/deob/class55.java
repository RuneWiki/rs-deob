package deob;

@ObfuscatedName("bq")
public class class55 extends class208 {

    @ObfuscatedName("bq.q")
    public static class197 field1163 = new class197(64);

    @ObfuscatedName("bq.f")
    public int field1164 = 0;

    @ObfuscatedName("eq.k(II)Lbq;")
    public static class55 method2978(int arg0) {
        class55 var1 = (class55) field1163.method3535((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1166.method3097(5, arg0);
        class55 var3 = new class55();
        if (var2 != null) {
            var3.method1068(new class123(var2));
        }
        field1163.method3537(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bq.q(Lde;S)V")
    public void method1068(class123 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method1067(arg0, var2);
        }
    }

    @ObfuscatedName("bq.f(Lde;II)V")
    public void method1067(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1164 = arg0.method2547();
        }
    }
}
