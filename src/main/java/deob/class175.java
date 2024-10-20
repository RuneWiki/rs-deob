package deob;

@ObfuscatedName("ao")
public class class175 extends class6 {

    @ObfuscatedName("ao.k")
    public static class2 field2594 = new class2(64);

    @ObfuscatedName("ao.w")
    public int field2596 = 0;

    @ObfuscatedName("ao.k(Ldp;I)V")
    public void method3032(class50 arg0) {
        while (true) {
            int var2 = arg0.method726();
            if (var2 == 0) {
                return;
            }
            this.method3044(arg0, var2);
        }
    }

    @ObfuscatedName("ao.w(Ldp;II)V")
    public void method3044(class50 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2596 = arg0.method720();
        }
    }

    @ObfuscatedName("ez.h(II)Lao;")
    public static class175 method1106(int arg0) {
        class175 var1 = (class175) field2594.method1((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2595.method1266(16, arg0);
        class175 var3 = new class175();
        if (var2 != null) {
            var3.method3032(new class50(var2));
        }
        field2594.method4(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("en.t(I)V")
    public static void method1402() {
        field2594.method5();
    }
}
