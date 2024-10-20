package deob;

@ObfuscatedName("hh")
public class class186 extends class470 {

    @ObfuscatedName("hh.ay")
    public static class289 field1899 = new class289(64);

    @ObfuscatedName("hh.ar")
    public int field1897 = 0;

    @ObfuscatedName("bq.aw(II)Lhh;")
    public static class186 method633(int arg0) {
        class186 var1 = (class186) field1899.method5152((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1898.method6117(5, arg0);
        class186 var3 = new class186();
        if (var2 != null) {
            var3.method3257(new class514(var2));
        }
        field1899.method5149(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hh.ay(Lty;I)V")
    public void method3257(class514 arg0) {
        while (true) {
            int var2 = arg0.method8244();
            if (var2 == 0) {
                return;
            }
            this.method3258(arg0, var2);
        }
    }

    @ObfuscatedName("hh.ar(Lty;IB)V")
    public void method3258(class514 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1897 = arg0.method8246();
        }
    }
}
