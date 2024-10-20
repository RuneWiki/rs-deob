package deob;

@ObfuscatedName("ix")
public class class242 extends class195 {

    @ObfuscatedName("ix.u")
    public static class190 field3271 = new class190(64);

    @ObfuscatedName("ix.q")
    public int field3273 = 0;

    @ObfuscatedName("ev.i(Liy;I)V")
    public static void method2735(class236 arg0) {
        Statics.field3274 = arg0;
        Statics.field2317 = Statics.field3274.method3846(16);
    }

    @ObfuscatedName("bg.h(IB)Lix;")
    public static class242 method1000(int arg0) {
        class242 var1 = (class242) field3271.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3274.method3836(16, arg0);
        class242 var3 = new class242();
        if (var2 != null) {
            var3.method4000(new class174(var2));
        }
        field3271.method3316(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.u(Lfv;I)V")
    public void method4000(class174 arg0) {
        while (true) {
            int var2 = arg0.method2930();
            if (var2 == 0) {
                return;
            }
            this.method4005(arg0, var2);
        }
    }

    @ObfuscatedName("ix.q(Lfv;II)V")
    public void method4005(class174 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3273 = arg0.method2932();
        }
    }
}
