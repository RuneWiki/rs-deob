package deob;

@ObfuscatedName("ik")
public class class251 extends class185 {

    @ObfuscatedName("ik.k")
    public static class155 field3207 = new class155(64);

    @ObfuscatedName("ik.d")
    public int field3208 = 0;

    @ObfuscatedName("hu.x(IB)Lik;")
    public static class251 method3836(int arg0) {
        class251 var1 = (class251) field3207.method3146((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3209.method3869(16, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method4059(new class310(var2));
        }
        field3207.method3152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ik.m(Lkb;I)V")
    public void method4059(class310 arg0) {
        while (true) {
            int var2 = arg0.method5137();
            if (var2 == 0) {
                return;
            }
            this.method4060(arg0, var2);
        }
    }

    @ObfuscatedName("ik.k(Lkb;II)V")
    public void method4060(class310 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3208 = arg0.method5139();
        }
    }
}
