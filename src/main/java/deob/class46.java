package deob;

@ObfuscatedName("am")
public class class46 extends class183 {

    @ObfuscatedName("am.h")
    public static class172 field1057 = new class172(64);

    @ObfuscatedName("am.m")
    public int field1056 = 0;

    @ObfuscatedName("dt.g(II)Lam;")
    public static class46 method2399(int arg0) {
        class46 var1 = (class46) field1057.method3130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1059.method2667(16, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method884(new class107(var2));
        }
        field1057.method3126(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.s(Ldi;I)V")
    public void method884(class107 arg0) {
        while (true) {
            int var2 = arg0.method2101();
            if (var2 == 0) {
                return;
            }
            this.method889(arg0, var2);
        }
    }

    @ObfuscatedName("am.h(Ldi;IB)V")
    public void method889(class107 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1056 = arg0.method2166();
        }
    }
}
