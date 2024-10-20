package deob;

@ObfuscatedName("is")
public class class214 extends class484 {

    @ObfuscatedName("is.al")
    public static class302 field2140 = new class302(64);

    @ObfuscatedName("is.ak")
    public int field2145;

    @ObfuscatedName("is.ax")
    public int field2142;

    @ObfuscatedName("is.ao")
    public int field2143;

    @ObfuscatedName("is.ah")
    public static final int[] field2144 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2144[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("er.ac(II)Lis;")
    public static class214 method2671(int arg0) {
        class214 var1 = (class214) field2140.method5286((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2146.method6342(14, arg0);
        class214 var3 = new class214();
        if (var2 != null) {
            var3.method3580(new class530(var2));
        }
        field2140.method5289(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("is.al(Lul;I)V")
    public void method3580(class530 arg0) {
        while (true) {
            int var2 = arg0.method8365();
            if (var2 == 0) {
                return;
            }
            this.method3581(arg0, var2);
        }
    }

    @ObfuscatedName("is.ak(Lul;II)V")
    public void method3581(class530 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2145 = arg0.method8598();
            this.field2142 = arg0.method8365();
            this.field2143 = arg0.method8365();
        }
    }

    @ObfuscatedName("ev.ax(I)V")
    public static void method2774() {
        field2140.method5288();
    }
}
