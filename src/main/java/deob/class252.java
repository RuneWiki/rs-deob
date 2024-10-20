package deob;

@ObfuscatedName("is")
public class class252 extends class185 {

    @ObfuscatedName("is.x")
    public static class155 field3237 = new class155(64);

    @ObfuscatedName("is.w")
    public int field3239 = 0;

    @ObfuscatedName("hx.h(II)Lis;")
    public static class252 method3657(int arg0) {
        class252 var1 = (class252) field3237.method3147((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4.method3834(16, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4019(new class311(var2));
        }
        field3237.method3145(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("is.v(Lkj;I)V")
    public void method4019(class311 arg0) {
        while (true) {
            int var2 = arg0.method5274();
            if (var2 == 0) {
                return;
            }
            this.method4010(arg0, var2);
        }
    }

    @ObfuscatedName("is.x(Lkj;II)V")
    public void method4010(class311 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3239 = arg0.method5342();
        }
    }

    @ObfuscatedName("ao.w(I)V")
    public static void method543() {
        field3237.method3146();
    }
}
