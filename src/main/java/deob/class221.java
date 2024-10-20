package deob;

@ObfuscatedName("hr")
public class class221 extends class235 {

    @ObfuscatedName("hr.c(Lqq;B)V")
    public void method4275(class445 arg0) {
        int var2 = arg0.method7196();
        if (class241.field2874.field2870 != var2) {
            throw new IllegalStateException("");
        }
        this.field2833 = arg0.method7196();
        this.field2834 = arg0.method7196();
        this.field2841 = arg0.method7198();
        this.field2839 = arg0.method7198();
        this.field2831 = arg0.method7198();
        this.field2829 = arg0.method7198();
        this.field2830 = arg0.method7301();
        this.field2832 = arg0.method7301();
    }

    @ObfuscatedName("hr.p(Lqq;I)V")
    public void method4277(class445 arg0) {
        this.field2834 = Math.min(this.field2834, 4);
        this.field2837 = new short[1][64][64];
        this.field2838 = new short[this.field2834][64][64];
        this.field2840 = new byte[this.field2834][64][64];
        this.field2835 = new byte[this.field2834][64][64];
        this.field2836 = new class237[this.field2834][64][64][];
        int var2 = arg0.method7196();
        if (class240.field2867.field2868 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method7196();
        int var4 = arg0.method7196();
        if (this.field2831 != var3 || this.field2829 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method4623(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class221)) {
            class221 var2 = (class221) arg0;
            return this.field2831 == var2.field2831 && this.field2829 == var2.field2829;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2831 | this.field2829 << 8;
    }
}
