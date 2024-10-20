package deob;

@ObfuscatedName("ah")
public class class51 extends class204 {

    @ObfuscatedName("ah.f")
    public static class193 field1093 = new class193(64);

    @ObfuscatedName("ah.i")
    public int field1094 = 0;

    @ObfuscatedName("ak.v(Lfh;I)V")
    public static void method631(class167 arg0) {
        Statics.field1099 = arg0;
    }

    @ObfuscatedName("ar.f(IB)Lah;")
    public static class51 method680(int arg0) {
        class51 var1 = (class51) field1093.method3490((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1099.method3082(5, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method984(new class119(var2));
        }
        field1093.method3502(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.i(Ldx;B)V")
    public void method984(class119 arg0) {
        while (true) {
            int var2 = arg0.method2400();
            if (var2 == 0) {
                return;
            }
            this.method990(arg0, var2);
        }
    }

    @ObfuscatedName("ah.d(Ldx;IB)V")
    public void method990(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1094 = arg0.method2334();
        }
    }
}
