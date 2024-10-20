package deob;

@ObfuscatedName("jq")
public class class268 extends class209 {

    @ObfuscatedName("jq.q")
    public static class203 field3378 = new class203(64);

    @ObfuscatedName("jq.m")
    public class200 field3376;

    @ObfuscatedName("ig.c(Lih;B)V")
    public static void method4449(class250 arg0) {
        Statics.field3375 = arg0;
    }

    @ObfuscatedName("jq.q(B)V")
    public void method4588() {
    }

    @ObfuscatedName("jq.m(Lgg;S)V")
    public void method4589(class185 arg0) {
        while (true) {
            int var2 = arg0.method3243();
            if (var2 == 0) {
                return;
            }
            this.method4597(arg0, var2);
        }
    }

    @ObfuscatedName("jq.j(Lgg;IB)V")
    public void method4597(class185 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3376 = class265.method2860(arg0, this.field3376);
        }
    }

    @ObfuscatedName("jq.g(IIB)I")
    public int method4607(int arg0, int arg1) {
        return class265.method2910(this.field3376, arg0, arg1);
    }

    @ObfuscatedName("jq.i(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4592(int arg0, String arg1) {
        return class265.method482(this.field3376, arg0, arg1);
    }

    @ObfuscatedName("l.h(I)V")
    public static void method100() {
        field3378.method3647();
    }
}
