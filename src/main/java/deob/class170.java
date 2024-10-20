package deob;

@ObfuscatedName("fp")
public class class170 extends class405 {

    @ObfuscatedName("fp.q")
    public static class256 field1824 = new class256(64);

    @ObfuscatedName("fp.f")
    public int field1827 = 0;

    @ObfuscatedName("fd.c(IS)Lfp;")
    public static class170 method3238(int arg0) {
        class170 var1 = (class170) field1824.method4691((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1825.method5305(16, arg0);
        class170 var3 = new class170();
        if (var2 != null) {
            var3.method3042(new class443(var2));
        }
        field1824.method4693(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fp.v(Lqt;I)V")
    public void method3042(class443 arg0) {
        while (true) {
            int var2 = arg0.method7047();
            if (var2 == 0) {
                return;
            }
            this.method3043(arg0, var2);
        }
    }

    @ObfuscatedName("fp.q(Lqt;II)V")
    public void method3043(class443 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1827 = arg0.method7049();
        }
    }
}
