package deob;

@ObfuscatedName("ht")
public class class230 extends class244 {

    @ObfuscatedName("ht.a(Lqr;B)V")
    public void method4301(class464 arg0) {
        int var2 = arg0.method7735();
        if (class250.field2927.field2924 != var2) {
            throw new IllegalStateException("");
        }
        this.field2884 = arg0.method7735();
        this.field2882 = arg0.method7735();
        this.field2890 = arg0.method7716();
        this.field2878 = arg0.method7716();
        this.field2879 = arg0.method7716();
        this.field2880 = arg0.method7716();
        this.field2883 = arg0.method7734();
        this.field2889 = arg0.method7734();
    }

    @ObfuscatedName("ht.f(Lqr;I)V")
    public void method4299(class464 arg0) {
        this.field2882 = Math.min(this.field2882, 4);
        this.field2885 = new short[1][64][64];
        this.field2877 = new short[this.field2882][64][64];
        this.field2887 = new byte[this.field2882][64][64];
        this.field2888 = new byte[this.field2882][64][64];
        this.field2881 = new class246[this.field2882][64][64][];
        int var2 = arg0.method7735();
        if (class249.field2916.field2917 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method7735();
        int var4 = arg0.method7735();
        if (this.field2879 != var3 || this.field2880 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method4680(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class230)) {
            class230 var2 = (class230) arg0;
            return this.field2879 == var2.field2879 && this.field2880 == var2.field2880;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2879 | this.field2880 << 8;
    }
}
