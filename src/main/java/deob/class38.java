package deob;

@ObfuscatedName("am")
public class class38 extends class174 {

    @ObfuscatedName("am.p")
    public static class170 field964 = new class170(64);

    @ObfuscatedName("am.a")
    public int field972;

    @ObfuscatedName("am.l")
    public int field966;

    @ObfuscatedName("am.q")
    public int field967;

    @ObfuscatedName("dm.i(Lef;I)V")
    public static void method2254(class152 arg0) {
        Statics.field965 = arg0;
    }

    @ObfuscatedName("dl.p(II)Lam;")
    public static class38 method2336(int arg0) {
        class38 var1 = (class38) field964.method3223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field965.method2932(14, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method789(new class127(var2));
        }
        field964.method3225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.a(Ldn;B)V")
    public void method789(class127 arg0) {
        while (true) {
            int var2 = arg0.method2411();
            if (var2 == 0) {
                return;
            }
            this.method802(arg0, var2);
        }
    }

    @ObfuscatedName("am.l(Ldn;II)V")
    public void method802(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field972 = arg0.method2413();
            this.field966 = arg0.method2411();
            this.field967 = arg0.method2411();
        }
    }
}
