package deob;

@ObfuscatedName("ia")
public class class253 extends class195 {

    @ObfuscatedName("ia.h")
    public static class190 field3389 = new class190(64);

    @ObfuscatedName("ia.u")
    public class187 field3391;

    @ObfuscatedName("ds.i(Liy;B)V")
    public static void method1918(class236 arg0) {
        Statics.field3392 = arg0;
    }

    @ObfuscatedName("cc.h(II)Lia;")
    public static class253 method1727(int arg0) {
        class253 var1 = (class253) field3389.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3392.method3836(34, arg0);
        class253 var3 = new class253();
        if (var2 != null) {
            var3.method4151(new class174(var2));
        }
        var3.method4161();
        field3389.method3316(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ia.u(B)V")
    public void method4161() {
    }

    @ObfuscatedName("ia.q(Lfv;B)V")
    public void method4151(class174 arg0) {
        while (true) {
            int var2 = arg0.method2930();
            if (var2 == 0) {
                return;
            }
            this.method4152(arg0, var2);
        }
    }

    @ObfuscatedName("ia.g(Lfv;IB)V")
    public void method4152(class174 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3391 = class250.method2688(arg0, this.field3391);
        }
    }

    @ObfuscatedName("ia.v(III)I")
    public int method4153(int arg0, int arg1) {
        return class250.method2899(this.field3391, arg0, arg1);
    }

    @ObfuscatedName("ia.t(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4169(int arg0, String arg1) {
        return Statics.method4095(this.field3391, arg0, arg1);
    }
}
