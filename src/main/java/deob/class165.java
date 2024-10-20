package deob;

@ObfuscatedName("fl")
public class class165 extends class364 {

    @ObfuscatedName("fl.c")
    public static class236 field1778 = new class236(64);

    @ObfuscatedName("fl.m")
    public int field1785;

    @ObfuscatedName("fl.k")
    public int field1780;

    @ObfuscatedName("fl.o")
    public int field1781;

    @ObfuscatedName("fl.g")
    public static final int[] field1782 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1782[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("dw.n(Lkk;B)V")
    public static void method2457(class290 arg0) {
        Statics.field1783 = arg0;
    }

    @ObfuscatedName("fl.m(Lot;I)V")
    public void method2786(class400 arg0) {
        while (true) {
            int var2 = arg0.method6217();
            if (var2 == 0) {
                return;
            }
            this.method2787(arg0, var2);
        }
    }

    @ObfuscatedName("fl.k(Lot;II)V")
    public void method2787(class400 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1785 = arg0.method6219();
            this.field1780 = arg0.method6217();
            this.field1781 = arg0.method6217();
        }
    }

    @ObfuscatedName("it.o(I)V")
    public static void method4190() {
        field1778.method4168();
    }
}
