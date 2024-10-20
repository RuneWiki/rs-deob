package deob;

@ObfuscatedName("it")
public class class253 extends class185 {

    @ObfuscatedName("it.m")
    public static class155 field3232 = new class155(64);

    @ObfuscatedName("it.k")
    public boolean field3234 = false;

    @ObfuscatedName("cj.x(Liy;I)V")
    public static void method2050(class244 arg0) {
        Statics.field3233 = arg0;
    }

    @ObfuscatedName("it.m(Lkb;B)V")
    public void method4095(class310 arg0) {
        while (true) {
            int var2 = arg0.method5137();
            if (var2 == 0) {
                return;
            }
            this.method4096(arg0, var2);
        }
    }

    @ObfuscatedName("it.k(Lkb;II)V")
    public void method4096(class310 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3234 = true;
        }
    }
}
