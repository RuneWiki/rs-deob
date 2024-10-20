package deob;

@ObfuscatedName("fb")
public class class171 extends class404 {

    @ObfuscatedName("fb.i")
    public static class257 field1804 = new class257(64);

    @ObfuscatedName("fb.f")
    public int field1807 = 0;

    @ObfuscatedName("em.v(IB)Lfb;")
    public static class171 method2716(int arg0) {
        class171 var1 = (class171) field1804.method4644((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1805.method5296(16, arg0);
        class171 var3 = new class171();
        if (var2 != null) {
            var3.method3037(new class438(var2));
        }
        field1804.method4651(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fb.c(Lpi;I)V")
    public void method3037(class438 arg0) {
        while (true) {
            int var2 = arg0.method6971();
            if (var2 == 0) {
                return;
            }
            this.method3044(arg0, var2);
        }
    }

    @ObfuscatedName("fb.i(Lpi;II)V")
    public void method3044(class438 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1807 = arg0.method7148();
        }
    }
}
