package deob;

@ObfuscatedName("bn")
public class class57 extends class208 {

    @ObfuscatedName("bn.r")
    public static class197 field1232 = new class197(64);

    @ObfuscatedName("bn.e")
    public int field1235 = 0;

    @ObfuscatedName("z.l(Lfp;I)V")
    public static void method200(class171 arg0) {
        Statics.field1233 = arg0;
        Statics.field1234 = Statics.field1233.method3204(16);
    }

    @ObfuscatedName("em.g(IB)Lbn;")
    public static class57 method3067(int arg0) {
        class57 var1 = (class57) field1232.method3653((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1233.method3210(16, arg0);
        class57 var3 = new class57();
        if (var2 != null) {
            var3.method1211(new class123(var2));
        }
        field1232.method3655(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bn.r(Ldc;B)V")
    public void method1211(class123 arg0) {
        while (true) {
            int var2 = arg0.method2490();
            if (var2 == 0) {
                return;
            }
            this.method1212(arg0, var2);
        }
    }

    @ObfuscatedName("bn.e(Ldc;II)V")
    public void method1212(class123 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1235 = arg0.method2492();
        }
    }

    @ObfuscatedName("k.h(B)V")
    public static void method93() {
        field1232.method3658();
    }
}
