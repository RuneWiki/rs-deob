package deob;

@ObfuscatedName("am")
public class class48 extends class195 {

    @ObfuscatedName("am.i")
    public static class184 field1087 = new class184(64);

    @ObfuscatedName("am.e")
    public int field1091 = 0;

    @ObfuscatedName("ar.n(IB)Lam;")
    public static class48 method571(int arg0) {
        class48 var1 = (class48) field1087.method3315((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1089.method2859(16, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method947(new class111(var2));
        }
        field1087.method3317(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.w(Ldo;I)V")
    public void method947(class111 arg0) {
        while (true) {
            int var2 = arg0.method2155();
            if (var2 == 0) {
                return;
            }
            this.method941(arg0, var2);
        }
    }

    @ObfuscatedName("am.i(Ldo;IB)V")
    public void method941(class111 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1091 = arg0.method2157();
        }
    }
}
