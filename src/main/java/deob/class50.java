package deob;

@ObfuscatedName("aw")
public class class50 extends class204 {

    @ObfuscatedName("aw.f")
    public static class193 field1086 = new class193(64);

    @ObfuscatedName("aw.i")
    public boolean field1090 = false;

    @ObfuscatedName("ff.o(IB)Law;")
    public static class50 method3147(int arg0) {
        class50 var1 = (class50) field1086.method3456((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1550.method3030(15, arg0);
        class50 var3 = new class50();
        if (var2 != null) {
            var3.method949(new class119(var2));
        }
        field1086.method3451(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.f(Ldc;I)V")
    public void method949(class119 arg0) {
        while (true) {
            int var2 = arg0.method2290();
            if (var2 == 0) {
                return;
            }
            this.method959(arg0, var2);
        }
    }

    @ObfuscatedName("aw.i(Ldc;II)V")
    public void method959(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1090 = true;
        }
    }
}
