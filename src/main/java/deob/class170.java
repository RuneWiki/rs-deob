package deob;

@ObfuscatedName("fq")
public class class170 extends class407 {

    @ObfuscatedName("fq.p")
    public static class257 field1838 = new class257(64);

    @ObfuscatedName("fq.f")
    public int field1839 = 0;

    @ObfuscatedName("gq.c(Llv;B)V")
    public static void method3335(class317 arg0) {
        Statics.field1837 = arg0;
    }

    @ObfuscatedName("k.p(IB)Lfq;")
    public static class170 method21(int arg0) {
        class170 var1 = (class170) field1838.method4789((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1837.method5499(5, arg0);
        class170 var3 = new class170();
        if (var2 != null) {
            var3.method3149(new class445(var2));
        }
        field1838.method4781(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fq.f(Lqq;I)V")
    public void method3149(class445 arg0) {
        while (true) {
            int var2 = arg0.method7196();
            if (var2 == 0) {
                return;
            }
            this.method3151(arg0, var2);
        }
    }

    @ObfuscatedName("fq.n(Lqq;II)V")
    public void method3151(class445 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1839 = arg0.method7198();
        }
    }
}
