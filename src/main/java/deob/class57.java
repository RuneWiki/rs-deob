package deob;

@ObfuscatedName("bq")
public class class57 extends class208 {

    @ObfuscatedName("bq.c")
    public static class197 field1233 = new class197(64);

    @ObfuscatedName("bq.h")
    public int field1232 = 0;

    @ObfuscatedName("aq.e(Lfe;B)V")
    public static void method772(class171 arg0) {
        Statics.field1234 = arg0;
        Statics.field1230 = Statics.field1234.method3142(16);
    }

    @ObfuscatedName("de.l(IB)Lbq;")
    public static class57 method2370(int arg0) {
        class57 var1 = (class57) field1233.method3589((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1234.method3130(16, arg0);
        class57 var3 = new class57();
        if (var2 != null) {
            var3.method1203(new class123(var2));
        }
        field1233.method3591(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bq.c(Ldd;I)V")
    public void method1203(class123 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method1192(arg0, var2);
        }
    }

    @ObfuscatedName("bq.h(Ldd;IB)V")
    public void method1192(class123 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1232 = arg0.method2466();
        }
    }
}
