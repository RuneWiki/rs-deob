package deob;

@ObfuscatedName("iu")
public class class260 extends class214 {

    @ObfuscatedName("iu.h")
    public static class208 field3297 = new class208(64);

    @ObfuscatedName("iu.l")
    public int field3295 = 0;

    @ObfuscatedName("if.n(Lij;I)V")
    public static void method4595(class254 arg0) {
        Statics.field3296 = arg0;
    }

    @ObfuscatedName("ec.h(II)Liu;")
    public static class260 method3071(int arg0) {
        class260 var1 = (class260) field3297.method3902((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3296.method4494(5, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4634(new class190(var2));
        }
        field3297.method3908(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.l(Lgc;B)V")
    public void method4634(class190 arg0) {
        while (true) {
            int var2 = arg0.method3511();
            if (var2 == 0) {
                return;
            }
            this.method4631(arg0, var2);
        }
    }

    @ObfuscatedName("iu.g(Lgc;II)V")
    public void method4631(class190 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3295 = arg0.method3513();
        }
    }
}
