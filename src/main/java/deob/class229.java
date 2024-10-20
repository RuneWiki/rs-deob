package deob;

@ObfuscatedName("hj")
public class class229 extends class235 {

    @ObfuscatedName("hj.o")
    public int field2790;

    @ObfuscatedName("hj.q")
    public int field2789;

    @ObfuscatedName("hj.l")
    public int field2788;

    @ObfuscatedName("hj.k")
    public int field2792;

    @ObfuscatedName("hj.o(Lpx;B)V")
    public void method4368(class440 arg0) {
        int var2 = arg0.method7071();
        if (class241.field2878.field2879 != var2) {
            throw new IllegalStateException("");
        }
        this.field2841 = arg0.method7071();
        this.field2844 = arg0.method7071();
        this.field2850 = arg0.method7082();
        this.field2838 = arg0.method7082();
        this.field2790 = arg0.method7071();
        this.field2789 = arg0.method7071();
        this.field2842 = arg0.method7082();
        this.field2840 = arg0.method7082();
        this.field2788 = arg0.method7071();
        this.field2792 = arg0.method7071();
        this.field2843 = arg0.method6910();
        this.field2837 = arg0.method6910();
    }

    @ObfuscatedName("hj.q(Lpx;I)V")
    public void method4078(class440 arg0) {
        this.field2844 = Math.min(this.field2844, 4);
        this.field2845 = new short[1][64][64];
        this.field2847 = new short[this.field2844][64][64];
        this.field2846 = new byte[this.field2844][64][64];
        this.field2848 = new byte[this.field2844][64][64];
        this.field2839 = new class237[this.field2844][64][64][];
        int var2 = arg0.method7071();
        if (class240.field2873.field2872 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method7071();
        int var4 = arg0.method7071();
        int var5 = arg0.method7071();
        int var6 = arg0.method7071();
        if (this.field2842 != var3 || this.field2840 != var4 || this.field2788 != var5 || this.field2792 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method4401(this.field2788 * 8 + var7, this.field2792 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class229)) {
            return false;
        }
        class229 var2 = (class229) arg0;
        if (this.field2842 == var2.field2842 && this.field2840 == var2.field2840) {
            return this.field2788 == var2.field2788 && this.field2792 == var2.field2792;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2842 | this.field2840 << 8 | this.field2788 << 16 | this.field2792 << 24;
    }

    @ObfuscatedName("hj.l(B)I")
    public int method4359() {
        return this.field2790;
    }

    @ObfuscatedName("hj.k(I)I")
    public int method4373() {
        return this.field2789;
    }

    @ObfuscatedName("hj.m(I)I")
    public int method4360() {
        return this.field2788;
    }

    @ObfuscatedName("hj.p(I)I")
    public int method4362() {
        return this.field2792;
    }
}
