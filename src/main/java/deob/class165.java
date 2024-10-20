package deob;

@ObfuscatedName("fm")
public class class165 extends class365 {

    @ObfuscatedName("fm.q")
    public static class236 field1781 = new class236(64);

    @ObfuscatedName("fm.f")
    public int field1782;

    @ObfuscatedName("fm.j")
    public int field1783;

    @ObfuscatedName("fm.m")
    public int field1780;

    @ObfuscatedName("fm.k")
    public static final int[] field1785 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1785[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("cu.l(II)Lfm;")
    public static class165 method2158(int arg0) {
        class165 var1 = (class165) field1781.method4223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1787.method4756(14, arg0);
        class165 var3 = new class165();
        if (var2 != null) {
            var3.method2852(new class401(var2));
        }
        field1781.method4225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fm.q(Lot;I)V")
    public void method2852(class401 arg0) {
        while (true) {
            int var2 = arg0.method6272();
            if (var2 == 0) {
                return;
            }
            this.method2843(arg0, var2);
        }
    }

    @ObfuscatedName("fm.f(Lot;II)V")
    public void method2843(class401 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1782 = arg0.method6284();
            this.field1783 = arg0.method6272();
            this.field1780 = arg0.method6272();
        }
    }
}
