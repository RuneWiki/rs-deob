package deob;

@ObfuscatedName("ah")
public class class51 extends class204 {

    @ObfuscatedName("ah.q")
    public static class193 field1098 = new class193(64);

    @ObfuscatedName("ah.v")
    public int field1099 = 0;

    @ObfuscatedName("dp.h(IB)Lah;")
    public static class51 method2645(int arg0) {
        class51 var1 = (class51) field1098.method3538((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2882.method3073(5, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method992(new class119(var2));
        }
        field1098.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.q(Ldm;S)V")
    public void method992(class119 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method993(arg0, var2);
        }
    }

    @ObfuscatedName("ah.v(Ldm;IB)V")
    public void method993(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1099 = arg0.method2385();
        }
    }
}
