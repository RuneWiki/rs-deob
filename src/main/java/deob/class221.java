package deob;

@ObfuscatedName("hn")
public class class221 extends class227 {

    @ObfuscatedName("hn.c")
    public int field2679;

    @ObfuscatedName("hn.l")
    public int field2675;

    @ObfuscatedName("hn.s")
    public int field2676;

    @ObfuscatedName("hn.e")
    public int field2674;

    @ObfuscatedName("hn.c(Lpi;B)V")
    public void method4271(class421 arg0) {
        int var2 = arg0.method6686();
        if (class233.field2772.field2775 != var2) {
            throw new IllegalStateException("");
        }
        this.field2731 = arg0.method6686();
        this.field2735 = arg0.method6686();
        this.field2734 = arg0.method6666();
        this.field2728 = arg0.method6666();
        this.field2679 = arg0.method6686();
        this.field2675 = arg0.method6686();
        this.field2738 = arg0.method6666();
        this.field2730 = arg0.method6666();
        this.field2676 = arg0.method6686();
        this.field2674 = arg0.method6686();
        this.field2733 = arg0.method6649();
        this.field2727 = arg0.method6649();
    }

    @ObfuscatedName("hn.l(Lpi;B)V")
    public void method3952(class421 arg0) {
        this.field2735 = Math.min(this.field2735, 4);
        this.field2740 = new short[1][64][64];
        this.field2736 = new short[this.field2735][64][64];
        this.field2737 = new byte[this.field2735][64][64];
        this.field2732 = new byte[this.field2735][64][64];
        this.field2739 = new class229[this.field2735][64][64][];
        int var2 = arg0.method6686();
        if (class232.field2766.field2767 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method6686();
        int var4 = arg0.method6686();
        int var5 = arg0.method6686();
        int var6 = arg0.method6686();
        if (this.field2738 != var3 || this.field2730 != var4 || this.field2676 != var5 || this.field2674 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method4319(this.field2676 * 8 + var7, this.field2674 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class221)) {
            return false;
        }
        class221 var2 = (class221) arg0;
        if (this.field2738 == var2.field2738 && this.field2730 == var2.field2730) {
            return this.field2676 == var2.field2676 && this.field2674 == var2.field2674;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2738 | this.field2730 << 8 | this.field2676 << 16 | this.field2674 << 24;
    }

    @ObfuscatedName("hn.s(I)I")
    public int method4273() {
        return this.field2679;
    }

    @ObfuscatedName("hn.e(B)I")
    public int method4274() {
        return this.field2675;
    }

    @ObfuscatedName("hn.r(I)I")
    public int method4275() {
        return this.field2676;
    }

    @ObfuscatedName("hn.w(I)I")
    public int method4276() {
        return this.field2674;
    }
}
