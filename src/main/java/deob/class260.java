package deob;

@ObfuscatedName("im")
public class class260 extends class202 {

    @ObfuscatedName("im.p")
    public static class197 field3449 = new class197(64);

    @ObfuscatedName("im.i")
    public class194 field3450;

    @ObfuscatedName("d.m(Lik;I)V")
    public static void method179(class243 arg0) {
        Statics.field3448 = arg0;
    }

    @ObfuscatedName("im.p(B)V")
    public void method4278() {
    }

    @ObfuscatedName("im.i(Lfv;I)V")
    public void method4271(class181 arg0) {
        while (true) {
            int var2 = arg0.method3012();
            if (var2 == 0) {
                return;
            }
            this.method4267(arg0, var2);
        }
    }

    @ObfuscatedName("im.j(Lfv;IS)V")
    public void method4267(class181 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3450 = class257.method2376(arg0, this.field3450);
        }
    }

    @ObfuscatedName("im.v(IIB)I")
    public int method4268(int arg0, int arg1) {
        return class257.method2750(this.field3450, arg0, arg1);
    }

    @ObfuscatedName("im.x(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4274(int arg0, String arg1) {
        return class257.method2471(this.field3450, arg0, arg1);
    }

    @ObfuscatedName("fn.e(I)V")
    public static void method3242() {
        field3449.method3423();
    }
}
