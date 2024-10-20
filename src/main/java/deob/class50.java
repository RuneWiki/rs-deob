package deob;

@ObfuscatedName("ac")
public class class50 extends class204 {

    @ObfuscatedName("ac.b")
    public static class193 field1091 = new class193(64);

    @ObfuscatedName("ac.w")
    public boolean field1090 = false;

    @ObfuscatedName("du.g(IB)Lac;")
    public static class50 method2690(int arg0) {
        class50 var1 = (class50) field1091.method3529((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1095.method3112(15, arg0);
        class50 var3 = new class50();
        if (var2 != null) {
            var3.method1016(new class119(var2));
        }
        field1091.method3528(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.b(Ldm;B)V")
    public void method1016(class119 arg0) {
        while (true) {
            int var2 = arg0.method2362();
            if (var2 == 0) {
                return;
            }
            this.method1010(arg0, var2);
        }
    }

    @ObfuscatedName("ac.w(Ldm;II)V")
    public void method1010(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1090 = true;
        }
    }
}
