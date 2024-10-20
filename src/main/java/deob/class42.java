package deob;

@ObfuscatedName("ak")
public class class42 extends class174 {

    @ObfuscatedName("ak.e")
    public static class170 field1056 = new class170(64);

    @ObfuscatedName("ak.r")
    public int field1054 = 0;

    @ObfuscatedName("bc.a(IB)Lak;")
    public static class42 method1347(int arg0) {
        class42 var1 = (class42) field1056.method3196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1058.method2961(16, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method896(new class127(var2));
        }
        field1056.method3193(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.x(Ldy;B)V")
    public void method896(class127 arg0) {
        while (true) {
            int var2 = arg0.method2411();
            if (var2 == 0) {
                return;
            }
            this.method901(arg0, var2);
        }
    }

    @ObfuscatedName("ak.e(Ldy;II)V")
    public void method901(class127 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1054 = arg0.method2413();
        }
    }
}
