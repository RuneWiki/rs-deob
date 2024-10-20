package deob;

@ObfuscatedName("if")
public class class244 extends class195 {

    @ObfuscatedName("if.p")
    public static class190 field3317 = new class190(64);

    @ObfuscatedName("if.i")
    public boolean field3318 = false;

    @ObfuscatedName("by.n(II)Lif;")
    public static class244 method978(int arg0) {
        class244 var1 = (class244) field3317.method3280((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3319.method3880(19, arg0);
        class244 var3 = new class244();
        if (var2 != null) {
            var3.method4032(new class174(var2));
        }
        field3317.method3282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("if.p(Lfl;I)V")
    public void method4032(class174 arg0) {
        while (true) {
            int var2 = arg0.method2925();
            if (var2 == 0) {
                return;
            }
            this.method4023(arg0, var2);
        }
    }

    @ObfuscatedName("if.i(Lfl;IB)V")
    public void method4023(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3318 = true;
        }
    }
}
