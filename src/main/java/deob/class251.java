package deob;

@ObfuscatedName("ia")
public class class251 extends class202 {

    @ObfuscatedName("ia.s")
    public static class197 field3368 = new class197(64);

    @ObfuscatedName("ia.r")
    public boolean field3369 = false;

    @ObfuscatedName("bp.b(IB)Lia;")
    public static class251 method939(int arg0) {
        class251 var1 = (class251) field3368.method3330((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3370.method3887(19, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method3999(new class181(var2));
        }
        field3368.method3332(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ia.s(Lfs;I)V")
    public void method3999(class181 arg0) {
        while (true) {
            int var2 = arg0.method2945();
            if (var2 == 0) {
                return;
            }
            this.method3991(arg0, var2);
        }
    }

    @ObfuscatedName("ia.r(Lfs;IB)V")
    public void method3991(class181 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3369 = true;
        }
    }
}
