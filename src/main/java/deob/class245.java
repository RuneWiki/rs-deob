package deob;

@ObfuscatedName("ih")
public class class245 extends class195 {

    @ObfuscatedName("ih.h")
    public static class190 field3307 = new class190(64);

    @ObfuscatedName("ih.u")
    public boolean field3310 = false;

    @ObfuscatedName("de.i(Liy;I)V")
    public static void method1933(class236 arg0) {
        Statics.field3309 = arg0;
    }

    @ObfuscatedName("iy.h(IB)Lih;")
    public static class245 method3933(int arg0) {
        class245 var1 = (class245) field3307.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3309.method3836(15, arg0);
        class245 var3 = new class245();
        if (var2 != null) {
            var3.method4036(new class174(var2));
        }
        field3307.method3316(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ih.u(Lfv;I)V")
    public void method4036(class174 arg0) {
        while (true) {
            int var2 = arg0.method2930();
            if (var2 == 0) {
                return;
            }
            this.method4037(arg0, var2);
        }
    }

    @ObfuscatedName("ih.q(Lfv;II)V")
    public void method4037(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3310 = true;
        }
    }
}
