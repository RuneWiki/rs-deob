package deob;

@ObfuscatedName("il")
public class class254 extends class198 {

    @ObfuscatedName("il.c")
    public static class193 field3397 = new class193(64);

    @ObfuscatedName("il.f")
    public int field3395;

    @ObfuscatedName("il.m")
    public int field3398;

    @ObfuscatedName("il.h")
    public int field3393;

    @ObfuscatedName("hs.s(Liw;I)V")
    public static void method3808(class239 arg0) {
        Statics.field3396 = arg0;
    }

    @ObfuscatedName("il.c(Lfs;I)V")
    public void method4147(class177 arg0) {
        while (true) {
            int var2 = arg0.method2965();
            if (var2 == 0) {
                return;
            }
            this.method4146(arg0, var2);
        }
    }

    @ObfuscatedName("il.f(Lfs;II)V")
    public void method4146(class177 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3395 = arg0.method2967();
            this.field3398 = arg0.method2965();
            this.field3393 = arg0.method2965();
        }
    }
}
