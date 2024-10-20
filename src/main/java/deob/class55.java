package deob;

@ObfuscatedName("bl")
public class class55 extends class208 {

    @ObfuscatedName("bl.d")
    public static class197 field1168 = new class197(64);

    @ObfuscatedName("bl.v")
    public int field1169 = 0;

    @ObfuscatedName("l.a(IB)Lbl;")
    public static class55 method583(int arg0) {
        class55 var1 = (class55) field1168.method3544((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1176.method3117(5, arg0);
        class55 var3 = new class55();
        if (var2 != null) {
            var3.method1092(new class123(var2));
        }
        field1168.method3546(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bl.d(Ldb;I)V")
    public void method1092(class123 arg0) {
        while (true) {
            int var2 = arg0.method2395();
            if (var2 == 0) {
                return;
            }
            this.method1091(arg0, var2);
        }
    }

    @ObfuscatedName("bl.v(Ldb;IB)V")
    public void method1091(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1169 = arg0.method2584();
        }
    }
}
