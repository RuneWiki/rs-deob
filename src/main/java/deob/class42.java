package deob;

@ObfuscatedName("ae")
public class class42 extends class183 {

    @ObfuscatedName("ae.s")
    public static class172 field971 = new class172(64);

    @ObfuscatedName("ae.v")
    public int field972;

    @ObfuscatedName("ae.o")
    public int field973;

    @ObfuscatedName("ae.k")
    public int field974;

    @ObfuscatedName("client.g(Let;S)V")
    public static void method444(class147 arg0) {
        Statics.field975 = arg0;
    }

    @ObfuscatedName("aj.s(II)Lae;")
    public static class42 method569(int arg0) {
        class42 var1 = (class42) field971.method3112((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field975.method2703(14, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method802(new class107(var2));
        }
        field971.method3115(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.v(Lde;I)V")
    public void method802(class107 arg0) {
        while (true) {
            int var2 = arg0.method2116();
            if (var2 == 0) {
                return;
            }
            this.method809(arg0, var2);
        }
    }

    @ObfuscatedName("ae.o(Lde;II)V")
    public void method809(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field972 = arg0.method2094();
            this.field973 = arg0.method2116();
            this.field974 = arg0.method2116();
        }
    }
}
