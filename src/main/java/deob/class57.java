package deob;

@ObfuscatedName("bk")
public class class57 extends class208 {

    @ObfuscatedName("bk.f")
    public static class197 field1222 = new class197(64);

    @ObfuscatedName("bk.c")
    public int field1225 = 0;

    @ObfuscatedName("aq.k(II)Lbk;")
    public static class57 method597(int arg0) {
        class57 var1 = (class57) field1222.method3535((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1226.method3097(16, arg0);
        class57 var3 = new class57();
        if (var2 != null) {
            var3.method1131(new class123(var2));
        }
        field1222.method3537(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bk.q(Lde;I)V")
    public void method1131(class123 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method1132(arg0, var2);
        }
    }

    @ObfuscatedName("bk.f(Lde;IB)V")
    public void method1132(class123 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1225 = arg0.method2547();
        }
    }
}
