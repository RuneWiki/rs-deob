package deob;

@ObfuscatedName("hg")
public class class187 extends class470 {

    @ObfuscatedName("hg.ar")
    public static class289 field1906 = new class289(64);

    @ObfuscatedName("hg.am")
    public int field1904 = 0;

    @ObfuscatedName("ga.aw(II)Lhg;")
    public static class187 method3069(int arg0) {
        class187 var1 = (class187) field1906.method5152((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1910.method6117(16, arg0);
        class187 var3 = new class187();
        if (var2 != null) {
            var3.method3269(new class514(var2));
        }
        field1906.method5149(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hg.ay(Lty;I)V")
    public void method3269(class514 arg0) {
        while (true) {
            int var2 = arg0.method8244();
            if (var2 == 0) {
                return;
            }
            this.method3268(arg0, var2);
        }
    }

    @ObfuscatedName("hg.ar(Lty;II)V")
    public void method3268(class514 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1904 = arg0.method8246();
        }
    }
}
