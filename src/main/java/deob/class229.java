package deob;

@ObfuscatedName("hg")
public class class229 extends class235 {

    @ObfuscatedName("hg.c")
    public int field2783;

    @ObfuscatedName("hg.p")
    public int field2781;

    @ObfuscatedName("hg.f")
    public int field2782;

    @ObfuscatedName("hg.n")
    public int field2780;

    @ObfuscatedName("hg.c(Lqq;I)V")
    public void method4578(class445 arg0) {
        int var2 = arg0.method7196();
        if (class241.field2869.field2870 != var2) {
            throw new IllegalStateException("");
        }
        this.field2833 = arg0.method7196();
        this.field2834 = arg0.method7196();
        this.field2841 = arg0.method7198();
        this.field2839 = arg0.method7198();
        this.field2783 = arg0.method7196();
        this.field2781 = arg0.method7196();
        this.field2831 = arg0.method7198();
        this.field2829 = arg0.method7198();
        this.field2782 = arg0.method7196();
        this.field2780 = arg0.method7196();
        this.field2830 = arg0.method7301();
        this.field2832 = arg0.method7301();
    }

    @ObfuscatedName("hg.p(Lqq;I)V")
    public void method4277(class445 arg0) {
        this.field2834 = Math.min(this.field2834, 4);
        this.field2837 = new short[1][64][64];
        this.field2838 = new short[this.field2834][64][64];
        this.field2840 = new byte[this.field2834][64][64];
        this.field2835 = new byte[this.field2834][64][64];
        this.field2836 = new class237[this.field2834][64][64][];
        int var2 = arg0.method7196();
        if (class240.field2864.field2868 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method7196();
        int var4 = arg0.method7196();
        int var5 = arg0.method7196();
        int var6 = arg0.method7196();
        if (this.field2831 != var3 || this.field2829 != var4 || this.field2782 != var5 || this.field2780 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method4623(this.field2782 * 8 + var7, this.field2780 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class229)) {
            return false;
        }
        class229 var2 = (class229) arg0;
        if (this.field2831 == var2.field2831 && this.field2829 == var2.field2829) {
            return this.field2782 == var2.field2782 && this.field2780 == var2.field2780;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2831 | this.field2829 << 8 | this.field2782 << 16 | this.field2780 << 24;
    }

    @ObfuscatedName("hg.f(I)I")
    public int method4579() {
        return this.field2783;
    }

    @ObfuscatedName("hg.n(I)I")
    public int method4580() {
        return this.field2781;
    }

    @ObfuscatedName("hg.m(B)I")
    public int method4594() {
        return this.field2782;
    }

    @ObfuscatedName("hg.x(B)I")
    public int method4582() {
        return this.field2780;
    }
}
