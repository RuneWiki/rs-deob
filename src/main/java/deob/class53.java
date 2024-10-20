package deob;

@ObfuscatedName("bm")
public class class53 extends class204 {

    @ObfuscatedName("bm.g")
    public static class193 field1161 = new class193(64);

    @ObfuscatedName("bm.w")
    public int field1162 = 0;

    @ObfuscatedName("w.y(IB)Lbm;")
    public static class53 method39(int arg0) {
        class53 var1 = (class53) field1161.method3425((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1160.method3045(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1053(new class119(var2));
        }
        field1161.method3427(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bm.d(Ldd;I)V")
    public void method1053(class119 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method1066(arg0, var2);
        }
    }

    @ObfuscatedName("bm.g(Ldd;II)V")
    public void method1066(class119 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1162 = arg0.method2525();
        }
    }

    @ObfuscatedName("aq.w(S)V")
    public static void method736() {
        field1161.method3428();
    }
}
