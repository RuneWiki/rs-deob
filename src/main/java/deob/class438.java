package deob;

@ObfuscatedName("pt")
public class class438 extends class407 {

    @ObfuscatedName("pt.p")
    public static class257 field4706 = new class257(64);

    @ObfuscatedName("pt.f")
    public int[][] field4707;

    @ObfuscatedName("pt.n")
    public Object[][] field4708;

    @ObfuscatedName("ou.c(Llv;B)V")
    public static void method6624(class317 arg0) {
        Statics.field4709 = arg0;
    }

    @ObfuscatedName("pt.f(Lqq;B)V")
    public void method7081(class445 arg0) {
        while (true) {
            int var2 = arg0.method7196();
            if (var2 == 0) {
                return;
            }
            this.method7087(arg0, var2);
        }
    }

    @ObfuscatedName("pt.n(Lqq;IB)V")
    public void method7087(class445 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        int var3 = arg0.method7196();
        if (this.field4707 == null) {
            this.field4707 = new int[var3][];
        }
        for (int var4 = arg0.method7196(); var4 != 255; var4 = arg0.method7196()) {
            int var5 = var4 & 0x7F;
            boolean var6 = (var4 & 0x80) != 0;
            int[] var7 = new int[arg0.method7196()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = arg0.method7211();
            }
            this.field4707[var5] = var7;
            if (var6) {
                if (this.field4708 == null) {
                    this.field4708 = new Object[this.field4707.length][];
                }
                this.field4708[var5] = class441.method6112(arg0, var7);
            }
        }
    }

    @ObfuscatedName("pt.k(B)V")
    public void method7082() {
    }

    @ObfuscatedName("ng.w(S)V")
    public static void method6322() {
        field4706.method4782();
    }
}
