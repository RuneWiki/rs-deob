package deob;

@ObfuscatedName("jq")
public class class262 extends class181 {

    @ObfuscatedName("jq.f")
    public static class146 field3384 = new class146(64);

    @ObfuscatedName("jq.q")
    public class317 field3383;

    @ObfuscatedName("go.m(II)Ljq;")
    public static class262 method3351(int arg0) {
        class262 var1 = (class262) field3384.method3011((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3385.method4156(34, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4522(new class202(var2));
        }
        var3.method4521();
        field3384.method3009(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jq.f(B)V")
    public void method4521() {
    }

    @ObfuscatedName("jq.q(Lgr;I)V")
    public void method4522(class202 arg0) {
        while (true) {
            int var2 = arg0.method3551();
            if (var2 == 0) {
                return;
            }
            this.method4523(arg0, var2);
        }
    }

    @ObfuscatedName("jq.w(Lgr;II)V")
    public void method4523(class202 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3383 = Statics.method4176(arg0, this.field3383);
        }
    }

    @ObfuscatedName("jq.o(IIB)I")
    public int method4524(int arg0, int arg1) {
        class317 var3 = this.field3383;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class185 var5 = (class185) var3.method5382((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2138;
            }
        }
        return var4;
    }

    @ObfuscatedName("jq.u(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4525(int arg0, String arg1) {
        return class259.method2980(this.field3383, arg0, arg1);
    }
}
