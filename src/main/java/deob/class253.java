package deob;

@ObfuscatedName("ig")
public class class253 extends class195 {

    @ObfuscatedName("ig.c")
    public static class190 field3393 = new class190(64);

    @ObfuscatedName("ig.e")
    public class187 field3394;

    @ObfuscatedName("gp.i(Liw;I)V")
    public static void method3482(class236 arg0) {
        Statics.field3392 = arg0;
    }

    @ObfuscatedName("ig.c(I)V")
    public void method4118() {
    }

    @ObfuscatedName("ig.e(Lfx;B)V")
    public void method4109(class174 arg0) {
        while (true) {
            int var2 = arg0.method2870();
            if (var2 == 0) {
                return;
            }
            this.method4110(arg0, var2);
        }
    }

    @ObfuscatedName("ig.v(Lfx;II)V")
    public void method4110(class174 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3394 = class250.method1933(arg0, this.field3394);
        }
    }

    @ObfuscatedName("ig.b(IIB)I")
    public int method4111(int arg0, int arg1) {
        return class250.method1453(this.field3394, arg0, arg1);
    }

    @ObfuscatedName("ig.y(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4117(int arg0, String arg1) {
        return class250.method446(this.field3394, arg0, arg1);
    }
}
