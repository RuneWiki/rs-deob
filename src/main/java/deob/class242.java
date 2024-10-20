package deob;

@ObfuscatedName("is")
public class class242 extends class196 {

    @ObfuscatedName("is.j")
    public static class191 field3283 = new class191(64);

    @ObfuscatedName("is.a")
    public int field3282 = 0;

    @ObfuscatedName("j.i(Lii;I)V")
    public static void method3(class237 arg0) {
        Statics.field3285 = arg0;
    }

    @ObfuscatedName("is.j(Lfp;I)V")
    public void method3953(class175 arg0) {
        while (true) {
            int var2 = arg0.method2999();
            if (var2 == 0) {
                return;
            }
            this.method3952(arg0, var2);
        }
    }

    @ObfuscatedName("is.a(Lfp;II)V")
    public void method3952(class175 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3282 = arg0.method2995();
        }
    }
}
