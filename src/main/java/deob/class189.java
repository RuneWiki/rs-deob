package deob;

@ObfuscatedName("gt")
public class class189 extends class151 {

    @ObfuscatedName("gt.c")
    public static class146 field2776 = new class146(64);

    @ObfuscatedName("gt.n")
    public int field2777 = 0;

    @ObfuscatedName("co.d(II)Lgt;")
    public static class189 method1822(int arg0) {
        class189 var1 = (class189) field2776.method2598((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2782.method3129(5, arg0);
        class189 var3 = new class189();
        if (var2 != null) {
            var3.method3211(new class130(var2));
        }
        field2776.method2607(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gt.c(Ldu;I)V")
    public void method3211(class130 arg0) {
        while (true) {
            int var2 = arg0.method2379();
            if (var2 == 0) {
                return;
            }
            this.method3212(arg0, var2);
        }
    }

    @ObfuscatedName("gt.n(Ldu;II)V")
    public void method3212(class130 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2777 = arg0.method2232();
        }
    }
}
