package deob;

@ObfuscatedName("fb")
public class class173 extends class407 {

    @ObfuscatedName("fb.p")
    public static class257 field1873 = new class257(64);

    @ObfuscatedName("fb.f")
    public boolean field1872 = false;

    @ObfuscatedName("cb.c(Llv;I)V")
    public static void method2512(class317 arg0) {
        Statics.field1870 = arg0;
    }

    @ObfuscatedName("fb.p(Lqq;B)V")
    public void method3197(class445 arg0) {
        while (true) {
            int var2 = arg0.method7196();
            if (var2 == 0) {
                return;
            }
            this.method3198(arg0, var2);
        }
    }

    @ObfuscatedName("fb.f(Lqq;IB)V")
    public void method3198(class445 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1872 = true;
        }
    }
}
