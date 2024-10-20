package deob;

@ObfuscatedName("il")
public class class258 extends class202 {

    @ObfuscatedName("il.x")
    public static class197 field3450 = new class197(64);

    @ObfuscatedName("il.k")
    public int field3451;

    @ObfuscatedName("il.z")
    public int field3452;

    @ObfuscatedName("il.v")
    public int field3453;

    @ObfuscatedName("ij.d(Lid;I)V")
    public static void method3915(class243 arg0) {
        Statics.field3449 = arg0;
    }

    @ObfuscatedName("bz.x(II)Lil;")
    public static class258 method996(int arg0) {
        class258 var1 = (class258) field3450.method3418((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3449.method3935(14, arg0);
        class258 var3 = new class258();
        if (var2 != null) {
            var3.method4235(new class181(var2));
        }
        field3450.method3417(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("il.k(Lfr;I)V")
    public void method4235(class181 arg0) {
        while (true) {
            int var2 = arg0.method3204();
            if (var2 == 0) {
                return;
            }
            this.method4236(arg0, var2);
        }
    }

    @ObfuscatedName("il.z(Lfr;II)V")
    public void method4236(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3451 = arg0.method3179();
            this.field3452 = arg0.method3204();
            this.field3453 = arg0.method3204();
        }
    }
}
