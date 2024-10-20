package deob;

@ObfuscatedName("ir")
public class class228 extends class502 {

    @ObfuscatedName("ir.ay")
    public static class315 field2435 = new class315(64);

    @ObfuscatedName("ir.an")
    public int field2437 = 0;

    @ObfuscatedName("qo.ab(IS)Lir;")
    public static class228 method7337(int arg0) {
        class228 var1 = (class228) field2435.method5586((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2439.method6670(5, arg0);
        class228 var3 = new class228();
        if (var2 != null) {
            var3.method4360(new class549(var2));
        }
        field2435.method5589(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.ay(Lvg;B)V")
    public void method4360(class549 arg0) {
        while (true) {
            int var2 = arg0.method9025();
            if (var2 == 0) {
                return;
            }
            this.method4361(arg0, var2);
        }
    }

    @ObfuscatedName("ir.an(Lvg;II)V")
    public void method4361(class549 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2437 = arg0.method8968();
        }
    }

    @ObfuscatedName("dy.au(I)V")
    public static void method2622() {
        field2435.method5588();
    }
}
