package deob;

@ObfuscatedName("fa")
public class class164 extends class143 {

    @ObfuscatedName("fa.d")
    public static class101 field2480 = new class101(64);

    @ObfuscatedName("fa.k")
    public int field2478 = 0;

    @ObfuscatedName("dd.k(IB)Lfa;")
    public static class164 method1337(int arg0) {
        class164 var1 = (class164) field2480.method1236((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2481.method1024(16, arg0);
        class164 var3 = new class164();
        if (var2 != null) {
            var3.method2575(new class136(var2));
        }
        field2480.method1238(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fa.u(Let;B)V")
    public void method2575(class136 arg0) {
        while (true) {
            int var2 = arg0.method1602();
            if (var2 == 0) {
                return;
            }
            this.method2574(arg0, var2);
        }
    }

    @ObfuscatedName("fa.v(Let;II)V")
    public void method2574(class136 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2478 = arg0.method1712();
        }
    }

    @ObfuscatedName("bl.f(I)V")
    public static void method906() {
        field2480.method1239();
    }
}
