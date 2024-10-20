package deob;

@ObfuscatedName("jq")
public class class280 extends class219 {

    @ObfuscatedName("jq.e")
    public static class213 field3554 = new class213(64);

    @ObfuscatedName("jq.b")
    public class210 field3553;

    @ObfuscatedName("n.g(Ljr;B)V")
    public static void method11(class262 arg0) {
        Statics.field3555 = arg0;
    }

    @ObfuscatedName("ek.e(IB)Ljq;")
    public static class280 method2948(int arg0) {
        class280 var1 = (class280) field3554.method3706((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3555.method4294(34, arg0);
        class280 var3 = new class280();
        if (var2 != null) {
            var3.method4630(new class195(var2));
        }
        var3.method4617();
        field3554.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jq.b(I)V")
    public void method4617() {
    }

    @ObfuscatedName("jq.z(Lgg;I)V")
    public void method4630(class195 arg0) {
        while (true) {
            int var2 = arg0.method3332();
            if (var2 == 0) {
                return;
            }
            this.method4618(arg0, var2);
        }
    }

    @ObfuscatedName("jq.n(Lgg;II)V")
    public void method4618(class195 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3553 = class277.method3031(arg0, this.field3553);
        }
    }

    @ObfuscatedName("jq.l(III)I")
    public int method4621(int arg0, int arg1) {
        return class277.method2026(this.field3553, arg0, arg1);
    }

    @ObfuscatedName("jq.s(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4620(int arg0, String arg1) {
        return class277.method3127(this.field3553, arg0, arg1);
    }
}
