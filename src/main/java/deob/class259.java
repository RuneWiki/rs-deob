package deob;

@ObfuscatedName("ic")
public class class259 extends class209 {

    @ObfuscatedName("ic.l")
    public static class203 field3324 = new class203(64);

    @ObfuscatedName("ic.w")
    public boolean field3325 = false;

    @ObfuscatedName("hr.f(II)Lic;")
    public static class259 method4199(int arg0) {
        class259 var1 = (class259) field3324.method3737((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3323.method4289(19, arg0);
        class259 var3 = new class259();
        if (var2 != null) {
            var3.method4512(new class185(var2));
        }
        field3324.method3744(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ic.l(Lgm;B)V")
    public void method4512(class185 arg0) {
        while (true) {
            int var2 = arg0.method3344();
            if (var2 == 0) {
                return;
            }
            this.method4510(arg0, var2);
        }
    }

    @ObfuscatedName("ic.w(Lgm;II)V")
    public void method4510(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3325 = true;
        }
    }
}
