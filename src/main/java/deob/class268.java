package deob;

@ObfuscatedName("jr")
public class class268 extends class209 {

    @ObfuscatedName("jr.c")
    public static class203 field3383 = new class203(64);

    @ObfuscatedName("jr.n")
    public class200 field3385;

    @ObfuscatedName("jr.y(I)V")
    public void method4609() {
    }

    @ObfuscatedName("jr.c(Lge;B)V")
    public void method4610(class185 arg0) {
        while (true) {
            int var2 = arg0.method3299();
            if (var2 == 0) {
                return;
            }
            this.method4611(arg0, var2);
        }
    }

    @ObfuscatedName("jr.n(Lge;IB)V")
    public void method4611(class185 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3385 = class265.method4229(arg0, this.field3385);
        }
    }

    @ObfuscatedName("jr.u(III)I")
    public int method4621(int arg0, int arg1) {
        return class265.method4405(this.field3385, arg0, arg1);
    }

    @ObfuscatedName("jr.i(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4614(int arg0, String arg1) {
        return class265.method966(this.field3385, arg0, arg1);
    }
}
