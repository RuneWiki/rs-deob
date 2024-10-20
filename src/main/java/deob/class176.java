package deob;

@ObfuscatedName("fa")
public class class176 extends class382 {

    @ObfuscatedName("fa.b")
    public static class249 field1907 = new class249(64);

    @ObfuscatedName("fa.p")
    public int field1909;

    @ObfuscatedName("fa.m")
    public int field1908;

    @ObfuscatedName("fa.t")
    public int field1910;

    @ObfuscatedName("fa.s")
    public static final int[] field1906 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1906[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("fa.c(Lpi;I)V")
    public void method3077(class419 arg0) {
        while (true) {
            int var2 = arg0.method6781();
            if (var2 == 0) {
                return;
            }
            this.method3083(arg0, var2);
        }
    }

    @ObfuscatedName("fa.b(Lpi;II)V")
    public void method3083(class419 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1909 = arg0.method6672();
            this.field1908 = arg0.method6781();
            this.field1910 = arg0.method6781();
        }
    }

    @ObfuscatedName("b.p(B)V")
    public static void method9() {
        field1907.method4518();
    }
}
