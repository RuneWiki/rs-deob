package deob;

@ObfuscatedName("is")
public class class245 extends class198 {

    @ObfuscatedName("is.f")
    public static class193 field3303 = new class193(64);

    @ObfuscatedName("is.m")
    public int field3302 = 0;

    @ObfuscatedName("go.s(II)Lis;")
    public static class245 method3237(int arg0) {
        class245 var1 = (class245) field3303.method3319((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3301.method3840(16, arg0);
        class245 var3 = new class245();
        if (var2 != null) {
            var3.method3994(new class177(var2));
        }
        field3303.method3315(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("is.c(Lfs;I)V")
    public void method3994(class177 arg0) {
        while (true) {
            int var2 = arg0.method2965();
            if (var2 == 0) {
                return;
            }
            this.method3996(arg0, var2);
        }
    }

    @ObfuscatedName("is.f(Lfs;IB)V")
    public void method3996(class177 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3302 = arg0.method2967();
        }
    }

    @ObfuscatedName("bx.m(I)V")
    public static void method1042() {
        field3303.method3316();
    }
}
