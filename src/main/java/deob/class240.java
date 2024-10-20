package deob;

@ObfuscatedName("iz")
public class class240 extends class176 {

    @ObfuscatedName("iz.j")
    public static class146 field3181 = new class146(64);

    @ObfuscatedName("iz.i")
    public int field3182 = 0;

    @ObfuscatedName("ay.s(Lhz;B)V")
    public static void method649(class234 arg0) {
        Statics.field3180 = arg0;
    }

    @ObfuscatedName("bu.j(II)Liz;")
    public static class240 method1575(int arg0) {
        class240 var1 = (class240) field3181.method3065((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3180.method3790(5, arg0);
        class240 var3 = new class240();
        if (var2 != null) {
            var3.method3949(new class300(var2));
        }
        field3181.method3067(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.i(Lky;I)V")
    public void method3949(class300 arg0) {
        while (true) {
            int var2 = arg0.method5179();
            if (var2 == 0) {
                return;
            }
            this.method3950(arg0, var2);
        }
    }

    @ObfuscatedName("iz.k(Lky;II)V")
    public void method3950(class300 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3182 = arg0.method5054();
        }
    }
}
