package deob;

@ObfuscatedName("jb")
public class class261 extends class214 {

    @ObfuscatedName("jb.l")
    public static class208 field3303 = new class208(64);

    @ObfuscatedName("jb.g")
    public int field3304 = 0;

    @ObfuscatedName("fy.n(IB)Ljb;")
    public static class261 method3318(int arg0) {
        class261 var1 = (class261) field3303.method3902((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3306.method4494(16, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4642(new class190(var2));
        }
        field3303.method3908(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jb.h(Lgc;I)V")
    public void method4642(class190 arg0) {
        while (true) {
            int var2 = arg0.method3511();
            if (var2 == 0) {
                return;
            }
            this.method4643(arg0, var2);
        }
    }

    @ObfuscatedName("jb.l(Lgc;IB)V")
    public void method4643(class190 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3304 = arg0.method3513();
        }
    }
}
