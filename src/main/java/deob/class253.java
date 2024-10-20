package deob;

@ObfuscatedName("iz")
public class class253 extends class195 {

    @ObfuscatedName("iz.p")
    public static class190 field3404 = new class190(64);

    @ObfuscatedName("iz.i")
    public class187 field3403;

    @ObfuscatedName("hu.n(IB)Liz;")
    public static class253 method3647(int arg0) {
        class253 var1 = (class253) field3404.method3280((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3402.method3880(34, arg0);
        class253 var3 = new class253();
        if (var2 != null) {
            var3.method4164(new class174(var2));
        }
        var3.method4163();
        field3404.method3282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.p(I)V")
    public void method4163() {
    }

    @ObfuscatedName("iz.i(Lfl;I)V")
    public void method4164(class174 arg0) {
        while (true) {
            int var2 = arg0.method2925();
            if (var2 == 0) {
                return;
            }
            this.method4165(arg0, var2);
        }
    }

    @ObfuscatedName("iz.j(Lfl;IB)V")
    public void method4165(class174 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3403 = class250.method1667(arg0, this.field3403);
        }
    }

    @ObfuscatedName("iz.f(III)I")
    public int method4172(int arg0, int arg1) {
        return class250.method4031(this.field3403, arg0, arg1);
    }

    @ObfuscatedName("iz.m(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4176(int arg0, String arg1) {
        return class250.method3573(this.field3403, arg0, arg1);
    }
}
