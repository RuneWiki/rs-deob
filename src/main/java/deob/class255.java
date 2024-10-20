package deob;

@ObfuscatedName("jz")
public class class255 extends class502 {

    @ObfuscatedName("jz.ay")
    public static class315 field2684 = new class315(64);

    @ObfuscatedName("jz.an")
    public int field2683;

    @ObfuscatedName("jz.au")
    public int field2686;

    @ObfuscatedName("jz.ax")
    public int field2685;

    @ObfuscatedName("jz.ao")
    public static final int[] field2687 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2687[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("jz.ay(Lvg;I)V")
    public void method4619(class549 arg0) {
        while (true) {
            int var2 = arg0.method9025();
            if (var2 == 0) {
                return;
            }
            this.method4618(arg0, var2);
        }
    }

    @ObfuscatedName("jz.an(Lvg;II)V")
    public void method4618(class549 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2683 = arg0.method8968();
            this.field2686 = arg0.method9025();
            this.field2685 = arg0.method9025();
        }
    }

    @ObfuscatedName("im.au(I)V")
    public static void method4378() {
        field2684.method5588();
    }
}
