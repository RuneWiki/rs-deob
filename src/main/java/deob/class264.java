package deob;

@ObfuscatedName("jk")
public class class264 extends class206 {

    @ObfuscatedName("jk.g")
    public static class201 field3474 = new class201(64);

    @ObfuscatedName("jk.m")
    public class198 field3475;

    @ObfuscatedName("ir.s(Lir;B)V")
    public static void method4249(class247 arg0) {
        Statics.field3476 = arg0;
    }

    @ObfuscatedName("jk.g(I)V")
    public void method4517() {
    }

    @ObfuscatedName("jk.m(Lgy;I)V")
    public void method4534(class185 arg0) {
        while (true) {
            int var2 = arg0.method3239();
            if (var2 == 0) {
                return;
            }
            this.method4519(arg0, var2);
        }
    }

    @ObfuscatedName("jk.h(Lgy;II)V")
    public void method4519(class185 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3475 = class261.method4400(arg0, this.field3475);
        }
    }

    @ObfuscatedName("jk.i(III)I")
    public int method4520(int arg0, int arg1) {
        return class261.method1479(this.field3475, arg0, arg1);
    }

    @ObfuscatedName("jk.w(ILjava/lang/String;S)Ljava/lang/String;")
    public String method4521(int arg0, String arg1) {
        return class261.method4283(this.field3475, arg0, arg1);
    }
}
