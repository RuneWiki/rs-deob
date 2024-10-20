package deob;

@ObfuscatedName("aa")
public class class46 extends class195 {

    @ObfuscatedName("aa.o")
    public static class184 field1053 = new class184(64);

    @ObfuscatedName("aa.a")
    public int field1052 = 0;

    @ObfuscatedName("gb.n(II)Laa;")
    public static class46 method3586(int arg0) {
        class46 var1 = (class46) field1053.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1056.method2925(5, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method900(new class111(var2));
        }
        field1053.method3372(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.o(Ldl;I)V")
    public void method900(class111 arg0) {
        while (true) {
            int var2 = arg0.method2234();
            if (var2 == 0) {
                return;
            }
            this.method903(arg0, var2);
        }
    }

    @ObfuscatedName("aa.a(Ldl;IB)V")
    public void method903(class111 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1052 = arg0.method2236();
        }
    }
}
