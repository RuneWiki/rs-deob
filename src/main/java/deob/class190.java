package deob;

@ObfuscatedName("gz")
public class class190 extends class130 {

    @ObfuscatedName("gz.d")
    public static class125 field2797 = new class125(64);

    @ObfuscatedName("gz.h")
    public boolean field2795 = false;

    @ObfuscatedName("ci.q(IB)Lgz;")
    public static class190 method1894(int arg0) {
        class190 var1 = (class190) field2797.method2258((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2794.method3133(15, arg0);
        class190 var3 = new class190();
        if (var2 != null) {
            var3.method3267(new class154(var2));
        }
        field2797.method2248(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gz.d(Lel;B)V")
    public void method3267(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3266(arg0, var2);
        }
    }

    @ObfuscatedName("gz.h(Lel;II)V")
    public void method3266(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2795 = true;
        }
    }
}
