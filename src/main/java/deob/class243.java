package deob;

@ObfuscatedName("iz")
public class class243 extends class176 {

    @ObfuscatedName("iz.t")
    public static class146 field3218 = new class146(64);

    @ObfuscatedName("iz.n")
    public boolean field3223 = false;

    @ObfuscatedName("do.a(II)Liz;")
    public static class243 method2438(int arg0) {
        class243 var1 = (class243) field3218.method3120((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3220.method3873(19, arg0);
        class243 var3 = new class243();
        if (var2 != null) {
            var3.method4104(new class300(var2));
        }
        field3218.method3122(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.t(Lkc;I)V")
    public void method4104(class300 arg0) {
        while (true) {
            int var2 = arg0.method5123();
            if (var2 == 0) {
                return;
            }
            this.method4105(arg0, var2);
        }
    }

    @ObfuscatedName("iz.n(Lkc;II)V")
    public void method4105(class300 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3223 = true;
        }
    }
}
