package deob;

@ObfuscatedName("iw")
public class class254 extends class196 {

    @ObfuscatedName("iw.j")
    public static class191 field3400 = new class191(64);

    @ObfuscatedName("iw.a")
    public class188 field3395;

    @ObfuscatedName("ho.i(IB)Liw;")
    public static class254 method3730(int arg0) {
        class254 var1 = (class254) field3400.method3347((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3273.method3824(34, arg0);
        class254 var3 = new class254();
        if (var2 != null) {
            var3.method4134(new class175(var2));
        }
        var3.method4133();
        field3400.method3346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iw.j(I)V")
    public void method4133() {
    }

    @ObfuscatedName("iw.a(Lfp;I)V")
    public void method4134(class175 arg0) {
        while (true) {
            int var2 = arg0.method2999();
            if (var2 == 0) {
                return;
            }
            this.method4135(arg0, var2);
        }
    }

    @ObfuscatedName("iw.r(Lfp;IB)V")
    public void method4135(class175 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3395 = class251.method475(arg0, this.field3395);
        }
    }

    @ObfuscatedName("iw.o(III)I")
    public int method4136(int arg0, int arg1) {
        return class251.method161(this.field3395, arg0, arg1);
    }

    @ObfuscatedName("iw.n(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4152(int arg0, String arg1) {
        return class251.method564(this.field3395, arg0, arg1);
    }
}
