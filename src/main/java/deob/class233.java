package deob;

@ObfuscatedName("hd")
public class class233 extends class247 {

    @ObfuscatedName("hd.h(Lqy;I)V")
    public void method4425(class467 arg0) {
        int var2 = arg0.method7792();
        if (class253.field2985.field2986 != var2) {
            throw new IllegalStateException("");
        }
        this.field2953 = arg0.method7792();
        this.field2946 = arg0.method7792();
        this.field2945 = arg0.method7794();
        this.field2942 = arg0.method7794();
        this.field2943 = arg0.method7794();
        this.field2949 = arg0.method7794();
        this.field2941 = arg0.method7810();
        this.field2948 = arg0.method7810();
    }

    @ObfuscatedName("hd.e(Lqy;I)V")
    public void method4432(class467 arg0) {
        this.field2946 = Math.min(this.field2946, 4);
        this.field2950 = new short[1][64][64];
        this.field2944 = new short[this.field2946][64][64];
        this.field2951 = new byte[this.field2946][64][64];
        this.field2952 = new byte[this.field2946][64][64];
        this.field2947 = new class249[this.field2946][64][64][];
        int var2 = arg0.method7792();
        if (class252.field2977.field2979 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method7792();
        int var4 = arg0.method7792();
        if (this.field2943 != var3 || this.field2949 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method4769(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class233)) {
            class233 var2 = (class233) arg0;
            return this.field2943 == var2.field2943 && this.field2949 == var2.field2949;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2943 | this.field2949 << 8;
    }
}
