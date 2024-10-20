package deob;

@ObfuscatedName("iv")
public class class256 extends class198 {

    @ObfuscatedName("iv.c")
    public static class193 field3407 = new class193(64);

    @ObfuscatedName("iv.f")
    public class190 field3409;

    @ObfuscatedName("dr.s(IB)Liv;")
    public static class256 method2237(int arg0) {
        class256 var1 = (class256) field3407.method3319((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3410.method3840(34, arg0);
        class256 var3 = new class256();
        if (var2 != null) {
            var3.method4176(new class177(var2));
        }
        var3.method4175();
        field3407.method3315(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iv.c(I)V")
    public void method4175() {
    }

    @ObfuscatedName("iv.f(Lfs;B)V")
    public void method4176(class177 arg0) {
        while (true) {
            int var2 = arg0.method2965();
            if (var2 == 0) {
                return;
            }
            this.method4181(arg0, var2);
        }
    }

    @ObfuscatedName("iv.m(Lfs;II)V")
    public void method4181(class177 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3409 = class253.method3798(arg0, this.field3409);
        }
    }

    @ObfuscatedName("iv.h(III)I")
    public int method4178(int arg0, int arg1) {
        return class253.method163(this.field3409, arg0, arg1);
    }

    @ObfuscatedName("iv.t(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4179(int arg0, String arg1) {
        return class253.method471(this.field3409, arg0, arg1);
    }
}
