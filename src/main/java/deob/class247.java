package deob;

@ObfuscatedName("ie")
public class class247 extends class198 {

    @ObfuscatedName("ie.c")
    public static class193 field3326 = new class193(64);

    @ObfuscatedName("ie.f")
    public boolean field3328 = false;

    @ObfuscatedName("fz.s(Liw;I)V")
    public static void method2884(class239 arg0) {
        Statics.field3331 = arg0;
    }

    @ObfuscatedName("ie.c(Lfs;I)V")
    public void method4030(class177 arg0) {
        while (true) {
            int var2 = arg0.method2965();
            if (var2 == 0) {
                return;
            }
            this.method4029(arg0, var2);
        }
    }

    @ObfuscatedName("ie.f(Lfs;II)V")
    public void method4029(class177 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3328 = true;
        }
    }
}
