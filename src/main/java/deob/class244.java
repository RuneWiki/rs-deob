package deob;

@ObfuscatedName("iu")
public class class244 extends class195 {

    @ObfuscatedName("iu.o")
    public static class190 field3288 = new class190(64);

    @ObfuscatedName("iu.i")
    public boolean field3290 = false;

    @ObfuscatedName("bc.c(II)Liu;")
    public static class244 method950(int arg0) {
        class244 var1 = (class244) field3288.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3287.method3741(19, arg0);
        class244 var3 = new class244();
        if (var2 != null) {
            var3.method3900(new class174(var2));
        }
        field3288.method3233(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.o(Lfp;I)V")
    public void method3900(class174 arg0) {
        while (true) {
            int var2 = arg0.method2843();
            if (var2 == 0) {
                return;
            }
            this.method3899(arg0, var2);
        }
    }

    @ObfuscatedName("iu.i(Lfp;II)V")
    public void method3899(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3290 = true;
        }
    }
}
