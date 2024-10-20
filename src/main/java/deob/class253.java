package deob;

@ObfuscatedName("iq")
public class class253 extends class195 {

    @ObfuscatedName("iq.q")
    public static class190 field3374 = new class190(64);

    @ObfuscatedName("iq.x")
    public class187 field3375;

    @ObfuscatedName("ig.d(Lim;I)V")
    public static void method3932(class236 arg0) {
        Statics.field1465 = arg0;
    }

    @ObfuscatedName("o.q(IB)Liq;")
    public static class253 method53(int arg0) {
        class253 var1 = (class253) field3374.method3252((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1465.method3750(34, arg0);
        class253 var3 = new class253();
        if (var2 != null) {
            var3.method4050(new class174(var2));
        }
        var3.method4049();
        field3374.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iq.x(I)V")
    public void method4049() {
    }

    @ObfuscatedName("iq.y(Lfw;I)V")
    public void method4050(class174 arg0) {
        while (true) {
            int var2 = arg0.method2921();
            if (var2 == 0) {
                return;
            }
            this.method4063(arg0, var2);
        }
    }

    @ObfuscatedName("iq.e(Lfw;II)V")
    public void method4063(class174 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3375 = class250.method2459(arg0, this.field3375);
        }
    }

    @ObfuscatedName("iq.f(III)I")
    public int method4053(int arg0, int arg1) {
        return class250.method720(this.field3375, arg0, arg1);
    }

    @ObfuscatedName("iq.v(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4058(int arg0, String arg1) {
        return class250.method319(this.field3375, arg0, arg1);
    }
}
