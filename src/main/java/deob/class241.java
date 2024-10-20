package deob;

@ObfuscatedName("iu")
public class class241 extends class176 {

    @ObfuscatedName("iu.n")
    public static class146 field3196 = new class146(64);

    @ObfuscatedName("iu.q")
    public int field3193 = 0;

    @ObfuscatedName("b.a(Lhq;I)V")
    public static void method231(class234 arg0) {
        Statics.field3192 = arg0;
        Statics.field3191 = Statics.field3192.method3953(16);
    }

    @ObfuscatedName("cz.t(II)Liu;")
    public static class241 method2125(int arg0) {
        class241 var1 = (class241) field3196.method3120((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3192.method3873(16, arg0);
        class241 var3 = new class241();
        if (var2 != null) {
            var3.method4068(new class300(var2));
        }
        field3196.method3122(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.n(Lkc;B)V")
    public void method4068(class300 arg0) {
        while (true) {
            int var2 = arg0.method5123();
            if (var2 == 0) {
                return;
            }
            this.method4073(arg0, var2);
        }
    }

    @ObfuscatedName("iu.q(Lkc;II)V")
    public void method4073(class300 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3193 = arg0.method5166();
        }
    }

    @ObfuscatedName("g.v(I)V")
    public static void method291() {
        field3196.method3123();
    }
}
