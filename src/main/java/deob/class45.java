package deob;

@ObfuscatedName("ad")
public class class45 extends class187 {

    @ObfuscatedName("ad.y")
    public static class176 field980 = new class176(64);

    @ObfuscatedName("ad.d")
    public int field979 = 0;

    @ObfuscatedName("t.p(II)Lad;")
    public static class45 method543(int arg0) {
        class45 var1 = (class45) field980.method3198((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field987.method2811(5, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method859(new class110(var2));
        }
        field980.method3193(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.y(Ldg;I)V")
    public void method859(class110 arg0) {
        while (true) {
            int var2 = arg0.method2309();
            if (var2 == 0) {
                return;
            }
            this.method860(arg0, var2);
        }
    }

    @ObfuscatedName("ad.d(Ldg;II)V")
    public void method860(class110 arg0, int arg1) {
        if (arg1 == 2) {
            this.field979 = arg0.method2243();
        }
    }
}
