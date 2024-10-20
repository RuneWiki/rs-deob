package deob;

@ObfuscatedName("ak")
public class class51 extends class205 {

    @ObfuscatedName("ak.w")
    public static class194 field1076 = new class194(64);

    @ObfuscatedName("ak.f")
    public int field1077 = 0;

    @ObfuscatedName("ff.e(II)Lak;")
    public static class51 method2940(int arg0) {
        class51 var1 = (class51) field1076.method3473((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3145.method3048(5, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method979(new class120(var2));
        }
        field1076.method3475(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.w(Ldq;I)V")
    public void method979(class120 arg0) {
        while (true) {
            int var2 = arg0.method2355();
            if (var2 == 0) {
                return;
            }
            this.method982(arg0, var2);
        }
    }

    @ObfuscatedName("ak.f(Ldq;IB)V")
    public void method982(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1077 = arg0.method2532();
        }
    }
}
