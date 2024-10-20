package deob;

@ObfuscatedName("fv")
public class class177 extends class425 {

    @ObfuscatedName("fv.c")
    public static class266 field1865 = new class266(64);

    @ObfuscatedName("fv.x")
    public int field1866 = 0;

    @ObfuscatedName("jn.a(II)Lfv;")
    public static class177 method4855(int arg0) {
        class177 var1 = (class177) field1865.method4839((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1868.method5859(16, arg0);
        class177 var3 = new class177();
        if (var2 != null) {
            var3.method3119(new class464(var2));
        }
        field1865.method4834(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fv.f(Lqr;B)V")
    public void method3119(class464 arg0) {
        while (true) {
            int var2 = arg0.method7735();
            if (var2 == 0) {
                return;
            }
            this.method3110(arg0, var2);
        }
    }

    @ObfuscatedName("fv.c(Lqr;II)V")
    public void method3110(class464 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1866 = arg0.method7716();
        }
    }

    @ObfuscatedName("fe.x(B)V")
    public static void method2973() {
        field1865.method4837();
    }
}
