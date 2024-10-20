package deob;

@ObfuscatedName("ah")
public class class46 extends class182 {

    @ObfuscatedName("ah.h")
    public static class171 field1065 = new class171(64);

    @ObfuscatedName("ah.v")
    public int field1066 = 0;

    @ObfuscatedName("dr.i(IB)Lah;")
    public static class46 method2586(int arg0) {
        class46 var1 = (class46) field1065.method3185((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1063.method2811(16, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method901(new class107(var2));
        }
        field1065.method3186(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.c(Ldm;I)V")
    public void method901(class107 arg0) {
        while (true) {
            int var2 = arg0.method2151();
            if (var2 == 0) {
                return;
            }
            this.method902(arg0, var2);
        }
    }

    @ObfuscatedName("ah.h(Ldm;II)V")
    public void method902(class107 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1066 = arg0.method2313();
        }
    }
}
