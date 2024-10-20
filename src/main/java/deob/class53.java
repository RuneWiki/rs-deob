package deob;

@ObfuscatedName("bt")
public class class53 extends class204 {

    @ObfuscatedName("bt.w")
    public static class193 field1161 = new class193(64);

    @ObfuscatedName("bt.d")
    public int field1160 = 0;

    @ObfuscatedName("u.g(II)Lbt;")
    public static class53 method122(int arg0) {
        class53 var1 = (class53) field1161.method3529((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1162.method3112(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1093(new class119(var2));
        }
        field1161.method3528(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bt.b(Ldm;I)V")
    public void method1093(class119 arg0) {
        while (true) {
            int var2 = arg0.method2362();
            if (var2 == 0) {
                return;
            }
            this.method1092(arg0, var2);
        }
    }

    @ObfuscatedName("bt.w(Ldm;II)V")
    public void method1092(class119 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1160 = arg0.method2376();
        }
    }
}
