package deob;

@ObfuscatedName("gp")
public class class186 extends class406 {

    @ObfuscatedName("gp.q")
    public static class257 field2051 = new class257(64);

    @ObfuscatedName("gp.l")
    public class420 field2052;

    @ObfuscatedName("bx.o(Llp;I)V")
    public static void method1567(class316 arg0) {
        Statics.field2053 = arg0;
    }

    @ObfuscatedName("ov.q(II)Lgp;")
    public static class186 method6382(int arg0) {
        class186 var1 = (class186) field2051.method4566((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2053.method5249(34, arg0);
        class186 var3 = new class186();
        if (var2 != null) {
            var3.method3213(new class440(var2));
        }
        var3.method3212();
        field2051.method4571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gp.l(I)V")
    public void method3212() {
    }

    @ObfuscatedName("gp.k(Lpx;I)V")
    public void method3213(class440 arg0) {
        while (true) {
            int var2 = arg0.method7071();
            if (var2 == 0) {
                return;
            }
            this.method3214(arg0, var2);
        }
    }

    @ObfuscatedName("gp.a(Lpx;II)V")
    public void method3214(class440 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2052 = class176.method2892(arg0, this.field2052);
        }
    }

    @ObfuscatedName("gp.m(III)I")
    public int method3215(int arg0, int arg1) {
        return class176.method2802(this.field2052, arg0, arg1);
    }

    @ObfuscatedName("gp.p(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3216(int arg0, String arg1) {
        return class176.method2266(this.field2052, arg0, arg1);
    }

    @ObfuscatedName("iv.s(I)V")
    public static void method4525() {
        field2051.method4569();
    }
}
