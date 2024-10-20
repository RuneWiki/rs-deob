package deob;

@ObfuscatedName("en")
public class class152 extends class364 {

    @ObfuscatedName("en.c")
    public static class236 field1609 = new class236(64);

    @ObfuscatedName("en.m")
    public int field1610 = 0;

    @ObfuscatedName("kq.n(IB)Len;")
    public static class152 method4881(int arg0) {
        class152 var1 = (class152) field1609.method4167((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1612.method4710(5, arg0);
        class152 var3 = new class152();
        if (var2 != null) {
            var3.method2579(new class400(var2));
        }
        field1609.method4169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("en.c(Lot;B)V")
    public void method2579(class400 arg0) {
        while (true) {
            int var2 = arg0.method6217();
            if (var2 == 0) {
                return;
            }
            this.method2574(arg0, var2);
        }
    }

    @ObfuscatedName("en.m(Lot;II)V")
    public void method2574(class400 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1610 = arg0.method6219();
        }
    }
}
