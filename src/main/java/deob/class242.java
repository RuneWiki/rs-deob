package deob;

@ObfuscatedName("im")
public class class242 extends class196 {

    @ObfuscatedName("im.n")
    public static class191 field3265 = new class191(64);

    @ObfuscatedName("im.g")
    public int field3264 = 0;

    @ObfuscatedName("bg.e(Lit;I)V")
    public static void method724(class237 arg0) {
        Statics.field3266 = arg0;
    }

    @ObfuscatedName("im.n(Lfh;I)V")
    public void method3952(class175 arg0) {
        while (true) {
            int var2 = arg0.method2928();
            if (var2 == 0) {
                return;
            }
            this.method3953(arg0, var2);
        }
    }

    @ObfuscatedName("im.g(Lfh;II)V")
    public void method3953(class175 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3264 = arg0.method3091();
        }
    }
}
