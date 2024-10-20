package deob;

@ObfuscatedName("ij")
public class class238 extends class244 {

    @ObfuscatedName("ij.a")
    public int field2828;

    @ObfuscatedName("ij.f")
    public int field2826;

    @ObfuscatedName("ij.c")
    public int field2827;

    @ObfuscatedName("ij.x")
    public int field2825;

    @ObfuscatedName("ij.a(Lqr;I)V")
    public void method4637(class464 arg0) {
        int var2 = arg0.method7735();
        if (class250.field2925.field2924 != var2) {
            throw new IllegalStateException("");
        }
        this.field2884 = arg0.method7735();
        this.field2882 = arg0.method7735();
        this.field2890 = arg0.method7716();
        this.field2878 = arg0.method7716();
        this.field2828 = arg0.method7735();
        this.field2826 = arg0.method7735();
        this.field2879 = arg0.method7716();
        this.field2880 = arg0.method7716();
        this.field2827 = arg0.method7735();
        this.field2825 = arg0.method7735();
        this.field2883 = arg0.method7734();
        this.field2889 = arg0.method7734();
    }

    @ObfuscatedName("ij.f(Lqr;I)V")
    public void method4299(class464 arg0) {
        this.field2882 = Math.min(this.field2882, 4);
        this.field2885 = new short[1][64][64];
        this.field2877 = new short[this.field2882][64][64];
        this.field2887 = new byte[this.field2882][64][64];
        this.field2888 = new byte[this.field2882][64][64];
        this.field2881 = new class246[this.field2882][64][64][];
        int var2 = arg0.method7735();
        if (class249.field2920.field2917 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method7735();
        int var4 = arg0.method7735();
        int var5 = arg0.method7735();
        int var6 = arg0.method7735();
        if (this.field2879 != var3 || this.field2880 != var4 || this.field2827 != var5 || this.field2825 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method4680(this.field2827 * 8 + var7, this.field2825 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class238)) {
            return false;
        }
        class238 var2 = (class238) arg0;
        if (this.field2879 == var2.field2879 && this.field2880 == var2.field2880) {
            return this.field2827 == var2.field2827 && this.field2825 == var2.field2825;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2879 | this.field2880 << 8 | this.field2827 << 16 | this.field2825 << 24;
    }

    @ObfuscatedName("ij.c(I)I")
    public int method4639() {
        return this.field2828;
    }

    @ObfuscatedName("ij.x(I)I")
    public int method4649() {
        return this.field2826;
    }

    @ObfuscatedName("ij.h(I)I")
    public int method4641() {
        return this.field2827;
    }

    @ObfuscatedName("ij.y(I)I")
    public int method4642() {
        return this.field2825;
    }
}
