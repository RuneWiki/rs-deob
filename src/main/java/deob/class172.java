package deob;

@ObfuscatedName("fr")
public class class172 extends class406 {

    @ObfuscatedName("fr.h")
    public static class256 field1837 = new class256(64);

    @ObfuscatedName("fr.w")
    public boolean field1838 = false;

    @ObfuscatedName("dd.h(IB)Lfr;")
    public static class172 method2463(int arg0) {
        class172 var1 = (class172) field1837.method4599((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1839.method5179(19, arg0);
        class172 var3 = new class172();
        if (var2 != null) {
            var3.method2987(new class444(var2));
        }
        field1837.method4600(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fr.w(Lqr;I)V")
    public void method2987(class444 arg0) {
        while (true) {
            int var2 = arg0.method6929();
            if (var2 == 0) {
                return;
            }
            this.method2994(arg0, var2);
        }
    }

    @ObfuscatedName("fr.v(Lqr;II)V")
    public void method2994(class444 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1838 = true;
        }
    }
}
