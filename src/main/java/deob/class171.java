package deob;

@ObfuscatedName("fi")
public class class171 extends class406 {

    @ObfuscatedName("fi.l")
    public static class257 field1859 = new class257(64);

    @ObfuscatedName("fi.k")
    public int field1860 = 0;

    @ObfuscatedName("d.o(II)Lfi;")
    public static class171 method274(int arg0) {
        class171 var1 = (class171) field1859.method4566((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1863.method5249(16, arg0);
        class171 var3 = new class171();
        if (var2 != null) {
            var3.method2983(new class440(var2));
        }
        field1859.method4571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fi.q(Lpx;B)V")
    public void method2983(class440 arg0) {
        while (true) {
            int var2 = arg0.method7071();
            if (var2 == 0) {
                return;
            }
            this.method2982(arg0, var2);
        }
    }

    @ObfuscatedName("fi.l(Lpx;IB)V")
    public void method2982(class440 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1860 = arg0.method7082();
        }
    }
}
