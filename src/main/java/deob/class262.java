package deob;

@ObfuscatedName("jn")
public class class262 extends class214 {

    @ObfuscatedName("jn.g")
    public static class208 field3317 = new class208(64);

    @ObfuscatedName("jn.x")
    public int field3318 = 0;

    @ObfuscatedName("ju.a(Liz;I)V")
    public static void method5012(class255 arg0) {
        Statics.field38 = arg0;
        Statics.field1419 = Statics.field38.method4419(16);
    }

    @ObfuscatedName("eg.s(IB)Ljn;")
    public static class262 method3119(int arg0) {
        class262 var1 = (class262) field3317.method3885((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field38.method4422(16, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4593(new class190(var2));
        }
        field3317.method3878(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jn.g(Lgx;I)V")
    public void method4593(class190 arg0) {
        while (true) {
            int var2 = arg0.method3443();
            if (var2 == 0) {
                return;
            }
            this.method4596(arg0, var2);
        }
    }

    @ObfuscatedName("jn.x(Lgx;II)V")
    public void method4596(class190 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3318 = arg0.method3610();
        }
    }

    @ObfuscatedName("hs.h(I)V")
    public static void method4264() {
        field3317.method3879();
    }
}
