package deob;

@ObfuscatedName("in")
public class class244 extends class198 {

    @ObfuscatedName("in.c")
    public static class193 field3294 = new class193(64);

    @ObfuscatedName("in.f")
    public int field3296 = 0;

    @ObfuscatedName("ho.s(II)Lin;")
    public static class244 method3816(int arg0) {
        class244 var1 = (class244) field3294.method3319((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3297.method3840(5, arg0);
        class244 var3 = new class244();
        if (var2 != null) {
            var3.method3980(new class177(var2));
        }
        field3294.method3315(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("in.c(Lfs;B)V")
    public void method3980(class177 arg0) {
        while (true) {
            int var2 = arg0.method2965();
            if (var2 == 0) {
                return;
            }
            this.method3981(arg0, var2);
        }
    }

    @ObfuscatedName("in.f(Lfs;II)V")
    public void method3981(class177 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3296 = arg0.method2967();
        }
    }
}
