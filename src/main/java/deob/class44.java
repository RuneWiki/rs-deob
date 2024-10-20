package deob;

@ObfuscatedName("au")
public class class44 extends class182 {

    @ObfuscatedName("au.s")
    public static class171 field990 = new class171(64);

    @ObfuscatedName("au.f")
    public int field991 = 0;

    @ObfuscatedName("x.t(II)Lau;")
    public static class44 method173(int arg0) {
        class44 var1 = (class44) field990.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2663.method2709(5, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method818(new class107(var2));
        }
        field990.method3168(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.s(Ldb;I)V")
    public void method818(class107 arg0) {
        while (true) {
            int var2 = arg0.method2101();
            if (var2 == 0) {
                return;
            }
            this.method819(arg0, var2);
        }
    }

    @ObfuscatedName("au.f(Ldb;II)V")
    public void method819(class107 arg0, int arg1) {
        if (arg1 == 2) {
            this.field991 = arg0.method2103();
        }
    }
}
