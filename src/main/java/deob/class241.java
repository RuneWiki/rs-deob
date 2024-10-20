package deob;

@ObfuscatedName("ik")
public class class241 extends class176 {

    @ObfuscatedName("ik.e")
    public static class146 field3206 = new class146(64);

    @ObfuscatedName("ik.p")
    public int field3207 = 0;

    @ObfuscatedName("b.q(Lhp;B)V")
    public static void method54(class234 arg0) {
        Statics.field3205 = arg0;
        Statics.field3204 = Statics.field3205.method3785(16);
    }

    @ObfuscatedName("l.w(II)Lik;")
    public static class241 method47(int arg0) {
        class241 var1 = (class241) field3206.method3039((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3205.method3775(16, arg0);
        class241 var3 = new class241();
        if (var2 != null) {
            var3.method3970(new class301(var2));
        }
        field3206.method3041(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ik.e(Lkf;I)V")
    public void method3970(class301 arg0) {
        while (true) {
            int var2 = arg0.method5077();
            if (var2 == 0) {
                return;
            }
            this.method3971(arg0, var2);
        }
    }

    @ObfuscatedName("ik.p(Lkf;II)V")
    public void method3971(class301 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3207 = arg0.method5069();
        }
    }

    @ObfuscatedName("bm.k(I)V")
    public static void method955() {
        field3206.method3042();
    }
}
