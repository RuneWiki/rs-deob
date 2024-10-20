package deob;

@ObfuscatedName("bs")
public class class57 extends class208 {

    @ObfuscatedName("bs.v")
    public static class197 field1236 = new class197(64);

    @ObfuscatedName("bs.r")
    public int field1237 = 0;

    @ObfuscatedName("gu.a(IB)Lbs;")
    public static class57 method3320(int arg0) {
        class57 var1 = (class57) field1236.method3544((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1234.method3117(16, arg0);
        class57 var3 = new class57();
        if (var2 != null) {
            var3.method1155(new class123(var2));
        }
        field1236.method3546(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bs.d(Ldb;I)V")
    public void method1155(class123 arg0) {
        while (true) {
            int var2 = arg0.method2395();
            if (var2 == 0) {
                return;
            }
            this.method1156(arg0, var2);
        }
    }

    @ObfuscatedName("bs.v(Ldb;II)V")
    public void method1156(class123 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1237 = arg0.method2584();
        }
    }

    @ObfuscatedName("av.r(I)V")
    public static void method711() {
        field1236.method3552();
    }
}
