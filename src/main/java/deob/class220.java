package deob;

@ObfuscatedName("hh")
public class class220 extends class234 {

    @ObfuscatedName("hh.c(Lqt;I)V")
    public void method4204(class443 arg0) {
        int var2 = arg0.method7047();
        if (class240.field2844.field2840 != var2) {
            throw new IllegalStateException("");
        }
        this.field2803 = arg0.method7047();
        this.field2801 = arg0.method7047();
        this.field2800 = arg0.method7049();
        this.field2810 = arg0.method7049();
        this.field2798 = arg0.method7049();
        this.field2799 = arg0.method7049();
        this.field2807 = arg0.method7066();
        this.field2806 = arg0.method7066();
    }

    @ObfuscatedName("hh.v(Lqt;I)V")
    public void method4206(class443 arg0) {
        this.field2801 = Math.min(this.field2801, 4);
        this.field2804 = new short[1][64][64];
        this.field2805 = new short[this.field2801][64][64];
        this.field2797 = new byte[this.field2801][64][64];
        this.field2796 = new byte[this.field2801][64][64];
        this.field2808 = new class236[this.field2801][64][64][];
        int var2 = arg0.method7047();
        if (class239.field2838.field2836 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method7047();
        int var4 = arg0.method7047();
        if (this.field2798 != var3 || this.field2799 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method4544(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class220)) {
            class220 var2 = (class220) arg0;
            return this.field2798 == var2.field2798 && this.field2799 == var2.field2799;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2798 | this.field2799 << 8;
    }
}
