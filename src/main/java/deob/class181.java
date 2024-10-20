package deob;

@ObfuscatedName("fz")
public class class181 extends class435 {

    @ObfuscatedName("fz.w")
    public static class273 field1918 = new class273(64);

    @ObfuscatedName("fz.v")
    public int field1923 = 0;

    @ObfuscatedName("ii.f(II)Lfz;")
    public static class181 method4584(int arg0) {
        class181 var1 = (class181) field1918.method5028((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1922.method5990(5, arg0);
        class181 var3 = new class181();
        if (var2 != null) {
            var3.method3277(new class474(var2));
        }
        field1918.method5027(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fz.w(Lrd;I)V")
    public void method3277(class474 arg0) {
        while (true) {
            int var2 = arg0.method7964();
            if (var2 == 0) {
                return;
            }
            this.method3278(arg0, var2);
        }
    }

    @ObfuscatedName("fz.v(Lrd;IB)V")
    public void method3278(class474 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1923 = arg0.method8032();
        }
    }
}
