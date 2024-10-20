package deob;

@ObfuscatedName("az")
public class class38 extends class174 {

    @ObfuscatedName("az.p")
    public static class170 field938 = new class170(64);

    @ObfuscatedName("az.k")
    public int field932;

    @ObfuscatedName("az.a")
    public int field934;

    @ObfuscatedName("az.q")
    public int field933;

    @ObfuscatedName("cq.x(II)Laz;")
    public static class38 method1545(int arg0) {
        class38 var1 = (class38) field938.method3196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2458.method2920(14, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method784(new class127(var2));
        }
        field938.method3197(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.p(Ldg;I)V")
    public void method784(class127 arg0) {
        while (true) {
            int var2 = arg0.method2484();
            if (var2 == 0) {
                return;
            }
            this.method792(arg0, var2);
        }
    }

    @ObfuscatedName("az.k(Ldg;II)V")
    public void method792(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field932 = arg0.method2539();
            this.field934 = arg0.method2484();
            this.field933 = arg0.method2484();
        }
    }
}
