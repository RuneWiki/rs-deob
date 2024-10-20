package deob;

@ObfuscatedName("ay")
public class class46 extends class182 {

    @ObfuscatedName("ay.f")
    public static class171 field1046 = new class171(64);

    @ObfuscatedName("ay.e")
    public int field1047 = 0;

    @ObfuscatedName("ae.t(II)Lay;")
    public static class46 method583(int arg0) {
        class46 var1 = (class46) field1046.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1051.method2709(16, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method870(new class107(var2));
        }
        field1046.method3168(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.s(Ldb;I)V")
    public void method870(class107 arg0) {
        while (true) {
            int var2 = arg0.method2101();
            if (var2 == 0) {
                return;
            }
            this.method883(arg0, var2);
        }
    }

    @ObfuscatedName("ay.f(Ldb;IB)V")
    public void method883(class107 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1047 = arg0.method2103();
        }
    }

    @ObfuscatedName("cf.e(I)V")
    public static void method1940() {
        field1046.method3171();
    }
}
