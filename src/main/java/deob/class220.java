package deob;

@ObfuscatedName("hu")
public class class220 extends class234 {

    @ObfuscatedName("hu.s(Lqr;B)V")
    public void method4081(class444 arg0) {
        int var2 = arg0.method6929();
        if (class240.field2850.field2848 != var2) {
            throw new IllegalStateException("");
        }
        this.field2813 = arg0.method6929();
        this.field2805 = arg0.method6929();
        this.field2812 = arg0.method7120();
        this.field2816 = arg0.method7120();
        this.field2807 = arg0.method7120();
        this.field2808 = arg0.method7120();
        this.field2811 = arg0.method6945();
        this.field2820 = arg0.method6945();
    }

    @ObfuscatedName("hu.h(Lqr;B)V")
    public void method4074(class444 arg0) {
        this.field2805 = Math.min(this.field2805, 4);
        this.field2810 = new short[1][64][64];
        this.field2814 = new short[this.field2805][64][64];
        this.field2815 = new byte[this.field2805][64][64];
        this.field2809 = new byte[this.field2805][64][64];
        this.field2817 = new class236[this.field2805][64][64][];
        int var2 = arg0.method6929();
        if (class239.field2844.field2842 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method6929();
        int var4 = arg0.method6929();
        if (this.field2807 != var3 || this.field2808 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method4454(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class220)) {
            class220 var2 = (class220) arg0;
            return this.field2807 == var2.field2807 && this.field2808 == var2.field2808;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2807 | this.field2808 << 8;
    }
}
