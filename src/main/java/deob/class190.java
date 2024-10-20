package deob;

@ObfuscatedName("gm")
public class class190 extends class151 {

    @ObfuscatedName("gm.n")
    public static class146 field2785 = new class146(64);

    @ObfuscatedName("gm.q")
    public int field2786 = 0;

    @ObfuscatedName("a.d(Lgd;I)V")
    public static void method202(class185 arg0) {
        Statics.field2787 = arg0;
        Statics.field2784 = Statics.field2787.method3097(16);
    }

    @ObfuscatedName("dx.c(II)Lgm;")
    public static class190 method1975(int arg0) {
        class190 var1 = (class190) field2785.method2598((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2787.method3129(16, arg0);
        class190 var3 = new class190();
        if (var2 != null) {
            var3.method3224(new class130(var2));
        }
        field2785.method2607(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gm.n(Ldu;I)V")
    public void method3224(class130 arg0) {
        while (true) {
            int var2 = arg0.method2379();
            if (var2 == 0) {
                return;
            }
            this.method3221(arg0, var2);
        }
    }

    @ObfuscatedName("gm.q(Ldu;II)V")
    public void method3221(class130 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2786 = arg0.method2232();
        }
    }

    @ObfuscatedName("ba.t(I)V")
    public static void method1341() {
        field2785.method2603();
    }
}
