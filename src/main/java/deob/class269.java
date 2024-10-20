package deob;

@ObfuscatedName("jw")
public class class269 extends class214 {

    @ObfuscatedName("jw.h")
    public static class208 field3393 = new class208(64);

    @ObfuscatedName("jw.l")
    public int field3396;

    @ObfuscatedName("jw.g")
    public int field3395;

    @ObfuscatedName("jw.b")
    public int field3392;

    @ObfuscatedName("jw.n(Lgc;I)V")
    public void method4757(class190 arg0) {
        while (true) {
            int var2 = arg0.method3511();
            if (var2 == 0) {
                return;
            }
            this.method4759(arg0, var2);
        }
    }

    @ObfuscatedName("jw.h(Lgc;II)V")
    public void method4759(class190 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3396 = arg0.method3513();
            this.field3395 = arg0.method3511();
            this.field3392 = arg0.method3511();
        }
    }

    @ObfuscatedName("hm.l(B)V")
    public static void method4306() {
        field3393.method3899();
    }
}
