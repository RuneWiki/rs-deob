package deob;

@ObfuscatedName("bh")
public class class54 extends class208 {

    @ObfuscatedName("bh.z")
    public static class197 field1120 = new class197(64);

    @ObfuscatedName("bh.t")
    public boolean field1122 = false;

    @ObfuscatedName("r.s(II)Lbh;")
    public static class54 method127(int arg0) {
        class54 var1 = (class54) field1120.method3523((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1126.method3091(15, arg0);
        class54 var3 = new class54();
        if (var2 != null) {
            var3.method1038(new class123(var2));
        }
        field1120.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bh.z(Ldy;I)V")
    public void method1038(class123 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method1047(arg0, var2);
        }
    }

    @ObfuscatedName("bh.t(Ldy;II)V")
    public void method1047(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1122 = true;
        }
    }
}
