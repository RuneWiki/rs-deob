package deob;

@ObfuscatedName("if")
public class class254 extends class185 {

    @ObfuscatedName("if.b")
    public static class155 field3263 = new class155(64);

    @ObfuscatedName("if.l")
    public boolean field3265 = false;

    @ObfuscatedName("ch.f(Liw;B)V")
    public static void method2135(class245 arg0) {
        Statics.field3262 = arg0;
    }

    @ObfuscatedName("if.b(Lkb;I)V")
    public void method4143(class311 arg0) {
        while (true) {
            int var2 = arg0.method5276();
            if (var2 == 0) {
                return;
            }
            this.method4147(arg0, var2);
        }
    }

    @ObfuscatedName("if.l(Lkb;II)V")
    public void method4147(class311 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3265 = true;
        }
    }
}
