package deob;

@ObfuscatedName("ax")
public class class46 extends class183 {

    @ObfuscatedName("ax.k")
    public static class172 field1054 = new class172(64);

    @ObfuscatedName("ax.i")
    public int field1057 = 0;

    @ObfuscatedName("dz.n(II)Lax;")
    public static class46 method2544(int arg0) {
        class46 var1 = (class46) field1054.method3115((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1056.method2738(16, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method902(new class107(var2));
        }
        field1054.method3117(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.x(Ldw;I)V")
    public void method902(class107 arg0) {
        while (true) {
            int var2 = arg0.method2148();
            if (var2 == 0) {
                return;
            }
            this.method900(arg0, var2);
        }
    }

    @ObfuscatedName("ax.k(Ldw;II)V")
    public void method900(class107 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1057 = arg0.method2140();
        }
    }

    @ObfuscatedName("et.i(B)V")
    public static void method2658() {
        field1054.method3124();
    }
}
