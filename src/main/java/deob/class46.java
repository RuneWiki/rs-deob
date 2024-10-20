package deob;

@ObfuscatedName("ax")
public class class46 extends class204 {

    @ObfuscatedName("ax.q")
    public static class193 field1030 = new class193(64);

    @ObfuscatedName("ax.k")
    public boolean field1032 = false;

    @ObfuscatedName("client.q(II)Lax;")
    public static class46 method532(int arg0) {
        class46 var1 = (class46) field1030.method3439((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1034.method2986(19, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method901(new class119(var2));
        }
        field1030.method3429(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.k(Lda;I)V")
    public void method901(class119 arg0) {
        while (true) {
            int var2 = arg0.method2457();
            if (var2 == 0) {
                return;
            }
            this.method903(arg0, var2);
        }
    }

    @ObfuscatedName("ax.f(Lda;II)V")
    public void method903(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1032 = true;
        }
    }
}
