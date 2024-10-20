package deob;

@ObfuscatedName("ih")
public class class233 extends class502 {

    @ObfuscatedName("ih.an")
    public static class315 field2455 = new class315(64);

    @ObfuscatedName("ih.au")
    public int field2458 = 0;

    @ObfuscatedName("pc.ab(II)Lih;")
    public static class233 method6826(int arg0) {
        class233 var1 = (class233) field2455.method5586((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2456.method6670(16, arg0);
        class233 var3 = new class233();
        if (var2 != null) {
            var3.method4386(new class549(var2));
        }
        field2455.method5589(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ih.ay(Lvg;S)V")
    public void method4386(class549 arg0) {
        while (true) {
            int var2 = arg0.method9025();
            if (var2 == 0) {
                return;
            }
            this.method4385(arg0, var2);
        }
    }

    @ObfuscatedName("ih.an(Lvg;II)V")
    public void method4385(class549 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2458 = arg0.method8968();
        }
    }
}
