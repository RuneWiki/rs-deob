package deob;

@ObfuscatedName("im")
public class class256 extends class198 {

    @ObfuscatedName("im.o")
    public static class193 field3406 = new class193(64);

    @ObfuscatedName("im.x")
    public class190 field3408;

    @ObfuscatedName("ip.w(Liq;B)V")
    public static void method3923(class239 arg0) {
        Statics.field3409 = arg0;
    }

    @ObfuscatedName("hb.o(IB)Lim;")
    public static class256 method3708(int arg0) {
        class256 var1 = (class256) field3406.method3239((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3409.method3754(34, arg0);
        class256 var3 = new class256();
        if (var2 != null) {
            var3.method4066(new class177(var2));
        }
        var3.method4065();
        field3406.method3241(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("im.x(I)V")
    public void method4065() {
    }

    @ObfuscatedName("im.k(Lfi;B)V")
    public void method4066(class177 arg0) {
        while (true) {
            int var2 = arg0.method2931();
            if (var2 == 0) {
                return;
            }
            this.method4080(arg0, var2);
        }
    }

    @ObfuscatedName("im.f(Lfi;II)V")
    public void method4080(class177 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3408 = class253.method2807(arg0, this.field3408);
        }
    }

    @ObfuscatedName("im.i(III)I")
    public int method4068(int arg0, int arg1) {
        return class253.method2161(this.field3408, arg0, arg1);
    }

    @ObfuscatedName("im.j(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4069(int arg0, String arg1) {
        return class253.method4380(this.field3408, arg0, arg1);
    }
}
