package deob;

@ObfuscatedName("ig")
public class class245 extends class195 {

    @ObfuscatedName("ig.q")
    public static class190 field3304 = new class190(64);

    @ObfuscatedName("ig.x")
    public boolean field3302 = false;

    @ObfuscatedName("ap.d(II)Lig;")
    public static class245 method621(int arg0) {
        class245 var1 = (class245) field3304.method3252((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3669.method3750(15, arg0);
        class245 var3 = new class245();
        if (var2 != null) {
            var3.method3925(new class174(var2));
        }
        field3304.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ig.q(Lfw;I)V")
    public void method3925(class174 arg0) {
        while (true) {
            int var2 = arg0.method2921();
            if (var2 == 0) {
                return;
            }
            this.method3926(arg0, var2);
        }
    }

    @ObfuscatedName("ig.x(Lfw;II)V")
    public void method3926(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3302 = true;
        }
    }
}
