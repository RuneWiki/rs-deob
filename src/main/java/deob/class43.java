package deob;

@ObfuscatedName("al")
public class class43 extends class174 {

    @ObfuscatedName("al.y")
    public static class167 field1038 = new class167(64);

    @ObfuscatedName("al.g")
    public int field1032 = 0;

    @ObfuscatedName("a.k(II)Lal;")
    public static class43 method102(int arg0) {
        class43 var1 = (class43) field1038.method3137((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1031.method2725(16, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method856(new class104(var2));
        }
        field1038.method3130(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.y(Lcb;B)V")
    public void method856(class104 arg0) {
        while (true) {
            int var2 = arg0.method2190();
            if (var2 == 0) {
                return;
            }
            this.method857(arg0, var2);
        }
    }

    @ObfuscatedName("al.g(Lcb;II)V")
    public void method857(class104 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1032 = arg0.method2132();
        }
    }

    @ObfuscatedName("be.r(I)V")
    public static void method1321() {
        field1038.method3134();
    }
}
