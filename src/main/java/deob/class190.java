package deob;

@ObfuscatedName("gt")
public class class190 extends class130 {

    @ObfuscatedName("gt.l")
    public static class125 field2786 = new class125(64);

    @ObfuscatedName("gt.i")
    public boolean field2787 = false;

    @ObfuscatedName("gj.b(IS)Lgt;")
    public static class190 method3186(int arg0) {
        class190 var1 = (class190) field2786.method2256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2788.method3226(15, arg0);
        class190 var3 = new class190();
        if (var2 != null) {
            var3.method3330(new class154(var2));
        }
        field2786.method2258(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gt.l(Leg;I)V")
    public void method3330(class154 arg0) {
        while (true) {
            int var2 = arg0.method2678();
            if (var2 == 0) {
                return;
            }
            this.method3319(arg0, var2);
        }
    }

    @ObfuscatedName("gt.i(Leg;II)V")
    public void method3319(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2787 = true;
        }
    }
}
