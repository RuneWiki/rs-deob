package deob;

@ObfuscatedName("iq")
public class class254 extends class196 {

    @ObfuscatedName("iq.n")
    public static class191 field3389 = new class191(64);

    @ObfuscatedName("iq.g")
    public class188 field3391;

    @ObfuscatedName("as.e(Lit;I)V")
    public static void method551(class237 arg0) {
        Statics.field3388 = arg0;
    }

    @ObfuscatedName("iq.n(I)V")
    public void method4151() {
    }

    @ObfuscatedName("iq.g(Lfh;I)V")
    public void method4152(class175 arg0) {
        while (true) {
            int var2 = arg0.method2928();
            if (var2 == 0) {
                return;
            }
            this.method4168(arg0, var2);
        }
    }

    @ObfuscatedName("iq.y(Lfh;IB)V")
    public void method4168(class175 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3391 = class251.method990(arg0, this.field3391);
        }
    }

    @ObfuscatedName("iq.w(III)I")
    public int method4154(int arg0, int arg1) {
        return class251.method464(this.field3391, arg0, arg1);
    }

    @ObfuscatedName("iq.k(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4161(int arg0, String arg1) {
        return class251.method2901(this.field3391, arg0, arg1);
    }

    @ObfuscatedName("gn.v(B)V")
    public static void method3550() {
        field3389.method3282();
    }
}
