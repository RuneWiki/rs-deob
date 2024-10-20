package deob;

@ObfuscatedName("ai")
public class class48 extends class195 {

    @ObfuscatedName("ai.a")
    public static class184 field1115 = new class184(64);

    @ObfuscatedName("ai.w")
    public int field1116 = 0;

    @ObfuscatedName("av.n(IB)Lai;")
    public static class48 method577(int arg0) {
        class48 var1 = (class48) field1115.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1114.method2925(16, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method975(new class111(var2));
        }
        field1115.method3372(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.o(Ldl;I)V")
    public void method975(class111 arg0) {
        while (true) {
            int var2 = arg0.method2234();
            if (var2 == 0) {
                return;
            }
            this.method970(arg0, var2);
        }
    }

    @ObfuscatedName("ai.a(Ldl;IB)V")
    public void method970(class111 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1116 = arg0.method2236();
        }
    }

    @ObfuscatedName("ao.w(I)V")
    public static void method618() {
        field1115.method3376();
    }
}
