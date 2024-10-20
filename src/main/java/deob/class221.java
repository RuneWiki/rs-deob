package deob;

@ObfuscatedName("hz")
public class class221 extends class235 {

    @ObfuscatedName("hz.o(Lpx;I)V")
    public void method4073(class440 arg0) {
        int var2 = arg0.method7071();
        if (class241.field2880.field2879 != var2) {
            throw new IllegalStateException("");
        }
        this.field2841 = arg0.method7071();
        this.field2844 = arg0.method7071();
        this.field2850 = arg0.method7082();
        this.field2838 = arg0.method7082();
        this.field2842 = arg0.method7082();
        this.field2840 = arg0.method7082();
        this.field2843 = arg0.method6910();
        this.field2837 = arg0.method6910();
    }

    @ObfuscatedName("hz.q(Lpx;I)V")
    public void method4078(class440 arg0) {
        this.field2844 = Math.min(this.field2844, 4);
        this.field2845 = new short[1][64][64];
        this.field2847 = new short[this.field2844][64][64];
        this.field2846 = new byte[this.field2844][64][64];
        this.field2848 = new byte[this.field2844][64][64];
        this.field2839 = new class237[this.field2844][64][64][];
        int var2 = arg0.method7071();
        if (class240.field2876.field2872 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method7071();
        int var4 = arg0.method7071();
        if (this.field2842 != var3 || this.field2840 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method4401(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class221)) {
            class221 var2 = (class221) arg0;
            return this.field2842 == var2.field2842 && this.field2840 == var2.field2840;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2842 | this.field2840 << 8;
    }
}
