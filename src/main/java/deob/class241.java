package deob;

@ObfuscatedName("ij")
public class class241 extends class247 {

    @ObfuscatedName("ij.h")
    public int field2895;

    @ObfuscatedName("ij.e")
    public int field2894;

    @ObfuscatedName("ij.v")
    public int field2896;

    @ObfuscatedName("ij.x")
    public int field2897;

    @ObfuscatedName("ij.h(Lqy;B)V")
    public void method4737(class467 arg0) {
        int var2 = arg0.method7792();
        if (class253.field2984.field2986 != var2) {
            throw new IllegalStateException("");
        }
        this.field2953 = arg0.method7792();
        this.field2946 = arg0.method7792();
        this.field2945 = arg0.method7794();
        this.field2942 = arg0.method7794();
        this.field2895 = arg0.method7792();
        this.field2894 = arg0.method7792();
        this.field2943 = arg0.method7794();
        this.field2949 = arg0.method7794();
        this.field2896 = arg0.method7792();
        this.field2897 = arg0.method7792();
        this.field2941 = arg0.method7810();
        this.field2948 = arg0.method7810();
    }

    @ObfuscatedName("ij.e(Lqy;I)V")
    public void method4432(class467 arg0) {
        this.field2946 = Math.min(this.field2946, 4);
        this.field2950 = new short[1][64][64];
        this.field2944 = new short[this.field2946][64][64];
        this.field2951 = new byte[this.field2946][64][64];
        this.field2952 = new byte[this.field2946][64][64];
        this.field2947 = new class249[this.field2946][64][64][];
        int var2 = arg0.method7792();
        if (class252.field2978.field2979 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method7792();
        int var4 = arg0.method7792();
        int var5 = arg0.method7792();
        int var6 = arg0.method7792();
        if (this.field2943 != var3 || this.field2949 != var4 || this.field2896 != var5 || this.field2897 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method4769(this.field2896 * 8 + var7, this.field2897 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class241)) {
            return false;
        }
        class241 var2 = (class241) arg0;
        if (this.field2943 == var2.field2943 && this.field2949 == var2.field2949) {
            return this.field2896 == var2.field2896 && this.field2897 == var2.field2897;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2943 | this.field2949 << 8 | this.field2896 << 16 | this.field2897 << 24;
    }

    @ObfuscatedName("ij.v(I)I")
    public int method4727() {
        return this.field2895;
    }

    @ObfuscatedName("ij.x(I)I")
    public int method4728() {
        return this.field2894;
    }

    @ObfuscatedName("ij.m(I)I")
    public int method4729() {
        return this.field2896;
    }

    @ObfuscatedName("ij.g(I)I")
    public int method4726() {
        return this.field2897;
    }
}
