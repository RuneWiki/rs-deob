package deob;

@ObfuscatedName("it")
public class class249 extends class176 {

    @ObfuscatedName("it.x")
    public static class146 field3272 = new class146(64);

    @ObfuscatedName("it.t")
    public int field3275;

    @ObfuscatedName("it.g")
    public int field3276;

    @ObfuscatedName("it.l")
    public int field3274;

    @ObfuscatedName("gf.c(II)Lit;")
    public static class249 method3366(int arg0) {
        class249 var1 = (class249) field3272.method3061((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3273.method3825(14, arg0);
        class249 var3 = new class249();
        if (var2 != null) {
            var3.method4161(new class300(var2));
        }
        field3272.method3062(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("it.x(Lkz;I)V")
    public void method4161(class300 arg0) {
        while (true) {
            int var2 = arg0.method5103();
            if (var2 == 0) {
                return;
            }
            this.method4166(arg0, var2);
        }
    }

    @ObfuscatedName("it.t(Lkz;IB)V")
    public void method4166(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3275 = arg0.method5304();
            this.field3276 = arg0.method5103();
            this.field3274 = arg0.method5103();
        }
    }
}
