package deob;

@ObfuscatedName("hu")
public class class213 extends class227 {

    @ObfuscatedName("hu.c(Lpi;S)V")
    public void method3951(class421 arg0) {
        int var2 = arg0.method6686();
        if (class233.field2774.field2775 != var2) {
            throw new IllegalStateException("");
        }
        this.field2731 = arg0.method6686();
        this.field2735 = arg0.method6686();
        this.field2734 = arg0.method6666();
        this.field2728 = arg0.method6666();
        this.field2738 = arg0.method6666();
        this.field2730 = arg0.method6666();
        this.field2733 = arg0.method6649();
        this.field2727 = arg0.method6649();
    }

    @ObfuscatedName("hu.l(Lpi;B)V")
    public void method3952(class421 arg0) {
        this.field2735 = Math.min(this.field2735, 4);
        this.field2740 = new short[1][64][64];
        this.field2736 = new short[this.field2735][64][64];
        this.field2737 = new byte[this.field2735][64][64];
        this.field2732 = new byte[this.field2735][64][64];
        this.field2739 = new class229[this.field2735][64][64][];
        int var2 = arg0.method6686();
        if (class232.field2765.field2767 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method6686();
        int var4 = arg0.method6686();
        if (this.field2738 != var3 || this.field2730 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method4319(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class213)) {
            class213 var2 = (class213) arg0;
            return this.field2738 == var2.field2738 && this.field2730 == var2.field2730;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2738 | this.field2730 << 8;
    }
}
