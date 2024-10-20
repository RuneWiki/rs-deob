package deob;

@ObfuscatedName("at")
public class class46 extends class182 {

    @ObfuscatedName("at.y")
    public static class171 field1060 = new class171(64);

    @ObfuscatedName("at.w")
    public int field1063 = 0;

    @ObfuscatedName("ap.k(Lee;I)V")
    public static void method738(class146 arg0) {
        Statics.field1064 = arg0;
        Statics.field1062 = Statics.field1064.method2688(16);
    }

    @ObfuscatedName("x.r(II)Lat;")
    public static class46 method113(int arg0) {
        class46 var1 = (class46) field1060.method3141((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1064.method2749(16, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method911(new class107(var2));
        }
        field1060.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.y(Lde;B)V")
    public void method911(class107 arg0) {
        while (true) {
            int var2 = arg0.method2111();
            if (var2 == 0) {
                return;
            }
            this.method912(arg0, var2);
        }
    }

    @ObfuscatedName("at.w(Lde;II)V")
    public void method912(class107 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1063 = arg0.method2232();
        }
    }

    @ObfuscatedName("dz.m(I)V")
    public static void method2542() {
        field1060.method3138();
    }
}
