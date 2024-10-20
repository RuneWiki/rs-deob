package deob;

@ObfuscatedName("gm")
public class class190 extends class130 {

    @ObfuscatedName("gm.j")
    public static class125 field2784 = new class125(64);

    @ObfuscatedName("gm.c")
    public boolean field2783 = false;

    @ObfuscatedName("fu.j(IB)Lgm;")
    public static class190 method2896(int arg0) {
        class190 var1 = (class190) field2784.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2781.method3121(15, arg0);
        class190 var3 = new class190();
        if (var2 != null) {
            var3.method3252(new class154(var2));
        }
        field2784.method2223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gm.c(Lek;I)V")
    public void method3252(class154 arg0) {
        while (true) {
            int var2 = arg0.method2701();
            if (var2 == 0) {
                return;
            }
            this.method3253(arg0, var2);
        }
    }

    @ObfuscatedName("gm.d(Lek;II)V")
    public void method3253(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2783 = true;
        }
    }
}
