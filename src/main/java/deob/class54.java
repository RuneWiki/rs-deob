package deob;

@ObfuscatedName("bq")
public class class54 extends class208 {

    @ObfuscatedName("bq.g")
    public static class197 field1168 = new class197(64);

    @ObfuscatedName("bq.r")
    public boolean field1167 = false;

    @ObfuscatedName("at.l(Lfp;I)V")
    public static void method893(class171 arg0) {
        Statics.field1165 = arg0;
    }

    @ObfuscatedName("ah.g(II)Lbq;")
    public static class54 method672(int arg0) {
        class54 var1 = (class54) field1168.method3653((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1165.method3210(15, arg0);
        class54 var3 = new class54();
        if (var2 != null) {
            var3.method1109(new class123(var2));
        }
        field1168.method3655(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bq.r(Ldc;I)V")
    public void method1109(class123 arg0) {
        while (true) {
            int var2 = arg0.method2490();
            if (var2 == 0) {
                return;
            }
            this.method1110(arg0, var2);
        }
    }

    @ObfuscatedName("bq.e(Ldc;II)V")
    public void method1110(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1167 = true;
        }
    }
}
