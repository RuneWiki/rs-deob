package deob;

@ObfuscatedName("ij")
public class class244 extends class198 {

    @ObfuscatedName("ij.o")
    public static class193 field3278 = new class193(64);

    @ObfuscatedName("ij.x")
    public int field3280 = 0;

    @ObfuscatedName("hv.w(IB)Lij;")
    public static class244 method3700(int arg0) {
        class244 var1 = (class244) field3278.method3239((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3282.method3754(5, arg0);
        class244 var3 = new class244();
        if (var2 != null) {
            var3.method3868(new class177(var2));
        }
        field3278.method3241(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ij.o(Lfi;I)V")
    public void method3868(class177 arg0) {
        while (true) {
            int var2 = arg0.method2931();
            if (var2 == 0) {
                return;
            }
            this.method3869(arg0, var2);
        }
    }

    @ObfuscatedName("ij.x(Lfi;II)V")
    public void method3869(class177 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3280 = arg0.method2886();
        }
    }
}
