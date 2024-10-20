package deob;

@ObfuscatedName("iq")
public class class242 extends class195 {

    @ObfuscatedName("iq.e")
    public static class190 field3287 = new class190(64);

    @ObfuscatedName("iq.p")
    public int field3288 = 0;

    @ObfuscatedName("ci.d(Lit;I)V")
    public static void method1705(class236 arg0) {
        Statics.field3289 = arg0;
        Statics.field2453 = Statics.field3289.method3889(16);
    }

    @ObfuscatedName("fg.k(II)Liq;")
    public static class242 method3180(int arg0) {
        class242 var1 = (class242) field3287.method3341((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3289.method3875(16, arg0);
        class242 var3 = new class242();
        if (var2 != null) {
            var3.method4021(new class174(var2));
        }
        field3287.method3343(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iq.e(Lfg;B)V")
    public void method4021(class174 arg0) {
        while (true) {
            int var2 = arg0.method2955();
            if (var2 == 0) {
                return;
            }
            this.method4027(arg0, var2);
        }
    }

    @ObfuscatedName("iq.p(Lfg;II)V")
    public void method4027(class174 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3288 = arg0.method3035();
        }
    }

    @ObfuscatedName("cl.q(I)V")
    public static void method1638() {
        field3287.method3345();
    }
}
