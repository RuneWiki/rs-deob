package deob;

@ObfuscatedName("iy")
public class class257 extends class207 {

    @ObfuscatedName("iy.m")
    public static class201 field3280 = new class201(64);

    @ObfuscatedName("iy.q")
    public boolean field3281 = false;

    @ObfuscatedName("jm.w(II)Liy;")
    public static class257 method4775(int arg0) {
        class257 var1 = (class257) field3280.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3279.method4250(19, arg0);
        class257 var3 = new class257();
        if (var2 != null) {
            var3.method4458(new class183(var2));
        }
        field3280.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.m(Lgy;I)V")
    public void method4458(class183 arg0) {
        while (true) {
            int var2 = arg0.method3436();
            if (var2 == 0) {
                return;
            }
            this.method4466(arg0, var2);
        }
    }

    @ObfuscatedName("iy.q(Lgy;II)V")
    public void method4466(class183 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3281 = true;
        }
    }
}
