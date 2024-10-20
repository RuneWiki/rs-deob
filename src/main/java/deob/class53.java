package deob;

@ObfuscatedName("bz")
public class class53 extends class204 {

    @ObfuscatedName("bz.q")
    public static class193 field1145 = new class193(64);

    @ObfuscatedName("bz.o")
    public int field1149 = 0;

    @ObfuscatedName("ag.l(IB)Lbz;")
    public static class53 method753(int arg0) {
        class53 var1 = (class53) field1145.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1147.method3050(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1079(new class119(var2));
        }
        field1145.method3479(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bz.e(Ldl;I)V")
    public void method1079(class119 arg0) {
        while (true) {
            int var2 = arg0.method2388();
            if (var2 == 0) {
                return;
            }
            this.method1078(arg0, var2);
        }
    }

    @ObfuscatedName("bz.q(Ldl;IB)V")
    public void method1078(class119 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1149 = arg0.method2440();
        }
    }
}
