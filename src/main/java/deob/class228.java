package deob;

@ObfuscatedName("hz")
public class class228 extends class234 {

    @ObfuscatedName("hz.s")
    public int field2756;

    @ObfuscatedName("hz.h")
    public int field2755;

    @ObfuscatedName("hz.w")
    public int field2759;

    @ObfuscatedName("hz.v")
    public int field2758;

    @ObfuscatedName("hz.s(Lqr;I)V")
    public void method4395(class444 arg0) {
        int var2 = arg0.method6929();
        if (class240.field2847.field2848 != var2) {
            throw new IllegalStateException("");
        }
        this.field2813 = arg0.method6929();
        this.field2805 = arg0.method6929();
        this.field2812 = arg0.method7120();
        this.field2816 = arg0.method7120();
        this.field2756 = arg0.method6929();
        this.field2755 = arg0.method6929();
        this.field2807 = arg0.method7120();
        this.field2808 = arg0.method7120();
        this.field2759 = arg0.method6929();
        this.field2758 = arg0.method6929();
        this.field2811 = arg0.method6945();
        this.field2820 = arg0.method6945();
    }

    @ObfuscatedName("hz.h(Lqr;B)V")
    public void method4074(class444 arg0) {
        this.field2805 = Math.min(this.field2805, 4);
        this.field2810 = new short[1][64][64];
        this.field2814 = new short[this.field2805][64][64];
        this.field2815 = new byte[this.field2805][64][64];
        this.field2809 = new byte[this.field2805][64][64];
        this.field2817 = new class236[this.field2805][64][64][];
        int var2 = arg0.method6929();
        if (class239.field2843.field2842 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method6929();
        int var4 = arg0.method6929();
        int var5 = arg0.method6929();
        int var6 = arg0.method6929();
        if (this.field2807 != var3 || this.field2808 != var4 || this.field2759 != var5 || this.field2758 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method4454(this.field2759 * 8 + var7, this.field2758 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class228)) {
            return false;
        }
        class228 var2 = (class228) arg0;
        if (this.field2807 == var2.field2807 && this.field2808 == var2.field2808) {
            return this.field2759 == var2.field2759 && this.field2758 == var2.field2758;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2807 | this.field2808 << 8 | this.field2759 << 16 | this.field2758 << 24;
    }

    @ObfuscatedName("hz.w(B)I")
    public int method4397() {
        return this.field2756;
    }

    @ObfuscatedName("hz.k(S)I")
    public int method4414() {
        return this.field2755;
    }

    @ObfuscatedName("hz.o(I)I")
    public int method4399() {
        return this.field2759;
    }

    @ObfuscatedName("hz.n(B)I")
    public int method4400() {
        return this.field2758;
    }
}
