package deob;

@ObfuscatedName("q")
public class class23 extends class29 {

    @ObfuscatedName("q.c(Lgp;Lgp;I)V")
    public void method166(class195 arg0, class195 arg1) {
        int var3 = arg1.method3429();
        if (class38.field482.field484 != var3) {
            throw new IllegalStateException("");
        }
        this.field393 = arg1.method3429();
        this.field392 = arg1.method3429();
        this.field391 = arg1.method3218();
        this.field388 = arg1.method3218();
        this.field387 = arg1.method3218();
        this.field390 = arg1.method3218();
        this.field392 = Math.min(this.field392, 4);
        this.field389 = new short[1][64][64];
        this.field394 = new short[this.field392][64][64];
        this.field395 = new byte[this.field392][64][64];
        this.field396 = new byte[this.field392][64][64];
        this.field397 = new class32[this.field392][64][64][];
        int var4 = arg0.method3429();
        if (class37.field478.field475 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3429();
        int var6 = arg0.method3429();
        if (this.field387 != var5 || this.field390 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method228(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field387 == var2.field387 && this.field390 == var2.field390;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field387 | this.field390 << 8;
    }
}
