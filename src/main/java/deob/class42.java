package deob;

@ObfuscatedName("aa")
public class class42 extends class182 {

    @ObfuscatedName("aa.s")
    public static class171 field965 = new class171(64);

    @ObfuscatedName("aa.f")
    public int field975;

    @ObfuscatedName("aa.e")
    public int field964;

    @ObfuscatedName("aa.d")
    public int field968;

    @ObfuscatedName("bz.t(II)Laa;")
    public static class42 method1294(int arg0) {
        class42 var1 = (class42) field965.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field976.method2709(14, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method790(new class107(var2));
        }
        field965.method3168(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.s(Ldb;I)V")
    public void method790(class107 arg0) {
        while (true) {
            int var2 = arg0.method2101();
            if (var2 == 0) {
                return;
            }
            this.method795(arg0, var2);
        }
    }

    @ObfuscatedName("aa.f(Ldb;IB)V")
    public void method795(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field975 = arg0.method2103();
            this.field964 = arg0.method2101();
            this.field968 = arg0.method2101();
        }
    }
}
