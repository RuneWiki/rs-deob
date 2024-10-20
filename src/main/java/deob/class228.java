package deob;

@ObfuscatedName("ho")
public class class228 extends class234 {

    @ObfuscatedName("ho.c")
    public int field2746;

    @ObfuscatedName("ho.v")
    public int field2747;

    @ObfuscatedName("ho.q")
    public int field2745;

    @ObfuscatedName("ho.f")
    public int field2748;

    @ObfuscatedName("ho.c(Lqt;B)V")
    public void method4501(class443 arg0) {
        int var2 = arg0.method7047();
        if (class240.field2841.field2840 != var2) {
            throw new IllegalStateException("");
        }
        this.field2803 = arg0.method7047();
        this.field2801 = arg0.method7047();
        this.field2800 = arg0.method7049();
        this.field2810 = arg0.method7049();
        this.field2746 = arg0.method7047();
        this.field2747 = arg0.method7047();
        this.field2798 = arg0.method7049();
        this.field2799 = arg0.method7049();
        this.field2745 = arg0.method7047();
        this.field2748 = arg0.method7047();
        this.field2807 = arg0.method7066();
        this.field2806 = arg0.method7066();
    }

    @ObfuscatedName("ho.v(Lqt;I)V")
    public void method4206(class443 arg0) {
        this.field2801 = Math.min(this.field2801, 4);
        this.field2804 = new short[1][64][64];
        this.field2805 = new short[this.field2801][64][64];
        this.field2797 = new byte[this.field2801][64][64];
        this.field2796 = new byte[this.field2801][64][64];
        this.field2808 = new class236[this.field2801][64][64][];
        int var2 = arg0.method7047();
        if (class239.field2837.field2836 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method7047();
        int var4 = arg0.method7047();
        int var5 = arg0.method7047();
        int var6 = arg0.method7047();
        if (this.field2798 != var3 || this.field2799 != var4 || this.field2745 != var5 || this.field2748 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method4544(this.field2745 * 8 + var7, this.field2748 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class228)) {
            return false;
        }
        class228 var2 = (class228) arg0;
        if (this.field2798 == var2.field2798 && this.field2799 == var2.field2799) {
            return this.field2745 == var2.field2745 && this.field2748 == var2.field2748;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2798 | this.field2799 << 8 | this.field2745 << 16 | this.field2748 << 24;
    }

    @ObfuscatedName("ho.q(I)I")
    public int method4503() {
        return this.field2746;
    }

    @ObfuscatedName("ho.f(I)I")
    public int method4504() {
        return this.field2747;
    }

    @ObfuscatedName("ho.j(S)I")
    public int method4505() {
        return this.field2745;
    }

    @ObfuscatedName("ho.w(B)I")
    public int method4520() {
        return this.field2748;
    }
}
